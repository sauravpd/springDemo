package codeSamples;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
class MyAspect
{
	@Before("execution(* codeSamples.Company.*(..))")
	public void before(JoinPoint joinPoint)
	{
		System.out.println("Before "+joinPoint.getSignature().getName());
	}
	
	@After("execution(* codeSamples.Company.*(..))")
	public void after(JoinPoint joinPoint)
	{
		System.out.println("After "+joinPoint.getSignature().getName());
	}
}
