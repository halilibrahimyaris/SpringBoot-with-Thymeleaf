package com.example.SpringBootThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonalController {
    @GetMapping
    String getPersonal(Model model){
        model.addAttribute("personalValue","Personal Table");
        model.addAttribute("personalList", Arrays.asList(
                new Personal("Ahmet","Ak",23,15000),
                new Personal("Ayşe","Yeşil",21,20000)
        ));

        return "personal";
    }
}
