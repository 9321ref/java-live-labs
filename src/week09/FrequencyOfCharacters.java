package week09;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "aabbbcccc";
        String result = ""; // frequency buraya atacak

        for (int i = 0; i <= str.length() - 1; i++) {  // i < str.length() same thing

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }
            //if (!result.contains("" + ch + frequency))

                 if (result.indexOf(ch) == -1)
                result += ""+ch + frequency; // ch char frequency int I have to convert string --> ""+


            }
            System.out.println(result);
        }
    }



/*
3. Frequency of Characters Task:
    Write a program to display the frequency of each character in a given string.
   Example:
     str = "aabbbcccc"
   Output:
     a2b3c4

 */