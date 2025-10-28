package com.sibsutis.devices;

public class PersonalComputer extends Device {
    private String cpu;

    public PersonalComputer(String brand, String model, String cpu) {
        super(brand, model);
        this.cpu = cpu;
    }

    @Override
    public String getDeviceInfo() {
        return "Компьютер: " + brand + " " + model + ", процессор: " + cpu;
    }

    @Override
    public void print() {
        System.out.println("Информация о компьютере:");
        super.print();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        PersonalComputer other = (PersonalComputer) obj;
        return cpu.equals(other.cpu);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + cpu.hashCode();
    }
}
