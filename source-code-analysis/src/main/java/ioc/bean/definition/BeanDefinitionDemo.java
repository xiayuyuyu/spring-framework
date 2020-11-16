package ioc.bean.definition;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author xy
 * @version 1.0
 * @description
 * @date 2020/11/12 12:09
 */
public class BeanDefinitionDemo {
	public static void main(String[] args) {
		/* <1> */
		ClassPathResource resource = new ClassPathResource("bean.xml");
		/* <2> */
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		/* <3> */
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		/* <4> */
		reader.loadBeanDefinitions(resource);

	}
}
