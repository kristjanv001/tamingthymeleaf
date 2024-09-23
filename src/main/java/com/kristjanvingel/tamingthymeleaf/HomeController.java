package com.kristjanvingel.tamingthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", "Taming Thymeleaf");
        model.addAttribute("scientists", List.of("Albert Einstein", "Niels Bohr", "Marie Curie"));

        return "index";
    }
}
