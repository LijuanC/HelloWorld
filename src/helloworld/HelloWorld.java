/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author lcao2
 */
abstract public class HelloWorld {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Integer name1 = new Integer(5);
       Integer name2 = new Integer(6);
       
       if(name1 == name2)
           System.out.println("Equal");
       else if(name1 > name2)
           System.out.println("Great");
       else
           System.out.println("Less");
   }
   
   
   
}


