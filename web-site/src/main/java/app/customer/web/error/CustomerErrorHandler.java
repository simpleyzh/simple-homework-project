package app.customer.web.error;

import core.framework.web.ErrorHandler;
import core.framework.web.Request;
import core.framework.web.Response;

import java.util.Optional;

/**
 * @author simple
 */
public class CustomerErrorHandler implements ErrorHandler {
    @Override
    public Optional<Response> handle(Request request, Throwable e) {
        return Optional.empty();
    }
}
