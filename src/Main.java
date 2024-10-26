import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("количество элементов массива:");
        int[] myArray = new int[scan.nextInt()];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }
        System.out.println("введи к1 и к2:");

        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        if (k1 < 0 || k2 >= myArray.length || k2 <= k1) {
            System.out.println("к1 должно быть меньше к2");
            return;


    }
        int sum = 0;

        for (int i = k1; i <= k2; i++) {

            sum += myArray[i];

        }


        System.out.println("= " + sum);
    }
}