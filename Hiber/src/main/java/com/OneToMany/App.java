package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Teacher.class);
		Configuration con1 = new Configuration().configure().addAnnotatedClass(Course.class);
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction T = ss.beginTransaction();
		Teacher t = new Teacher();
		t.setTid(1);
		t.setTname("Prasad");
		t.setTsub("Medicle");
		Teacher t1 = new Teacher();
		t1.setTid(2);
		t1.setTname("Shubham");
		t1.setTsub("Medicle");
		Teacher t2 = new Teacher();
		t2.setTid(3);
		t2.setTname("Priyanka");
		t2.setTsub("IT");
		Course c = new Course();
		c.setCid(101);
		c.setCname("Human Anatomay");
		c.setCduration("6 Months");
		c.setTeacher(t1);
		Course c1 = new Course();
		c1.setCid(102);
		c1.setCname("Surgery");
		c1.setCduration("3 Years");
		c1.setTeacher(t);
		Course c2 = new Course();
		c2.setCid(103);
		c2.setCname("Java");
		c2.setCduration("1 Year");
		c2.setTeacher(t2);
		Course c3 = new Course();
		c3.setCid(104);
		c3.setCname("Forensic science");
		c3.setCduration("2 Year");
		c3.setTeacher(t);
		Course c4 = new Course();
		c4.setCid(105);
		c4.setCname("Machine Learning");
		c4.setCduration("6 Month");
		c4.setTeacher(t2);
		List<Course> L = new ArrayList<>();
		L.add(c);
		L.add(c1);
		L.add(c3);
		L.add(c2);
		L.add(c4);
		t.setCourse(L);
		ss.save(t);
		ss.save(t2);
		ss.save(t1);
		ss.save(c);
		ss.save(c1);
		ss.save(c2);
		ss.save(c3);
		ss.save(c4);
		T.commit();
		ss.close();
	}
}
/*


teacher_info_courses;
+-------------+------------+
| Teacher_tid | course_cid |
+-------------+------------+
|           1 |        101 |
|           1 |        102 |
|           1 |        104 |
|           1 |        103 |
|           1 |        105 |
+-------------+------------+


Teacher_info
+-----+----------+---------+
| tid | tname    | tsub    |
+-----+----------+---------+
|   1 | Prasad   | Medicle |
|   2 | Shubham  | Medicle |
|   3 | Priyanka | IT      |
+-----+----------+---------+



 Courses
+-----+-----------+------------------+------+
| cid | Cduration | cname            | tid  |
+-----+-----------+------------------+------+
| 101 | 6 Months  | Human Anatomay   |    2 |
| 102 | 3 Years   | Surgery          |    1 |
| 104 | 2 Year    | Forensic science |    1 |
| 103 | 1 Year    | Java             |    3 |
| 105 | 6 Month   | Machine Learning |    3 |
+-----+-----------+------------------+------+
*/