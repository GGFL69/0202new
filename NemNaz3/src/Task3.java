import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main (String [] args){
        ArrayList<String> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        while (true) {
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное в список");
            System.out.println("3. Удалить животное из списка");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить наличие животного");
            System.out.println("0. Выйти из программы");
            System.out.print("Выберите команду: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    if (animals.isEmpty()) {
                        System.out.println("В зоопарке нет животных.");
                    } else {
                        System.out.println("Список животных в зоопарке (" + animals.size() + " шт.):");
                        for (String animal : animals) {
                            System.out.println("- " + animal);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Введите название животного для добавления: ");
                    String newAnimal = scanner.nextLine();
                    animals.add(newAnimal);
                    System.out.println("Животное \"" + newAnimal + "\" добавлено в зоопарк.");
                    break;
                case 3:
                    if (animals.isEmpty()) {
                        System.out.println("Список пуст. Нечего удалять.");
                    } else {
                        System.out.print("Введите название животного для удаления: ");
                        String animalToRemove = scanner.nextLine();
                        if (animals.remove(animalToRemove)) {
                            System.out.println("Животное \"" + animalToRemove + "\" удалено из зоопарка.");
                        } else {
                            System.out.println("Животное \"" + animalToRemove + "\" не найдено в зоопарке.");
                        }
                    }
                    break;
                case 4:
                    if (animals.isEmpty()) {
                        System.out.println("Список уже пуст.");
                    } else {
                        animals.clear();
                        System.out.println("Список животных очищен.");
                    }
                    break;
                case 5:
                    System.out.print("Введите название животного для проверки: ");
                    String animalToCheck = scanner.nextLine();
                    if (animals.contains(animalToCheck)) {
                        System.out.println("Да, животное \"" + animalToCheck + "\" есть в зоопарке.");
                    } else {
                        System.out.println("Нет, \"" + animalToCheck + "\" нет в зоопарке.");
                    }
                    break;
                case 0:
                    System.out.println("До свидания!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неправильная команда.");
            }
        }
    }
}