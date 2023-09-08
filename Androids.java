class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Android дзвонить");
    }

    @Override
    public void sms() {
        System.out.println("Android відправляє СМС");
    }

    @Override
    public void internet() {
        System.out.println("Android завантажує інтернет");
    }

    @Override
    public void installLinux() {
        System.out.println("Android завантажує операційну систему Linux");
    }
}
