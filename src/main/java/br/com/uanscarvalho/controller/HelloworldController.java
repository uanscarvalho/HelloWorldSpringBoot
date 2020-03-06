package br.com.uanscarvalho.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.uanscarvalho.bean.Pessoa;
import br.com.uanscarvalho.bean.Response;

@RestController
public class HelloworldController {

	@RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public @ResponseBody Response welcome(@RequestBody Pessoa pessoa) {

		Response response = new Response();
		response.setMensagem("Ola " + pessoa.getNome());

		return response;
	}
}
