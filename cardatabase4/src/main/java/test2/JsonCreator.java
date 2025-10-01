package test2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
/*

설명: Google의 Gson 라이브러리를 사용하여 JsonObject를 만들고, 이를 사람이 읽기 좋은 형태의 JSON 문자열로 변환하는 프로그램을 작성하세요.

요구사항 명세서:

JsonObject 객체를 생성합니다.
addProperty 메서드를 사용하여 username (문자열, "guest"), isMember (불리언, true), visitCount (정수, 15) 세 가지 속성을 추가합니다.
GsonBuilder를 사용하여 setPrettyPrinting() 옵션이 활성화된 Gson 객체를 생성합니다.
생성된 Gson 객체의 toJson 메서드를 사용하여 JsonObject를 보기 좋게 포맷팅된 문자열로 변환하고, 이를 콘솔에 출력하세요.

{
  "username": "guest",
  "isMember": true,
  "visitCount": 15
}

* implementation 'com.google.code.gson:gson:2.8.9' 빌드 추가하였음
 */
public class JsonCreator {
    public static void main(String[] args) {
        // TODO: JsonObject를 생성하시오.
        JsonObject json1 = new JsonObject();
        // TODO: username("guest"), isMember(true), visitCount(15) 속성을 추가하시오.
        json1.addProperty("username", "guest");
        json1.addProperty("isMember", true);
        json1.addProperty("visitCount", 15);
        // TODO: setPrettyPrinting()이 활성화된 Gson 객체를 생성하시오.
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // TODO: JsonObject를 보기 좋은 형태의 JSON 문자열로 변환하여 출력하시오.
        System.out.println(gson.toJson(json1));
    }
}