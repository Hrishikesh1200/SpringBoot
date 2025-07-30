package org.example;

import java.awt.print.Book;

interface book{
    void Book();
   // void planeBook();
}

class LineBook implements book{
    public void Book() {
        System.out.println("This is lined book");
    }
}

class PlaneBook implements book{
    public void Book(){
        System.out.println("This is Plane book");
    }

}

class Writebook{
    public void writing( book line){
        line.Book();
    }

}

public class InterfaceExample {

    public static void main(String args[]){

        book b1 = new LineBook();
        book b2 = new PlaneBook();
        Writebook wb = new Writebook();
        //b1.Book();
        wb.writing(b2);

    }
}
