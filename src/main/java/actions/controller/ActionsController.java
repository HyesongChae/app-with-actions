package actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import actions.entity.Student;
import actions.service.StudentService;

@RestController
public class ActionsController {
	
	StudentService studentService;
	
	@GetMapping(value = "/api/actions")
	public String actionsTest() {
		return "app-with-actions version:0.0.3" ;
	}
	
	@GetMapping(value = "/student/insert")
	public void insertStudent (Student student) {
		studentService.insertStudent(student);
	}
	
	@GetMapping(value = "/student/select")
	public Student selectStudent (Long id) {
		Student std = studentService.selectStudent(id);
		return std;
	}
	
	@GetMapping(value = "/student/update")
	public void updateStudent (Long id, Student student) {
		studentService.updateStudent(id, student);
	}
	
	@GetMapping(value = "/student/delete")
	public void deleteStudent (Long id) {
		studentService.deleteStudent(id);
	}
	
}
