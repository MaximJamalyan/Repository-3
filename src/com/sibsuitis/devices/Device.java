
package com.sibsutis.devices;

public abstract class Device implements Printable {

    protected String brand;
    protected String model;
    protected static int deviceCount = 0;
    public final String type = "Electronic Device";

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        deviceCount++;
    }

    public abstract String getDeviceInfo();

    @Override
    public void print() {
        System.out.println(getDeviceInfo());
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Device)) return false;
        Device other = (Device) obj;
        return brand.equals(other.brand) && model.equals(other.model);
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + model.hashCode();
    }

    public static int getDeviceCount() {
        return deviceCount;
    }

    @Override
    public String toString() {
        return "Устройство: " + brand + " " + model;
    }
}
