package dev.orwin.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    Logger logger = LogManager.getLogger(LoggingAspect.class);

    @Before("logJP()")// This method will run right before a controller method is called
    public void logRequest(){
        logger.info("Request was called and handled");
    }

    //Pointcuts are a regular expression to select methods within your application
    @Pointcut("within(dev.orwin.controllers..*)")
    private void logJP(){} //Empty method with no uses



}
