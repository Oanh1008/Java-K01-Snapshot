package polymorphism;

public class Profile extends Person {

	private String id;

	private boolean isDeleted;

	public Profile(String id, boolean isDeleted) {
		super();
		this.id = id;
		this.isDeleted = isDeleted;
	}

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public void learning() {
		System.out.println("Profile is learning !!!");
	}

}
