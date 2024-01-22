package menu;

public class Loading {
    public void firstLoading(){
        MenuArray.menuArray.add(new Dish("매운해물볶음밥", 8000, "볶음밥", 1));
        MenuArray.menuArray.add(new Dish("매운참치볶음밥", 7000, "볶음밥", 2));
        MenuArray.menuArray.add(new Dish("매운소고기볶음밥", 7000, "볶음밥", 3));
        MenuArray.menuArray.add(new Dish("짬뽕", 6500, "면요리", 101));
        MenuArray.menuArray.add(new Dish("짜장", 5000, "면요리", 102));
        MenuArray.menuArray.add(new Dish("쟁반짜장", 12000, "면요리", 103));
        MenuArray.menuArray.add(new Dish("탕수육", 20000, "탕수육", 201));
        MenuArray.menuArray.add(new Dish("삼육식버섯탕수육", 100, "탕수육", 202));

        MenuArray.menuArray.add(new Drink("사이다", 1000, "음료",301));
        MenuArray.menuArray.add(new Drink("콜라", 1000, "음료",302));
        MenuArray.menuArray.add(new Drink("제로사이다", 1500, "음료",303));
        MenuArray.menuArray.add(new Drink("제로콜라", 1500, "음료",304));
        MenuArray.menuArray.add(new Drink("환타", 2000, "음료",305));
        MenuArray.menuArray.add(new Drink("자몽에이드", 4000, "음료",306));
        MenuArray.menuArray.add(new Drink("아이스티", 3500, "음료",307));
    }
}
