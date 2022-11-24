package prasad;
import java.util.ArrayList;
import java.util.List;

public class Minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1>data=new ArrayList<>();//creating list of Student data
		//add data
		data.add(new Student1(101,"Shubham",20,65));
		data.add(new Student1(102,"Arya",19,50));
		data.add(new Student1(103,"Megha",21,75));
		data.add(new Student1(104,"Mansvi",20,70));
		data.add(new Student1(105,"Prasad",19,91));
		//add condition for result using stream() & print it
		//for Mamimum marks
		Student1 s1=data.stream().max((m1,m2)->m1.getMarks()>m2.getMarks()?1:-1).get();
		System.out.println("Maximum Marks:-"+s1.getName()+" "+s1.getMarks());
		//for minimum marks
		Student1 s2=data.stream().min((m1,m2)->m1.getMarks()>m2.getMarks()?1:-1).get();
		System.out.println("Minimum marks:-"+s2.getName()+" "+s2.getMarks());
		
			}

		}
		//creating student class
		class Student1
		{
			//declare there private data member
		private int id;
		private String name;
		private int age;
		private int marks;
		//getter setter method
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public Student1(int id, String name, int age, int marks) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.marks = marks;
		}
		

	
}