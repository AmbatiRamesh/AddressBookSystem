package com.addressbook;
import java.util.Scanner;

public class AddressBook {
        public static  void main(String[] args) {
            System.out.println("--------Welcome to Address Book Program-------");
            Scanner scanner = new Scanner(System.in);
            int choice;
            AddressBookMain addressBookMain = new AddressBookMain();
            do {
                System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5. Search by State\n6. Sorted List\n7. Exit");
                System.out.println("Enter Choice: ");
                choice =scanner.nextInt();

                switch (choice) {
                    case 1:
                        addressBookMain.addNewContact();
                        break;
                    case 2:
                        addressBookMain.editContact();
                        break;
                    case 3:
                        addressBookMain.deleteContact();
                        break;
                    case 4:
                        do {
                            System.out.println("---------------------------");
                            System.out.println("1. Display Contacts\n2.Display and Count by City\n3. Display and Count by State\n4. Exit");
                            System.out.println("Choice :");
                            choice=scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    addressBookMain.displayContact();
                                    break;
                                case 2:
                                    addressBookMain.countByCity();
                                    break;
                                case 3:
                                    addressBookMain.countByState();
                                    break;
                                case 4:
                                    System.out.println("Thank you");
                                    break;
                                default:
                                    System.out.println("Please Select Valid Input");
                                    break;
                            }
                        }while (choice!=4);
                    case 5:
                        do {
                            System.out.println("-----------------------------");
                            System.out.println("1. Search by City\n2. Search by State\n3. Exit");
                            System.out.println("Choice :");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    addressBookMain.searchByCity();
                                    break;
                                case 2:
                                    addressBookMain.searchByState();
                                    break;
                                case 3:
                                    System.out.println("Thank you");
                                    break;
                                default:
                                    System.out.println("Please Select Valid Input");
                                    break;
                            }
                        }while (choice!=3);
                    case 6:
                        addressBookMain.sortedList();
                        break;
                    case 7:
                        System.out.println("Thank you for Using Address Book");
                    default:
                        System.out.println("Please Select between 1 to 6 only.");
                        break;
                }
            }
            while( choice != 7 );
        }
}
