package week12;

import java.util.ArrayList;

public class SuperHero {

    public String superHeroName;
    public String realName;
    public String universe;
    public ArrayList<String> powers;

    public SuperHero(String superHeroName, String realName, String universe, ArrayList<String> powers) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.universe = universe;
        this.powers = powers;
    }
    public void protect(){
        System.out.println("Super hero is protecting .....");
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "superHeroName='" + superHeroName + '\'' +
                ", realName='" + realName + '\'' +
                ", universe='" + universe + '\'' +
                ", powers=" + powers +
                '}';
    }
}
