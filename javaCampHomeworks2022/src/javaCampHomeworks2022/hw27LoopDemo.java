package javaCampHomeworks2022;

public class hw27LoopDemo {

	public static void main(String[] args) {
		// For Loop
		// counter definition ---> int i=1;
		// condition ------------> i<10;
		// amount of the increase> i++
		// Increase by 2 ---------> i+=2
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("It's over.");

		// While
		//A defined variable is only valid 
		//in the code block in which it is defined.
		//This condition will always be 1 and will cause an infinite loop. 
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("It's over.");
		//If we want to print even numbers --> int i=2; and i+=2
		

	}

}
