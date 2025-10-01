package num;

/*
설명: 회원 정보를 관리하는 Member 클래스를 작성합니다. 필드는 private으로 보호하고, public 메서드(Setter)를 통해 필드 값을 설정할 때 유효성 검사를 수행하도록 합니다.

요구사항 명세서:

Member 클래스는 private 필드로 name (이름)과 age (나이)를 가집니다.
setName 메서드는 이름이 null이거나 2글자 미만일 경우 "유효하지 않은 이름입니다."를 출력하고 값을 변경하지 않습니다.
setAge 메서드는 나이가 0세 미만이거나 120세 초과일 경우 "유효하지 않은 나이입니다."를 출력하고 값을 변경하지 않습니다.
main 메서드에서 Member 객체를 생성하고, 유효한 값과 유효하지 않은 값으로 각각 setName과 setAge를 호출하여 "실행 예"와 같이 결과가 출력되도록 하세요.

실행 예
유효하지 않은 나이입니다.
이름: 이순신, 나이: 0
유효하지 않은 이름입니다.
이름: 이순신, 나이: 30
이름: 강감찬, 나이: 45
 */
class Member {
    private String name;
    private int age;

    // TODO: name에 대한 Getter와 Setter를 작성하시오.
    // Setter에는 이름이 null이 아니고 2글자 이상인지 검증하는 로직을 추가하시오.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 2) {
            System.out.println("유효하지 않은 이름입니다.");
            return;
        }
        this.name = name;
    }
    // TODO: age에 대한 Getter와 Setter를 작성하시오.
    // Setter에는 나이가 0에서 120 사이인지 검증하는 로직을 추가하시오.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("유효하지 않은 나이입니다.");
            return;
        }
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age +"\n");
    }
}

public class MemberManagement {
    public static void main(String[] args) {
        Member member = new Member();

        // TODO: 유효한 이름("이순신")과 유효하지 않은 나이(150)를 설정하고 정보를 출력하시오.
        member.setName("이순신");
        member.setAge(150);
        member.printInfo();
        // TODO: 유효하지 않은 이름("김")과 유효한 나이(30)를 설정하고 정보를 출력하시오.
        member.setName("김");
        member.setAge(30);
        member.printInfo();
        // TODO: 유효한 이름("강감찬")과 유효한 나이(45)를 설정하고 정보를 출력하시오.
        member.setName("강감찬");
        member.setAge(45);
        member.printInfo();
    }
}