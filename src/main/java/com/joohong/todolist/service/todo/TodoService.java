package com.joohong.todolist.service.todo;

import com.joohong.todolist.web.dto.todo.CreateTodoReqDto;

public interface TodoService {
	//추가
	public boolean createTodo(CreateTodoReqDto createTodoReqDto) throws Exception; 
	// 수정
	// 삭제
	// 조회 
}
