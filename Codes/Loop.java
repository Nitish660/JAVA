package Codes;
public class Loop {
    public static void main(String[] args) {
        
        int i;

        for(i=1;i<=4;i++){
            System.out.println("HI " + i);

            for(int j=1;j<=9;j++){
              System.out.println("  " + (j+8));
            } 
        }
    }
}
