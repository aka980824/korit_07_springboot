package test1;


/*
설명: 상품 재고를 관리하는 프로그램에서 재고가 부족할 때 사용자 정의 예외 OutOfStockException을 발생시키고 처리하는 코드를 작성하세요.

요구사항 명세서:

Exception 클래스를 상속받는 OutOfStockException 사용자 정의 예외 클래스를 만듭니다.
Product 클래스에 decreaseStock 메서드를 구현합니다. 이 메서드는 요청 수량(quantity)이 현재 재고(stock)보다 많으면 OutOfStockException을 발생시킵니다.
재고가 충분하면 stock에서 quantity만큼 차감합니다.
main 메서드에서 try-catch 블록을 사용하여 decreaseStock 메서드를 호출하고, OutOfStockException이 발생했을 때 적절한 메시지를 "실행 예"와 같이 출력하세요.

실행 예
재고 부족: 15개 주문 불가. 현재 재고: 10개.
 */
// TODO: Exception을 상속받는 OutOfStockException 클래스를 작성하시오.
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void decreaseStock(int quantity) throws OutOfStockException {
        // TODO: quantity가 stock보다 크면 OutOfStockException을 발생시키는 코드를 작성하시오.
        // 그렇지 않으면 stock을 quantity만큼 감소시킵니다.
        if(quantity > stock){
            throw new OutOfStockException("재고 부족: " + quantity + "개 주문 불가. 현재 재고: " + stock + "개.");
        }
        stock -= quantity;
    }

    public int getStock() {
        return stock;
    }
}

public class InventoryManager {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", 10);
        int orderQuantity = 15;

        // TODO: try-catch 블록을 사용하여 laptop.decreaseStock()을 호출하고,
        // OutOfStockException을 처리하여 실행 예와 같이 출력하시오.
        try {
            laptop.decreaseStock(orderQuantity);
            System.out.println("주문이 정상 처리되었습니다.");
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}