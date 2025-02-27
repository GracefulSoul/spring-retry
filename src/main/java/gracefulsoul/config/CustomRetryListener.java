package gracefulsoul.config;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;

public class CustomRetryListener implements RetryListener {

	public <T, E extends Throwable> void close(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
		// Something to close.
	}

	public <T, E extends Throwable> void onError(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
		// Something on error.
	}

	public <T, E extends Throwable> boolean open(RetryContext context, RetryCallback<T, E> callback) {
		// Something to open.
		return true;
	}

}
