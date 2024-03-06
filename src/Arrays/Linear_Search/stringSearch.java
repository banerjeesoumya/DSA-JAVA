package Arrays.Linear_Search;

import java.util.Arrays;

public class stringSearch {
    public static void main(String[] args) {
        String str = "SOUMYA";
        char target = 'U';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search2(str, target));
    }

    /*public static boolean search1 (String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }*/

    public static boolean search2 (String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if (target == ch){
                return true;
            }
        }
        return false;
    }
}
