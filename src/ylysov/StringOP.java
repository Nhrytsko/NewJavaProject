package ylysov;

public class StringOP {
    public static void printCharacters() {
        String s1 ="It is very nice day today. Sun is shining!";

        char[] chars = s1.toCharArray();
        int pos = s1.indexOf(".");

        int i =0;
        while (i< chars.length)  {
            System.out.print(chars[i]);
            if (i==pos)	break;
            i ++;  }


        String s2 = s1.replaceAll("\\s", "");

        int len1=s1.length();
        int len2=s2.length();
        int len3=s1.length()-s2.length();
        System.out.println();
        System.out.println("The amount of 'space' characters is: " + len3);

    }
}
