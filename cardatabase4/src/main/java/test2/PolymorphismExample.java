package test2;
/*
설명: 동물(Animal) 클래스와 이를 상속받는 개(Dog), 고양이(Cat) 클래스를 통해 다형성을 구현합니다. 업캐스팅된 객체를 다루고, 필요한 경우 다운캐스팅하여 자식 클래스 고유의 메서드를 호출하는 프로그램을 작성하세요.

요구사항 명세서:

makeSound() 메서드를 가진 Animal 클래스를 만듭니다.
Animal을 상속하고 makeSound()를 오버라이딩하는 Dog와 Cat 클래스를 만듭니다.
Dog 클래스에는 고유 메서드인 fetch()를 추가합니다.
Animal 타입의 배열 animals에 Dog와 Cat 객체를 업캐스팅하여 저장합니다.
반복문을 통해 배열의 모든 동물이 각자의 소리를 내도록 makeSound()를 호출합니다.
instanceof 연산자로 Dog 객체를 확인한 후, 다운캐스팅하여 fetch() 메서드를 호출합니다.

멍멍!
공을 가져옵니다.
야옹~
 */
class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        /* TODO: "멍멍!" 출력 */
        System.out.println("멍멍");
    }
    public void fetch() {
        /* TODO: "공을 가져옵니다." 출력 */
        System.out.println("공을 가져옵니다.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        /* TODO: "야옹~" 출력 */
        System.out.println("야옹~");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        // TODO: animals 배열의 0번 인덱스에 Dog 객체를, 1번 인덱스에 Cat 객체를 할당하시오.
        animals[0] = new Dog();
        animals[1] = new Cat();
        // TODO: 반복문을 사용하여 모든 동물의 makeSound() 메서드를 호출하시오.
        // 추가로, instanceof를 사용해 Dog일 경우 다운캐스팅하여 fetch() 메서드를 호출하시오.
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            }
        }
    }
}