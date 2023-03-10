package br.com.projeto.api.controller;

import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControleController {

    @Autowired
    private PessoaRepository acao;

    @GetMapping("pessoa/findAll")
    public List<Pessoa> findAll(){
        return acao.findAll();
    }
    @GetMapping("pessoa/findByid/{id}")
    public Pessoa findAll(@PathVariable int id){
        return acao.findByCodigo(id);
    }

    @PostMapping("/pessoa/cadastrar")
    public Pessoa cadastrar(@RequestBody Pessoa p){
        return acao.save(p);
    }
    @DeleteMapping("/pessoa/delete/{id}")
    public void remover(@PathVariable int id){
        Pessoa p = acao.findByCodigo(id);
        acao.delete(p);
    }
    @PutMapping("/pessoa")
    public Pessoa update(@RequestBody Pessoa p){
        return acao.save(p);
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
    @GetMapping("/pessoa/contador")
    public long contador(){
        return acao.count();
    }
    @GetMapping("/pessoa/ordenada")
    public List<Pessoa> ordenaNomes(){
        return acao.findByOrderByNomeAsc();
    }
    @GetMapping("/pessoa/filtra/ordenada")
    public List<Pessoa> filtraOrdenaIdade(){
        return acao.findByNomeOrderByIdadeDesc("Leo");
    }
    @GetMapping("/pessoa/filtra/like")
    public List<Pessoa> filtraLike(){
        return acao.findByNomeContaining("Le");
    }
}
