package Text.SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Text.Entity.Agent;
import Text.Entity.AgentDao;


public class App {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		AgentDao dao= (AgentDao) ap.getBean("Prasad");
		System.out.println(dao.saveAgent(new Agent(1, "Prasad", 30000)));
		System.out.println(dao.saveAgent(new Agent(2, "Priyanka", 60000)));
		System.out.println(dao.saveAgent(new Agent(3, "Aarti", 50000)));
		System.out.println(dao.saveAgent(new Agent(4, "Shubham", 40000)));
		System.out.println(dao.saveAgent(new Agent(5, "Rohidas", 20000)));
		System.out.println(dao.updateAgent(new Agent(2, "Rutuja", 10000)));
		System.out.println(dao.deleteAgent(new Agent(2)));
	}
}


/*
 
 Insert Value Into Agent Table
+----+----------+-----------+
| id | name     | comission |
+----+----------+-----------+
|  1 | Prasad   |     30000 |
|  2 | Priyanka |     60000 |
|  3 | Aarti    |     50000 |
|  4 | Shubham  |     40000 |
|  5 | Rohidas  |     20000 |
+----+----------+-----------+

Update Value Into Agent Table
+----+---------+-----------+
| id | name    | comission |
+----+---------+-----------+
|  1 | Prasad  |     30000 |
|  2 | Rutuja  |     10000 |
|  3 | Aarti   |     50000 |
|  4 | Shubham |     40000 |
|  5 | Rohidas |     20000 |
+----+---------+-----------+

Delete Value Into Agent Table
+----+---------+-----------+
| id | name    | comission |
+----+---------+-----------+
|  1 | Prasad  |     30000 |
|  3 | Aarti   |     50000 |
|  4 | Shubham |     40000 |
|  5 | Rohidas |     20000 |
+----+---------+-----------+
*/