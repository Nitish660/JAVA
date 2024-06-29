 class Human {
 
     private int age;
     private String name="Nitish";

     public int getAge()
     {
        return age;
     }
     
     public int setAge(int a){
        return age =a;
     }

     public String getName()
     {
        return name;
     }
    
}

public class Encap {

     public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(20);
        obj.getName();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

     }
}
