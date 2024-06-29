 class  Person {
       int age;
       String name;

       public Person(String n,int a)
       {
        name=n;
        age=a;
       }

       public void display(){
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
       }
    
}



public class M_overloading {
    public static void main(String[] args) {
         
        Person obj=new Person("Nitish", 24);
        obj.display();
    }
}
