import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = sc.nextLine();

        char[] mas= str.toCharArray();

        for (int i = 1; i <= mas.length; i++) {
            for (int j = 1; j <= mas.length-i; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print(mas[j]);
            System.out.println();
        }
        for (int i = 1; i <= mas.length-1; i++){
            for (int j = 0; j < mas.length-i; j++) System.out.print(mas[j]);
            System.out.println();
        }

    }
}
