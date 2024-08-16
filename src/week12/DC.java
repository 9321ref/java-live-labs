package week12;

import java.util.ArrayList;

public class DC extends SuperHero {

    public String city;
    public DC(String superHeroName, String realName, ArrayList<String> powers, String city) {
        super(superHeroName, realName, "DC", powers);
        this.city=city;
    }

    public void callAvengers(){
        System.out.println("Calling all avengers ....");
    }
    @Override
    public void protect(){
        System.out.println("Super_hero is protecting by any means necessary FROM DC");
    }
}
