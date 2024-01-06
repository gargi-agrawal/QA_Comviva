package org.example.services.StringUtilsTest;

import org.example.services.StringUtils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    public void reverseTest() {
        StringUtils stringUtilsObj = new StringUtils();
        String result = "!dlrow ,olleH";
        String reverse = stringUtilsObj.reverse("Hello, world!");
        Assertions.assertEquals(result, reverse);
    }

    @Test
    public void isPalindromeTest() {
        StringUtils stringUtilsObj = new StringUtils();
        String str = "Bob bob";
        Assertions.assertFalse(stringUtilsObj.isPalindrome(str));
    }

    @Test
    public void concatenateTest(){
        String str1 = "Hello";
        String str2 = "World";
        StringUtils stringUtilsObj = new StringUtils();
        String actualResult = stringUtilsObj.concatenate(str1, str2);
        String expectedResult = "HelloWorld";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountOccurrences() {
        StringUtils stringUtilsObj = new StringUtils();
        String str = "abracadabra";
        char target = 'a';
        int res = 5;
        Assertions.assertEquals(res, stringUtilsObj.countOccurrences(str, target));
    }
}
