package test;

import com.greenhat.annotation.Aspect;
import com.greenhat.annotation.Controller;
import com.greenhat.proxy.AspectProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by jiacheng on 2017/7/31.
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAspect.class);
    private long begin;
    @Override
    public void before(Class<?> cls, Method method, Object[] params) {
        logger.info("--------begin-------");
        logger.info("class: [{}]",cls.getName());
        logger.info("method: [{}]",method.getName());
        begin =System.currentTimeMillis();

    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params, Object result) {
        logger.info("time: [{}] ms",System.currentTimeMillis()-begin);
        logger.info("--------end-------");
    }


}
