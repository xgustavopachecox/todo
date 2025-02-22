package br.com.todo.service;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.todo.entity.todo;
import br.com.todo.repository.todoRepository;

@Service
public class TodoService {
    private todoRepository todoRepository;

    public TodoService(br.com.todo.repository.todoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<todo> create(todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<todo> update(todo todo){
        todoRepository.save(todo);
        return list();
    }
    
    public List<todo> delete(Long id){
        todoRepository.deleteById(id)   ;
        return list();
    }
}
