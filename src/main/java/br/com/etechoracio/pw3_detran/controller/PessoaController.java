package br.com.etechoracio.pw3_detran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bing.annotation.PostMapping;

import br.com.etechoracio.pw3_detran.entity.Pessoa;
import br.com.etechoracio.pw3_detran.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaRepository repository;
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	@GetMapping
	private List<Pessoa> buscar()
	{
		dados = repository.findAll();
		return dados;
	}
}
@PostMapping
public void inserir (@RequestBody Pessoa pessoa)
{
	repository.save(pessoa),
}

