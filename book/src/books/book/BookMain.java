package books.book;

public class BookMain {
    public static void main(String[] args) {
        // 일반 도서 객체 생성
        Book book1 = new Book("자바의 정석", "남궁성");
        System.out.println("\n");
        book1.displayInfo();  // “제목 : 자바의 정석, 저자 : 남궁성” 출력

        System.out.println();

        // 전자책 객체 생성
        EBook ebook1 = new EBook("스프링 부트3 백과사전", "김영한", 20.5);
        ebook1.displayInfo();
        // 출력 예: 제목 : 스프링 부트3 백과사전, 저자 : 김영한
        //        파일 크기 : 20.5MB
    }
}