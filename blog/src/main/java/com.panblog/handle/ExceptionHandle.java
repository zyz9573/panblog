package com.panblog.handle;

import com.panblog.domain.Result;
import com.panblog.exception.UserException;
import com.panblog.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResultUtil.fail(userException.getCode(), userException.getMessage());
        }else {
            logger.error("system bug {}", e);
            return ResultUtil.fail(-1, "unknown error");
        }
    }
}