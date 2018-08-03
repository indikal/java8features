/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.indika.java8;

interface I {
    void show(int i);
}

class C implements I {
    public void show(int i) {
        System.out.println("Hello");
    }
    
}

/**
 *
 * @author indika
 */
public class DemoLambda {
    public static void main(String[] args) {
        DemoLambda.oldWay();
        anonymousClass();
        lambdaWay();
    }
    
    private static void oldWay() {
        I obj;
        obj = new C();
        obj.show(5);
    }
    
    private static void anonymousClass() {
        I obj = new I() {
            public void show(int i) {
                System.out.println("Hello anonymous! " + i);
            }
            
        };
        obj.show(5);
    }
    
    private static void lambdaWay() {
        I obj = (int i) -> {
            System.out.println("Hello lambda! " + i);
        };
        obj.show(6);
        
        I obj1 = (i) -> System.out.println("Hello lambda!" + i);
        obj1.show(7);
        
        I obj2 = i -> System.out.println("Hello lambda!" + i);
        obj1.show(8);
    }
}
