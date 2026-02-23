import java.util.*;

class validAnagram {
    public static boolean isAnagram(String s, String t) {
        s = s.trim().toLowerCase();
        t = t.trim().toLowerCase();

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2)){
            return true;
        }
        return false;
    }

    public static void main (String args[]){
        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }
}
