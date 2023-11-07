import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Введите количество элементов первого множества: ");
        int count1 = sc.nextInt();
        System.out.println("Введите элементы первого множества: ");
        for (int i = 0; i < count1; i++) {
            int num = sc.nextInt();
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Введите количество элементов второго множества: ");
        int count2 = sc.nextInt();
        System.out.println("Введите элементы второго множества: ");
        for (int i = 0; i < count2; i++) {
            int num = sc.nextInt();
            set2.add(num);
        }
        System.out.println("Первое множество вышло таким: ");
        for (int i : set1)
            System.out.print(i + " ");
        System.out.println("\nВторое множество вышло таким: ");
        for (int i : set2)
            System.out.print(i + " ");

        AndArray andArray = new AndArray();
        OrArray orArray = new OrArray();

        Set<Integer> andAdd = andArray.add(set1, set2);
        List<Double> andProcess = andArray.process(andAdd);

        System.out.println("\n\nРезультат по классу AndArray");
        System.out.println("Пересечение множеств: ");
        for (int i : andAdd)
            System.out.print(i + " ");
        System.out.println("\nПоэлементная обработка: ");
        for (double i : andProcess)
            System.out.println(i);

        Set<Integer> orAdd = orArray.add(set1, set2);
        List<Double> orProcess = orArray.process(orAdd);

        System.out.println("\n\nРезультат по классу OrArray");
        System.out.println("Объединение множеств: ");
        for (int i : orAdd)
            System.out.print(i + " ");
        System.out.println("\nПоэлементная обработка: ");
        for (double i : orProcess)
            System.out.println(i);
    }
}