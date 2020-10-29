public class Lesson02 {

    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void main(String[] args) {
        System.out.println("\n   Задание 1 ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.println(arr[i] + " ");
        }



    //2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        System.out.println("\n  Задание 2 ");
        int[] arr1 = new int[8];
        for (int i = 1, j = 0; i < arr1.length; i++) arr1[i] = j += 3;
        for (int x : arr1) System.out.print(x + " ");

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;

        System.out.println("\n    Задание 3 ");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i< arr2.length; i++)
        {
            if (arr2[i] < 6) arr2[i] *=2;
            System.out.print(arr2[i] + " ");
        }
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        System.out.println("\r\n  Задание 4");

        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++)
        {
            for (int j = 0, j1 = arr4[i].length; j < arr4[i].length; j++, j1--) {
                if (i == j || i == (j1 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }

        //** Задать одномерный массив и
        // найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("\n Задание 5 ");

        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr5[0], max = arr5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                indMax = i;
            }
            if (arr5[i] < min) {
                min = arr5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент  " + indMax + " = " + max);
        System.out.println("Минимальный элемент  " + indMin + "  = " + min);






    }
}
