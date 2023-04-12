package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que o código abaixo vai ser um Controller, ou umcontrolador da nossa API
@RestController

//indica o endpoint da nossa classe controladora
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Alô mundão!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Trabalho em equipe";
	}

	@GetMapping("/bsm2")
	public String bsm2() {
		return "Proatividade";
	}
}
