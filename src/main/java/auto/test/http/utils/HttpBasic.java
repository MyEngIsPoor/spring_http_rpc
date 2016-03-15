package auto.test.http.utils;

import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpBasic {
	
	private static String HEADER="http://"; //TODO: HTTPS
	private static String IP=null;
	private static Integer PORT=null;
	
	public static void init(){
		
	}
	
	/**
	 * 
	* @Title: doGetWithAuth 
	* @return_type:String     
	* @author lm
	 * @throws Exception 
	 */
	public static String doGetWithAuth(String ip,String port,String username,String password,String relativeUrl,String paras) throws Exception{
		init();
		//代理
		 HttpHost proxy = new HttpHost("localhost", 8888, "http");  
	     RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
	     
		if(username != null && password != null){
			
			 CloseableHttpClient client=HttpClients.createDefault();
			 HttpClientContext hc=new HttpClientContext();

			 String uri;
			 if(ip ==null || port ==null){
				 System.out.println("use ip & port default!");
				 ip=IP;
				 port=String.valueOf(PORT);
			 }
			 uri=HEADER+ip+":"+port+"/"+relativeUrl+paras;
			 HttpGet get = new HttpGet(uri);
			 get.setConfig(config);
			 HttpHost target = new HttpHost(get.getURI().getHost(), get.getURI().getPort(),"http");
			 CredentialsProvider credsProvider = new BasicCredentialsProvider();
			 AuthCache authCache = new BasicAuthCache();
			 BasicScheme basicAuth = new BasicScheme();
			 authCache.put(target, basicAuth);
			 credsProvider.setCredentials(new AuthScope(get.getURI().getHost(), get.getURI().getPort()),new UsernamePasswordCredentials(username, password));		 
			 hc.setCredentialsProvider(credsProvider);
			 hc.setAuthCache(authCache);
			 
			 CloseableHttpResponse hrsp= client.execute(get, hc);
			 HttpEntity entity=hrsp.getEntity();
			 String result=EntityUtils.toString(entity, "UTF-8");
			 hrsp.close();
			 client.close();
			 System.out.println("curl -u \"" + username+ ":" + password + "\"  \"" + uri + "\"");
			 System.out.println(result);
			 System.out.println("-------------------------------------------------------");
			 return result;	
		}
		System.out.println("username or password wrong !");
		return null;
	}

	public static String doGetWithAuth(String username,String password,String relativeUrl,String paras) throws Exception{
		return doGetWithAuth(null,null,username,password,relativeUrl,paras);	
	}
	
	public static String doGet(String ip,String port,String relativeUrl,String paras) throws Exception{
//		init();
//		 CloseableHttpClient client=HttpClients.createDefault();
//		 String uri;
//		 if(ip ==null || port ==null){
//			 System.out.println("use ip & port default!");
//			 uri=HEADER+IP+":"+PORT+"/"+relativeUrl+paras;
//		 }else{
//			 uri=HEADER+ip+":"+port+"/"+relativeUrl+paras;
//		 }	 
//		 HttpGet get = new HttpGet(uri);
//		 CloseableHttpResponse hrsp= client.execute(get);
//		 HttpEntity entity=hrsp.getEntity();
//		 
//		 return httpEntityToString(entity);	
		return null;
	}
	
	public static String doGet(String relativeUrl,String paras) throws Exception{
		return doGet(null,null,relativeUrl,paras);
	}
	
	public static String doPost(String ip,String port,String relativeUrl,String paras){
		return null;
		
	}
	
	public static String doPost(String relativeUrl,String paras){
		return null;
		
	}
	
	//@Deprecated
	public static String doPostWithAuth(String ip,String port,String username,String password,String relativeUrl,String paras) throws Exception{
		init();
		//代理
//		 HttpHost proxy = new HttpHost("localhost", 8888, "http");  
//	     RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
	     
		if(username != null && password != null){			
			 			 
			 StringEntity se=new StringEntity(paras,"UTF-8");
			 se.setContentType("application/x-www-form-urlencoded");
			 String uri;
			 if(ip ==null || port ==null){
				 System.out.println("use ip & port default!");
				 ip=IP;
				 port=String.valueOf(PORT);
			 }
			uri=HEADER+ip+":"+port+"/"+relativeUrl;
			HttpPost post = new HttpPost(uri);
			//认证
			HttpClientContext context = HttpClientContext.create();
			 HttpHost target = new HttpHost(post.getURI().getHost(), post.getURI().getPort(),"http");
			 CredentialsProvider credsProvider = new BasicCredentialsProvider();
			 credsProvider.setCredentials(new AuthScope(target.getHostName(),target.getPort()),new UsernamePasswordCredentials(username, password));	
			 AuthCache authCache = new BasicAuthCache();
			 BasicScheme basicAuth = new BasicScheme();
			 authCache.put(target, basicAuth);
			 context.setAuthCache(authCache);
			 context.setCredentialsProvider(credsProvider);
			 CloseableHttpClient client=HttpClients.custom()
						.setDefaultCredentialsProvider(credsProvider).build();

			 //执行post
			
			 post.setEntity(se);
			// post.setConfig(config);
			 CloseableHttpResponse hrsp= client.execute(target,post, context);
			 HttpEntity entity=hrsp.getEntity();
			 String result= EntityUtils.toString(entity, "UTF-8");
			 hrsp.close();
			 client.close();
			 System.out.println("curl -u \"" + username+ ":" + password + "\"  \"" + uri + "\" -d \"" + paras + "\"");
			 System.out.println(result);
			 System.out.println("-----------------------------------------------");
			 return result;	
		}
		System.out.println("username or password wrong !");
		return null;
	}
	
	@Deprecated
	public static String doPostWithAuth(String username,String password,String relativeUrl,String paras) throws Exception{
		return doPostWithAuth(null, null, username, password, relativeUrl, paras);	
	}
	
	
	public static String doPostWithAuth(String ip,String port,String username,String password,String relativeUrl,Map<String,String> paraMap) throws Exception{
		init();
		if(username != null && password != null){
			
			 CloseableHttpClient client=HttpClients.createDefault();
			// httpClient.getHostConfiguration().setProxy("127.0.0.1", 8888);
			 HttpClientContext hc=new HttpClientContext();
			 CredentialsProvider credsProvider = new BasicCredentialsProvider();
			 credsProvider.setCredentials(new AuthScope(IP,PORT),new UsernamePasswordCredentials(username, password));		 
			 hc.setCredentialsProvider(credsProvider);
//			 hc.setAttribute(id, obj);
			 String uri;
			 if(ip ==null || port ==null){
				 System.out.println("use ip & port default!");
				 ip=IP;
				 port=String.valueOf(PORT);
				 uri=HEADER+IP+":"+PORT+"/"+relativeUrl;
			 }else{
				 uri=HEADER+ip+":"+port+"/"+relativeUrl;
			 }
			 
			 HttpHost proxy = new HttpHost("localhost", 8888, "http");  
		     RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
			 
			 HttpPost post = new HttpPost(uri);
			 HttpHost target = new HttpHost(uri, Integer.parseInt(port),"http");
			 post.setConfig(config);
			 CloseableHttpResponse hrsp= client.execute(target,post);
			 HttpEntity entity=hrsp.getEntity();
			 
			 return EntityUtils.toString(entity, "UTF-8");	
		}
		System.out.println("username or password wrong !");
		return null;
		
	}
	
	public static String doPostWithAuth(String username,String password,String relativeUrl,Map<String,String> paraMap) throws Exception{
		return doPostWithAuth(null,null,username,password,relativeUrl,paraMap);		
	}

	//
	public static void main(String[] args) throws Exception {

		
		System.out.println( doPostWithAuth ("www.baidu.com","80","jingjing_test1","123223","",""));//"value=0&pageid="+pageId+"&uid="+uid)
	}
}
