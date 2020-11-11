package ioc.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * @author xy
 * @version 1.0
 * @description
 * @date 2020/11/10 13:26
 */
public class ResourceDemo {

	public static void main(String[] args) {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		System.out.println("testDefaultResourceLoader");
		testResourceLoader(resourceLoader);
		System.out.println("testFileSystemResourceLoader");
		resourceLoader = new FileSystemResourceLoader();
		testResourceLoader(resourceLoader);
	}


	private static void testResourceLoader(ResourceLoader resourceLoader) {

		/** 使用DefaultResourceLoader 获取,拿到的resource class是class org.springframework.core.io.DefaultResourceLoader$ClassPathContextResource
		 * 	稍微有点不合理
		 *	spring提供了 FileSystemResourceLoader => 对应resource 为 FileSystemContextResource
		 *	ClassRelativeResourceLoader => 对应resource 为 ClassRelativeContextResource
		 *	来方便我们进行处理
		 * */
		System.out.println("====================");
		/* 相对路径 */
		Resource fileResource_1 = resourceLoader.getResource("log4j2-test.xml");
		System.out.println(fileResource_1.getClass());
		System.out.println("====================");
		/* 绝对路径 */
		Resource fileResource_2 = resourceLoader.getResource("/data/resource_demo.txt");
		System.out.println(fileResource_2.getClass());
		System.out.println("====================");
		/* classPath路径 */
		Resource classPathResource = resourceLoader.getResource("classpath:log4j2-test.xml");
		System.out.println(classPathResource.getClass());
		System.out.println("====================");
		/* url路径 */
		Resource urlResource = resourceLoader.getResource("http://www.baidu.com");
		System.out.println(urlResource.getClass());
		System.out.println("====================");
	}

}
