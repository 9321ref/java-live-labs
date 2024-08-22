package week13;

import java.util.ArrayList;

public class Marvel extends SuperHero {

    public Marvel(String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, "MarvelHero", powers);
    }

    public void callAvengers(){
        System.out.println("Calling all avengers ....");
    }
    @Override
    public void protect(){
        System.out.println("Super_hero is protecting by any means necessary FROM MARVEL");
    }
}


