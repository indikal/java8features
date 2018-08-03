/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.indika.java8;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author indika
 */

// forEach method in Java 8
//External loop - older Java
//Internal loop - Java 8
public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
        
        System.out.println("Old for each ...");
        for (int i=0; i<values.size(); i++) {
            System.out.println(values.get(i));
        }
        
        System.out.println("Java 7 for each ...");
        for (int i : values) {
            System.out.println(i);
        }
        
        System.out.println("Java 8 forEach method ...");
        values.forEach(i -> System.out.println(i));
    }
}
