package test2;
/*
설명: 람다(Lambda) 표현식을 사용하여 Runnable 인터페이스를 구현하고, 새로운 스레드에서 메시지를 출력하는 간단한 멀티스레드 프로그램을 작성하세요.

요구사항 명세서:

Runnable 인터페이스의 익명 구현체를 람다식으로 작성합니다.
람다식의 내용은 "새로운 스레드에서 실행 중..."이라는 메시지를 콘솔에 출력하는 것입니다.
이 Runnable 객체를 사용하여 Thread 객체를 생성합니다.
생성된 스레드를 start() 메서드로 시작하고, "메인 스레드 종료."가 먼저 출력될 수 있도록 합니다.
예)
메인 스레드 종료.
새로운 스레드에서 실행 중...
 */
public class LambdaThread {
    public static void main(String[] args) {
        // TODO: "새로운 스레드에서 실행 중..."을 출력하는 Runnable을 람다식으로 작성하시오.
        Runnable task = () -> System.out.println("새로운 스레드에서 실행 중...");
        // TODO: 위에서 작성한 Runnable을 사용하여 Thread 객체를 생성하고 시작(start)하시오.
        new Thread(task).start();

        System.out.println("메인 스레드 종료.");
    }
}