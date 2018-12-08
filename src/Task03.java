import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);

        List<String> words = new ArrayList<>();
        while (matcher.find())
            words.add(matcher.group());

        int sum=0;
        for (String word: words){
            sum += word.length();
        }

        float avg = (float)sum/words.size();

        System.out.printf("Средная длина слова в предложениее: %.2f символа.",avg);
    }
}
