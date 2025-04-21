import java.sql.SQLOutput;
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
        int[] array = {1, 2, 3, 4, 1, -2};
        printArray(array);

        //1.2 Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
        System.out.println("Сумма элементов массива: " + sumElements(array));

        //1.3 Реализуйте метод для поиска минимального элемента в одномерном массиве
        System.out.println("Минимальный элемент массива: " + minimum(array));

        //1.4 Создайте массив строк, инициализируйте его названиями месяцев года. Выведите все строки, начинающиеся на букву "М"
        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        strokiNaM(month);

        //1.5 Напишите метод, который инвертирует порядок элементов в одномерном массиве.
        printArray(array);
        printArray(arrayToReverse(array));

        //1.6 Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы
        chekArrayForRepeating(array);

        //1.7 Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.
        System.out.print("Массив из асболютных значений: ");
        printArray(chekForMinus(array));

        //2.1 Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив
        int [][] matrixx = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        print(matrixx);

        //2.2 Напишите метод, вычисляющий сумму всех элементов в двумерном массиве
        System.out.println("Сумма элементов двумерного массива: " + sumElementsOfMatrix(matrixx));

        //2.3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)
        findMaxElementOfMatrix(matrixx);

        //2.4 Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)
        chekArrayForKvadratish(matrixx);

        //2.5 Напишите метод, который находит сумму элементов каждой строки, минимальное и максимальное значение двумерного массива и выводит результаты
        superMethod(matrixx);

        //2.6 Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.
         print(bildArray(4,4));
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
     */

    //1.1 Создайте метод, который выводит массив в консоль.
    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //1.2 Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
    static int sumElements(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }

    //1.3 Реализуйте метод для поиска минимального элемента в одномерном массиве
    static int minimum(int[] array) {
        int minn = array[0];
        for (int j = 1; j < array.length; j++) {
            if (minn > array[j]) {
                minn = array[j];
            }
        }
        return minn;
    }

    //1.4 Создайте массив строк, инициализируйте его названиями месяцев года. Выведите все строки, начинающиеся на букву "М"
    static void strokiNaM(String[] month) {
        for (String name : month) {
            char letter = name.charAt(0);
            if (letter == 'м' || letter == 'М') {
                System.out.println(name);
            };
        }
    }

    //1.5 Напишите метод, который инвертирует порядок элементов в одномерном массиве.
    static int[] arrayToReverse(int[] array) {
        int k = array.length;
        int[] arrReverse = new int[k];
        for (int a = 0; a < k; a++) {
            arrReverse[a] = array[k - 1 - a];
        }
        return arrReverse;
    }

    //1.6 Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы
    static void chekArrayForRepeating(int[] array) {
        boolean chek = false;
        for (int i = 0;  i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    chek = true;
                    break;
                }
            }
        }
        System.out.println("В массиве есть повторяющиеся эелементы? - " + chek);
    }

    //1.7 Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.
    static int[] chekForMinus(int[] array) {
        int k = array.length;
        int[] positiveArray = new int[k];
        for (int a = 0; a < k; a++) {
            if (array[a] < 0) {
                positiveArray[a] = Math.abs(array[a]);
            } else {
                positiveArray[a] = array[a];
            }
        }
        return positiveArray;
    }

    //2.2 Напишите метод, вычисляющий сумму всех элементов в двумерном массиве
    static int sumElementsOfMatrix(int[][] matrixx) {
        int summ = 0;
        for (int x = 0; x < matrixx.length; x++) {
            for (int y = 0; y < matrixx[x].length; y++) {
                summ += matrixx[x][y];
            }
        }
        return summ;
    }

    //2.3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)
    static void findMaxElementOfMatrix(int[][] matrixx) {
        int maxxElement = matrixx[0][0];
        for (int g = 0; g < matrixx.length; g++) {
            for (int h = 0; h < matrixx[g].length; h++) {
                if (maxxElement <= matrixx[g][h]) {
                    maxxElement = matrixx[g][h];
                    System.out.printf("Максимальный элемент в матрице: " + maxxElement + " (%s,%s) ", g, h);
                    System.out.println();
                }
            }
        }
    }

    //2.4 Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)
    static void chekArrayForKvadratish(int[][] matrixx) {
        if (matrixx.length == matrixx[0].length) {
            System.out.println("Эта матрица квадратная");
        } else {
            System.out.println("Эта матрица НЕ квадратная");
        }
    }

    //2.5 Напишите метод, который находит сумму элементов каждой строки, минимальное и максимальное значение двумерного массива и выводит результаты
    static void superMethod(int[][] matrixx) {
        int minZnach = matrixx[0][0];
        int maxZnach = matrixx[0][0];
        for (int c = 0; c < matrixx.length; c++) {
            int sumPoStroke = 0;
            for (int d = 0; d < matrixx[c].length; d++) {
                sumPoStroke += matrixx[c][d];
                if (minZnach > matrixx[c][d]) {
                    minZnach = matrixx[c][d];
                }
                if (maxZnach < matrixx[c][d]) {
                    maxZnach = matrixx[c][d];
                }
            }
            System.out.printf("Строка %s: сумма = %s", c, sumPoStroke);
            System.out.println();
        }
        System.out.println("Минимальное значение: " + minZnach);
        System.out.println("Максимальное значение: " + maxZnach);
    }

    //2.6 Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.
    static int[][] bildArray(int rows, int columns ) {
             int[][] newArray = new int[rows][columns];
              for (int i = 0; i < rows; i++) {
                  for (int j =0; j < columns; j++) {
                      if ((i + j) % 2 == 0) {
                          newArray[i][j] = 0;
                      } else {
                          newArray[i][j] = 1;
                      }
                  }
              }
          return newArray;
     }
}