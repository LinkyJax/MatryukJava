import java.util.Scanner;

public class One {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число:");

        int number = Integer.parseInt(sc.next());

        if (number > 7) {
        System.out.print("Привет");
    }

}}
