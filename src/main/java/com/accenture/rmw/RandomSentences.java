package com.accenture.rmw;

import java.util.Random;

public class RandomSentences{

    final static int NO_WORDS = 5;	// These constants must be static
    final static int NO_SENTS = 20;	// if they are going to be used in
    final static String SPACE = " ";	// a static method like main().
    final static String PERIOD = ".";

    static Random r = new Random();

    final static String article[] = { "the", "a", "one", "some", "any" };
    final static String noun[] = { "boy", "girl", "dog", "town", "car" };
    final static String verb[] = { "drove", "jumped", "ran", "walked", "skipped" };
    final static String preposition[] = { "to", "from", "over", "under", "on" };

    public static void main( String args[] ){

        String sentence;
        for (int i = 0; i < NO_SENTS; i++){
            sentence = getSentence();
            System.out.println(sentence);
            sentence = "";
        }
    }

	public static String getSentence() {
		String sentence;
		sentence = article[rand()];
		char c = sentence.charAt(0);
		sentence = sentence.replace( c, Character.toUpperCase(c) );
		sentence += SPACE + noun[rand()] + SPACE;
		sentence += (verb[rand()] + SPACE + preposition[rand()]);
		sentence += (SPACE + article[rand()] + SPACE + noun[rand()]);
		sentence += PERIOD;
		return sentence;
	}

    static int rand(){
        int ri = r.nextInt() % NO_WORDS;
        if ( ri < 0 )
            ri += NO_WORDS;
        return ri;
    }
}

/**
 * Further commentary on the above code
 *
 * Note that the method used to capitalize the first article is not a 
 * general method.  If the article were "that", for example, the code
 * would change it into "ThaT".
 *
 * A better solution would be to provide a method
 *   String capitalizeCharAt( int index )
 * that would return a new String with the char at the specified location
 * capitalized.
 */
