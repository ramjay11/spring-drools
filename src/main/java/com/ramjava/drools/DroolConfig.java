package com.ramjava.drools;

import java.io.IOException;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolConfig {

	private KieServices kieServices = KieServices.Factory.get();
	
	private KieFileSystem getKieFileSystem() throws IOException() {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write(ResourceFactory.newClassPathResource("rules/offer.drl"));
		return kieFileSystem;
	}
	
	@Bean
	public KieContainer getKieContainer() throws IOException {
		System.out.println("Container Created...");
		getKeyRepository();
		KieBuilder kb = KieServices.newKieBuilder(getKieFileSystem());
		kb.buildAll();
	}
}












