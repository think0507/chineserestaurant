
import menu.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Loading loading = new Loading();
        loading.firstLoading();

        //시작부
        System.out.println("중국관에오신걸 환영합니다");
        System.out.println("---------------------");

        kiosk.Kiosk.selectMenu();

        //피드백과 달리 Menu라는것은 네이밍은 그대로 가되, 그 아래 Dish(기존 Menu)와 Drink를 세분화함
    }
}