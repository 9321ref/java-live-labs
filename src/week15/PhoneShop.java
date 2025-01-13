package week15;

public class PhoneShop {

    public static void main(String[] args) {

        Phone phone1 = new Samsung("Galaxy S20","Black");

        System.out.println(phone1);

        Samsung samsung1 = new Samsung("Galaxy S20", "Black");

        System.out.println(samsung1);

        Iphone iphone13 = new Iphone("iPhone 13","Silver");
        iphone13.call("Enes");
        iphone13.text();
        iphone13.hasIOS();
        iphone13.hasSiri();
        System.out.println(iphone13);

        System.out.println("------------------------------------");

        Phone [] phones=new Phone[3];
        phones[0]=new Iphone("iPhone 14", "Silver");
        phones[1]=new Samsung("Galaxy S20", "Black");
        phones[2]= new SamsungNote("Galaxy Note7", "White");

        for ( Phone each : phones){
            each.text();
            each.call("Refianur");
        }


    }
}
