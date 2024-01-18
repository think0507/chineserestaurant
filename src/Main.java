
import menu.MenuArray;

import java.util.Scanner;

public class Main {
    static int category;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //굳이 이렇게 해야하나? 그렇다고 loading을 static으로 만들 이유는 없어보임.
        MenuArray ma = new MenuArray();

        ma.loading();
        System.out.println("중국관에오신걸 환영합니다");
        System.out.println("---------------------");

        boolean ordering = true;
        while(ordering){
            //카테고리라고 말하면 안될거같음.
            System.out.println("카테고리를 골라주세요");
            System.out.println("1. 볶음밥  2. 면요리  3. 탕수육  4. 장바구니 주문  5. 종료");
            category = sc.nextInt();
            switch (category){

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4 :
                    //order();
                    break;

                case 5:
                    ordering = false;
                    break;
            }
        }

    }
}