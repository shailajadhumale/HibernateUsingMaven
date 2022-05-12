package com.edubridge.hibernate.model;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.*;



public class Test {
	public static void main(String[] args) {
		try {

			Configuration cfg = new Configuration();
			cfg.configure("emp.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			//Transaction t = session.beginTransaction();
			Transaction t;
			// Session session=new
			// AnnotationConfiguration().configure().buildSessionFactory().openSession();

			//Employee e1 = new Employee();
			//e1.setId(1234);
			//e1.setFirstName("girish");
			//.setLastName("kumar");

			//Employee e2 = new Employee();
			//e2.setId(5678);
			//e2.setFirstName("mohan");
			//e2.setLastName("patil");

			//session.persist(e1);
			//session.persist(e2);

			//t.commit();
			Scanner sn=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
			t=session.beginTransaction();

			Employee e1 = new Employee();
			//e1.setId(1234);
			e1.setFirstName(sn.next());
			e1.setLastName(sn.next());

			/*Employee e2 = new Employee();
			//e2.setId(5678);
			e2.setFirstName("mohan");
			e2.setLastName("patil");*/

			session.persist(e1);
			//session.persist(e2);

			t.commit();
			}
			session.close();
			System.out.println("successfully saved");
		} catch (Exception ex) {
			System.out.println("exception " + ex.getMessage());
		}
	}
}



