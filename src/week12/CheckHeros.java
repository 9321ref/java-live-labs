package week12;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeros {


        public static void main(String[] args) {
            ArrayList<String> spiderPowers = new ArrayList<>(Arrays.asList("Enhanced strength", "agility","spider-sense"));
            Marvel spiderMan = new Marvel("Spider Man","Peter Parker",spiderPowers);

            ArrayList<String> ironManPowers = new ArrayList<>(Arrays.asList("powered suit of armor", "flight", "enhanced strength"));
            ArrayList<String> thorPowers = new ArrayList<>(Arrays.asList("wields hammer", "controls lightning", "flight"));

            ArrayList<String> wonderWomanPowers = new ArrayList<>();
            DC wonderWoman = new DC("Wonder Woman","Diana Prince",wonderWomanPowers, "Gotham");
            System.out.println(wonderWoman);
            System.out.println(wonderWomanPowers.isEmpty()); // since arraylist is initialized it is not null
            wonderWoman.powers.addAll(Arrays.asList("Enhanced strength", "speed", "agility", "durability"));

            ArrayList<String> batPowers = new ArrayList<>(Arrays.asList("master detective", "martial arts", "technical tools"));

            Marvel ironMan = new Marvel("Iron Man","Tony Stark",ironManPowers);
            Marvel thor = new Marvel("Thor","Thor Odinson",thorPowers);
            DC batman = new DC("Batman","Bruce Wayne",batPowers,"Gotham");

            ironMan.protect();
            batman.protect();

            System.out.println(wonderWoman);



        }
}
