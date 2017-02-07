package follybot.response.quotemaker;

import java.util.ArrayList;
import java.util.Random;

public class QuoteMaker {

    private Random random;
    
    public QuoteMaker() {

        random = new Random();
    }

    public String makeAQuote(String quote, ArrayList<String> randomWords, String name) {

        String newQuote = quote;

        if (quote.contains("Å")) {
            newQuote = quote.replaceAll("Å", randomWords.get(0));
        }

        return newQuote + endQuote(name);
    }

    public String endQuote(String name) {

        int zerotoseven = random.nextInt(8);

        if (zerotoseven == 7) {
            return ", " + name + ".";
        } else {
            return ".";
        }
    }
}