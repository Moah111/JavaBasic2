package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import universitat.edu.Classes;


public class ClassOfFuntion {
	public static void main(String[] args) {
		createClass();
	}
	public static Classes createClass(){
		
		
		
		System.out.println("Enter Class ID :  ");
		String id = Run.sc.nextLine();
		System.out.println("Enter Class Subject : ");
		String subject = Run.sc.nextLine();
		System.out.println("Enter Professor Name: ");
		String professorName = Run.sc.nextLine();
		
		
		
		return new Classes(id, subject, professorName,new ArrayList());
		
	}
	public static Classes searchClass(String id, List<Classes> clList){
		for (int i = 0; i < clList.size(); i++) {
			if(id.equals(clList.get(i).getId())){
				return clList.get(i);
			}
			
		}
		
		return null;
		
	}

}
