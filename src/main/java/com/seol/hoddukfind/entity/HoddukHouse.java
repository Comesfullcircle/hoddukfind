package com.seol.hoddukfind.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HoddukHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double posX;

    @Column(nullable = false)
    private Double posY;

    @Column(nullable = false, length = 100)
    private String addressKor;

    @Column(nullable = false)
    private Double perPrice;

}
