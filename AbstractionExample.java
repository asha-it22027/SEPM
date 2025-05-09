// Interface: defines power behavior
interface Powerable {
    void powerOn();  // All devices must implement this
}

// Abstract class: base class for all devices
abstract class ElectronicDevice {
    String model;

    public ElectronicDevice(String model) {
        this.model = model;
    }

    // Abstract method
    abstract void deviceType();

    // Concrete method
    public void showModel() {
        System.out.println("Device Model: " + model);
    }
}

// Subclass: Laptop extends ElectronicDevice and implements Powerable
class Laptop extends ElectronicDevice implements Powerable {

    public Laptop(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("Laptop is booting up.");
    }

    @Override
    void deviceType() {
        System.out.println("This is a portable computing device.");
    }
}

// Subclass: Smartphone extends ElectronicDevice and implements Powerable
class Smartphone extends ElectronicDevice implements Powerable {

    public Smartphone(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("Smartphone is turning on.");
    }

    @Override
    void deviceType() {
        System.out.println("This is a handheld communication device.");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        ElectronicDevice laptop = new Laptop("Dell XPS 13");
        laptop.showModel();
        ((Powerable) laptop).powerOn();
        laptop.deviceType();

        System.out.println();

        ElectronicDevice phone = new Smartphone("iPhone 14");
        phone.showModel();
        ((Powerable) phone).powerOn();
        phone.deviceType();
    }
}
