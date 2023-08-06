// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("\n" + "Задача 1" + "\n");
        int[] mass = new int[]{1, 2, 3};
        double[] doouble = {1.57, 7.654, 9.986};
        int[] pew = {2, 25, 87, 94, 100};
    }

    public static void task2() {
        System.out.println("\n" + "Задача 2" + "\n");
        int[] mass = {1, 2, 3};
        for (int i = 0; i < mass.length; i++) {
            if (i < mass.length - 1) {
                System.out.print(mass[i] + ",");
            } else {
                System.out.println(mass[i]);
            }
        }
        double[] doouble = {1.57, 7.654, 9.986};
        System.out.println(doouble[2] + "," + doouble[1] + "," + doouble[0]);
        int[] pew = {2, 25, 87, 94, 100};
        for (int a = 0; a < pew.length; a++) {
            if (a < pew.length - 1) {
                System.out.print(pew[a] + ",");
            } else {
                System.out.println(pew[a]);
            }
        }
    }


    public static void task3() {
        System.out.println("\n" + "Задача 3" + "\n");
        int[] mass = {1, 2, 3};
        for (int i = mass.length - 1; i >= 0; i--) {
            if (i < 1) {
                System.out.println(mass[i]);
            } else {
                System.out.print(mass[i] + ",");
            }
        }
        double[] doouble = {1.57, 7.654, 9.986};
        System.out.println(doouble[2] + "," + doouble[1] + "," + doouble[0]);
        int[] pew = {2, 76, 98, 98787, 54, 34};
        for (int i = pew.length - 1; i >= 0; i--) {
            if (i < 1) {
                System.out.print(pew[i]);
            } else {
                System.out.print(pew[i] + ",");
            }
        }
    }

    public static void task4() {
        System.out.println("\n" + "Задача 4" + "\n");
        int mass[] = new int[]{1, 2, 3};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]%2 == 1) {
                mass[i] += 1;
            }
            System.out.print(mass[i] + " ");
        }
    }
}