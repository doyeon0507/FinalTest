package com.jvision.admin201918010.web;

import com.jvision.admin201918010.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final ProductService productService;

    @GetMapping("/posts/save")
    public String postSave() {
        return "posts-save";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", productService.findAllAsc());
        return "index";
    }


    }
