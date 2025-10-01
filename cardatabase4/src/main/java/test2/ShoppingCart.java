package test2;

import java.util.ArrayList;
import java.util.List;
/*
`ArrayList`를 사용하여 장바구니에 상품을 추가, 삭제, 조회하는 간단한 프로그램을 작성하세요.

**요구사항 명세서:**

1.  `main` 메서드에서 `String` 타입의 요소를 저장하는 `ArrayList`인 `cart`를 생성합니다.
2.  `cart`에 "사과", "우유", "빵"을 순서대로 추가합니다.
3.  "우유"를 `cart`에서 삭제합니다.
4.  `cart`의 첫 번째 상품을 조회하여 출력합니다.
5.  최종적으로 `cart`에 담긴 모든 상품 목록을 "실행 예"와 같이 출력하세요.

첫 번째 상품: 사과
최종 목록: [사과, 빵]
 */
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();

        // TODO: cart에 "사과", "우유", "빵"을 추가하시오.
        cart.add("사과");
        cart.add("우유");
        cart.add("빵");
        // TODO: cart에서 "우유"를 삭제하시오.
        cart.remove("우유");
        // TODO: cart의 첫 번째 항목을 조회하여 "첫 번째 상품: [상품명]" 형식으로 출력하시오.
        if (cart.size() > 0) {
            String firstItem = cart.get(0);
            System.out.println("첫 번째 상품: " + firstItem);
        } else {
            System.out.println("장바구니가 비어 있습니다.");
        }
        // TODO: 최종 장바구니 목록을 "최종 목록: [리스트]" 형식으로 출력하시오.
        System.out.println("최종 목록: " + cart);
    }
}