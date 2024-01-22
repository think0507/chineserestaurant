package menu;

public class Menu {
    public String name;
    public int price;
    public String category;
    public int menuNumber;

    public Menu(String name, int price, String category, int menuNumber){
        this.name = name;
        this.price = price;
        this.category = category;
        this.menuNumber = menuNumber;
    }

    @Override
    public String toString() {
        return "이름=" + name +
                " 가격=" + price +
                " 카테고리=" + category +
                " 메뉴번호=" + menuNumber;
    }

    public String getName() {
        return name;
    }
}
