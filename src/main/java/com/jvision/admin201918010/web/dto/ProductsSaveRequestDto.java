package com.jvision.admin201918010.web.dto;

import com.jvision.admin201918010.domain.products.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.security.acl.LastOwnerException;

@Getter
@NoArgsConstructor
public class ProductsSaveRequestDto {

    private Long id;
    private String name;
    private Long price;
    private String desc;

    @Builder
    public ProductsSaveRequestDto(Long id, String name, Long price, String desc)

    {

        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Posts toEntity()
    {
        return Posts.builder()
                .id(id)
                .name(name)
                .price(price)
                .desc(desc)
                .build();
    }
}
