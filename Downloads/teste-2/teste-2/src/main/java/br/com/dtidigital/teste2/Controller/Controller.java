package br.com.dtidigital.teste2.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dtidigital.teste2.Entities.Students;
import br.com.dtidigital.teste2.Service.StudentsService;

@RestController
@RequestMapping("/students")
public class Controller {
	
	@Autowired
	private StudentsService studentsService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Students> listAll(){
		return this.studentsService.listAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Students getStudentById(@PathVariable("id") int id) {
		return this.studentsService.getStudentById(id);
		
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		this.studentsService.deleteStudents(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Students student) {
		this.studentsService.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Students student) {
		this.studentsService.insertStudent(student);
	}
}
