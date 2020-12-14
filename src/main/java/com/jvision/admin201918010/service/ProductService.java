package com.jvision.admin201918010.service;

import com.jvision.admin201918010.domain.products.ProductRepository;
import com.jvision.admin201918010.web.dto.ProductsListResponseDto;
import com.jvision.admin201918010.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public Long save(ProductsSaveRequestDto requestDto) {
        return productRepository.save(requestDto.toEntity()).getId();
    }


    @Transactional
    public List<ProductsListResponseDto> findAllAsc() {
        return productRepository.findAllDesc().stream()
                .map(ProductsListResponseDto::new)
                .collect(Collectors.toList());

    }

}