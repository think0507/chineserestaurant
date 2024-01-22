package order;


public class Order {
    public static void lastOrder(){
        for(int i = 0; i<OrderBasket.orderBasketArray.size();i++){
            System.out.println(OrderBasket.orderBasketArray.get(i).getName());
        }
        if(OrderBasket.orderBasketArray.isEmpty()){
            System.out.println("장바구니가 비어있습니다.");
        }else{
            System.out.println("주문이 완료되었습니다. 감사합니다");
        }
        //장바구니 비우기
        OrderBasket.orderBasketArray.clear();
    }


    
    public static void addPrice(int price){

    }

}
