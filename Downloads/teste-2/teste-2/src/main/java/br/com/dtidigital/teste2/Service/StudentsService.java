package br.com.dtidigital.teste2.Service;

import br.com.dtidigital.teste2.Entities.Students;
import br.com.dtidigital.teste2.DAO.DAO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {
	
	@Autowired
	private DAO studentDAO;
	
	public Collection<Students> listAll(){
		return this.studentDAO.listAll();
	}
	
	public Students getStudentById(int id) {
		return this.studentDAO.getStudentById(id);
		
	}

	public void deleteStudents(int id) {
		this.studentDAO.deleteStudents(id);
	}
	
	public void updateStudent(Students student) {
		this.studentDAO.updateStudent(student);
	}
	
public void insertStudent(Students student) {
		this.studentDAO.insertStudent(student);
	}
}
