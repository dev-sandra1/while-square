import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;

        System.out.println("say a number:");
        num = entry.nextInt();
       
        while(num >= 0 ){
            System.out.println("the number is positive:)");

            System.out.println("say a number: ");
            num = entry.nextInt();
            
           if(num < 0){
            System.out.println("the number is negative :(");
            
           }   System.out.println("say a number:");
            num = entry.nextInt();
            
        }


    }
}
