package com.screenscape.utility;

import com.screenscape.exception.ScreenScapeException;
import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {
    static final Log logger = LogFactory.getLog(LoggingAspects.class);

    @AfterThrowing(pointcut = "execution(* com.screenscape.service.*Impl.*(..))", throwing = "exception")
    public void logServices(ScreenScapeException exception){
        logger.error(exception.getMessage(),exception);
    }

}
