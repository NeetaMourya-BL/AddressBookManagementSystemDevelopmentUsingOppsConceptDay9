package com.bridgelabz.addressbooksystem;

/**
 * Address Book System!
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
	
public static void main(String[] args) {
	 System.out.println("Welcome to Address Book Program");
	 choice();
}
	 public static void choice() {
     Scanner scanner=new Scanner(System.in);
     System.out.println("For create and add contact press 1");
     System.out.println("For edit contact press 2");
     System.out.println("For delete contact press 3");
     System.out.println("Exit 4");
     System.out.println("Enter your choice");
	 int UsrIn;
     UsrIn = scanner.nextInt();
     while (UsrIn != 0) {
     switch (UsrIn) {
     case 1:
    	 while (UsrIn != 2) {
    	   createAndAddContact();
           System.out.println("Would you like to add someone else? 1: Yes, 2: No"); 
           UsrIn = scanner.nextInt();
     }
     break;
     case 2:
    	   editContact();
     break;
     case 3:		
    	   deleteContact();
     break;
     default: System.out.println("no valid option");
     break;
     }
     System.out.println("For create contact press 1");
     System.out.println("For edit contact press 2");
     System.out.println("For delete contact press 3");
     System.out.println("Exit 0");
     UsrIn = scanner.nextInt();
}
     System.out.println("Goodbye!");
     }
public static List<Contact> createAndAddContact(){
	List<Contact> contacts = new ArrayList<Contact>();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter First Name: ");
    String firstName = scanner.next();
    System.out.println("Enter Last Name: ");
    String lastName = scanner.next();
    System.out.println("Enter address:");
    String address=scanner.next();
    System.out.println("Enter city:");
    String city=scanner.next();
    System.out.println("Enter state:");
    String state=scanner.next();
    System.out.println("Enter zip:");
    String zip=scanner.next();
    System.out.println("Enter phone Number:");
    String phoneNumber=scanner.next();
    System.out.println("Enter email:");
    String email=scanner.next();
    contacts.add(new Contact(firstName, lastName, address, city,state,zip,phoneNumber,email));
    System.out.println(contacts);
    return contacts;
}
//public static List<Contact> addContact(){
//	List<Contact> contacts = new ArrayList<Contact>();
//	Scanner scanner=new Scanner(System.in);
//    System.out.println("Enter First Name: ");
//    String firstName = scanner.next();
//    System.out.println("Enter Last Name: ");
//    String lastName = scanner.next();
//    System.out.println("Enter address:");
//    String address=scanner.next();
//    System.out.println("Enter city:");
//    String city=scanner.next();
//    System.out.println("Enter state:");
//    String state=scanner.next();
//    System.out.println("Enter zip:");
//    String zip=scanner.next();
//    System.out.println("Enter phone Number:");
//    String phoneNumber=scanner.next();
//    System.out.println("Enter email:");
//    String email=scanner.next();
//    contacts.add(new Contact(firstName, lastName, address, city,state,zip,phoneNumber,email));
//    System.out.println(contacts);
//    return contacts;
//}
public static List<Contact> editContact() {
	String firstName = null,lastName=null,address=null,city=null,state=null,zip=null,phoneNumber=null,email=null;
	List<Contact> editcontacts = new ArrayList<Contact>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("For edit first name press 1");
    System.out.println("For edit last name press 2");
    System.out.println("For edit address press 3");
    System.out.println("For edit city press 4");
    System.out.println("For edit state press 5");
    System.out.println("For edit zip press 6");
    System.out.println("For edit phone number press 7");
    System.out.println("For edit email press 8");
    System.out.println("Exit 0");
    int choice;
    choice = scanner.nextInt();
    while (choice != 0) {
    switch(choice) {
    case 1:
	System.out.println("Enter new First Name: ");
    firstName = scanner.next();
    break;
    case 2:
    System.out.println("Enter new Last Name: ");
    lastName = scanner.next();
    break;
    case 3:
    System.out.println("Enter new address:");
    address=scanner.next();
    break;
    case 4:
    System.out.println("Enter new city:");
    city=scanner.next();
    break;
    case 5:
    System.out.println("Enter new state:");
    state=scanner.next();
    break;
    case 6:
    System.out.println("Enter new zip:");
    zip=scanner.next();
    break;
    case 7:
    System.out.println("Enter new  phone Number:");
    phoneNumber=scanner.next();
    break;
    case 8:
    System.out.println("Enter new email:");
     email=scanner.next();
    break;
    default: System.out.println("no valid option");
    break;
    }
    System.out.println("Would you like to edit someone else? 1: Yes, 9: No"); 
    choice = scanner.nextInt();
    }   
    editcontacts.add(new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email));
    System.out.println(editcontacts);
	return editcontacts;
}
public static List<Contact> deleteContact(){
	List<Contact> deletecontacts = new ArrayList<Contact>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("For delete enter person name");
    String name=scanner.next();
       deletecontacts.remove(name);
    System.out.println("Contact deleted successfully");
	return deletecontacts;
}
}