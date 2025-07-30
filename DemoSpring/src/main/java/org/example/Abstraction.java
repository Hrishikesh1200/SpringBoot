package org.example;


interface A {
    void show();
    void define();
    void call();
}

class B implements A{

    public void show(){
        System.out.println("THis is showing");
    }


    public void define() {
        System.out.println("THis is define");
    }

    @Override
    public void call() {
        System.out.println("THis is calling");
    }
}

public class Abstraction {
    public static void main (String args[]){

        A obj;
        obj = new B();
        obj.show();
        obj.define();
        obj.call();
    }


}
