package com.addressbook;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    Contacts contacts;
    ArrayList<Contacts> list = new ArrayList<>();
    HashMap<Object, Object> map;
    public void addNewAddressBook() {
        System.out.println("Enter AddressBook Name :");
        String addressbook = scanner.next();
        if (map.keySet().equals(addressbook)) {
            System.out.println("Entered AddressBook is already Exist");
        } else {
            map.put(addressbook, list);
        }
    }

    public void showAddressBook() {
        for (Object key : map.keySet()) {
            System.out.println(key);
        }
    }
    public void checkContact(){
        System.out.println("Enter AddressBook Name :");
        String adname = scanner.next();
        for (Object key : map.keySet()) {
            if (!adname.equalsIgnoreCase((String) key)) {
                System.out.println("Address Book Not Found-----!!!");
            }else{
                System.out.println("Match Found-----!!");
                System.out.println("Enter First Name :");
                String firstName = scanner.next();
                try {
                    if (!firstName.equalsIgnoreCase(contacts.getFirstname())) {
                        addNewContact();
                    }else{
                        System.out.println("Contact Already Exist");
                    }
                } catch (NullPointerException e) {
                    System.out.println("Contact Not Found------!!, Please Add First");
                    addNewContact();

                }
            }
        }
    }
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
    public  void searchByCity() {
        System.out.println("Enter city Name:");
        String city = scanner.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
    }
    public void searchByState() {
        System.out.println("Enter State Name:");
        String state = scanner.next();
        list.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
    }
    public void countByCity() {
        System.out.println("Enter the city Name:");
        String city = scanner.next();
        list.stream().filter(contacts -> contacts.getCity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
        long count = list.stream().filter(n -> n.getCity().equalsIgnoreCase(city)).count();
        System.out.println("Total number of Persons in city " + city + ":" + count);
    }

    public void countByState() {
        System.out.println("Enter the State Name:");
        String state = scanner.next();
        list.stream().filter(contacts -> contacts.getState().equalsIgnoreCase(state)).forEach(contacts -> System.out.println(contacts));
        long count = list.stream().filter(n -> n.getState().equalsIgnoreCase(state)).count();
        System.out.println("Total number of Persons in city " + state + ":" + count);
    }
    public void sortedList(){
        List<Contacts> sortedlist=list.stream().sorted(Comparator.comparing(contacts ->contacts.getFirstname())).collect(Collectors.toList());
        for (Contacts details:sortedlist) {
            System.out.println(details.toString());
        }
    }
}
