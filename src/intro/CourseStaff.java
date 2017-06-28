package intro;

public class CourseStaff {
	public static void main(String[] args) {
		CS180Staff instructor, coordinator, ta;
		
		instructor = new CS180Staff();
		instructor.getDetails();
		
		coordinator = new CS180Staff();
		coordinator.getDetails();
		
		ta = new CS180Staff();
		ta.getDetails();
		
		System.out.println("Instructor: ");
		instructor.printNeatly();
		System.out.println("Coordinator: ");
		coordinator.printNeatly();
		System.out.println("Teaching Assistant: ");
		ta.printNeatly();
		
	}
}
