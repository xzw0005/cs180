package intro;

import javax.swing.*;
import java.util.*;

public class Login {
	public static void main(String[] args) {
		String loginName;
		String password;
		Date today;
		
		loginName = JOptionPane.showInputDialog(null, "Enter your login ID: ");
		password = JOptionPane.showInputDialog(null, "Enter your password");
		today = new Date();
		
		System.out.println(loginName + " attemp to login at " + today.toString());
	}

}
