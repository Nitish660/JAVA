package Codes;
class Computer{

    public void playmusic(){
        System.out.println("music is playing..");
    }

    public String getMeAPen(int cost){
        if(cost>=10)
        return "pen";
        else
        return "Nothing";
    }
}

public class Method {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playmusic();
       String str = obj.getMeAPen(8);
       System.out.println(str);


    }
    
}
