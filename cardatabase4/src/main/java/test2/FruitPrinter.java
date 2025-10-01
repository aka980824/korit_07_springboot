package test2;
/*
설명: 문자열 배열에 담긴 과일 이름을 **향상된 for문(enhanced for loop)**을 사용하여 간결하게 출력하는 프로그램을 작성하세요.

요구사항 명세서:

String 타입의 배열 fruits를 선언하고 "사과", "바나나", "딸기", "포도"로 초기화합니다.
향상된 for문을 사용하여 fruits 배열의 각 요소를 순서대로 "맛있는 [과일이름]" 형식으로 출력합니다.

맛있는 사과
맛있는 바나나
맛있는 딸기
맛있는 포도
 */
public class FruitPrinter {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "딸기", "포도"};

        // TODO: 향상된 for문을 사용하여 배열의 모든 과일 이름을 지정된 형식으로 출력하시오.
        for(String fruit : fruits){
            System.out.println("맛있는 " + fruit);
        }

    }
}