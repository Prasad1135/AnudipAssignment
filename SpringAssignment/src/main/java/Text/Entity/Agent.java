package Text.Entity;

public class Agent {
	//Creating Constructor of Agent Class
public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
public Agent(int id) {
		super();
		this.id = id;
	}
public Agent(int id, String name, int comission) {
		super();
		this.id = id;
		this.name = name;
		this.comission = comission;
	}
private int id;
private String name;
private int comission;
//Creating Getter Setter Method of Agent Class
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
public int getComission() {
	return comission;
}
public void setComission(int comission) {
	this.comission = comission;
}
}
