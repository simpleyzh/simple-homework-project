package app.customer.web.interceptor;

import app.customer.web.exception.SelfException;
import core.framework.web.Interceptor;
import core.framework.web.Invocation;
import core.framework.web.Response;

/**
 * @author simple
 */
public class CustomerInterceptor implements Interceptor {
    @Override
    public Response intercept(Invocation invocation) {
        //TODO: something
        throw new SelfException("the request test");
//        return invocation.proceed();
    }
}
