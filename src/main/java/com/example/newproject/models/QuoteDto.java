package com.example.newproject.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuoteDto {
    public static final String REQUIRED_FIELD = "Required field.";

    @NotBlank(message = REQUIRED_FIELD)
    private String companyName;
    @NotBlank(message = REQUIRED_FIELD)
    private String personInCharge;

    @NotBlank(message = REQUIRED_FIELD)
    private String phone;
    @NotNull (message = REQUIRED_FIELD)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

    private LocalDate date;
    @NotBlank(message = REQUIRED_FIELD)
    private String email;
    private String transportType;
    private String containerType;
    private String deliveryTerms;
    private String loadingAddress;
    private String loadingPort;
    private String initialCountry;
    private String dischargePort;
    private String deliveryAddress;
    private String deliveryCountry;

    @NotNull(message = REQUIRED_FIELD)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

    private LocalDate readyDate;
    private String cargoType;
    private String remarks;

    private int weight;
    private int quantity;
    private int volume;

    private String packageType;
    private String dimensions;


    private boolean Imdg;
    private String imdgClass;

    public String getCompanyName() {
        return companyName;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public String getPhone() {
        return phone;
    }
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)

    public LocalDate getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getTransportType() {
        return transportType;
    }

    public String getContainerType() {
        return containerType;
    }

    public String getDeliveryTerms() {
        return deliveryTerms;
    }

    public String getLoadingAddress() {
        return loadingAddress;
    }

    public String getLoadingPort() {
        return loadingPort;
    }

    public String getInitialCountry() {
        return initialCountry;
    }

    public String getDischargePort() {
        return dischargePort;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    public LocalDate getReadyDate() {
        return readyDate;
    }

    public String getCargoType() {
        return cargoType;
    }

    public String getRemarks() {
        return remarks;
    }

    public int getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getVolume() {
        return volume;
    }

    public String getPackageType() {
        return packageType;
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean isImdg() {
        return Imdg;
    }

    public String getImdgClass() {
        return imdgClass;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public void setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public void setLoadingAddress(String loadingAddress) {
        this.loadingAddress = loadingAddress;
    }

    public void setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
    }

    public void setInitialCountry(String initialCountry) {
        this.initialCountry = initialCountry;
    }

    public void setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    public void setReadyDate(LocalDate readyDate) {
        this.readyDate = readyDate;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setImdg(boolean imdg) {
        Imdg = imdg;
    }

    public void setImdgClass(String imdgClass) {
        this.imdgClass = imdgClass;
    }
}
