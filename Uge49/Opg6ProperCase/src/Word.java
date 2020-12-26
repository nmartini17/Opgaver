public class Word {

    public String changeSentence(String sentence) throws EmptyStringException {
        String newSentence = "";
        String delimiter = " ";
        String[] words;
        words = sentence.split(delimiter);
        if(sentence.isEmpty())
            throw new EmptyStringException();

        for (int i = 0; i < words.length; i++) {
            String upperCaseWord = words[i].toUpperCase();
            //If the word is 3 or less letters, everything is lowercase.
            if (words[i].length() <= 3) {
                newSentence += words[i].toLowerCase() + " ";

//If word is longer than 3 letters, it has to be written in lowercase but start with an uppercase letter
            } else if (words[i].length() > 3) {
                String firstChar = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                newSentence += firstChar + " ";

                //If the word only contains capital letters
            } else if (upperCaseWord.equals(words[i])) {
                newSentence += words[i] + " ";

            }
        }
        System.out.println(newSentence);
        return newSentence;
    }

}
