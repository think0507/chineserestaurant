
import menu.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Loading loading = new Loading();
        loading.firstLoading();

        //시작부
        System.out.println("중국관에오신걸 환영합니다");
        System.out.println("---------------------");

        kiosk.Kiosk.selectMenu();

    }
}