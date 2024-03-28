package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import universitat.edu.Classes;
import universitat.edu.Student;

public class Run {
	public static Scanner sc = new Scanner(System.in);
	public static List<Student> listStudent = new ArrayList<>();
	public static void main(String[] args) {
		
		List<Classes> classList = FileIO.readClass();
		while (true) {
			System.out.println("MENU");
			System.out.println("1: Create Classes ");
			System.out.println("2: Search Classes ");
			String menu = sc.nextLine();
			
			switch (menu) {
				case "1":	
					Classes class1 = ClassOfFuntion.createClass();
					classList.add(class1);
					break;
				case "2":
					System.out.println("Enter Class ID : ");
					String classID = sc.nextLine();
					System.out.println(ClassOfFuntion.searchClass(classID, classList));
					break;
				default:
					FileIO.writeClass(classList);
					return;
			}
		}
	}

}
