package exercise;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		int sum = 1;
		for(int i = 2; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println("Sum Factorial: " +sum);
	}
}
