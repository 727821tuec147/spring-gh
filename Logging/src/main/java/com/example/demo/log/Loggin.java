package com.example.demo.log;



	import java.lang.ModuleLayer.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	@RestController
	public class Loggin {
		
	    
		Logger log= LoggerFactory.getLogger(Controller.class);
		@RequestMapping("/")
		public String demo()
		{
			log.info("information message");
			log.warn("warning messafe");
			log.error("Error message");
			log.trace("trace message");
			
			
			return "Completed";

		}

		
	}
