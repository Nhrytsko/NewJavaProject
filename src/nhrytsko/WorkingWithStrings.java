package nhrytsko;

public class WorkingWithStrings {

    public int CountWhiteSpaces(String initialString){

        char [] seq = initialString.toCharArray();
        int k = 0;

        for (char s : seq) {
            if (s == ' ') k++;
        }

        return k;
}

    public void ShowCharacters (String initialString){
        char [] seq = initialString.toCharArray();
        for (char s : seq) {
            if (s != '.') System.out.print(s);
            else break;
        }
    }
}
