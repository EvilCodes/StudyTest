package com.littlehu.test30;

import java.util.List;

public interface StudentDao {
	public List<Student> getAllStudents();
	
	public Student getStudent(int rollNo);
	
	public void updateStudent(Student stu);
	
	public void deleteStudent(Student stu);
	

}
