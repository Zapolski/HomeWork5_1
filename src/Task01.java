import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        System.out.print("Введите искомый символ: ");
        String ch = sc.nextLine();

        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (str.contains(ch)){
            sb = sb.append(str.indexOf(ch)).append("; ");
            str = str.replaceFirst(ch,"");
            count++;
        }

        if (count==0){
            System.out.println("Искомый символ в строке не встречается!");
        }else{
            System.out.printf("Искомый символ встречается в сроке %d раз(а). Индексы вхождений: %s",count,sb.toString());
        }


    }
}
