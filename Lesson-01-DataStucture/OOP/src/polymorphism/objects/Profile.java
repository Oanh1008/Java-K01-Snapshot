package polymorphism.objects;

public class Profile implements App {

	private int age;

	private String name;

	private String skill;

	public Profile(int age, String name, String skill) {
		super();
		this.age = age;
		this.name = name;
		this.skill = skill;
	}

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "Profile [age=" + age + ", name=" + name + ", skill=" + skill + "]";
	}

	@Override
	public void learning() {
		System.out.println("Profile is learning !!");

	}

	@Override
	public void transformer() {
		System.out.println("Profile tranformed !!");

	}
	
}
