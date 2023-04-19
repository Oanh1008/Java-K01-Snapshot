package polymorphism.objects;

import abstraction.Person;

public class Employee implements App {

	private String name;

	private String skill;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", skill=" + skill + "]";
	}

	@Override
	public void learning() {
		System.out.println("Employee is learning !!");

	}

	@Override
	public void transformer() {
		System.out.println("Employee transformed !!!");
	}

}