package gracefulsoul.service;

import java.sql.SQLException;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public interface SqlService {

	@Retryable(retryFor = SQLException.class, maxAttempts = 3, backoff = @Backoff(delay = 100))
	void execute(String sql);

	@Recover
	void recover(SQLException e, String sql);

}
