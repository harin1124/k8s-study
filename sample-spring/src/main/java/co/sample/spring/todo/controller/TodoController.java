package co.sample.spring.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
	@GetMapping("/list")
	public String pageTodoList () {
		return "todo list sample";
	}
}