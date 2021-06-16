
public class FlipCoin {
	
	int HeadCount;
	int TailCount;

	public void method() {
//      System.out.println("The value of i is: "+i);
		for (int i = 1; i <= 10; i++) {
			int coin = (int) (Math.floor(Math.random() * 10) % 2);
//	if (Math.random() < 1){
			if ((coin < 1)) {
				HeadCount++;
				System.out.println("Heads");
			} else {
				TailCount++;
				System.out.println("Tails");
			}
 
		}
		if (HeadCount > TailCount) {
			System.out.println("HEAD WINS");
		} else if (HeadCount == TailCount) {
			System.out.println("TIE");

		} else {
			System.out.println("TAIL WINS");
		}
	}

	public static void main(String[] args) {

		FlipCoin obj  = new FlipCoin();
		obj.method();

	}
	
}
