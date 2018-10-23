package com.littlehu.test27;

public class TestMain {
	
	public static void main(String[] args) {
		
		Student model=retriveStudentFromDatabase();
		StudentView studentView=new StudentView();
		
		
		StudentController controller=new StudentController(model, studentView);
		
		controller.updateView();
		controller.setStudentName("С��㻪��");
		controller.updateView();




		
	}
	
	
	private static Student retriveStudentFromDatabase(){
		Student student=new Student();
		student.setName("����������");
		student.setRollNo("20");
		return student;
	}

}
