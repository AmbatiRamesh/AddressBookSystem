package com.addressbook;
public class Contacts {
    private String firstname;
    private String lastname;
    private String Address;
    private String city;
    private String state;
    private String Pin;
    private String phoneNumber;
    private String email;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getPin() {
        return Pin;
    }
    public void setPin(String pin) {
        Pin = pin;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contacts Details :" +"\n"+
                "Firstname :" + firstname +","+
                "Lastname :" + lastname + ','+
                "Address :" + Address + ',' +
                "City :" + city + ',' +
                "State :" + state + ',' +
                "Pin :" + Pin +','+
                "PhoneNumber :" + phoneNumber +','+
                "Email :" + email;
    }
}