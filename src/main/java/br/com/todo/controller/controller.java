package br.com.todo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.com.todo.entity.todo;
import br.com.todo.service.TodoService;


@RestController
@RequestMapping("/todos")
public class controller {

    private TodoService todoService; 
    
    public controller(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<todo> create(@RequestBody todo todo){
        return todoService.create(todo);
    }

    @PutMapping
    List<todo> update(@RequestBody todo todo){
        return todoService.update(todo);
    }
    @GetMapping
    List<todo> list(){
        return todoService.list();
    }
    @DeleteMapping("{id}")
    List<todo> delete(@PathVariable("id") long id){
        return todoService.delete(id);
    }
}
