
import menu.*;
import order.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        OrderBasket ob = new OrderBasket();
        MenuArray ma = new MenuArray();

        //굳이 이렇게 해야하나? 그렇다고 loading을 static으로 만들 이유는 없어보임.
        Loading loading = new Loading();
        loading.firstLoading();

        //시작부
        System.out.println("중국관에오신걸 환영합니다");
        System.out.println("---------------------");

        kiosk.Kiosk.selectMenu();

    }
}