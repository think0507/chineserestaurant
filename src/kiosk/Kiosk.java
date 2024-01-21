package kiosk;

import menu.MenuArray;
import order.Order;
import order.OrderBasket;
import java.util.Scanner;

public class Kiosk {
    //특정 카테고리를 받았을경우 메뉴출력
    public static void showMenu(String category){
        switch (category) {
            case "볶음밥":
                for(int i = 0; i< MenuArray.menuArray.size(); i++){
                    if(MenuArray.menuArray.get(i).category.equals("볶음밥")){
                        System.out.println(MenuArray.menuArray.get(i).name+" "+MenuArray.menuArray.get(i).price);
                    }
                }
                break;
            case "면요리":
                for(int i =0; i<MenuArray.menuArray.size();i++){
                    if(MenuArray.menuArray.get(i).category.equals("면요리")){
                        System.out.println(MenuArray.menuArray.get(i).name+" "+MenuArray.menuArray.get(i).price);
                    }
                }
                break;
            case "탕수육":
                for(int i =0; i<MenuArray.menuArray.size();i++){
                    if(MenuArray.menuArray.get(i).category.equals("탕수육")){
                        System.out.println(MenuArray.menuArray.get(i).name+" "+MenuArray.menuArray.get(i).price);
                    }
                }
                break;
            default:
                System.out.println("카테고리에 없습니다.");
                break;
        }
    }
    public static void selectMenu() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        boolean ordering = true;
        while(ordering){
            System.out.println("------------------");
            System.out.println("카테고리를 골라주세요");
            System.out.println("1. 볶음밥  2. 면요리  3. 탕수육  4. 장바구니 주문  5. 종료");

            int category = sc.nextInt();
            switch (category){
                //볶음밥 종류 선택
                case 1:
                    Kiosk.showMenu("볶음밥");
                    System.out.println("장바구니에 담을 메뉴를 골라주세요");
                    OrderBasket.addOrderBasketArray(sc.next());
                    System.out.println("장바구니에 담겼습니다.");
                    Thread.sleep(1000);
                    break;

                //면요리 종류 선택
                case 2:
                    Kiosk.showMenu("면요리");
                    System.out.println("장바구니에 담을 메뉴를 골라주세요");
                    OrderBasket.addOrderBasketArray(sc.next());
                    System.out.println("장바구니에 담겼습니다.");
                    Thread.sleep(1000);
                    break;

                //탕수육 종류 선택
                case 3:
                    Kiosk.showMenu("탕수육");
                    System.out.println("장바구니에 담을 메뉴를 골라주세요");
                    OrderBasket.addOrderBasketArray(sc.next());
                    System.out.println("장바구니에 담겼습니다.");
                    Thread.sleep(1000);
                    break;

                //장바구니에 있는것 주문
                case 4 :
                    Order.lastOrder();
                    Thread.sleep(1000);
                    break;
                // 종료시
                case 5:
                    ordering = false;
                    break;
            }
        }


    }


//    public static void selectCategory

    //카테고리없이 전체메뉴 출력할 경우 -->굳이안넣음
    public static void showMenu(){
        System.out.println(MenuArray.menuArray);
    }
}
