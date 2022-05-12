package com.edubridge.hibernate.annotation;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateOrSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = UserSession.getSession();
		System.out.println("session2 created");
		Employee employee=new Employee();
		employee.setFirstName("shai");
		employee.setLastName("laja");
		System.out.println("object created");
		Transaction t5=session.beginTransaction();
		System.out.println("333333333333333333");
		session.saveOrUpdate(employee);
		employee.setLastName("dhumale");
		System.out.println("4444444444444444444");
		t5.commit();//saving or storing 
		System.out.println("5555555555555");
		session.close();

	}

}