package br.com.bytegames.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //quer dizer que é uma classe que vai receber requisições
@RequestMapping("/clientes")   //mappeia os endpoints para receber as requisições em determinada rota

public class ClienteController {
	
	@GetMapping
	public String hello() {
		return "Hello world!";
	}
	
}
