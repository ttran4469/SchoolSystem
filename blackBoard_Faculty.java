package UHCLSystem;

import java.util.*;

public class blackBoard_Faculty extends blackBoard {

	public blackBoard_Faculty(String id, Data d) {
		super(id, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sel = "";
		while(!sel.equals("x")) {
			System.out.println("Welcome to BlackBoard!");
			System.out.println("v: View my courses");
			System.out.println("x: Logout");
			
			sel = input.nextLine();
			if(sel.equals("v")) {
				viewMyCourses();
			}
						
		}		
	}

	private void viewMyCourses() {
		// TODO Auto-generated method stub
		ArrayList<String> courses = super.getD().getMyTeachingCourses(super.getId());
		for (int i = 0; i<courses.size(); i++) {
			System.out.println((i+1) + ". " + courses.get(i));
			System.out.println();
		}	
		
		Scanner input = new Scanner(System.in);
		String sel = "";
		String selection = "";
		System.out.println("Please enter your choice to post a new course note: ");
		sel = input.nextLine();
		if(isInteger.test(sel)) {
			int intsel = Integer.parseInt(sel);
			if (intsel>0 &&intsel<=courses.size()) {
				selection = courses.get(intsel-1);
				System.out.println("Please enter your note content: ");
				String content = input.nextLine();
				super.getD().postCourseNote(super.getId(), selection, content);
			}
		}
	}

}
