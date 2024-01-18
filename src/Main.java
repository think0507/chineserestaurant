import menu.*;
import order.*;
import java.util.Scanner;

public class Main {
    static int category;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        OrderBasket ob = new OrderBasket();
        MenuArray ma = new MenuArray();

        //굳이 이렇게 해야하나? 그렇다고 loading을 static으로 만들 이유는 없어보임.
        Loading loading = new Loading();
        loading.firstloading();

        //시작부
        System.out.println("중국관에오신걸 환영합니다");
        System.out.println("---------------------");

        boolean ordering = true;
        while(ordering){
            //카테고리라고 말하면 안될거같음.
            System.out.println("------------------");
            System.out.println("카테고리를 골라주세요");
            System.out.println("1. 볶음밥  2. 면요리  3. 탕수육  4. 장바구니 주문  5. 종료");

            category = sc.nextInt();
            switch (category){
                //한글 String으로 매개변수 넣는게 코드짜는 상 문제가 있는지 없는지.
                //볶음밥 종류 선택
                case 1:
                    Kiosk.showMenu("볶음밥");
                    System.out.println("장바구니에 담을 메뉴를 골라주세요");
                    OrderBasket.addOrderBasketArray(sc.next());
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
}