package com.exponent.bankapplication.controller;

import java.util.Scanner;

import com.exponent.bankapplication.service.CentralBank;
import com.exponent.bankapplication.serviceimpl.BankOfMaharashtra;

public class BankAdmin {

	public static void main(String[] args) {
		
		System.out.println("********* Welcome to Bank Of Maharashtra *******");
		Scanner sc = new Scanner(System.in);
		CentralBank bank = new BankOfMaharashtra();
		boolean flag = true;
		
		while(flag) {
			System.out.println("_________________________________");
			System.out.println("_________________________________");
			System.out.println("||    1. Create Account       ||");
			System.out.println("||  2. Show account Details   ||");
			System.out.println("||  3. Show account Balance   ||");
			System.out.println("||    4. Withdrow Money       ||");
			System.out.println("||    5. Deposite money       ||");
			System.out.println("|| 6. Update Account Details  ||");
			System.out.println("||        7. Exit             ||");
			System.out.println("________________________________");
			System.out.println("________________________________");
			System.out.println("Please enter your choice in between 1 to 7....");
			
			int choice = sc.nextInt();
			 switch (choice) {
			case 1:
				bank.createAccount();
				break;
			case 2:
				bank.showAccountDetails();
				break;
			case 3:
				bank.showAccountBalance();
				break;
			case 4:
				bank.withdrowMoney();
				break;
			case 5:
				bank.depositeMoney();
				break;
			case 6:
				bank.updateAccountDetails();
				break;
			case 7:
				flag = false;
				System.out.println("****Thank you From Bank of Maharashtra, Visit Again****");
				sc.close();
				break;
				
			default:
				System.out.println("Your Enterd number is not available in menu..");
				System.out.println("Please enter your choice again.........");
				break;
			}



			
		}
		
	}
}
