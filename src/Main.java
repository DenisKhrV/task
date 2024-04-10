import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"Мастер и Маргарита", "Михаил Афанасьевич Булгаков"}, {"Идиот", "Фёдор Михайлович Достоевский"}, {"Евгений Онегин", "Александр Сергеевич Пушкин"}};
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = "\"" + array[i][0] + "\" " + array[i][1];
        }
        System.out.print(Arrays.toString(newArray));
    }
}
