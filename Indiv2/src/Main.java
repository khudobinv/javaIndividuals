public class Main {
    public static void main(String[] args) {
        int[] array1 = {9, 9, 9, 9, 9};
        int[] array2 = {3, 4, 5, 6, 7};

        Array andArray = new AndArray(array1);
        int[] intersectionResult = andArray.add(array2);
        double[] sqrtResult = andArray.process(array1);

        Array orArray = new OrArray(array1);
        int[] unionResult = orArray.add(array2);
        double[] logResult = orArray.process(array1);

        System.out.println("Пересечение двух массивов: ");
        printArray(intersectionResult);

        System.out.println("\nВычисление квадратного корня элементов пересечения двух массивов:");
        printArray(sqrtResult);

        System.out.println("\nОбъединение двух массивов: ");
        printArray(unionResult);

        System.out.println("\nВычисление логарифма элементов объединения двух массивов:");
        printArray(logResult);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
