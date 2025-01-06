package br.com.danilo.desafio_todolist_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.danilo.desafio_todolist_java.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
