package menu;

public class Menu {
    public String name;
    public int price;
    public String category;
    public int menuNumber;


    public String getName() {
        return name;
    }

    public Menu(String name, int price, String category, int menuNumber){
        this.name = name;
        this.price = price;
        this.category = category;
        this.menuNumber = menuNumber;
    }

}
