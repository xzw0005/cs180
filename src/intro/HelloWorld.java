package intro;

import javax.swing.*;
import java.util.*;
import java.text.*;

public class HelloWorld {
	public static void main(String[] args) {
//		JFrame myWindow;
//		myWindow = new JFrame();
//		myWindow.setSize(300, 200);
//		myWindow.setTitle("Hello World");
//		myWindow.setVisible(true);

//		JOptionPane.showMessageDialog(null, "How are you");

//		String text = "Purdue!!!";
//		System.out.println(text.length());
//		System.out.println(text.substring(0, 8));
		
//		Date today;
//		today = new Date();
//		System.out.println(today.toString());
//		SimpleDateFormat sdf1, sdf2;
//		sdf1 = new SimpleDateFormat("MM/dd/yy");
//		sdf2 = new SimpleDateFormat("MMMM dd, yyyy");
//		System.out.println(sdf1.format(today));
//		System.out.println(sdf2.format(today));

		Scanner scanner;
		String firstName;
		scanner = new Scanner(System.in);
		System.out.print("Enter your first and last name: ");
		firstName = scanner.next();
		String lastName = scanner.next();
		System.out.println("Hello, " + firstName + " " + lastName + ".");
		
	}
}
