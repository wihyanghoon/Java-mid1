package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,orange";

        String[] fruitsArray = fruits.split(",");

        // 분리하기
        for(String fruit : fruitsArray) {
            System.out.println("fruit: " + fruit);
        }

        //합치기
        String joinString = String.join("===>", fruitsArray);
        System.out.println("joinString: " + joinString);
    }
}
