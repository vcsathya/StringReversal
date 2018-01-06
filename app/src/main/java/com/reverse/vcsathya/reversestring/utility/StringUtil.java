package com.reverse.vcsathya.reversestring.utility;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chrrajasiocal on 1/5/18.
 */

public class StringUtil {

    public String reverseString(String input) {
        String output = "";
        char[] chars = input.toCharArray();
        char[] outputChars = new char[chars.length];
        int l = chars.length;

        if (l == 1) {
            return input;
        }

        if (l == 0) {
            Log.e("StringReversal", "Invalid Input " + input);
        }

        for (int i=l-1; i>=0; i--) {
            outputChars[l-i-1] = chars[i];
        }

        output = String.valueOf(outputChars);

        return output;
    }

    public boolean isValid(String input) {

        Pattern p = Pattern.compile("[^a-zA-Z ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);

        return m.find();
    }
}
