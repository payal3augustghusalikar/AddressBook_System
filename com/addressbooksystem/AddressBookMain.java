package com.addressbooksystem;
import java.util.*;


public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Adrressbook System");
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("enter your first name:");
		String firstName = scanner.nextLine();
		System.out.println("enter your last name:");
		String lastName = scanner.nextLine();
		System.out.println("enter your city");
		String city = scanner.nextLine();
		System.out.println("enter your state");
		String state = scanner.nextLine();
		System.out.println("enter your phone");
		long MobileNo = scanner.nextLong();
		System.out.println("enter your zip code");
		int zip = scanner.nextInt();
		System.out.println("enter your email");
		String email = scanner.nextLine();
		Person person = new Person(firstName, lastName, city, state, MobileNo, zip, email);
		}
	}

