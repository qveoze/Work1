package work1;

import java.util.Scanner; //ввод пользовательских данных

public class work1 {
    public static void main(String[] args ){
    Scanner consol = new Scanner(System.in);
//номер 1

        System.out.println("Введите целое число: ");
        int t = consol.nextInt();
        if (t % 2 == 0) {
            System.out.println(t + " чётное число");
        }
        else {
            System.out.println(t+ " нечётное число");
        }
//номер 2
        System.out.println("a: ");
        int a = consol.nextInt();

        System.out.println("b: ");
        int b = consol.nextInt();

        System.out.println("c: ");
        int c = consol.nextInt();

        int discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            int x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("нет решений");
        }

//номер 3
        System.out.println("a1: ");
        int a1 = consol.nextInt();

        System.out.println("a2: ");
        int a2 = consol.nextInt();

        System.out.println("a3: ");
        int a3 = consol.nextInt();

        System.out.println(Math.max(Math.max(a1, a2), a3));

//номер 4
        System.out.println("x: ");
        int x = consol.nextInt();

        System.out.println("y: ");
        int y = consol.nextInt();

        System.out.println(x%y == 0? "Первое число делится на второе без остатка" : x%y); //тернарный оператор

    }
}


