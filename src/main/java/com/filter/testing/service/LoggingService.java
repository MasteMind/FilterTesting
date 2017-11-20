package com.filter.testing.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {
	final static Logger LOG = LoggerFactory.getLogger(LoggingService.class);
	
	public void logDetails(String details){
		LOG.info(details);
	}
	
}
