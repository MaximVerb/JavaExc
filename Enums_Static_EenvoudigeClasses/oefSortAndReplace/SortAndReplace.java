package Enums_Static_EenvoudigeClasses.oefSortAndReplace;

import java.util.Arrays;

public class SortAndReplace {
    private String string;

    public SortAndReplace(String string) {
        this.string = verwerk(string);
    }

    private String verwerk(String aString) {
        aString = aString.replaceAll("\\d", ".");
        char[] theSentence = aString.toCharArray();
        Arrays.sort(theSentence);
        return new String(theSentence);
    }

    @Override
    public String toString()
    {
        return String.format("De array is: %s",this.string);
    }
}
