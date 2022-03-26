package COM.JAVA;

import java.util.Scanner;

public class example1 {

	String text;
	int count=0;
	public example1()
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the message=");
	text=sc.nextLine();
	System.out.println(text);
	System.out.println(text.toUpperCase());
	System.out.println(text.length()=='A');
	}

	public static void main(String[] args) {
		 example1 example=new example1();

		

}
}


