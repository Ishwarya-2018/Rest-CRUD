package api.springbootrestapicrud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import api.springbootrestapicrud.data.StudentWrapper;
import api.springbootrestapicrud.service.StudentService;

@RestController
public class StudentController {

    @Autowired
   private StudentService studentService;

    @PostMapping("/saveStudent")
public ResponseEntity<StudentWrapper> saveStudent(@RequestBody StudentWrapper studentWrapper){
    	studentWrapper = studentService.saveStudent(studentWrapper);
    	return ResponseEntity.ok(studentWrapper);
    }
}