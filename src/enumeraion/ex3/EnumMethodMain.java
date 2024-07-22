package enumeraion.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 ENUM 변환
        Grade[] values = Grade.values();

        System.out.println("values = " + Arrays.toString(values));

        for (Grade grade : values) {
            System.out.println("name = " + grade.name() + ", ordinal = " + grade.ordinal());
        }

        //String -> ENUM 변환
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
