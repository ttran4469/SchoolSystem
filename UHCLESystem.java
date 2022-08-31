package UHCLSystem;

import java.util.Scanner;

public class UHCLESystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String selection = "";
		Data d = new Hibernate();
		
		while(!selection.equals("x"))  //while not x, keep displaying the menu
		{
			//display the menu
			System.out.println();
			System.out.println("**** Go Hawks! ****");
            System.out.println("Please make your selection");
            System.out.println("1: e-Service");
            System.out.println("2: BlackBoard");
            System.out.println("x: Leave");
            System.out.println();
			
			//get the selection from the user
			selection = input.nextLine();
			System.out.println();
			
			if(selection.equals("1"))
			{
				System.out.println("Please enter your id: ");
				String id = input.nextLine();
				System.out.println("Please enter your password: ");
				String password = input.nextLine();
				//login eService;
				 
				uhcluser u = d.login(id, password);
				
				//If u is not null and it is a student type, create an object of eService_Student
				//call the eService_Student welcome method
				
				//if u is not null and it is a faulty type, create an object of eService_Faculty 
				//call the eService_Faculty welcome method
				
				if(u!=null && u.getType().equals("student"))
				{
					
					eService_Student e = new eService_Student(u.getLoginID(), d);
					e.welcome();
				}
				
				if(u!=null && u.getType().equals("faculty"))
				{
					eService_Faculty e = new eService_Faculty(u.getLoginID(), d);
					e.welcome();
					
				}
				 
			}
			
			if(selection.equals("2"))
			{
				System.out.println("Please enter your id: ");
				String id = input.nextLine();
				System.out.println("Please enter your password: ");
				String password = input.nextLine();
				//login eService;
				 
				uhcluser u = d.login(id, password);
				
				//complete the blackboard login and go to the blackboard welcome page
				//Please see the eService code above for an example
				if (u!=null &&u.getType().equals("student")) {
					blackBoard_Student b = new blackBoard_Student(u.getLoginID(), d);
					b.welcome();
				}
				if (u!=null &&u.getType().equals("faculty")) {
					blackBoard_Faculty b = new blackBoard_Faculty(u.getLoginID(), d);
					b.welcome();
					
				}
				 
			}
		}
	}

}
