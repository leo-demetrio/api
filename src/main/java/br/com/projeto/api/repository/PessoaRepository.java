package br.com.projeto.api.repository;

import br.com.projeto.api.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

    List<Pessoa> findAll();
}
