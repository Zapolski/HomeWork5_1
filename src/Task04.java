import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предложение на латинице: ");
        String str = sc.nextLine();


        Pattern pattern = Pattern.compile("\\b[AaEeIiOoUu]\\w+\\B[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz]");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()){
            System.out.println("Слова, начинающиеся на гласные буквы и заканчивающиеся на согласные:");
            System.out.println(matcher.group());
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }else{
            System.out.println("Во введенном предложении нет слов, начинающиеся на гласные буквы и заканчивающиеся на согласные.");
        }
    }
}
