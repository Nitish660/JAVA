package Codes;
class Parent{
    String message = "Hello from Parent class";

    Parent(){
        System.out.println("Parent class constructor");
    }

    void displayParent(){
       System.out.println(message);
    }
}

class child extends Parent{
    String message = "Hello from child class";

    child(){
        super();
        System.out.println("child class constructor");
    }
    void displayParentMessage() {
      
    }
    void displayChild(){
       System.out.println(message);
    }
}

public class Super {
     public static void main(String[] args){
        Parent obj = new Parent();

        obj.displayParent();
        child objChild = new child(); // Creating object of Child class
        objChild.displayParentMessage(); // Calling method to display message from Parent class
        objChild.displayChild();
     }
}
