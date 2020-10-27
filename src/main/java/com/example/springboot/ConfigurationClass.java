package com.example.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("addon-client")
public class ConfigurationClass {
	private String publicJWKS;
	private String privateJWKS;
	private String serviceUrl;
	
	public String getPublicJWKS() {
		return publicJWKS;
	}
	public void setPublicJWKS(String publicJWKS) {
		this.publicJWKS = publicJWKS;
	}
	public String getPrivateJWKS() {
		return privateJWKS;
	}
	public void setPrivateJWKS(String privateJWKS) {
		this.privateJWKS = privateJWKS;
	}
	public String getServiceUrl() {
		return serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	@Override
	public String toString() {
		return "ConfigurationClass [publicJWKS=" + publicJWKS + ", privateJWKS=" + privateJWKS + ", serviceUrl="
				+ serviceUrl + "]";
	}
	
	
}
