package test1;

import java.util.Scanner;
/*
VendingMachine 클래스에 selectDrink 메서드를 구현합니다. 이 메서드는 int 타입의 choice를 인자로 받습니다.
selectDrink 메서드 내에서 switch 문을 사용하여 choice 값에 따라 다른 음료 정보를 출력합니다.
1번: "콜라 - 1,000원"
2번: "사이다 - 1,200원"
3번: "물 - 800원"
case에 해당하지 않는 번호가 입력되면 default 문을 사용하여 "잘못된 번호입니다."를 출력합니다.
main 메서드에서 Scanner를 사용하여 사용자로부터 음료 번호를 입력받고, selectDrink 메서드를 호출하여 결과를 출력합니다. 프로그램은 한 번의 선택 후 종료됩니다.
 */
class VendingMachine {
    public void selectDrink(int choice) {
        // TODO: switch문을 사용하여 choice 값에 따라 음료 이름과 가격을 출력하시오.
        // 1: "콜라 - 1,000원", 2: "사이다 - 1,200원", 3: "물 - 800원"
        // 그 외의 번호는 "잘못된 번호입니다." 출력
        switch (choice){
            case 1:
                System.out.println("콜라 : 1,000 원");
                break;
            case 2:
                System.out.println("사이다 : 1,200 원");
                break;
            case 3:
                System.out.println("물 : 800 원");
                break;
            default:
                System.out.println("숫자 잘못 입력");
                break;
        }
    }
}

public class Simulator {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 자판기 ---");
        System.out.println("1. 콜라  2. 사이다  3. 물");
        System.out.print("음료 번호를 선택하세요: ");

        int choice = scanner.nextInt();
        machine.selectDrink(choice);

        scanner.close();
    }
}
