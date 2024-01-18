package menu;

public class Kiosk {
    //특정 카테고리를 받았을경우 메뉴출력
    public static void showMenu(String category){
        switch (category) {
            case "볶음밥":
                for(int i =0; i<MenuArray.menuArray.size();i++){
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
    //카테고리없이 전체메뉴 출력할 경우 -->굳이안넣음
    public static void showMenu(){
        System.out.println(MenuArray.menuArray);
    }
}
