package com.cts.model;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

public class Internationalization extends WebMvcConfigurerAdapter {

	
	 @Bean
	   public LocaleResolver localeResolver() {
		   
		   SessionLocaleResolver slr = new SessionLocaleResolver();
		   
		   slr.setDefaultLocale(Locale.US);
			
			return slr;
	   }
	   
	   //Create LocaleChangeInterceptor object and set the parameter name as language and return the localeChangeInterceptor
	   @Bean
	   public LocaleChangeInterceptor localeChangeInterceptor() {
		   
		   LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		   
		   lci.setParamName("language");
		   
		   return lci;
	   }
	   
	   
	   //register the LocaleChangeInterceptor
	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
		  
		   registry.addInterceptor(localeChangeInterceptor());
	   }
}
