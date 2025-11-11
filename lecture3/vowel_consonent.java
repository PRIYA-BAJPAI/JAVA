public class vowel_consonent {
public static void main(String[] args){

    String str="aeiou";
    String s="wooooood";
    int vowel=0;
    // int consonent;
    for(int i=0;i<str.length();i++){
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==str.charAt(i)){
                vowel++;
            }
        }
    }
    System.out.println("number of vowels are ");
    System.out.println(vowel);
    System.out.println("number of consonents are ");
    System.out.println(s.length()-vowel);

}
}
