package com.addressbook;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    int choice;
    ArrayList<Contacts> contactList = new ArrayList<>();
    public void addNewContact() {
        Contacts contacts = new Contacts();
        System.out.println("Enter the Contact Details -");
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
        contacts.setPhonenumber(scanner.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(scanner.next());
        contactList.add(contacts);
    }
    public void displayContact() {
        for(Contacts contact : contactList) {
            if (contact.getFirstname() == null) {
                System.out.println("Contact Details Not Available------!!!");
            } else {
                System.out.println("Contact Details -");
                System.out.println("--------------------------------------------");
                System.out.println("First Name : " + contact.getFirstname());
                System.out.println("Last Name : " + contact.getLastname());
                System.out.println("Address : " + contact.getAddress());
                System.out.println("City : " + contact.getCity());
                System.out.println("State : " + contact.getState());
                System.out.println("PIN Code : " + contact.getPin());
                System.out.println("Phone Number : " + contact.getPhonenumber());
                System.out.println("EMail ID : " + contact.getEmail());
                System.out.println("--------------------------------------------");
            }
        }
    }
    public void editContact() {
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        for (Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstname())) {
                System.out.println("Enter Last Name :");
                contact.setLastname(scanner.next());
                System.out.println("Enter Address :");
                contact.setAddress(scanner.next());
                System.out.println("Enter City :");
                contact.setCity(scanner.next());
                System.out.println("Enter State :");
                contact.setState(scanner.next());
                System.out.println("Enter Zip Code :");
                contact.setPin(scanner.next());
                System.out.println("Enter Phone Number :");
                contact.setPhonenumber(scanner.next());
                System.out.println("Enter EMail ID :");
                contact.setEmail(scanner.next());
            } else {
                System.out.println("Contact Not Found.------!!!");
            }
        }
    }
    public void deleteContact() {
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        for (Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstname())) {
                contactList.remove(contact);
                System.out.println("Contact Deleted------------!!");
                break;
            } else {
                System.out.println("Contact  Not Found.-----!!");
            }
        }
    }

    public void contactOptions(AddressBookMain addressBookmain) {
        do {
            System.out.println("----Welcome to Address Book System----");
            System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5. Exit ");
            System.out.println("Enter Choice : ");
            choice = addressBookmain.scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBookmain.addNewContact();
                    break;
                case 2:
                    addressBookmain.editContact();
                    break;
                case 3:
                    addressBookmain.deleteContact();
                    break;
                case 4:
                    addressBookmain.displayContact();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        }while( choice != 5 );
    }
}