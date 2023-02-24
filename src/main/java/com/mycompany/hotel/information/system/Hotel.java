/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.information.system;

///**
 *
 * @author Tamim
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Hotel {

      public static void main(String[] args) throws InvalidAgeException {
        Scanner key=new Scanner(System.in);
        ArrayList<Customer>customerList=new ArrayList<Customer>();
        char cont='y';
        while(cont=='y'){
            System.out.println("-------------------------------");
        System.out.println("1- Add a new customer");
        System.out.println("2- Print customer information of the hotel");
        System.out.println("3- Exit ...");
        int s=key.nextInt();
        if(s==1)
        {
            System.out.println("Input ID ");              
                String i=key.next();
                System.out.println("input name");
                String n=key.next(); 
                System.out.println("Input age");
                int g=key.nextInt();
                
                System.out.println("Input address");
                String r=key.next();
                System.out.println("Input mobile number");
                String m=key.next();
                System.out.println("Input email");
                String e=key.next();
                System.out.println("Input type");
                char t=key.next().charAt(0);
                Customer p=new Customer(i,t,n,g,r,m,e) ;
                customerList.add(p);
        }
        else if(s==2)
        {
            for(int i=0;i<customerList.size();i++)
                {
                    System.out.println(customerList.get(i));
                }  
        }
        else if(s==3)
        {
            cont='n';
        }
        else
        {
            System.out.println("try again ....");
        }
    }
    }  
}
