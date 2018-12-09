import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = sc.nextLine();

        String reg1 = "[abc]+";
        String reg2 = "([abc]+)\\1{2}";

        boolean b = true;
        if (!str.matches(reg1)) b = false;        //проверяем на наличие только a b c
        else if (str.contains("bb")) b = false;   //проверяем на вдойную b
        else if (str.matches(reg2)) b = false;   //проверяем тройное повторение любой комбинации

        if (b){
            System.out.println("Введенное слово является корректным словом из языка Мумба-Юмба!");
        }else System.out.println("Введенное слово не является корректным словом из языка Мумба-Юмба!");
    }
}
