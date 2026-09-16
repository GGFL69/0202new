import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        System.out.println("Какая погода?");
        Scanner sc = new Scanner(System.in);
        String weather = sc.nextLine();
        if (weather.equalsIgnoreCase("Дождь"))
            System.out.println("Беру с собой зонт");
        else System.out.println("Иду налегке");
        System.out.println("Люблю гулять!");
    }
}
