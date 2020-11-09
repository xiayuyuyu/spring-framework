import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xy
 * @version 1.0
 * @date 2020/11/6 21:40
 */
public class AnnotationInjectionDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		User bean = (User) applicationContext.getBean("user");
		System.out.println(bean);
	}

}
