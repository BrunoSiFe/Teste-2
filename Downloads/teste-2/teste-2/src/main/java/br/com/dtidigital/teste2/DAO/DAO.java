package br.com.dtidigital.teste2.DAO;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import br.com.dtidigital.teste2.Entities.*;

@Repository
public class DAO {

	private static HashMap<Integer, Students> students;
	
	static {
		students = new HashMap<Integer, Students>(){
			{
				put(1,new Students(1,"Marco","Gastronomia","1234"));
				put(2,new Students(2,"Victor","Gastronomia","4321"));
				put(3,new Students(3,"Breno","Gastronomia","1342"));
				put(4,new Students(4,"Jake","Gastronomia","1243"));
			}
		};
	}
	
	public Collection<Students> listAll(){
		return this.students.values();
		
	}
	
	public Students getStudentById(int id) {
		return this.students.get(id);
		
	}

	public void deleteStudents(int id) {
		this.students.remove(id);
		
	}
	
	public void updateStudent(Students student) {
		Students s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		s.setStudentNumber(student.getStudentNumber());
	}
	
	public void insertStudent(Students student) {
		this.students.put(student.getId(), student);
	}

}
