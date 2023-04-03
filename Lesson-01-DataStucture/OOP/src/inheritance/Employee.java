package inheritance;

public class Employee extends Person {

	private String skill;

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age) {
		super(name, age);
	}

	public Employee(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee :" + "name :" + getName() + " age: " + getAge() + " skill: " + skill;
	}
	
	@Override
	public void transfrome() {
		// TODO Auto-generated method stub
		System.out.println("QR code");
	}

}
