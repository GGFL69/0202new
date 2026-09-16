import java.util.Scanner;

public class Task3 {
    public static void main(String [] args){
        System.out.print("Яиц в холодильнике = ");
        Scanner sc = new Scanner(System.in);
        int eggsQ = sc.nextInt();
        if (eggsQ>3)
            System.out.println("Рекомендую приготовить омлет.");
        else System.out.println("Рекомендую позавтракать бутербродами.");
        System.out.println("Приятного аппетита!");
    }
}
