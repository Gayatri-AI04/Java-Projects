package com.exponent.CMS.serviceImpl;

import java.util.Scanner;

import com.exponent.CMS.model.Batch;
import com.exponent.CMS.model.Course;
import com.exponent.CMS.model.Faculty;
import com.exponent.CMS.model.Student;
import com.exponent.CMS.service.UniversityServiceCenter;

public class CollageServiceCenter implements UniversityServiceCenter{

	Scanner sc = new Scanner(System.in);
	Course course = new Course();
	Faculty faculty = new Faculty();
	Batch batch = new Batch();
	Student student = new Student();
	boolean added = false;
	
	@Override
	public void addCourse() {
		added = true;
		 System.out.println("------Fill Course Details here-----");
		 System.out.println("Enter Course Id : ");
		 course.setcId(sc.nextInt());
		 System.out.println("Enter Course Name : ");
		 course.setcName(sc.next());
	
	}

	@Override
	public void courseDetails() {
		if(added) {
			 System.out.println("------Your Course Details Are-----");
			System.out.println("Your course Id is : "+course.getcId());
			System.out.println("Your course Name is : "+course.getcName());
			
		}else {
			System.out.println("Please add Course Details first...");
		}
		
		
	}

	@Override
	public void addFaculty() {
		 added = true;
		 System.out.println("------Fill Faculty Details here-----");
		 System.out.println("Enter Faculty Id : ");
		 faculty.setfId(sc.nextInt());
		 System.out.println("Enter Faculty Name : ");
		 faculty.setfName(sc.next());
		 faculty.setCourse(course);

		
	}

	@Override
	public void facultyDetails() {
		if(added) {
			 System.out.println("------Faculty Details Are-----");
			System.out.println("Your course Id is : "+faculty.getfId());
			System.out.println("Your course Name is : "+faculty.getfName());
			
			System.out.println("Course Details are: "+course);
			
		}else {
			System.out.println("Please add Faculty Details first...");
		}
		
	}

	@Override
	public void addBatch() {
		 added = true;
		 System.out.println("------Fill Batch Details here-----");
		 System.out.println("Enter Batch Id : ");

		 batch.setbId(sc.nextInt());
		 System.out.println("Enter Batch Name : ");

		 batch.setbName(sc.next());
		 batch.setFaculty(faculty);
	}

	@Override
	public void batchDetails() {
		if(added) {
			 System.out.println("------Your Batch Details Are-----");
			System.out.println("Your course Id is : "+batch.getbId());
			System.out.println("Your course Name is : "+batch.getbName());
			System.out.println(faculty);
			
		}else {
			System.out.println("Please add Batch Details first...");
		}
		
	}

	@Override
	public void addStudent() {
		added = true;
		 System.out.println("------Fill Student Details here-----");
		 System.out.println("Enter Student Id : ");

		 student.setsId(sc.nextInt());
		 System.out.println("Enter Student Name : ");

		 student.setsName(sc.next());
		 student.setBatch(batch);
		
	}

	@Override
	public void StudentDetails() {
		if(added) {
			 System.out.println("------Your Student Details Are-----");
			System.out.println("Student Id is : "+student.getsId());
			System.out.println("Student Name is : "+student.getsName());
			System.out.println(batch);
			
		}else {
			System.out.println("Please add Student Details first...");
		}
	}

	@Override
	public void updateInformation() {
		boolean flag = true;
		
		while(flag) {
		System.out.println("---------- Update Following as per your requirement ----------");
		System.out.println("___________________________");
		System.out.println("_______Menu for Update_____");
		System.out.println("| ----- Course  --------- |");
		System.out.println("|  1. Course Id           |");
		System.out.println("|  2. Course Name         |");
		System.out.println("| ------- Faculty ------- |");
		System.out.println("|  3. Faculty Id          |");
		System.out.println("|  4. Faculty Name        |");
		System.out.println("|----------Batch -------- |");
		System.out.println("|  5. Batch Id            |");
		System.out.println("|  6. Batch Name          |");
		System.out.println("|------ Student Info -----|");
		System.out.println("|  7. Student Id          |");
		System.out.println("|  8. Student Name        |");
		System.out.println("|_________________________|");
		System.out.println("___________________________");
		
		
		System.out.println("Enter Your Choice here : ");
		int choice = sc.nextInt();
		if(choice <= 8) {
			switch (choice) {
			case 1:
				System.out.println("Update your Course Id..");
				course.setcId(sc.nextInt());
				break;
			case 2:
				System.out.println("Update your Course Name..");
				course.setcName(sc.next());
				break;
			case 3:
				System.out.println("Update your Faculty Id..");
				faculty.setfId(sc.nextInt());
				break;
			case 4:
				System.out.println("Update your Course Name..");
				faculty.setfName(sc.next());
				break;
			case 5:
				System.out.println("Update your Batch Id..");
				batch.setbId(sc.nextInt());
				break;
			case 6:
				System.out.println("Update your Batch Name..");
				batch.setbName(sc.next());
				break;
			case 7:
				System.out.println("Update your Student Id..");
				student.setsId(sc.nextInt());
				break;
			case 8:
				System.out.println("Update your Student Name..");
				student.setsName(sc.next());
				break;

			default:
				sc.close();
				break;
			}
			
			
		}else {
			System.out.println("Invalid number...Please Choose Again between 1 to 8");
		}
		flag = false;
		}	
		
	}

}

