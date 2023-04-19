package record_class;

public class Hello {
	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.hashCode());
	}
	
	public record  Student(String name,int age) {
		public Student() {
			this(null,5);
		}
	}
}
