public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        iPhones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.installLinux();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.installiOS();
    }
}
