package api.springbootrestapicrud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.springbootrestapicrud.data.StudentWrapper;
import api.springbootrestapicrud.model.Student;
import api.springbootrestapicrud.repository.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public StudentWrapper saveStudent(StudentWrapper inputStudent) {
		
		Student student = new Student();
		// student.setId(inputStudent.getId());
		//student.setId(inputStudent.getId());
		student.setName(inputStudent.getName());
		
		student = repository.save(student);
		
		inputStudent.setId(student.getId());
		inputStudent.setName(student.getName());	
		return inputStudent;
	}
}
