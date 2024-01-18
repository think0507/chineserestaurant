package menu;

public class ShowMenu {
    //특정 카테고리를 받았을경우 메뉴출력
    public static void showMenu(int category){
        switch (category) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }


    }
    //카테고리없이 전체메뉴 출력할 경우
    public static void showMenu(){
        System.out.println(MenuArray.menuArray);
    }
}
