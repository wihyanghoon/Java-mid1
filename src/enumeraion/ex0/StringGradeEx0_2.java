package enumeraion.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 없는값
        int vip = discountService.discount("VIP", price);
        System.out.println("vip: " + vip);

        // 소문자 등
        int gold = discountService.discount("gold", price);
        System.out.println("gold: " + gold);
    }
}
