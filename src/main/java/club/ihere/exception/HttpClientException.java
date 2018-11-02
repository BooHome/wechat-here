package club.ihere.exception;

/**
 * @author: fengshibo
 * @date: 2018/11/2 11:19
 * @description:
 */
public class HttpClientException extends BaseException {

    private static final long serialVersionUID = -4347418498902767086L;

    public HttpClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpClientException(String message) {
        super(message);
    }

    public HttpClientException(Throwable cause) {
        super(cause);
    }

}
