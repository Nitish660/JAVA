package Codes;

class Cal {
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }
}

public class Calculator {
public static void main(String[] args) {
    Cal cal=new Cal();
    Adcal obj = new Adcal();
   int r1 = cal.add(3,4);
   int r2 = cal.sub(6, 2);
   int r3 = obj.multi(5,9);

    
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);

    
}
    
}