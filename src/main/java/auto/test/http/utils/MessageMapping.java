package auto.test.http.utils;

import java.util.HashMap;
import java.util.Map;

public class MessageMapping {

	private static Map<Integer,String> msgMap=new HashMap<Integer,String>();
	
	static{
		msgMap.put(0,"");
		msgMap.put(1, "login failed! check username and password please.");
	}
	
	public static String getMsgByCode(int msgCode){
		return msgMap.get(msgCode);
	}
}
