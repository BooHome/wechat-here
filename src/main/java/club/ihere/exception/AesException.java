package club.ihere.exception;

/**
 * @author: fengshibo
 * @date: 2018/11/2 15:19
 * @description:
 */
public class AesException extends BaseException {

    private static final long serialVersionUID = -4347418498902767087L;

    public AesException(String message, Throwable cause) {
        super(message, cause);
    }

    public AesException(String message) {
        super(message);
    }

    public AesException(Throwable cause) {
        super(cause);
    }
}
