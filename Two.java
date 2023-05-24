import java.util.Scanner;

public class Two {
             public static void main (String[] args){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Введите имя:");
                 while (true){
                     String name = sc.next();
                     if(name.equalsIgnoreCase("вячеслав")){
                         System.out.println("Привет, Вячеслав");
                         break;
                     }
                     else {
                         System.out.println("Нет такого имени");
                     }
                 }
             }
         }
