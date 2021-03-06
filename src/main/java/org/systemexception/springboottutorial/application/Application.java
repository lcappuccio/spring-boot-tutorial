package org.systemexception.springboottutorial.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * @author leo
 * @date 22/08/15 00:12
 */
@ComponentScan({"org.systemexception.springboottutorial.controller"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		System.out.println("Initializing beans");

		String[] beans = applicationContext.getBeanDefinitionNames();
		Arrays.sort(beans);

		for (String bean: beans) {
			System.out.println("Found bean: " + bean);
		}
	}
}
