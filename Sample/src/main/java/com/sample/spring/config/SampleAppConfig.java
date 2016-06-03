package com.sample.spring.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class SampleAppConfig {
	
	@Autowired
	private Environment environment;
	
	private static SampleAppConfig sampleAppConfig = null;
	
	public static SampleAppConfig getInstance() {
		return sampleAppConfig;
	}
	
	public String getConfigValue(String configKey) {
		return environment.getProperty(configKey);
	}
	
	@PostConstruct
	public void initIt() throws Exception {
		sampleAppConfig = this;
	}

}
