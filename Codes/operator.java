public class operator  {
    public static void main(String a[]){
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
        int num4 = 6;

         num1++;    //post      fetch and increement
         num2--;
         ++num3;    //pre      increment and fetch
         --num4;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        int result =num1++;
        
        System.out.println(result);
    }
    
}
