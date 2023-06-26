package com.example.newproject.services.impl;

import com.example.newproject.exceptions.EmailSenderException;
import com.example.newproject.models.QuoteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RequiredArgsConstructor

@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(String from, String subject, String text) {
        MimeMessage message = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom(from);
            helper.setFrom("manev_boris@yahoo.com");
            helper.setReplyTo("manev_boris@yahoo.com");
            helper.setTo("manev_boris@yahoo.com");
            helper.setSubject(subject);
            helper.setText(text, true); // true indicates HTML content

          javaMailSender.send(message);
        } catch (MessagingException e) {
            throw new EmailSenderException("Try again");
        }
    }

    public String formatQuoteDtoEn(QuoteDto quoteDto) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<h2>Company Details</h2>");
        sb.append("<b>Company name:</b> ").append(quoteDto.getCompanyName()).append("<br>");
        sb.append("<b>Person In charge:</b> ").append(quoteDto.getPersonInCharge()).append("<br>");
        sb.append("<b>Email:</b> ").append(quoteDto.getEmail()).append("<br>");
        sb.append("<b>Phone:</b> ").append(quoteDto.getPhone()).append("<br>");
        sb.append("<b>Date:</b> ").append(quoteDto.getDate()).append("<br><br>");

        sb.append("<h2>Transport Info</h2>");
        sb.append("<b>Type of Transport:</b> ").append(quoteDto.getTransportType()).append("<br>");
        sb.append("<b>Type of Container:</b> ").append(quoteDto.getContainerType()).append("<br>");
        sb.append("<b>Delivery terms according to Incoterms 2000:</b> ").append(quoteDto.getDeliveryTerms()).append("<br>");
        sb.append("<b>Loading Address:</b> ").append(quoteDto.getLoadingAddress()).append("<br>");
        sb.append("<b>Port of loading:</b> ").append(quoteDto.getLoadingPort()).append("<br>");
        sb.append("<b>Country of loading:</b> ").append(quoteDto.getInitialCountry()).append("<br>");
        sb.append("<b>Delivery Address:</b> ").append(quoteDto.getDeliveryAddress()).append("<br>");
        sb.append("<b>Port of discharge:</b> ").append(quoteDto.getDischargePort()).append("<br>");
        sb.append("<b>Country of discharge:</b> ").append(quoteDto.getDeliveryCountry()).append("<br>");
        sb.append("<b>Cargo Readiness:</b> ").append(quoteDto.getReadyDate()).append("<br><br>");

        sb.append("<h2>Cargo Info</h2>");
        sb.append("<b>Cargo Type:</b> ").append(quoteDto.getCargoType()).append("<br>");
        sb.append("<b>Remarks / Additional requirements:</b> ").append(quoteDto.getRemarks()).append("<br>");
        sb.append("<b>Gross weight (kg):</b> ").append(quoteDto.getWeight()).append("<br>");
        sb.append("<b>Volume (cbm):</b> ").append(quoteDto.getVolume()).append("<br>");
        sb.append("<b>Quantity (pcs):</b> ").append(quoteDto.getQuantity()).append("<br>");
        sb.append("<b>Type of Package:</b> ").append(quoteDto.getPackageType()).append("<br>");
        sb.append("<b>Dimensions (W x L x H):</b> ").append(quoteDto.getDimensions()).append("<br><br>");

        sb.append("<h2>Dangerous Goods</h2>");
        sb.append("<b>IMDG:</b> ").append(quoteDto.isImdg()).append("<br>");
        sb.append("<b>IMDG Type:</b> ").append(quoteDto.getImdgClass()).append("<br>");

        sb.append("</body></html>");

        return sb.toString();
    }


    public String formatQuoteDtoBg(QuoteDto quoteDto) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>Данни на компанията</h2>");
        sb.append("<b>Име на компанията:</b> ").append(quoteDto.getCompanyName()).append("<br>");
        sb.append("<b>Отговорик:</b> ").append(quoteDto.getPersonInCharge()).append("<br>");
        sb.append("<b>Имейл:</b> ").append(quoteDto.getEmail()).append("<br>");
        sb.append("<b>Телефонен номер:</b> ").append(quoteDto.getPhone()).append("<br>");
        sb.append("<b>Дата:</b> ").append(quoteDto.getDate()).append("<br><br><br>");
        sb.append("<h2>Информация за транспорта</h2>");
        sb.append("<b>Вид транспорт:</b> ").append(quoteDto.getTransportType()).append("<br>");
        sb.append("<b>Вид контейнер:</b> ").append(quoteDto.getContainerType()).append("<br>");
        sb.append("<b>Условия на доставка по Инкотермс 2000:</b> ").append(quoteDto.getDeliveryTerms()).append("<br>");
        sb.append("<b>Адрес на товарене:</b> ").append(quoteDto.getLoadingAddress()).append("<br>");
        sb.append("<b>Отправно пристанище:</b> ").append(quoteDto.getLoadingPort()).append("<br>");
        sb.append("<b>Държава:</b> ").append(quoteDto.getInitialCountry()).append("<br>");
        sb.append("<b>Адрес на разтоварване:</b> ").append(quoteDto.getDeliveryAddress()).append("<br>");
        sb.append("<b>Получаващо пристанище:</b> ").append(quoteDto.getDischargePort()).append("<br>");
        sb.append("<b>Държава:</b> ").append(quoteDto.getDeliveryCountry()).append("<br>");
        sb.append("<b>Готовност на товарене:</b> ").append(quoteDto.getReadyDate()).append("<br><br><br>");
        sb.append("<h2>Описание на стоката</h2><br>");
        sb.append("<b>Вид на стоката:</b> ").append(quoteDto.getCargoType()).append("<br>");
        sb.append("<b>Забележка / Допълнителни изисквания:</b> ").append(quoteDto.getRemarks()).append("<br>");
        sb.append("<b>Бруто тегло (кг.):</b> ").append(quoteDto.getWeight()).append("<br>");
        sb.append("<b>Обем, куб.м.:</b> ").append(quoteDto.getVolume()).append("<br>");
        sb.append("<b>Количество, бр.:</b> ").append(quoteDto.getQuantity()).append("<br>");
        sb.append("<b>Вид на опаковката:</b> ").append(quoteDto.getPackageType()).append("<br>");
        sb.append("<b>Размери, метри (Ш x Д x В):</b> ").append(quoteDto.getDimensions()).append("<br><br><br>");
        sb.append("<h2>Опасност на товара</h2>");
        sb.append("<b>IMDG:</b> ").append(quoteDto.isImdg()).append("<br>");
        sb.append("<b>Клас:</b> ").append(quoteDto.getImdgClass()).append("<br>");

        return sb.toString();
    }
}
