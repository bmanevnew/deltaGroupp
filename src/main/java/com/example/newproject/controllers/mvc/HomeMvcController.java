package com.example.newproject.controllers.mvc;

import com.example.newproject.models.QouteDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeMvcController {

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @GetMapping("/request-a-quote.html")
    public String qoute() {
        return "request-a-quote";
    }

    @PostMapping("/request-a-quote.html")
    public String showContactPage(Model model) {
        model.addAttribute("qputeDto", new QouteDto());
        return "request-a-quote";
    }
    @GetMapping("/index.html")
    public String home2() {
        return "index";
    }

    @GetMapping("/home-page-4.html")
    public String home4() {
        return "home-page-4";
    }
    @GetMapping("/about-us.html")
    public String aboutUs() {
        return "about-us";
    }
    @GetMapping("/news.html")
    public String news() {
        return "news";
    }
    @GetMapping("/ocean-forwarding.html")
    public String oceanForwarding() {
        return "ocean-forwarding";
    }
    @GetMapping("/contact.html")
    public String contact() {
        return "contact";
    }
}
