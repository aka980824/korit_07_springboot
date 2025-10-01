package test1;
/*
 다양한 채널(이메일, SMS)로 알림을 보내는 서비스를 인터페이스를 사용하여 구현합니다. 각 알림 방식은 동일한 인터페이스를 구현하지만, 실제 동작은 다르게 작성됩니다.

요구사항 명세서:

send(String message) 추상 메서드를 가진 Notification 인터페이스를 정의합니다.
Notification 인터페이스를 구현하는 EmailNotification과 SmsNotification 클래스를 작성합니다.
각 클래스의 send 메서드는 "실행 예"와 같이 채널에 맞는 알림 메시지를 출력합니다.
main 메서드에서 두 클래스의 객체를 생성하고, send 메서드를 호출하여 각각 다른 메시지를 전송하는 코드를 작성하세요.

예)

이메일 발송: 주문이 완료되었습니다.
SMS 발송: 배송이 시작되었습니다.
 */
// TODO: send(String message) 추상 메서드를 가진 Notification 인터페이스를 작성하시오.
interface Notification {
    void send(String message);
}
// TODO: Notification 인터페이스를 구현하는 EmailNotification 클래스를 작성하시오.
// send 메서드는 "이메일 발송: [메시지]" 형식으로 출력합니다.
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("이메일 발송 : " + message);
    }
}
// TODO: Notification 인터페이스를 구현하는 SmsNotification 클래스를 작성하시오.
// send 메서드는 "SMS 발송: [메시지]" 형식으로 출력합니다.
class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS 발송 : " + message);
    }
}
public class Notifier {
    public static void main(String[] args) {
        // TODO: EmailNotification 객체를 생성하고 "주문이 완료되었습니다." 메시지를 보내시오.
        // TODO: SmsNotification 객체를 생성하고 "배송이 시작되었습니다." 메시지를 보내시오.
        Notification email = new EmailNotification();
        email.send("주문이 완료되었습니다.");

        Notification sms = new SmsNotification();
        sms.send("배송이 시작되었습니다.");
    }
}