import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WorldCountries countriesList = new WorldCountries();
        Country russia = new Country();
        countriesList.addCountry(russia);
        Country usa = new Country("США", "Вашингтон", 336000000, 9800000, "английский", "доллар", "Джо Байден");
        countriesList.addCountry(usa);
        Country china = new Country("Китай", "Пекин", 1441000000, 9600000, "китайский", "юань", "Си Цзиньпин");
        countriesList.addCountry(china);
        Country urkine = new Country("Украина", "Киев", 41100000, 603500, "украинский", "гривна", "Владимир Зеленский");
        countriesList.addCountry(urkine);
        Country poland = new Country("Польша", "Варшава", 37800000, 312000, "польский", "злотый", "Анджей Дуда");
        countriesList.addCountry(poland);
        // добавление стран пользователем
//        System.out.print("Введите количество стран для добавления: ");
//        int qty = scanner.nexInt();
//        for (int i = 0; i < qty; i++) {
//            System.out.println("Добавляем " + (i + 1) + "-ую страну...");
//            System.out.print("Введите название страны: ");
//            String name = scanner.nextLine();
//            System.out.print("Введите столицу страны: ");
//            String capital = scanner.nextLine();
//            System.out.print("Введите население страны: ");
//            int population = scanner.nexInt();
//            System.out.print("Введите площадь страны: ");
//            int square = scanner.nexInt();
//            System.out.print("Введите официальный язык страны: ");
//            String officialLanguage = scanner.nextLine();
//            System.out.print("Введите валюту страны: ");
//            String currency = scanner.nextLine();
//            System.out.print("Введите главу страны: ");
//            String head = scanner.nextLine();
//            Country addedCountry = new Country (name, capital, population, square, officialLanguage, currency, head);
//            countriesList.addCountry(addedCountry);
//        }

        // поиск по фильтру
        System.out.print("По какому признаку хотите найти страну (название, столица, население, площадь, официальный язык, валюта, глава страны): ");
        String filter = scanner.nextLine();

        switch (filter.toLowerCase()) {
            case "название":
                System.out.print("Введите название страны: ");
                String name = scanner.nextLine();
                countriesList.findCountryByName(name);
                break;
            case "столица":
                System.out.print("Введите столицу страны: ");
                String capital = scanner.nextLine();
                countriesList.findCountryByCapital(capital);
                break;
            case "население":
                System.out.print("Введите население страны: ");
                int population = scanner.nextInt();
                scanner.nextLine(); // добавлено для очистки буфера
                countriesList.findCountryByPopulation(population);

                break;
            case "площадь":
                System.out.print("Введите площадь страны: ");
                int square = scanner.nextInt();
//                scanner.nextLine(); // добавлено для очистки буфера
                countriesList.findCountryBySquare(square);
                break;
            case "официальный язык":
                System.out.print("Введите официальный язык страны: ");
                String officialLanguage = scanner.nextLine();
                countriesList.findCountryByOfficialLanguage(officialLanguage);
                break;
            case "валюта":
                System.out.print("Введите валюту страны: ");
                String currency = scanner.nextLine();
                countriesList.findCountryByCurrency(currency);
                break;
            case "глава страны":
                System.out.print("Введите главу страны: ");
                String head = scanner.nextLine();
                countriesList.findCountryByHead(head);
                break;
            default:
                System.out.println("[!] Нет такого фильтра поиска!");
        }

// удаление страны
        System.out.print("Введите название страны для удаления: ");
        String nameToDelete = scanner.nextLine();
        countriesList.deleteCountry(nameToDelete);


// сортировка по фильтру
        System.out.print("По какому признаку хотите сортировать страны (название, столица, население, площадь, официальный язык, валюта, глава страны): ");
        String sortBy = scanner.nextLine();

        switch (sortBy.toLowerCase()) {
            case "название":
                countriesList.sortByName();
                break;
            case "столица":
                countriesList.sortByCapital();
                break;
            case "население":
                countriesList.sortByPopulation();
                break;
            case "площадь":
                countriesList.sortBySquare();
                break;
            case "официальный язык":
                countriesList.sortByOfficialLanguage();
                break;
            case "валюта":
                countriesList.sortByCurrency();
                break;
            case "глава страны":
                countriesList.sortByHead();
                break;
            default:
                System.out.println("[!] Нет такого признака для сортировки!");
        }

        // вывод всех стран
        countriesList.print();

    }
}