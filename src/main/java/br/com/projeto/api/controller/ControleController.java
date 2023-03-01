package br.com.projeto.api.controller;

import br.com.projeto.api.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControleController {

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
}
