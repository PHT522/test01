package kh.com.edu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAop {

	
	// 자동 호출하게 만들꺼다..
	@Around("within(kh.com.edu.dao.impl.*)")//패키지 경로지정(xml에서 설정을 여기다 해준다)
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		
		String signatureStr = joinpoint.getSignature().toShortString();		
		//System.out.println(signatureStr + " 시작");
		
		// 공통 기능
		//System.out.println("실행전:" + System.currentTimeMillis());	// 시간이 나온다
		
		try {
			//어떤 메소가 호출되었는가 확인용
			System.out.println("loggerApp:" + signatureStr +  " 메소드 실행");
			Object obj = joinpoint.proceed();	// 핵심기능 실행
			return obj;
			
		}finally {
		//	System.out.println("실행후:" + System.currentTimeMillis());
		//	System.out.println(signatureStr + " 종료");
		}
		
	}
	
}
