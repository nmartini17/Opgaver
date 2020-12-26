public class Strenge {

    public String charReplacer(String s1, String s2, char a, char b) {
        String retStr = "";
        retStr = s1+s2;
        String newStr = retStr.replace(a,b);

        return newStr;
    }
}
