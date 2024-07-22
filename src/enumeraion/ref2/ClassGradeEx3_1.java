package enumeraion.ref2;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.COLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("basic: " + basic);
        System.out.println("gold: " + gold);
        System.out.println("diamond: " + diamond);
    }
}
