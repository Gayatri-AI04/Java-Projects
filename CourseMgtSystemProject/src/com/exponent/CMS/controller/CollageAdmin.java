package com.exponent.CMS.controller;

import java.util.Scanner;

import com.exponent.CMS.serviceImpl.CollageServiceCenter;



public class CollageAdmin {

	public static void main(String[] args) {
		
		CollageServiceCenter collage = new CollageServiceCenter();
		Scanner sc = new Scanner(System.in);
		boolean valid = true;
		
		while(valid) {
			
		System.out.println("********** Welcome to Collage **********");
		System.out.println("__________________Menu_____________________");
		System.out.println("|_________________________________________|");
		System.out.println("|   1. Add Course                         |");
		System.out.println("|   2. Display Course Details             |");
		System.out.println("|   3. Add Faculty                        |");
		System.out.println("|   4. Display faculty Details            |");
		System.out.println("|   5. Add Batch                          |");
		System.out.println("|   6. Display Batch Details              |");
		System.out.println("|   7. Add Student                        |");
		System.out.println("|   8. Display Student Detail             |");
		System.out.println("|   9. Update Information                 |");
		System.out.println("|_________________________________________|");
		System.out.println("___________________________________________");
		
		System.out.println("Enter Your Choice here....");
		int choose = sc.nextInt();
		if(choose <=9) {
			
		switch (choose) {
		case 1:
			collage.addCourse();
			break;
		case 2: 
			collage.courseDetails();
			break;
		case 3:
			collage.addFaculty();
			break;
		case 4:
			collage.facultyDetails();
			break;
		case 5:
			collage.addBatch();
			break;
		case 6:
			collage.batchDetails();
			break;
		case 7:
			collage.addStudent();
			break;
		case 8:
			collage.StudentDetails();
			break;
		case 9:
			collage.updateInformation();
			break;

		default:
			valid = false;
			sc.close();
			break;
		}
		}else {
			System.out.println("Please Choose the Options from menu Correctly..");
		}
	
		}
		
	
		
	}
}


