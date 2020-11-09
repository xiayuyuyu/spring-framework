import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xy
 * @version 1.0
 * @date 2020/11/6 21:17
 */
@Configuration
public class JavaConfig {

	@Bean
	public User user() {
		return new User("张三", 20, "男");
	}
}
