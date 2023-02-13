package com.addressbook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;
public class AddressBookMain {
   private static final ArrayList<ArrayList<String>> addressbook = new ArrayList<>();
  public void createContacts(ArrayList<String> contact) {
      AddressBookMain.addressbook.add(contact);
      for (ArrayList<String> i : AddressBookMain.addressbook) {
         for (String j : i) {
               System.out.println(j);
         }
      }
    }
    public void addContact() {
        ArrayList<String> contact = enterContactDetails();
      createContacts(contact);
   }
public ArrayList enterContactDetails() {
       ArrayList<String> contact = new ArrayList<String>();
      System.out.println("Enter the first name: ");
       Scanner scanner1 = new Scanner(System.in);
        String first_name = scanner1.next();
        contact.add(first_name);
       System.out.println("Enter the last name: ");
       Scanner scanner2 = new Scanner(System.in);
        String last_name = scanner2.next();
        contact.add(last_name);
        System.out.println("Enter the address: ");
        Scanner scanner3 = new Scanner(System.in);
        String address = scanner3.next();
        contact.add(address);
        System.out.println("Enter the city name: ");
       Scanner scanner4 = new Scanner(System.in);
        String city = scanner4.next();
        contact.add(city);
        System.out.println("Enter the state's name: ");
       Scanner scanner5 = new Scanner(System.in);
        String state = scanner5.next();
       contact.add(state);
       System.out.println("Enter the zip: ");
        Scanner scanner6 = new Scanner(System.in);
        String zip = scanner6.next();
       contact.add(zip);
       System.out.println("Enter the phone number: ");
       Scanner scanner7 = new Scanner(System.in);
        String phone_num = scanner7.next();
        contact.add(phone_num);
       System.out.println("Enter the email ID: ");
        Scanner scanner8 = new Scanner(System.in);
        String email = scanner8.next();
       contact.add(email);
      return contact;
  }
    public int searchExistingContact(String search_pers){
      int indx = -1;
       int temp_indx = -1;
       for (ArrayList <String> i:AddressBookMain.addressbook){
          temp_indx ++;
           for (String j:i){
                if (j.equals(search_pers)){
                   indx = temp_indx;
                  break;
               }
            }
        }
      return indx;
   }
   public void editExistingContact(){
      System.out.println("Enter the name of the person whose details you "
               + "want to be changed");
       Scanner scanner = new Scanner(System.in);
     String search_pers = scanner.next();
       int index = searchExistingContact(search_pers);
        System.out.println("Found the name, Kindly enter new details ");
        ArrayList <String> contact = enterContactDetails();
        AddressBookMain.addressbook.set(index, contact);
   }
    public void deleteExistingContact(){
        System.out.println("Enter the name of the person whose details you "
                + "want to be deleted");
        Scanner scanner = new Scanner(System.in);
        String search_pers = scanner.next();
        int index = searchExistingContact(search_pers);
        AddressBookMain.addressbook.remove(index);
    }
    public void addMultiplePerson(){
        System.out.println("Enter the number of persons whose details you want " + "to add to the address book");
        Scanner scanner = new Scanner(System.in);
        int no_of_person = scanner.nextInt();
        for (int i=1;i<=no_of_person;i++){
            addContact();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain addressbookmain = new AddressBookMain();
        addressbookmain.enterContactDetails();
        addressbookmain.editExistingContact();
        addressbookmain.deleteExistingContact();
        addressbookmain.addMultiplePerson();
    }
}