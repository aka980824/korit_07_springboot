package test1;
/*
설명: 애플리케이션 전체에서 단 하나의 인스턴스만 존재해야 하는 설정 관리자 클래스를 싱글톤(Singleton) 패턴을 사용하여 구현합니다.

요구사항 명세서:

SettingsManager 클래스는 private static인 자기 자신 타입의 instance 필드를 가집니다.
생성자는 private으로 선언하여 외부에서 직접 객체를 생성할 수 없도록 합니다.
getInstance() public static 메서드를 제공하여, instance가 null일 경우에만 새로운 객체를 생성하고, 항상 동일한 인스턴스를 반환하도록 합니다.
main 메서드에서 getInstance()를 두 번 호출하여 얻은 두 객체가 동일한 객체인지 == 연산자로 확인하여 "실행 예"와 같이 출력하세요.

실행 예)
두 인스턴스는 동일합니다.
 */
class SettingsManager {
    // TODO: private static 필드로 instance를 선언하시오.
    private static SettingsManager instance;
    // TODO: 생성자를 private으로 선언하시오.
    private SettingsManager() {}
    // TODO: public static getInstance() 메서드를 구현하시오.
    // instance가 null일 때만 객체를 생성하고, 항상 같은 instance를 반환해야 합니다.
    public static SettingsManager getInstance() {
        if (instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }

}

public class Application {
    public static void main(String[] args) {
        // TODO: SettingsManager의 인스턴스를 두 번 가져와서 두 변수에 할당하시오.
        SettingsManager test1 = SettingsManager.getInstance();
        SettingsManager test2 = SettingsManager.getInstance();
        // TODO: 두 인스턴스가 같은지(==) 비교하여 결과를 출력하시오.
        // 예: "두 인스턴스는 동일합니다." 또는 "두 인스턴스는 다릅니다."
        if (test1 == test2) {
            System.out.println("두 인스턴스는 동일합니다.");
        } else {
            System.out.println("두 인스턴스는 다릅니다.");
        }
    }
}