package abstraction;

public abstract class Person {

	private String name;

	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public void transfrome() {
		System.out.println("Chuyeenr khoang bang ipay");
	}
	
	public abstract void learning();
	
	public void run() {
		
		System.out.println("Running !!!");
	}

}
