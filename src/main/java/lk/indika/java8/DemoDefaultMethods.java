/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.indika.java8;

/**
 *
 * @author indika
 */
interface DefaultMethods {
    //by default all methods in interface is "public abstract"
    void sayHello();
    
    default void hello() {
        System.out.println("Hello default!");
    }
    
    static void helloStatic() {
        System.out.println("Hello static!");
    }
}

public class DemoDefaultMethods implements DefaultMethods {

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    public static void main(String[] args) {
        DemoDefaultMethods demo = new DemoDefaultMethods();
        demo.sayHello();
        demo.hello();
        DefaultMethods.helloStatic();
    }
}