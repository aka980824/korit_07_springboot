package test2;

import java.util.HashSet;
import java.util.Set;
/*
설명: HashSet을 사용하여 회의에 참석한 사람의 명단을 관리하는 프로그램을 작성하세요. HashSet은 중복된 이름을 자동으로 걸러줍니다.

요구사항 명세서:

String 타입의 이름을 저장하는 HashSet인 attendees를 생성합니다.
"김철수", "이영희", "박지성", "김철수" 순서로 attendees에 이름을 추가합니다. ("김철수"는 두 번 추가)
"박지성"이 참석자 명단에 있는지 확인하고 결과를 boolean 값으로 출력합니다.
최종 참석자 수를 size() 메서드를 이용해 "실행 예"와 같이 출력합니다.

박지성 참석 여부: true
최종 참석자 수: 3
전체 명단: [박지성, 김철수, 이영희]
 */
public class MeetingAttendees {
    public static void main(String[] args) {
        Set<String> attendees = new HashSet<>();

        // TODO: "김철수", "이영희", "박지성", "김철수"를 attendees에 추가하시오.
        attendees.add("김철수");
        attendees.add("이영희");
        attendees.add("박지성");
        attendees.add("김철수");

        if (attendees.contains("박지성")) {
            System.out.println("박지성 참석 여부: true");
        } else {
            System.out.println("박지성 참석 여부: false");
        }

        // TODO: 최종 참석자 수를 "최종 참석자 수: [숫자]" 형식으로 출력하시오.
        System.out.println("최종 참석자 수: " + attendees.size());
        System.out.println("전체 명단: " + attendees);
    }
}