package com.joohong.todolist.service.todo;

import org.springframework.stereotype.Service;

import com.joohong.todolist.domain.todo.Todo;
import com.joohong.todolist.domain.todo.TodoRepository;
import com.joohong.todolist.web.dto.todo.CreateTodoReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServcieImpl implements TodoService {
	
	private final TodoRepository todoRepository;

	@Override
	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception {
		Todo todoEntity = createTodoReqDto.toEntity();
		
		return todoRepository.save(todoEntity) > 0;
	}
	
}
