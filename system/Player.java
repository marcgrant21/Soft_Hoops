/*GROUP 2 SOFT HOOPS*/
package system;
import java.util.Scanner;

/*Declaring Variables*/
public class Player {
	 private String Firstname;
	 private String Lastname;
	 private String Team;
	 private String Status;
	 public String height;
	 public int age;
/*The Constructor*/	 
 public Player(String firstname,String lastname, String team, String status, String Height, int Age) {
	  Firstname = firstname;
	  Lastname = lastname;
	  Team = team;
	  Status = status;
	  height = Height;
	  age = Age;
 }  
/*The Methods*/
 public void CreatePlayer() {
	         Scanner sc = new Scanner(System.in);
	         String firstname = sc.next();
			 String lastname = sc.next();
			 int Age = sc.nextInt();
			 String Height = sc.next();
			 String team = sc.next();
			 String status = sc.next();
			 
			 if(firstname!=null && lastname!=null && team!=null && status!=null && Height!=null) {
				 System.out.println("Creating Player");
				 sc.close();
			 }	 
  }
 public DisplayPlayer(String Lastname) {
	 return Lastname;
  }
 }	 

