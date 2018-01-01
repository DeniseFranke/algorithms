package com.denisefranke.algorithms;

import java.util.*;
import java.io.*;
/**
*
* PhoneBookMap
*
* @Author Denise Franke
*
* Usage:   
*  java com.denisefranke.algorithms.PhoneBookMap < PhoneBookMapInput.txt
*
* Input:
*    number records
*    records:  name \n number
*    name(s) to search map for
*
* Output:   
* uncle sam=99912222
* Not found
* harry=12299933
*
**/
class PhoneBookMap{
    public static void main(String []argh)
       {
          Scanner in = new Scanner(System.in);
          HashMap<String, String> phoneBook = new HashMap<String, String>();
          int n=in.nextInt();
          in.nextLine();
          String name = null;
          String phone = null;
          for(int i=0;i<n;i++) {
             name=in.nextLine();         
             phone=in.nextLine();
             phoneBook.put(name, phone);
              //System.out.println("Name: " + name + " Phone: " +phone);
          }
          while(in.hasNext()) {
              try{
                name=in.nextLine();
              } catch (Exception e)  {
                 //do nothing 
              }
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" +  phoneBook.get(name));
             } else {
                System.out.println("Not found" );
             }

          }
    }  
}
