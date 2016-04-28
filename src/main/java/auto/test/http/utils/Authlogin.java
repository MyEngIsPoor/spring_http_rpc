package auto.test.http.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Authlogin extends HandlerInterceptorAdapter{

	@Override  
    public boolean preHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler) throws Exception {
		
		Annotation class_an=handler.getClass().getAnnotation(Auth.class);
		//类上有全都拦截
		
		//只拦截有标识的方法
		Method[] ms=handler.getClass().getDeclaredMethods();
		System.out.println("------------------------------");
		for(Method m: ms){
			System.out.println(m.getName());
		}
		System.out.println("------------------------------");
	//	response.sendRedirect("/index");
		return true;  
	}

}
