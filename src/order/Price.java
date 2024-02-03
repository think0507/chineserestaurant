package order;

public class Price {
    private static int totalPrice;

    public static void addPrice(int price){
        totalPrice+=price;
    }
    public static int getTotalPrice() {
        return totalPrice;
    }
}

