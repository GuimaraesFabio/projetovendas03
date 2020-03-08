package com.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.services.DbService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DbService _dbService;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

	@Bean
	public boolean instaciateDataBase() throws ParseException {

		if (!"create".equals(strategy)) {
			return false;
		}
		_dbService.instanciateTestDataBase();
		return true;
	}
}
