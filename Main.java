import com.sibsutis.devices.*;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "Galaxy S24", "+49123456789");
        PersonalComputer pc = new PersonalComputer("Dell", "XPS 15", "Intel i7");

        phone.print();
        pc.print();

        Phone phone2 = new Phone("Samsung", "Galaxy S24", "+49123456789");
        System.out.println("Одинаковые телефоны? " + phone.equals(phone2));

        System.out.println("Всего создано устройств: " + Device.getDeviceCount());
    }
}
