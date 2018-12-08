import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слова, разделенные проблеами или двоеточиями: ");
        String str = sc.nextLine();

        String[] mas = str.split("[ :]");

        int count = 0;
        for (String s: mas)
            if (s.length()%2==0) count++;

        System.out.println("Количество слов с четным количеством букв: "+count);
    }
}
