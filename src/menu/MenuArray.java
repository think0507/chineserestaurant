package menu;

import java.util.ArrayList;

public class MenuArray {
    public static ArrayList<Menu> menuArray = new ArrayList<>();

    //이름, 가격, 카테고리, 메뉴넘버를 받아 배열에 메뉴추가
    public static void addMenu(String name, int price, String category, int menuNumber){
        Menu indexmenu = new Menu(name,price,category,menuNumber);
        menuArray.add(indexmenu);
    }

    public void loading(){
        menuArray.add(new Menu("매운해물볶음밥", 8000, "볶음밥", 1));
        menuArray.add(new Menu("매운참치볶음밥", 7000, "볶음밥", 2));
        menuArray.add(new Menu("매운소고기볶음밥", 7000, "볶음밥", 3));
        menuArray.add(new Menu("짬뽕", 0, "면요리", 101));
        menuArray.add(new Menu("짜장", 0, "면요리", 102));
        menuArray.add(new Menu("쟁반짜장", 0, "면요리", 103));
        menuArray.add(new Menu("탕수육", 0, "탕수육", 201));
        menuArray.add(new Menu("삼육식버섯탕수육", 0, "탕수육", 202));
    }





    //관리자 모드 에서 사용가능 // 출시예정 메뉴 추가시, 메뉴 타입으로 입력받아 바로 생성
    public static void addMenu(Menu menu){
        menuArray.add(menu);
    }
    //관리자 모드 사용가능 // 메뉴 삭제
    public static void deleteMenu(Menu menu){

    }
}
