package books.book;

// EBook.java
public class EBook extends Book {
    // 추가 필드
    private double fileSize;  // MB 단위

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        // 부모 클래스의 정보 출력
        super.displayInfo();
        // 파일 크기 정보 추가 출력
        System.out.println("파일 크기 : " + fileSize + "MB");
    }
}
