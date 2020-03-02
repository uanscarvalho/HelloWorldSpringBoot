package br.com.uanscarvalho.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.uanscarvalho.bean.Pessoa;

@RestController
public class HelloworldController {
	
	@RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String welcome(@RequestBody Pessoa pessoa) {
		return "Ola " + pessoa.getNome();
	}
}
