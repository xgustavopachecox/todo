package br.com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.todo.entity.todo;


public interface todoRepository extends JpaRepository <todo, Long>{
    
}
