package com.rest.webservice.limitservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="limits-service")
public class LimitsConfiguration {

	private int minLimit;
	private int maxLimit;
	
	public int getMinLimit() {
		return minLimit;
	}
	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}
	public int getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}
	
	
}
