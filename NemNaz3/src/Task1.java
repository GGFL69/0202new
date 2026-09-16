import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> speeds = new ArrayList<>();

        System.out.print("Количество скоростей = ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Скорость " + (i+1) + " = ");
            speeds.add(sc.nextInt());
        }

        int sum = 0;
        for (Integer speed : speeds) {
            sum += speed;
        }

        int averageSpeed = sum / speeds.size();
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");

        sc.close();
            }
        }