package week_16.test;

import org.junit.jupiter.api.Test;
import week_16.java.AgeRestrictionValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAgeRestrictionValidator {
    AgeRestrictionValidator ageRestrictionValidator = new AgeRestrictionValidator();

    @Test
    void testingAgeAtJustBelowMinimum() {

        assertFalse(ageRestrictionValidator.isEligible(17), "isEligible() method is not" +
                " working for just below minimum input");
    }

    @Test
    void testingAgeAtMinimum() {
        assertTrue(ageRestrictionValidator.isEligible(18), "isEligible() method is not " +
                "working for minimum input");
    }

    @Test
    void testingAgeAtJustAboveMinimum() {
        assertTrue(ageRestrictionValidator.isEligible(19), "isEligible() method is not " +
                "working for just above minimum input");
    }

    @Test
    void testingAgeAtJustBelowMaximum() {
        assertTrue(ageRestrictionValidator.isEligible(64), "isEligible() method is not " +
                "working for just below maximum input");
    }

    @Test
    void testingAgeAtMaximum() {
        assertTrue(ageRestrictionValidator.isEligible(65), "isEligible() method is not " +
                "working for maximum input");
    }

    @Test
    void testingAgeAtJustAboveMaximum() {
        assertFalse(ageRestrictionValidator.isEligible(66), "isEligible() method is not " +
                "working for just above maximum input");
    }

    @Test
    void testingAgeAtExtremeLowAge() {
        assertFalse(ageRestrictionValidator.isEligible(0), "isEligible() method is not " +
                "working for extreme low input");
    }

    @Test
    void testingAgeAtExtremeHighAge() {
        assertFalse(ageRestrictionValidator.isEligible(100), "isEligible() method is not " +
                "working for extreme high input");
    }
}
