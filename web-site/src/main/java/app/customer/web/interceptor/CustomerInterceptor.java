package app.customer.web.interceptor;

import core.framework.web.Interceptor;
import core.framework.web.Invocation;
import core.framework.web.Response;

/**
 * @author simple
 */
public class CustomerInterceptor implements Interceptor {
    @Override
    public Response intercept(Invocation invocation) throws Exception {
        //TODO: something
        return invocation.proceed();
    }
}
