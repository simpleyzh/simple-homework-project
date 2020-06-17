package app.customer.web.interceptor;

import core.framework.web.Interceptor;
import core.framework.web.Invocation;
import core.framework.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class CustomerInterceptor implements Interceptor {
    private final Logger logger = LoggerFactory.getLogger(CustomerInterceptor.class);

    @Override
    public Response intercept(Invocation invocation) throws Exception {
        //TODO: something
        logger.warn("the request is move in interceptor and pass");
        return invocation.proceed();
    }
}
