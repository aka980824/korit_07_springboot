package com.example.cardatabase;

import com.example.cardatabase.domain.Car;
import com.example.cardatabase.domain.CarRepository;
import com.example.cardatabase.domain.Owner;
import com.example.cardatabase.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(
            CardatabaseApplication.class
    );

    private final CarRepository repository;
    private final OwnerRepository ownerRepository;

    public CardatabaseApplication(CarRepository repository, OwnerRepository ownerRepository) {
        this.repository = repository;
        this.ownerRepository = ownerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CardatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 소유가 객체 추가
        Owner owner1 = new Owner("일","김");
        Owner owner2 = new Owner("이","김");
        // 다수의 객체를 한번에 저장하는 메서드
        ownerRepository.saveAll(Arrays.asList(owner1,owner2));

        // Car 데이터베이스에 필드를 추가하였기에 생성되는 오류를 막기위해 owner들을 추가로 나열
        repository.save(new Car("Kia", "Seltos", "Chacol", "370SU5690", 2020, 30000000,owner1));
        repository.save(new Car("Hyundai", "Sonata", "White", "123456", 2025, 25000000,owner2));
        repository.save(new Car("Honda", "CR-V", "Black-White", "987654", 2024, 45000000,owner2));

        // -> 이상의 코드는 testdb 내의 CAR 테이블 내에 3 개의 row를 추가하여 저장한다는 의미입니다.
        // Java 기준으로는 객체 세 개를 만들어서 저장했다고도 볼 수 있겠네요.

        // 모든 자동차를 가져와서 Console에 로깅해보도록 하겠습니다.
        for (Car car : repository.findAll()) {
            logger.info("brand : {}, model : {}", car.getBrand(), car.getModel());
        }

    }
}