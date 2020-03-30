package pl.com.nur.pracadomowa6progaspektoweemail.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MoviesAspect {

    MailService mailService;

    public MoviesAspect(MailService mailService) {
        this.mailService = mailService;
    }

//    @Around("@annotation(MailAnnotation)")
//    private void aroundMail(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("aroundHello");
//        joinPoint.proceed();  // wykonaj metodę przed którą wywołujemy Aspekt
//    }

    @Before("@annotation(MailAnnotation)")
    private void afterHello() {
        mailService.sendSimpleEmail("nur@interia.pl", "test z aplikacji", "ktoś dodał" +
                " film w Twojej aplikacji");
    }

}
