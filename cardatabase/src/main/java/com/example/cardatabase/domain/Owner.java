package com.example.cardatabase.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;

    @NonNull
    private String firstname;
    @NonNull
    private String lastname;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;
}
