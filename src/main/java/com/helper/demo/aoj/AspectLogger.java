package com.helper.demo.aoj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectLogger {
private static final Logger log=LogManager.getLogger(AspectLogger.class);

//@Pointcut(value="execution(* com.helper.demo.*.*.*(..) )")
//public void myPointcut() {
//	
//}

@Around(value="execution(* com.helper.demo.*.*.*(..) )")
public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
	ObjectMapper mapper = new ObjectMapper();
	String methodName = pjp.getSignature().getName();
	String className = pjp.getTarget().getClass().toString();
	Object[] array = pjp.getArgs();
	log.info("method invoked " + className + " : " + methodName + "()" + "arguments : "
			+ mapper.writeValueAsString(array));
	Object object = pjp.proceed();
	log.info(className + " : " + methodName + "()" + "Response : "
			+ mapper.writeValueAsString(object));
	return object;
}

}
