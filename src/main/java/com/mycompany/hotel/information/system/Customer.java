/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.information.system;

/**
 *
 * @author Tamim
 */
public class Customer extends Human implements CustomerType {

    private String ID;
    private char type;

    public Customer(String ID, char type, String name, int age, String address, String mobileNumber, String email) throws InvalidAgeException {
        super(name, age, address, mobileNumber, email);
        this.ID = ID;
        this.type = type;
    }

    public String CustomerType()
    {
        if (type=='A'||type=='a')
            return "Royal Suit";
        else if(type =='B'||type=='b')
            return "one bed room";
        else 
            return "";
    }

    @Override
    public String toString() {
        return super.toString()+ "\nID=" + ID + "\ntype=" + CustomerType() ;
    }
    
}
