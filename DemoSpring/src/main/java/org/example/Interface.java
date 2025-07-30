package org.example;


interface A {
    void show();
    void define();
    void call();

    // variables in interface are by default Final and static

    int id = 1200;
    String designation = "Software Engineer";
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

public class Interface {
    public static void main (String args[]){

        A obj;
        obj = new B();
        obj.show();
        obj.define();
        obj.call();
        //static variable we can call direct without creating object
        System.out.println("Designation defined in Interface A is: " +A.designation);
    }

}
