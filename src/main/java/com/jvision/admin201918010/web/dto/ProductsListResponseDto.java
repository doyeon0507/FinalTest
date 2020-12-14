package com.jvision.admin201918010.web.dto;

import com.jvision.admin201918010.domain.products.Posts;
import lombok.Getter;

public class ProductsListResponseDto {

    @Getter

        private Long id;
        private String name;
        private Long price;
        private String desc;


        public ProductsListResponseDto(Posts entity)
        {
            this.id = entity.getId();
            this.name = entity.getName();
            this.price = entity.getPrice();
            this.desc = entity.getDesc();


        }

    }

