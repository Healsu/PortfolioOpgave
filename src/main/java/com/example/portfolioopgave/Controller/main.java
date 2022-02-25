package com.example.portfolioopgave.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main {

    @GetMapping("/Homepage")
    public String PortfolioWebsite(){

        return "PortfolioMain";
    }
    @GetMapping("/AboutMe")
    public String PortfolioAboutMe(){

        return"aboutHTML";
    }
}
