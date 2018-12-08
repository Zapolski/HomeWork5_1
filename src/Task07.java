import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        //меняем все цифры на символ подчеркивания
        str = str.replaceAll("[\\d]","_");

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                str=str.substring(0,i)+str.substring(i).replaceFirst(String.valueOf(str.charAt(i)),
                        String.valueOf(str.charAt(i)).toUpperCase());
            }else {
                if (Character.isUpperCase(str.charAt(i))){
                    str=str.substring(0,i)+str.substring(i).replaceFirst(String.valueOf(str.charAt(i)),
                            String.valueOf(str.charAt(i)).toLowerCase());
                }
            }
        }
        System.out.println("Результат преобразование: "+str);
    }
}
