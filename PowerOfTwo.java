import java.util.Scanner;

public class PowerOfTwo {
	public static void Square() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :-  ");
		int num = sc.nextInt();
		int i;
		int answer;
		for (i = 0; i <= num; i++) {
			answer = (int) (Math.pow(i, 2));

			System.out.println("THE SQUARE OF " + i + " IS ---- " + answer);
		}
	}

	public static void main(String[] args) {
		PowerOfTwo power = new PowerOfTwo();
		power.Square();
	}
}
