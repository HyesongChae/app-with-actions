package actions.service;

import org.springframework.stereotype.Service;

import actions.entity.Student;
import actions.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentService {

	private final StudentRepository studentRepository;
	
	public void insertStudent (Student student) {
		studentRepository.save(student);
	}
	
	public Student selectStudent (Long id) {
		return studentRepository.getReferenceById(id);
	}
	
	public void updateStudent (Long id, Student student) {
		Student std = studentRepository.getReferenceById(id);
		
		if(std != null) {
			student.setId(id);
			studentRepository.save(student);	
		}
	}
	
	public void deleteStudent (Long id) {
		studentRepository.deleteById(id);
	}
}
