package intro;

import javax.swing.JOptionPane;

public class CS180Staff {
	
	private String firstName, lastName, email, office;
	
	public void getDetails() {
		firstName = JOptionPane.showInputDialog(null, "Enter First Name: ");
		lastName = JOptionPane.showInputDialog(null, "Enter Last Name: ");
		email = JOptionPane.showInputDialog(null, "Enter eMail: ");
		office = JOptionPane.showInputDialog(null, "Enter office: ");
	}
	
	public void printNeatly() {
		System.out.println(" \t" + firstName + " " + lastName);
		System.out.println("\tEmail: " + email);
		System.out.println("\tOffice: " + office);
	}
}