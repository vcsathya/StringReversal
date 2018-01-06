package com.reverse.vcsathya.reversestring;

import com.reverse.vcsathya.reversestring.utility.StringUtil;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {

    @Test
    public void validateSpecialChars() throws Exception {
        String[] s = new String[] {"qwerty54321", "bfr6@#$%^", "987$%^&jbvar", "(*&^%$", " "};
        StringUtil util = new StringUtil();
        for (String testString : s) {
            assert (util.isValid(testString));
        }
    }

    @Test
    public void validateString() throws Exception {
        String[] s = new String[] {"qwertyuiop", "kjhgfdsa", "nbvcxz", "iahurwifv"};
        StringUtil util = new StringUtil();
        for (String testString : s) {
            assert (util.isValid(testString));
        }
    }

    @Test
    public void validateReversal() throws Exception {
        String input = "Sample Input";
        StringUtil util = new StringUtil();

        StringBuffer sb = new StringBuffer(input);
        assert(util.reverseString(input).equals(sb.reverse()));
    }
}