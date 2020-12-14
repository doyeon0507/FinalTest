package com.jvision.admin201918010.web;

import com.jvision.admin201918010.service.ProductService;
import com.jvision.admin201918010.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final ProductService productService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody ProductsSaveRequestDto requestDto)
    {
        return productService.save(requestDto);
    }

}
