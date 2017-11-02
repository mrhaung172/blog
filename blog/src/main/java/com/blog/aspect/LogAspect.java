package com.blog.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class LogAspect {
	
	@Pointcut("@")
	public void cutPoint() {
		
	}
	
	
	@AfterThrowing(pointcut = "cutPoint()" , throwing = "e")
	public Object arountPoint(JoinPoint point, Throwable e) {
		return null;
		
	}
	
	
}
