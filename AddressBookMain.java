package com.addressbook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;
public class AddressBookMain {
    private static final ArrayList<ArrayList<String>> address_book = new ArrayList<>();
    public void createContacts(ArrayList<String> contact){
        AddressBookMain.address_book.add(contact);
        for (ArrayList<String> i : AddressBookMain.address_book) {
            for (String j : i) {
                System.out.println(j);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
    }
}