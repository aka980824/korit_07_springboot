package test2;
/*
설명: 두 정수를 나누는 과정에서 발생할 수 있는 ArithmeticException (0으로 나누기)을 try-catch 블록을 사용하여 처리하는 프로그램을 작성하세요.

요구사항 명세서:

divide 메서드는 두 정수 a, b를 인자로 받아 나눗셈 결과를 출력합니다.
main 메서드에서 try-catch 블록을 사용합니다.
try 블록 안에서 10을 0으로 나누는 divide 메서드를 호출합니다.
catch 블록에서 ArithmeticException을 잡아 "0으로 나눌 수 없습니다." 라는 메시지를 출력합니다.
finally 블록을 사용하여 예외 발생 여부와 상관없이 "계산을 종료합니다." 메시지를 출력합니다.

0으로 나눌 수 없습니다.
계산을 종료합니다.
 */
public class DivisionCalculator {
    public static void divide(int a, int b) {
        System.out.println("나눗셈 결과: " + (a / b));
    }

    public static void main(String[] args) {
        // TODO: try-catch-finally 블록을 사용하여 10을 0으로 나누는 코드를 작성하고 예외를 처리하시오.
        // divide(10, 0)을 호출해야 합니다.
        try{
            divide(10, 0);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }finally {
            System.out.println("종료");
        }
    }
}