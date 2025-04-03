package EX_15;

public class Lab167_VowelsConsonants {
    public static void main(String[] args) {
        String S1="This is for counting of Vowels and consonants";
        int vowel=0;
        int consonant =0;
        for(int i=0;i<S1.length();i++)
        {
            char ch =S1.charAt(i);
            if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
            }
            else
            {
                consonant++;
            }




        }
        System.out.println(vowel);
        System.out.println(consonant);

    }
}
