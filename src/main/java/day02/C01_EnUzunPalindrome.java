package day02;

public class C01_EnUzunPalindrome {
    public static void main(String[] args) {

        /*
        Verilen str datadaki en uzun palindrome 'u veren kodu yaziniz
         String str = "hellosannasmith";
         nalan==> nalan
         ey edip adanada pide ye
         ey edip adanada pide ye
         */
        String str = "hellosannasmith";
        System.out.println(enUzunPalindrome(str));

    }

    public static String enUzunPalindrome(String str) {
        String longestPalindrome= "";

        for (int i = 0;   i <str.length() ;    i++) {
            for (int j = i+1; j <= str.length(); j++) {// "hellosannasmith";

                String currentString = str.substring(i,j);//currentString=gecerliString
                System.out.println("currentString = " + currentString);
                if(isPalindrome(currentString) && currentString.length()>longestPalindrome.length()){
                    longestPalindrome = currentString;
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String str) {//"hellosannasmith";
        int leftIndex=0;
        int rightIndex = str.length()-1;
        while(leftIndex<rightIndex){
            if(str.charAt(leftIndex)!= str.charAt(rightIndex)){
                return false;
            }//if
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
