package auto.test.http.utils;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Authlogin extends HandlerInterceptorAdapter{

	@Override  
    public boolean preHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler) throws Exception {
		
		Method[] ms=handler.getClass().getDeclaredMethods();
		System.out.println("------------------------------");
		for(Method m: ms){
			System.out.println(m.getName());
		}
		System.out.println("------------------------------");
		response.sendRedirect("http://www.baidu.com");
		return false;  
	}
	
//	@Override
//	public void afterCompletion(
//			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		
//	}
}
