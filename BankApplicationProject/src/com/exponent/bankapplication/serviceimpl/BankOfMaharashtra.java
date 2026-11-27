package com.exponent.bankapplication.serviceimpl;

import java.util.Scanner;

import com.exponent.bankapplication.model.AccountDetails;
import com.exponent.bankapplication.service.CentralBank;
import com.exponent.bankapplication.validation.Validation;

public class BankOfMaharashtra implements CentralBank {

	Scanner sc = new Scanner(System.in);
	AccountDetails ac = new AccountDetails();
	boolean isCreated = false;
	
	@Override
	public void createAccount() {
		
		
		System.out.println("......................................");

		long accountNo = Validation.accountNumber();
	
		ac.setAccountNo(accountNo);
		
		System.out.println("Enter your name: ");
		ac.setName(sc.next());
		
		System.out.println("Enter your Aadhar Number: ");
		ac.setAadharCardNo(sc.nextLong());
		
		System.out.println("Enter your Pan Card Number: ");
		ac.setPanCard(sc.next());
		
		System.out.println("Enter your ContactNumber: ");
		Validation.contactNumber();
//		ac.setContactNo(sc.nextLong());
		
		System.out.println("Enter your Email Adress: ");
		ac.setEmail(sc.next());
		
		System.out.println("Enter your Deposite Money: ");
		ac.setBalance(sc.nextDouble());
		
		System.out.println("Your Account number is :"+" " +accountNo);
		System.out.println("________________________________________");
		System.out.println("| Your Account is Created Successfully  |");
		System.out.println("|_______________________________________|");
		isCreated = true;
		
	}

	@Override
	public void showAccountDetails() {
		System.out.println("---------------------------------------");
		if (isCreated){
		
		System.out.println("Enter your Account Number : ");
		long checkAccountNo = sc.nextLong();
		if(ac.getAccountNo()== checkAccountNo) {
			System.out.println("----Your Account Details Are----");
			System.out.println(ac);
		}
		}else {
			System.out.println("Please create your Account First...");
			createAccount();
		}
	}

	@Override
	public void showAccountBalance() {
		if (isCreated) {
		
		
		System.out.println("Available Balance is: "+ac.getBalance());
		}else {
			System.out.println("Please create your Account First...");
			createAccount();
		}
		
	}

	@Override
	public void withdrowMoney() {
		if(isCreated) {
		
		
		System.out.println("Money Withdrowal Process is Started");
		System.out.println("Enter the Amount to withdraw");
		double amount = sc.nextDouble();
		if(amount >0) { 
		
			
		
		if(amount < ac.getBalance()) {
			double balance = ac.getBalance();

			double finalamt = (balance - amount);
			ac.setBalance(finalamt);
			System.out.println("....Money Withdrowl Successfull....");

		}else {
			System.out.println("Insufficient Balance");
		}
		}else {
			System.out.println("Invalid amount entered...please enter again");
		}
		}else {
			System.out.println("Please create your Account First...");
			createAccount();
		}

	}

	@Override
	public void depositeMoney() {
		if(isCreated) {
		
		
		System.out.println("......................");
		System.out.println("Enter the Money to deposite");
		double amount = sc.nextDouble();
		double balance = ac.getBalance();
		if(amount > 0) {
			double totalAmt = balance+amount;
			System.out.println("Total Amount = "+ totalAmt);
		}else {
			System.out.println("Please check your Amnount ");
		}
		}else {
			System.out.println("Please create your Account First...");
			createAccount();
		}
	}

	@Override
	public void updateAccountDetails() {
		if(isCreated) {
		
		
		System.out.println("Choose the option, which you want to update");
		System.out.println("_____________________");
		System.out.println("_____________________");
		System.out.println("| 1.Name            |");
		System.out.println("| 2.Contact Number  |");
		System.out.println("| 3.Email Adress    |");
		System.out.println("|___________________|");
		System.out.println("_____________________");
		
		boolean flag = true;
		System.out.println("Enter the number where to update");
		int choice = sc.nextInt();
		while(flag) {
			switch (choice) {
			case 1:
				System.out.println("Enter updated name here: ");
				String updateName = sc.next();
				ac.setName(updateName);
				break;
			case 2:
				System.out.println("Enter updated Contact number here: ");
				long updateNo = sc.nextLong();
				ac.setContactNo(updateNo);
				break;
			case 3:
				System.out.println("Enter updated Email here: ");
				String updateEmail = sc.next();
				ac.setEmail(updateEmail);
				break;
			case 4 :
				flag = false;
				break;

			default:
				System.out.println("Please choose number between 1 to 3 for update");
				break;
			}
			flag = false;
		}
		}else {
			System.out.println("Please create your Account First....");
			createAccount();
		}
		
		
	}

}
