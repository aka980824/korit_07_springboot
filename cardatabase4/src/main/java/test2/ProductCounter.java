package test2;
/*
설명: static 키워드를 사용하여 생성된 상품(Product) 객체의 총 개수를 추적하는 프로그램을 작성하세요.

요구사항 명세서:

Product 클래스에 private static int totalProducts 필드를 선언하고 0으로 초기화합니다.
Product 클래스의 생성자에서 totalProducts 값을 1씩 증가시킵니다.
public static int getTotalProducts() 메서드를 만들어 totalProducts 값을 반환하도록 합니다.
main 메서드에서 Product 객체를 여러 개 생성한 후, 클래스 이름을 통해 getTotalProducts()를 호출하여 총 생성된 상품 개수를 "실행 예"와 같이 출력하세요.

초기 상품 수: 0
총 상품 수: 3
 */
class Product {
    private String name;
    // TODO: 생성된 상품 수를 추적하기 위한 private static int 필드를 선언하시오.
    private static int totalProducts = 0;

    public Product(String name) {
        this.name = name;
        // TODO: 객체가 생성될 때마다 static 필드의 값을 1 증가시키시오.
        totalProducts++;
    }
    // TODO: static 필드의 값을 반환하는 public static 메서드를 작성하시오.
    public static int getTotalProducts() {
        return totalProducts;
    }
}

public class ProductCounter {
    public static void main(String[] args) {
        System.out.println("초기 상품 수: " + Product.getTotalProducts());

        new Product("사과");
        new Product("바나나");
        new Product("오렌지");

        // TODO: 총 상품 수를 static 메서드를 통해 출력하시오.
        System.out.println("총 상품 수: " + Product.getTotalProducts());
    }
}