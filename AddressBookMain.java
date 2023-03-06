package com.addressbook;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    Contacts contacts;
    ArrayList<Contacts> list = new ArrayList<>();
    public void addNewContact() {
        contacts = new Contacts();
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstname(scanner.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(scanner.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(scanner.next());
        System.out.println("Enter the City :");
        contacts.setCity(scanner.next());
        System.out.println("Enter the State :");
        contacts.setState(scanner.next());
        System.out.println("Enter the PIN Code :");
        contacts.setPin(scanner.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhoneNumber(scanner.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(scanner.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
        list.add(contacts);
        System.out.println("Enter First Name :");
        String firstName = scanner.next();
        if (contacts.getFirstname().equalsIgnoreCase(firstName)) {
            System.out.println("Name already Exist----!!");
        } else {
            contacts = new Contacts();
            System.out.println("----------------------------------");
            System.out.println("Enter the Contact Details :-");
            System.out.println("Enter the First Name :");
            contacts.setFirstname(scanner.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastname(scanner.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(scanner.next());
            System.out.println("Enter the City :");
            contacts.setCity(scanner.next());
            System.out.println("Enter the State :");
            contacts.setState(scanner.next());
            System.out.println("Enter the PIN Code :");
            contacts.setPin(scanner.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(scanner.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(scanner.next());
            System.out.println("Contacts Added Successfully------!!!");
            System.out.println("-----------------------------------------");
            list.add(contacts);
        }
    }
    public void displayContact() {
        if (contacts.getFirstname() == null) {
            System.out.println("Contact Not Found");
        } else {
            for (Contacts cont : list) {
                System.out.println(cont);
            }
        }
    }
    public void editContact() {
        contacts=new Contacts();
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
            System.out.println("Enter the First Name :");
            contacts.setFirstname(scanner.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastname(scanner.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(scanner.next());
            System.out.println("Enter the City :");
            contacts.setCity(scanner.next());
            System.out.println("Enter the State :");
            contacts.setState(scanner.next());
            System.out.println("Enter the PIN Code :");
            contacts.setPin(scanner.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhoneNumber(scanner.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(scanner.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
            list.add(contacts);
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();
        if (firstName.equalsIgnoreCase(contacts.getFirstname())) {
            list.remove(contacts);
            System.out.println("Contact Deleted Successfully-------!!!");
        }else {
            System.out.println("Not Found");
        }
    }
}