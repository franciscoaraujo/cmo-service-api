package br.com.assmbl.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class SpringDataRestConfig implements RepositoryRestConfigurer {
	
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

		cors.addMapping("/*").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE").allowCredentials(false)
				.maxAge(3600);
	}
}
