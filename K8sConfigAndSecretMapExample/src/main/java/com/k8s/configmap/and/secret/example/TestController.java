package com.k8s.configmap.and.secret.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${my.project.first.config.property}")
	private String firstConfigProperty;

	@Value("${my.project.second.config.property}")
	private String secondConfigProperty;

	@Value("${my.project.first.secret}")
	private String secretFirstKey;

	@Value("${my.project.second.secret}")
	private String secretSecondKey;

	@GetMapping("/configTest")
	public String getData() {
		System.out.println("First config property:" + firstConfigProperty + ", second config property:" + secondConfigProperty
				+ ", first secret key:" + secretFirstKey + ", second secret key:" + secretSecondKey);
		return "First config property:" + firstConfigProperty + ", second config property:" + secondConfigProperty
				+ ", first secret key:" + secretFirstKey + ", second secret key:" + secretSecondKey;
	}
}
