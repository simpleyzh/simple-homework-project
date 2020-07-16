package app.customer.web.exception;

import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.ResponseStatus;
import core.framework.log.ErrorCode;
import core.framework.log.Severity;

@ResponseStatus(HTTPStatus.OK)
public class SelfException extends RuntimeException implements ErrorCode {
    private static final long serialVersionUID = 5048293172410780924L;
    private final String errorCode;

    public SelfException(String message) {
        super(message);
        errorCode = "GOOD_REQUEST";
    }

    public SelfException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public SelfException(String message, String errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    @Override
    public Severity severity() {
        return Severity.WARN;
    }

    @Override
    public String errorCode() {
        return errorCode;
    }


}
