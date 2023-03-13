package com.addressbook;
import java.util.Scanner;

public class AddressBook {
        public static  void main(String[] args) {
            System.out.println("--------Welcome to Address Book Program-------");
            Scanner scanner = new Scanner(System.in);
            int choice;
            AddressBookMain addressBookMain = new AddressBookMain();
            do {
                System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5." +
                        " Search by State\n6. Sorted List\n7. New AddressBook \n8. Exit");
                System.out.println("Enter Choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addressBookMain.checkContact();
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
                            System.out.println("1. Display Contacts\n2. Display and Count by City\n3. Display and Count by State\n0. Exit");
                            System.out.println("Choice :");
                            choice = scanner.nextInt();
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
                                case 0:
                                    System.out.println("Thank you for using AddressBook ");
                                    break;
                                default:
                                    System.out.println("Please Select Valid Input");
                                    break;
                            }
                        } while (choice != 0);
                        break;
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
                                    System.out.println("Thank you for using AddressBook");
                                    break;
                                default:
                                    System.out.println("Please Select Valid Input");
                                    break;
                            }
                        } while (choice != 3);
                        break;
                    case 6:
                        do {
                            System.out.println("-----------------------------");
                            System.out.println("1. Sorted list\n 2. Sorted by City\n3. Search by State\n4. Exit");
                            System.out.println("Choice :");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    addressBookMain.sortedList();
                                    break;
                                case 2:
                                    addressBookMain.searchByCity();
                                    break;
                                case 3:
                                    addressBookMain.searchByState();
                                    break;
                                case 4:
                                    System.out.println("Thank you for Using AddressBook ");
                                    break;
                                default:
                                    break;
                            }
                        } while (choice != 4);
                        break;
                    case 7:
                        do {
                            System.out.println("-----------------------------");
                            System.out.println("1. Add AddressBook\n2. Show Address Book\n3. Exit");
                            System.out.println("Choice :");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    addressBookMain.addNewAddressBook();
                                    break;
                                case 2:
                                    addressBookMain.showAddressBook();
                                    break;
                                case 3:
                                    System.out.println("Thank you for using AddressBook");
                                    break;
                                default:
                                    System.out.println("Please Select Valid Input");
                                    break;
                            }
                        } while (choice != 3) ;
                        break;
                    case 8:
                        System.out.println("Thank you for Using Address Book");
                    default:
                        System.out.println("Please Select between 1 to 8 only.");
                        break;
                }
            }
            while( choice != 8 );
        }
}