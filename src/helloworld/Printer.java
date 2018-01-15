/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author lcao2
 */
public class Printer {
    public <T> void printArray(T[] values) {
      for(T item: values)         

         System.out.println(item);
   }
    
}
