class iPhones implements Smartphones, iOS{
    @Override
    public void call() {
        System.out.println("iPhone дзвонить");
    }

    @Override
    public void sms() {
        System.out.println("iPhone відправляє СМС");
    }

    @Override
    public void internet() {
        System.out.println("iPhone завантажує інтернет");
    }

    @Override
    public void installiOS() {
        System.out.println("iPhone завантажує орпераційну систему iOS");
    }
}
