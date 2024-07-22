package enumeraion.ref2;

public enum Grade {
    BASIC(10), COLD(20), DIAMOND(30);

    private final int discountPercent;

    // enum의 생성자는 접근지정자 생략
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }
}
