package menu;

public class Loading {

    public void firstLoading(){
        MenuArray.dishArray.add(new Dish("매운해물볶음밥", 8000, "볶음밥", 1));
        MenuArray.dishArray.add(new Dish("매운참치볶음밥", 7000, "볶음밥", 2));
        MenuArray.dishArray.add(new Dish("매운소고기볶음밥", 7000, "볶음밥", 3));
        MenuArray.dishArray.add(new Dish("짬뽕", 6500, "면요리", 101));
        MenuArray.dishArray.add(new Dish("짜장", 5000, "면요리", 102));
        MenuArray.dishArray.add(new Dish("쟁반짜장", 12000, "면요리", 103));
        MenuArray.dishArray.add(new Dish("탕수육", 20000, "탕수육", 201));
        MenuArray.dishArray.add(new Dish("삼육식버섯탕수육", 100, "탕수육", 202));
    }
}
