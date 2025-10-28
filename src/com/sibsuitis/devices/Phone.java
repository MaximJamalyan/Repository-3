package com.sibsutis.devices;

public class Phone extends Device {
    private String phoneNumber;

    public Phone(String brand, String model, String phoneNumber) {
        super(brand, model);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getDeviceInfo() {
        return "Телефон: " + brand + " " + model + ", номер: " + phoneNumber;
    }

    @Override
    public void print() {
        System.out.println("Информация о телефоне:");
        super.print();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Phone other = (Phone) obj;
        return phoneNumber.equals(other.phoneNumber);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + phoneNumber.hashCode();
    }
}
