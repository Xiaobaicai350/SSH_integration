package pointcutexample;

import org.aspectj.lang.JoinPoint;

public class LbeforeAdvice {
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("***" + methodName + "方法开始执行......");
    }
}
