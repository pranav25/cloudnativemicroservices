package cloudnative.microservices.chapter1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Chapter1Application {

	public static void main(String[] args) {
		 SpringApplication.run(Chapter1Application.class, args);
//		ApplicationContext ctx = SpringApplication.run(Chapter1Application.class, args);
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//		}
	}
}
