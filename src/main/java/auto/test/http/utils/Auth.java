package auto.test.http.utils;

import java.lang.annotation.ElementType;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  
import java.lang.annotation.Target;  
@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.TYPE,ElementType.METHOD})  
public @interface Auth {  
	Permission value() default Permission.USER;   
    enum Permission{
    	ADMIN,
    	USER,
    	SUPER;
    };
} 
