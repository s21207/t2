package com.company;
class telephone {
    String brand;
    double screenResolution;
    double number;


    public telephone(String brand, double screenResolution, double number) {
        this.brand = brand;
                this.screenResolution = screenResolution;
                this.number = number;

    }

    public void sendSMS (long numberY, String messageX) {
        System.out.println("Sending the SMS " + messageX + " to number " + numberY);
    }

}



