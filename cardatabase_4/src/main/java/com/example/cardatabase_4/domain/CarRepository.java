package com.example.cardatabase_4.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
    // 브랜드로 자동차 검색
    List<Car> findByBrand(@Param("brand") String brand);

    // 색상으로 자동차 검색
    List<Car> findByColor(@Param("color") String color);

    // ❌ getCars() 제거 (Spring Data JPA가 자동 생성 불가)
}
