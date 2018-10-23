package com.littlehu.test27;

public class TestMain {
	
	public static void main(String[] args) {
		
		Student model=retriveStudentFromDatabase();
		StudentView studentView=new StudentView();
		
		
		StudentController controller=new StudentController(model, studentView);
		
		controller.updateView();
		controller.setStudentName("小李广华容");
		controller.updateView();




		
	}
	
	
	private static Student retriveStudentFromDatabase(){
		Student student=new Student();
		student.setName("黑旋风李逵");
		student.setRollNo("20");
		return student;
	}

}
