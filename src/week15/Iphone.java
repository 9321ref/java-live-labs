package week15;
public class Iphone extends Phone implements HasSiri,HasIOS{


    public Iphone(String model, String color) {
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
    public void hasSiri() {
        System.out.println(model+" has Siri");
    }

    @Override
    public void hasIOS() {
        System.out.println(model+" has iOS" );
    }
}
