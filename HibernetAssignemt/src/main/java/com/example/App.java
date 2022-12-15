package com.example;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static String addEmpolyee(Session s, Transaction t) {
		// object creation
		Empolyee emp = new Empolyee();
		// scanner class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id :");
		int eid = sc.nextInt();
		emp.setEid(eid);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Employee Name :");
		String ename = sc1.nextLine();
		emp.setEname(ename);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Employee Deparment :");
		String edept = sc2.nextLine();
		emp.setEdept(edept);

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Employee Salary :");
		int esalary = sc3.nextInt();
		emp.setEsalary(esalary);

		Address ad = new Address();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the Employee Home Name :");
		String hname = sc2.nextLine();
		ad.setEhname(hname);

		Scanner sc5 = new Scanner(System.in);
		System.out.println("Enter the Employee Area :");
		String area = sc2.nextLine();
		ad.setEarea(area);

		Scanner sc6 = new Scanner(System.in);
		System.out.println("Enter the Employee City :");
		String city = sc6.nextLine();
		ad.setEcity(city);

		Scanner sc7 = new Scanner(System.in);
		System.out.println("Enter the Employee Pincode :");
		int pincode = sc7.nextInt();
		ad.setEpincode(pincode);
		emp.setAddress(ad);
		s.save(emp);
		
		return "Record Added";
	}

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Empolyee.class);
		SessionFactory sf = con.buildSessionFactory();
		Session ss = ((SessionFactory) sf).openSession();
		Transaction T = ((SharedSessionContract) ss).beginTransaction();
		System.out.println(addEmpolyee(ss, T));
		T.commit();
	}
}

/*

+-----+-------------+-------+----------------+----------+-------+--------+---------+
| eid | earea       | ecity | ehname         | epincode | edept | ename  | esalary |
+-----+-------------+-------+----------------+----------+-------+--------+---------+
|   1 | Hadapsar    | Pune  | Shivtej Niwas  |   412308 | cs    | Prasad |   45000 |
|   2 | Karve Nagar | Pune  | Shivanya niwas |   411028 | CSe   | Aarti  |   60000 |
+-----+-------------+-------+----------------+----------+-------+--------+---------+

*/