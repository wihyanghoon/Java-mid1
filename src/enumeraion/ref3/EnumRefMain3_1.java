package enumeraion.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic =  discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.BASIC, price);
        int diamond = discountService.discount(Grade.BASIC, price);
    }
}
