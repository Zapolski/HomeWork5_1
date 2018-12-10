import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

            //javaIdentifier longAndMnemonicIdentifier name nEERC
            //java_identifier long_and_mnemonic_identifier name n_e_e_r_c
            //java_Identifier
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите наименование переменной: ");
            String str = sc.nextLine();

            if (str.contains("_")&& !str.equals(str.toLowerCase())){
                System.out.println("Смешанный синтаксис!");
            }else{
                if (Character.isLowerCase(str.charAt(0))&&!str.contains("_")){
                    System.out.println("Результат преобразования наименования переменной с Java на C: "+fromJavaToC(str));
                }else{
                    System.out.println("Результат преобразования наименования переменной с C на Java: "+fromCToJava(str));
                }
            }
    }

    public static String fromJavaToC(String str){
        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (Character.isUpperCase(array[i])){
                sb.append('_').append(String.valueOf(array[i]).toLowerCase());
            }else sb.append(array[i]);
        }
        return sb.toString();
    }

    public static String fromCToJava(String str){
        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i]=='_') b = true;
            else
            if (b){
                sb.append(String.valueOf(array[i]).toUpperCase());
                b = false;
            }
            else sb.append(array[i]);
        }
        return sb.toString();
    }
}
