package enumeraion.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VID(40);

    private final int discountPercent;

    // enum의 생성자는 접근지정자 생략
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public int discount(int price) {
        return this.discountPercent * price / 100;
    }
}
