package polymorphism.method;

public class Calculate {

	public int getMin(int a, int b) {
		return a > b ? b : a;
	}

	public float getMin(float a, float b) {
		return a > b ? b : a;
	}

	public int getMin(int a, int b, int c) {
		int min = getMin(a, b);
		return min > c ? c : min;
	}

	public int getMin(int... args) {
		int min = args[0];
		for (int i = 1; i < args.length; i++) {
			min = min > args[i] ? args[i] : min;
		}
		return min;
	}
}
