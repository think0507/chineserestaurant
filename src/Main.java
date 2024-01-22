
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
        //수정) 키오스크에서 toString을 생성해서 긴 sout문 조절
        // showMenu => showMenuByCategory 로 변경
        //selectMenu 인풋 나누는거 코드가 그대로인데 굳이 하는것이 나은지? 확장성을 위한것??
    }
}