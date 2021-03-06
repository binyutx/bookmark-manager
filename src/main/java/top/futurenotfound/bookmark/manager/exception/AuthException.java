package top.futurenotfound.bookmark.manager.exception;

import lombok.Getter;

/**
 * 认证异常
 *
 * @author liuzhuoming
 */
@Getter
public class AuthException extends RuntimeException {
    private static final long serialVersionUID = -5786150841339936581L;
    private final ExceptionCode exceptionCode;

    public AuthException(ExceptionCode exceptionCode) {
        super(exceptionCode.toString());
        this.exceptionCode = exceptionCode;
    }
}
