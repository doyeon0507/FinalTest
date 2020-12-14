package com.jvision.admin201918010.domain.products;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private long price;

    @Column(length = 500, nullable = true)
    private String desc;


    @Builder
    public Posts(Long id, String name, Long price, String desc)
    {

        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;

    }


    }
