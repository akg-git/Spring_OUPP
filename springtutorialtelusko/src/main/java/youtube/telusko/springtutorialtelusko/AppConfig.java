package youtube.telusko.springtutorialtelusko;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="youtube.telusko.springtutorialtelusko")
public class AppConfig {
	
//Again instead of this bean annotaion and signature we can use componentscan annotaion with basepackage qualifier 
//	@Bean
//	public Samsung getPhone(){
//		
//		return new Samsung();
//	}
//	
//	@Bean
//	public Mobile getProcess(){
//		return new Snapdragon();
//	}
	
	

}
