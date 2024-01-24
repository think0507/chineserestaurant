package order;


public class Order {
    public static void lastOrder(){
        for(int i = 0; i<OrderBasket.orderBasketArray.size();i++){
            System.out.println(OrderBasket.orderBasketArray.get(i).getName());

            //가격추가.
            Price.addPrice(OrderBasket.orderBasketArray.get(i).price);
        }
        if(OrderBasket.orderBasketArray.isEmpty()){
            System.out.println("장바구니가 비어있습니다.");
        }else{
            System.out.println("주문이 완료되었습니다. 감사합니다");
            System.out.println("가격은"+Price.getTotalPrice()+"입니다.");
        }

        //장바구니 비우기
        OrderBasket.orderBasketArray.clear();
    }
}
