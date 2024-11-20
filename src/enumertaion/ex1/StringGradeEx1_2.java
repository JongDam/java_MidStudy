package enumertaion.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {//실수 할 수 있는 부분
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("vip등급의 할인 금액 " + vip);

        //오타
        int diamondd = discountService.discount("DAIMONED", price);
        System.out.println("diamondd등급의 할인 금액:  " + diamondd);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold등급의 할인 금액 " + gold);

        }
}
