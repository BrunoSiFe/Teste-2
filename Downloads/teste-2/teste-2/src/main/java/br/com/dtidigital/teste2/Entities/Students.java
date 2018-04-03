package br.com.dtidigital.teste2.Entities;

public class Students {
	
	private int id;
	private String name;
	private String course;
	private String studentNumber;//Matricula do Aluno
	
	public Students() {
	}
	
	public Students(int id, String name, String course, String studentNumber) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.studentNumber = studentNumber;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumeber) {
		this.studentNumber = studentNumeber;
	}
	
}