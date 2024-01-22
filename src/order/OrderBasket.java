package order;

import menu.Dish;
import menu.Menu;
import menu.MenuArray;

import java.util.ArrayList;

public class OrderBasket {
    static ArrayList<Menu> orderBasketArray = new ArrayList<Menu>();
    public static void addOrderBasketArray(Menu menu){
        orderBasketArray.add(menu);
    }

    //String으로 장바구니에 넣을때
    public static void addOrderBasketArray(String stringMenu) {
        Menu menu = null;
        for (Menu m : MenuArray.dishArray) {
            if (stringMenu.equals(m.getName())) {
                menu = m;
                orderBasketArray.add(menu);
                break;
            }
        }
        if (menu == null) {
            System.out.println("그런 메뉴는 없습니다.");
        }
    }
}
