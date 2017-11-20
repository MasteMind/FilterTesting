package com.filter.testing.filters;

import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.filter.testing.service.LoggingService;

@WebFilter
@Component
public class LogFilter extends OncePerRequestFilter{
	
	@Autowired
	LoggingService loggingService;

	@Override
	protected void doFilterInternal(HttpServletRequest arg0, HttpServletResponse arg1, FilterChain arg2)
			throws ServletException, IOException {
		long startTime = (new Date()).getTime();
		doFilter(arg0, arg1, arg2);
		long endTime = (new Date()).getTime();
		
		loggingService.logDetails(arg1.getHeaderNames().toString()+"\n"+arg1.getHeaderNames().toString());
		loggingService.logDetails((endTime - startTime)+"");
		
	}
	

}
