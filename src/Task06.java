public class Task06 {
    public static void main(String[] args) {

        String[] mas = new String[100_000];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = String.valueOf(i);
            while (mas[i].length()<5) mas[i]="0"+mas[i];
        }

        int count =0;
        for (String s: mas)
            if (s.contains("4")||(s.contains("13"))) count++;
        System.out.printf("Для совместных учений требуется исключить %d номеров.",count);
    }
}
