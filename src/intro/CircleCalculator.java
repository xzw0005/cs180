package intro;

import java.util.*;
import javax.swing.*;

public class CircleCalculator {
	public static void main(String[] args) {
		float radius, area, circumference;
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter radius: ");
//		radius = scanner.nextDouble();
		
		String r;
		r = JOptionPane.showInputDialog(null, "Enter radius: "); 
		//radius = Double.parseDouble(r);
		radius = Float.parseFloat(r);
		
		circumference = (float) Math.PI * radius * 2;
		area = (float) Math.PI * radius * radius;
		System.out.println("Given Radius: " + radius + "\nArea: " + area + "\nCircumference: " + circumference);
	}
}
