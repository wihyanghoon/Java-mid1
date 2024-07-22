package enumeraion.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class Basic : " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD : " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND : " + ClassGrade.DIAMOND.getClass());

        System.out.println("basic ref : " + ClassGrade.BASIC);
        System.out.println("gold ref : " + ClassGrade.GOLD);
        System.out.println("diamond ref : " + ClassGrade.DIAMOND);
    }
}
