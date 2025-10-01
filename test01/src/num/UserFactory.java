package num;

import lombok.Builder;
import lombok.ToString;
/*
설명: Lombok의 @Builder 애너테이션을 사용하여 사용자(User) 객체를 생성하는 코드를 작성하세요. 빌더 패턴을 사용하면 생성자보다 유연하고 가독성 좋게 객체를 생성할 수 있습니다.

요구사항 명세서:

User 클래스는 username, email, age 필드를 가집니다.
@Builder와 @ToString Lombok 애너테이션을 클래스에 추가합니다.
main 메서드에서 빌더 패턴을 사용하여 두 명의 User 객체를 생성합니다.
첫 번째 사용자는 모든 필드(username, email, age)를 가집니다.
두 번째 사용자는 username과 email 필드만 가집니다 (age는 기본값 0).

생성된 두 객체를 콘솔에 출력하여 "실행 예"와 같이 결과가 나오도록 하세요.
User(username=user1, email=user1@example.com, age=25)
User(username=user2, email=user2@example.com, age=0)
 */
// TODO: Lombok의 @Builder와 @ToString 애너테이션을 추가하시오.
class User {
    private String username;
    private String email;
    private int age;
}

public class UserFactory {
    public static void main(String[] args) {
        // TODO: 빌더 패턴을 사용하여 username="user1", email="user1@example.com", age=25 인 User 객체를 생성하고 출력하시오.

        // TODO: 빌더 패턴을 사용하여 username="user2", email="user2@example.com" 인 User 객체를 생성하고 출력하시오.
    }
}
