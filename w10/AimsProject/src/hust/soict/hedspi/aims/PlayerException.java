package hust.soict.hedspi.aims;

public class PlayerException extends Exception {

  public PlayerException() {
    super();
  }

  public PlayerException(String message) {
    super(message);
  }

  public PlayerException(Throwable cause) {
    super(cause);
  }

  public PlayerException(String message, Throwable cause) {
    super(message, cause);
  }

  protected PlayerException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
