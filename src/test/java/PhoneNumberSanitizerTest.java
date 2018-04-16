import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberSanitizerTest {

    @Test
    public void testPhoneNumberSanitization() {
        PhoneNumberSanitizer sol = new PhoneNumberSanitizer();
        Assert.assertEquals(sol.solution("00-44    48 5555 8361"), "004-448-555-583-61");
        Assert.assertEquals(sol.solution("0 - 22 1985--324"), "022-198-53-24");
        Assert.assertEquals(sol.solution("555372654"), "555-372-654");
        Assert.assertEquals(sol.solution("001"), "001");
        Assert.assertEquals(sol.solution("22"), "22");
        Assert.assertEquals(sol.solution("12345678-"), "123-456-78");
        Assert.assertEquals(sol.solution("12345678   "), "123-456-78");
        Assert.assertEquals(sol.solution("  12345678   "), "123-456-78");
    }
}