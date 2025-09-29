package com.example.cardatabase;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.CarRepository;
import com.example.cardatabase.domain.Owner;
import com.example.cardatabase.domain.OwnerRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;



@DataJpaTest
public class CarRepositoryTest {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    @DisplayName("사양저장 메서드 테스트")
    void saveCar(){
        // given 제반 준비 사항
        // car Entity 확인시 필드로 Owner를 요구하였기에 이를 만들고. ownerRepository 에 저장
        Owner owner = new Owner("Gemini","GPT");
        ownerRepository.save(owner);
        //그리고 car 객체
        Car car = new Car("Ford","Mustang","Red","ABCDEF",2021,567890,owner);

        // when 테스트 실행
        carRepository.save(car);
        // then 결과
        assertThat(carRepository.findById(car.getId())).isPresent();

        assertThat(carRepository.findById(car.getId()).get().getBrand()).isEqualTo("Ford");


    }

    @Test
    @DisplayName("삭제 검증 테스트")
    void deleteTest1(){
        Owner owner = new Owner("Gemini","GPT");
        ownerRepository.save(owner);
        Car car = new Car("Hyundai", "Avante", "Blue", "ZZZ123", 2025, 1234, owner);
        carRepository.save(car);

        carRepository.deleteById(car.getId());
        assertThat(carRepository.findById(car.getId())).isNotPresent();
    }

    @Test
    @DisplayName("브랜드 조회 검증 테스트")
    void findByBrandShouldReturnCar() {

        Owner owner = new Owner("Gemini", "GPT");
        ownerRepository.save(owner);

        Car car1 = new Car("Ford", "Mustang", "Red", "ABCDEF", 2025, 50000, owner);
        Car car2 = new Car("Ford", "Focus", "Blue", "SASD45", 2024, 30000, owner);
        Car car3 = new Car("Hyundai", "Avante", "Black", "CCC333", 2023, 25000, owner);

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);

        var fordCars = carRepository.findByBrand("Ford");

        assertThat(fordCars).hasSize(2); // 총 2대만 나와야 함
        assertThat(fordCars.get(0).getBrand()).isEqualTo("Ford");
        assertThat(fordCars.get(1).getBrand()).isEqualTo("Ford");

        List<Car> findCars = carRepository.findByBrand("Ford");

        assertThat(fordCars.size()).isEqualTo(2);
        assertThat(fordCars.get(0).getBrand()).isEqualTo("Ford");
        assertThat(fordCars.get(1).getBrand()).isEqualTo("Ford");


    }
}
