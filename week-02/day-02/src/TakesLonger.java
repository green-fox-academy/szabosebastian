import java.sql.PseudoColumnUsage;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String plusValue = "always takes longer than";
        int firstWord, secondWord, lastString;
        String firstPiece, secondPiece;


        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        //StringBuilder beuilder_quote = new StringBuilder(quote);

        firstWord = quote.indexOf("It");
        firstWord = firstWord+1;
      //  System.out.println(firstString);

        secondWord = quote.indexOf("you");
        secondWord = secondWord+2;
      //  System.out.println(secondString);


        firstPiece = quote.substring(0,firstWord);
        secondPiece = quote.substring(secondWord, quote.length()-1);

        quote = firstPiece + " " + plusValue + " " + secondPiece;

        System.out.println(quote);
    }
}