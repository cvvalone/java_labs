package models;

import java.util.UUID;

public class Patient {
    private String id;
    private String firstName;
    private String lastName;
    private String surName;
    private String address;
    private String phoneNumber;
    private String medicalCardNumber;
    private String diagnosis;

    //Constructor without params
    public Patient() {}


    public Patient(String firstName, String lastName, String surName,
                   String address, String phoneNumber, String medicalCardNumber, String diagnosis) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }


    //Setters

    public void setFirstName(String firstName) {
        if (this.firstName == null || !this.firstName.equals(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (this.lastName == null || !this.lastName.equals(lastName)) {
            this.lastName = lastName;
        }
    }

    public void setSurName(String surName) {
        if (this.surName == null || !this.surName.equals(surName)) {
            this.surName = surName;
        }
    }

    public void setAddress(String address) {
        if (this.address == null || !this.address.equals(address)) {
            this.address = address;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (this.phoneNumber == null || !this.phoneNumber.equals(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setMedicalCardNumber(String medicalCardNumber) {
        if (this.medicalCardNumber == null || !this.medicalCardNumber.equals(medicalCardNumber)) {
            this.medicalCardNumber = medicalCardNumber;
        }
    }

    public void setDiagnosis(String diagnosis) {
        if (this.diagnosis == null || !this.diagnosis.equals(diagnosis)) {
            this.diagnosis = diagnosis;
        }
    }

    @Override
    public String toString() {
        return "Пацієнт:\n" +
                "id='" + id + '\'' +
                ", \nІмʼя='" + firstName + '\'' +
                ", \nПо батькові='" + lastName + '\'' +
                ", \nПрізвище='" + surName + '\'' +
                ", \nАдреса='" + address + '\'' +
                ", \nНомер телефону='" + phoneNumber + '\'' +
                ", \nНомер мед.карти='" + medicalCardNumber + '\'' +
                ", \nДіагноз='" + diagnosis + '\'' +
                "\n====================================================";
    }
}
