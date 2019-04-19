/**
 * 
 */
package com.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Karthikeyan.v
 *
 */
@Configuration
@PropertySource("file:D:/Test/configprops.properties")
@ConfigurationProperties(prefix = "*")
public class ConfigFile {

	@Autowired
	private Environment env;

	@Bean
	public void proValue() {
		System.out.println("Port ::::: "+env.getProperty("server.port"));
		System.out.println("User Name ::::: "+env.getProperty("user.name"));
		System.out.println("Password ::::: "+env.getProperty("user.password"));
		System.out.println("Database URL ::::: "+env.getProperty("spring.datasource.url"));
	}
}
