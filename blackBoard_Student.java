package UHCLSystem;

import java.util.*;

public class blackBoard_Student extends blackBoard {

	public blackBoard_Student(String id, Data d) {
		super(id, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sel = "";
		while (!sel.equals("x")) {
			System.out.println("Welcome to BlackBoard!");
			System.out.println("v: View my courses");
			System.out.println("x: Logout");
			
			sel = input.nextLine();
			if (sel.equals("v")) {
				viewMyCourses();
			}

		}
		
	}

	private void viewMyCourses() {
		// TODO Auto-generated method stub
		ArrayList <String> courses = super.getD().getMyCourses(super.getId());
		for (int i = 0; i<courses.size(); i++) {
			System.out.println((i+1) + ". " + courses.get(i));
		}
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		String sel = "";
		String selection = "";
		System.out.println("Please enter your choice for the course's note: ");
		sel = input.next();
		if (isInteger.test(sel)) {
			int intSel = Integer.parseInt(sel);
			if (intSel>0 && intSel<=courses.size()) {
				selection = courses.get(intSel-1);
				ArrayList<String> contents = super.getD().showCourseNote(selection);
				for (String c: contents) {
					System.out.println("Note for " + selection + ": " + c);
				}
//				super.getD().showCourseNote(selection);
				System.out.println();
			}
		}		
	}	
}
