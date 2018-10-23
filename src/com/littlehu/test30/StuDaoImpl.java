package com.littlehu.test30;

import java.util.ArrayList;
import java.util.List;

public class StuDaoImpl implements StudentDao{
	
	List<Student> stus;

	
	public StuDaoImpl() {
		stus=new ArrayList<Student>();
		Student stu1=new Student("ÀîåÓ", 0);
		Student stu2=new Student("ÎäËÉ", 1);
		stus.add(stu1);
		stus.add(stu2);
	}
	@Override
	public List<Student> getAllStudents() {
		return stus;
	}

	@Override
	public Student getStudent(int rollNo) {
		return stus.get(rollNo);
	}

	@Override
	public void updateStudent(Student stu) {
		stus.get(stu.getRollNo()).setName(stu.getName());		
		System.out.println("Student: Roll No"
				+ stu.getRollNo()+",updated in the database");
	}

	@Override
	public void deleteStudent(Student stu) {
		
		stus.remove(stu.getRollNo());
		System.out.println("Student:Roll No"+stu.getRollNo()+",deleted from database");
		
	}

}
