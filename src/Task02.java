import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        //формируем строку
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while (sb.length()<=1000){
            sb.append(count);
            count++;
        }
        //обрезаем до 1000 символов
        String str = sb.substring(0,1000);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите позицию искомой цифры (1-1000): ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.printf("Под номером %d в строке находится цирфа %s.",n,str.charAt(n-1));
    }
}
