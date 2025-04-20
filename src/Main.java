import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        // int[] numbers = new int[10];
        // String[] names = {"Ilya", "Elena", "Андрей"};

        //System.out.println(numbers);

        /*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */

        /*
        for (String name : names) {
            System.out.println(name);
        }
         */

        // Запись значение
        // numbers[0] = 1;

        // System.out.println(numbers[0]);
        // System.out.println(names[1]);
        // System.out.println(names.length);

        // System.out.println(average(1000));
        // System.out.println(averageV2(1000));

        // int[][] matrix = new int[10][10];
        // int[][] grid = {{1, 2}, {3, 4}};

        // print(matrix);
        // print(grid);

        // printIndex(matrix);
        // printIndex(grid);

        // int[][] data = createMatrix(10);
        // print(data);
        // sum(data);

        /**
         * Lesson 5. Homework
         * 1. Одномерные массивы.
         */

        //1.1 Создайте метод, который выводит массив в консоль.
        int[] array = {1, 2, 3, 4};
        printArray(array);

        //2.1 Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
        System.out.println("Сумма элементов массива: " + sumElements(array));

        //3.1 Реализуйте метод для поиска минимального элемента в одномерном массиве
        System.out.println("Минимальный элемент массива: " + minimum(array));

    }

    // O(2n)
    static int average(int size) {
        int[] arr = new int[size];

        // O(n)
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
        }

        int sum = 0;

        // O(n)
        for (int e : arr) {
            sum += e;
        }

        return sum / size;
    }

    // O(n)
    static int averageV2(int size) {
        int[] arr = new int[size];
        int sum = 0;

        // O(n)
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
            sum += arr[i];
        }


        return sum / size;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void printIndex(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("(%s, %s)", i, j);
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = RANDOM.nextInt(100);
            }
        }
        return matrix;
    }

    static void sum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.printf("Строка %s: сумма = %s\n", i, sum);
        }

    }

    /**
     * Lesson 5. Homework
     * 1. Одномерные массивы.
     *  static int[] bildArray(int size) {
     *         int[] array = new int[size];
     *         for (int i = 0; i < array.length; i++) {
     *             array[i] = RANDOM.nextInt(100);
     *         }
     *     return array;
     *     }
     */

    //1.1 Создайте метод, который выводит массив в консоль.
    static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    //2.1 Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
    static int sumElements(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }

    //3.1 Реализуйте метод для поиска минимального элемента в одномерном массиве
    static int minimum(int[] array) {
        int minn = array[0];
        for (int j = 1; j < array.length; j++) {
            if (minn > array[j]) {
                minn = array[j];
            }
        }
        return minn;
    }


}