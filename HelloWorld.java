import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Hello World");
		System.out.print("Hello World\n");
		System.out.print("****\n***\n**\n*\n");

		// int a = 10;
		// int b = 5;
		String name = "kishan rana ghosh";
		System.out.println(name);

		// a = 10;
		// System.out.println(a);

		// System.out.println("name=" + name + " a = " + a + " b= " + b);
		// System.out.println(a - b);
		// System.out.println(a * b);
		// System.out.println(a / b);
		// System.out.println(a % b);
		// Data Types

		// byte b = 10;
		// System.out.println(b);
		// char ch = 'a';
		// System.out.println(ch);
		// boolean var = false;
		// float price = 10.5f;
		// int number = 12;
		// long num = 232342473;
		// double db = 232342473.3243;

		// Input in JAVA-----------------------------

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(input);

		String input2 = sc.next();
		System.out.println(input2);
		
		int num1 = sc.nextInt();
		int nunm2 = sc.nextInt();
		
		int product = num1 * nunm2;
		System.out.println(product);
		sc.close();

	}
}