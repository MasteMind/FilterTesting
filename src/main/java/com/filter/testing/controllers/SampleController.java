package com.filter.testing.controllers;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Async
@RestController
@RequestMapping("/")
public class SampleController {

	/*@GetMapping("/")
	public CompletableFuture<String> firstHit(){
		return CompletableFuture.completedFuture("Hello World!");
	}*/
	
	@PostMapping("/")
	public CompletableFuture<String> firstHit(@RequestBody String Val){
		return CompletableFuture.completedFuture("Hello "+Val+"!");
	}
}
