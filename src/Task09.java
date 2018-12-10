import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task09 {
    public static void main(String[] args) {

        //Аз есмь строка, живу я, мерой остр.
        //За семь морей ростка я вижу рост.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String str1 = sc.nextLine();

        System.out.print("Введите второе предложение: ");
        String str2 = sc.nextLine();

        String[] ar1 = getArrayWordsWithSortedLetters(str1);
        Arrays.sort(ar1);
        String[] ar2 = getArrayWordsWithSortedLetters(str2);
        Arrays.sort(ar2);

        boolean b = true;
        if (ar1.length==ar2.length){
            for (int i = 0; i < ar1.length; i++) {
                System.out.println(ar1[i]+" "+ar2[i]);
                if (!ar1[i].equals(ar2[i])){
                    b=false;
                    break;
                }
            }
        }else System.out.println("Предложения имеют различное количество слов!");

        if (b) System.out.println("Yes");
        else System.out.println("No");
    }

    public static String[] getArrayWordsWithSortedLetters(String str){
        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(str);
        ArrayList<String> words = new ArrayList<>();
        while (matcher.find()){
            char[] mas1= matcher.group().toLowerCase().toCharArray();
            Arrays.sort(mas1);
            String s = String.valueOf(mas1);
            words.add(s);
        }
        return words.toArray(new String[0]);
    }
}
