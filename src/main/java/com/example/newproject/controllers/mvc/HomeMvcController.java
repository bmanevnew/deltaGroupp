package com.example.newproject.controllers.mvc;

import com.example.newproject.models.QuoteDto;
import com.example.newproject.services.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeMvcController {

private EmailService emailService;

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
    @GetMapping("/")
    public String home() {
        return "bg/index";
    }

    @GetMapping("/en/index.html")
    public String homeEn() {
        return "en/index";
    }

    @GetMapping("/bg/index.html")
    public String homeBg() {
        return "bg/index";
    }



    @GetMapping("/request-a-quote.html")
    public String quote() { return "bg/request-a-quote";
    }


    @GetMapping("/en/request-a-quote.html")
    public String quoteEn(Model model) {
        model.addAttribute("quoteDto", new QuoteDto());
        return "en/request-a-quote";
    }

    @PostMapping("/en/request-a-quote.html")
    public String submitQuoteEn(@ModelAttribute("quoteDto") QuoteDto quoteDto, Model model) {
            String subject = "Quote Requested - " + quoteDto.getCompanyName();
            String text = emailService.formatQuoteDtoEn(quoteDto);
            String senderMail = quoteDto.getEmail();
            emailService.sendEmail(senderMail, subject, text);
            return "en/index";

    }

    @GetMapping("/bg/request-a-quote.html")
    public String quoteBg(Model model) {
        model.addAttribute("quoteDto", new QuoteDto());
        return "bg/request-a-quote";
    }

    @PostMapping("/bg/request-a-quote.html")
    public String submitQuoteBg(@ModelAttribute("quoteDto") QuoteDto quoteDto) {
        String subject = "Запитване - " + quoteDto.getCompanyName();
        String text = emailService.formatQuoteDtoBg(quoteDto);
        String senderMail = quoteDto.getEmail();
        emailService.sendEmail(senderMail, subject, text);
        return "bg/index";
    }


    // Add mappings for other pages similarly...

    // Language-specific mappings
    @GetMapping("/en/about-us.html")
    public String aboutUsEn() {
        return "en/about-us";
    }

    @GetMapping("/bg/about-us.html")
    public String aboutUsBg() {
        return "bg/about-us";
    }

    @GetMapping("/about-us.html")
    public String aboutUsBgUs() {
        return "bg/about-us";
    }

    // Add mappings for other language-specific pages similarly...

    // Common mappings for shared pages
    @GetMapping("/contact.html")
    public String contact() {
        return "bg/contact";
    }

    @GetMapping("/en/contact.html")
    public String contactEn() {
        return "en/contact";
    }

    @GetMapping("/bg/contact.html")
    public String contactBg() {
        return "bg/contact";
    }

    @GetMapping("/cargo-tracking.html")
    public String cargo() {
        return "bg/cargo-tracking";
    }

    @GetMapping("/en/cargo-tracking.html")
    public String cargoEn() {
        return "en/cargo-tracking";
    }

    @GetMapping("/bg/cargo-tracking.html")
    public String cargoBg() {
        return "bg/cargo-tracking";
    }


    @GetMapping("/inland-transport.html")
    public String inland() {
        return "bg/inland-transport";
    }

    @GetMapping("/en/inland-transport.html")
    public String inlandEN() {
        return "en/inland-transport";
    }

    @GetMapping("/bg/inland-transport.html")
    public String inlandBG() {
        return "bg/inland-transport";
    }


    @GetMapping("/insurance.html")
    public String insurance() {
        return "bg/insurance";
    }

    @GetMapping("/en/insurance.html")
    public String insuranceEN() {
        return "en/insurance";
    }

    @GetMapping("/bg/insurance.html")
    public String insuranceBG() {
        return "bg/insurance";
    }



    @GetMapping("/ocean-freight-forwarding.html")
    public String ocean() {
        return "bg/ocean-freight-forwarding";
    }

    @GetMapping("/en/ocean-freight-forwarding.html")
    public String oceanEN() {
        return "en/ocean-freight-forwarding";
    }

    @GetMapping("/bg/ocean-freight-forwarding.html")
    public String oceanBG() {
        return "bg/ocean-freight-forwarding";
    }


    @GetMapping("/terminal-delta.html")
    public String terminal() {
        return "bg/terminal-delta";
    }

    @GetMapping("/en/terminal-delta.html")
    public String terminalEN() {
        return "en/terminal-delta";
    }

    @GetMapping("/bg/terminal-delta.html")
    public String terminalBG() {
        return "bg/terminal-delta";
    }


    @GetMapping("/warehousing.html")
    public String warehousing() {
        return "bg/warehousing";
    }

    @GetMapping("/en/warehousing.html")
    public String warehousingEN() {
        return "en/warehousing";
    }

    @GetMapping("/bg/warehousing.html")
    public String warehousingBG() {
        return "bg/warehousing";
    }

}
