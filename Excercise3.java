import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
         Scanner entry = new Scanner(System.in);
         int first;
         int secod;

         System.out.println("write a number");
          first = entry.nextInt();

         System.out.println("write the second number");
         secod = entry.nextInt();


         while(first == secod ){
            System.out.println(" the numbers are even:) ");

         System.out.println("write a number");
         first = entry.nextInt();

         System.out.println("escribre el secod numero");
         secod = entry.nextInt();

         if (first < secod || first > secod){
            System.out.println("the number is negative");
         }
             
        }
     }
 }
