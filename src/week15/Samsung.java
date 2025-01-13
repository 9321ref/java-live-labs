package week15;

public class Samsung extends Phone implements HasAndroid, HasBixby{

    public Samsung(String model, String color) {
        super(model, color);
    }

    @Override
    void text() {
        System.out.println("Texting from "+model);
    }

    @Override
    void call(String name) {
        System.out.println("Calling "+name+" from "+model);
    }

    @Override
    public void hasAndroid() {
        System.out.println("Samsung has android");
    }

    @Override
    public void hasBixby() {
        System.out.println("Samsung has Bixby");
    }
}
