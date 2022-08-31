package IdeaProjects.dorcasFile.test.Regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexSamplesTest {

    @Test
    void testThatPhoneNumberIsValid(){
        assertTrue(RegexSamples.validatePhoneNumber("+2347062828140"));

    }
    @Test
    void testThatPhoneNumberWithoutCountryCodeIsValid(){
        assertTrue(RegexSamples.validatePhoneNumber("07062828140"));

    }

    @Test
    void testThatPhoneNumberWithCountryCodeAndZeroIsInvalid(){
        assertFalse(RegexSamples.validatePhoneNumber("+23407062828140"));

    }

    @Test
    void testForRegexEmail(){
        assertTrue(RegexSamples.validateEmail("dorcasabang@gmail.com"));
    }

    @Test
    void testForEmailWithNumberInId(){
        assertTrue(RegexSamples.validateEmail("dorcasabang24@gmail.com"));
    }

    @Test
    void testForEmailWithNumberInMiddleOfId(){
        assertTrue(RegexSamples.validateEmail("dorcas2abang@gmail.com"));
    }

    @Test
    void testForEmailWithNumberInMiddleAndEndOfId(){
        assertTrue(RegexSamples.validateEmail("dorcas2abang24@gmail.com"));
    }

    @Test
    void testThatEmailWithoutIdIsInvalid(){
        assertFalse(RegexSamples.validateEmail("@gmail.com"));
    }

    @Test
    void testThatEmailWithNumberAtBeginningOfId(){
        assertFalse(RegexSamples.validateEmail("24dorcas@gmail.com"));
    }

    @Test
    void testThatEmailWithOtherDomainsAreValid(){
        assertTrue(RegexSamples.validateEmail("dorcas@yahoo.com"));
    }
    @Test
    void testEmailsValidWithDotInUsername(){
        String email = "straight.lace@yahoo.com";
        assertTrue(RegexSamples.validateEmail(email));
    }
    @Test
    void testEmailsIsValidWithDotAtTheEnd(){
        String email = "straight.@yahoo.com";
        assertTrue(RegexSamples.validateEmail(email));
    }
    @Test
    void testForPassWordValidation(){
        assertTrue(RegexSamples.validatePassword("Adeweh@2"));
    }


}