package com.org.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);

	}
	
	//To enable Hibernate SessionFactory in SpringBoot
	//all the things which we want to use in springBoot
	// is injected as a bean 
	// and this is ready to use
	@Bean
	public HibernateJpaSessionFactoryBean sessionFactory() {
	    return new HibernateJpaSessionFactoryBean();
	}

}
