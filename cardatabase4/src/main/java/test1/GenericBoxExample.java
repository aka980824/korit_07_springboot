package test1;


/*
설명: 어떤 타입의 데이터든 담을 수 있는 제네릭 Box 클래스를 작성하여, 문자열과 정수를 각각 담고 출력하는 프로그램을 만드세요.
제네릭 타입 T를 사용하는 Box<T> 클래스를 정의합니다.
Box 클래스는 T 타입의 content 필드를 가집니다.
content 필드에 대한 생성자와 Getter 메서드를 작성합니다.
main 메서드에서 String을 담는 Box와 Integer를 담는 Box 객체를 각각 생성하고, getContent() 메서드를 이용해 "실행 예"와 같이 내용물을 출력하세요.

문자열 상자 내용: Hello World
정수 상자 내용: 123
 */
// TODO: 제네릭 타입 T를 사용하는 Box 클래스를 작성하시오.
// 필드: private T content
// 생성자: content를 인자로 받아 초기화
// 메서드: public T getContent()
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
}
public class GenericBoxExample {
    public static void main(String[] args) {
        // TODO: "Hello World" 문자열을 담는 Box<String> 객체를 생성하고 내용물을 출력하시오.
        Box<String> stb = new Box<>("Hello World");
        System.out.println("문자열 상자 내용 : " + stb.getContent());
        // TODO: 숫자 123을 담는 Box<Integer> 객체를 생성하고 내용물을 출력하시오.
        Box<Integer> intb = new Box<>(123);
        System.out.println("정수 상자 내용 : " + intb.getContent());
    }
}