package Codes;
public class if_else_if {
    public static void main(String[] args) {
        int x =8;
        int y=7;
        int z=9;

        if(x>y && x>z){
            System.out.println("X iz largest");
        }
        else if(y>x && y>z){
            System.out.println("Y is largest");
        }
        else{
        System.out.println("Z is largest");}
    }
}
