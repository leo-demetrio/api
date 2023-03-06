package br.com.projeto.api.controller;

import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControleController {

    @Autowired
    private PessoaRepository acao;

    @GetMapping("pessoa/findAll")
    public List<Pessoa> findAll(){
        return acao.findAll();
    }

    @PostMapping("/pessoa/cadastrar")
    public Pessoa cadastrar(@RequestBody Pessoa p){
        return acao.save(p);
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
}
