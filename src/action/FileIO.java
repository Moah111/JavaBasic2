package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import universitat.edu.Classes;
import universitat.edu.Student;

import javax.swing.*;

public class FileIO {

	public static List<Classes> readClass() {
		List<Classes> classResult = new ArrayList<>();

		try {
			File cl = new File("Classes.txt");
			Scanner scanner = new Scanner(new FileInputStream(cl));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] arrClass = line.split(",");
				String[] students = arrClass[3].split(":");
				List<Student> studentsList = new ArrayList<>();
                for (String student : students) {
                    String[] studentSplit = student.split("\\|");
                    studentsList.add(new Student(studentSplit[0], studentSplit[1], studentSplit[2], studentSplit[3]));
                }
				Classes classes = new Classes(arrClass[0], arrClass[1], arrClass[2], studentsList);
				classResult.add(classes);
			}

			scanner.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return classResult;

	}

	public static void writeClass(List<Classes> list) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File(
					"Classes.txt")));
			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static List<Student> readStudent() {
		List<Student> studentResult = new ArrayList<>();
		try {
			File st = new File("Student.txt");
			Scanner scanner = new Scanner(new FileInputStream(st));
			while (scanner.hasNext()) {

				String[] arrStudent = scanner.nextLine().split(",");
				studentResult.add(new Student(arrStudent[0], arrStudent[1],
						arrStudent[2], arrStudent[3]));
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return studentResult;

	}

}
