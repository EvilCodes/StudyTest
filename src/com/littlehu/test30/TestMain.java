package com.littlehu.test30;

public class TestMain {
	public static void main(String[] args) {
		StudentDao studentDao=new StuDaoImpl();
		
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student:[RollNo:"
					+ student.getRollNo()+",Name:"+student.getName()+"]");
			
		}
		
		
		Student student = studentDao.getAllStudents().get(0);
		System.out.println(student.getName());
		student.setName("Job");
		studentDao.updateStudent(student);
		
		
		studentDao.getStudent(0);
		System.out.println("Student:[RollNo:"+student.getRollNo()+",Name:"+student.getName()+"]");
		
	}

}
