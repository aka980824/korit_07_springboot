package com.example.cardatabase.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String model;
    private String color;
    private String registrationNumber;
    private int modelYear;
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    // 생성자 (owner 포함)
    public Car(String brand, String model, String color,
               String registrationNumber, int modelYear, int price, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }
}
