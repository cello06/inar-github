package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.ShippingCostCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShippingCostCalculatorTest {
    ShippingCostCalculator shippingCostCalculator;
    static int testCaseNumber = 1;

    @BeforeAll
    public static void init() {
        System.out.println("TestShippingCostCalculator is started ");
    }

    @BeforeEach
    public void setUp() {
        shippingCostCalculator = new ShippingCostCalculator();
        System.out.println("---------------TC-" + testCaseNumber + ": is started-------------");

    }

    @AfterEach
    public void tearDown() {
        shippingCostCalculator = null;
        System.out.println("--------------TC-" + testCaseNumber + ": is finished--------------");
        System.out.println("######################################");
        testCaseNumber++;
    }


    @Test
    void testingLocalDestinationWithStandardDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(2, "Local", "Standard");
        double expectedCost = 2.0;
        System.out.println("input(weight) --> 2.0\n" +
                "input(destination) --> 'Local'\n" +
                "input(deliverySpeed) --> 'Standard'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);
        assertEquals(actualCost, expectedCost, 0.0001, "TC : " + testCaseNumber + " has some problems in calculating cost");
    }

    @Test
    void testingLocalDestinationWithExpressDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(2, "Local", "Express");
        double expectedCost = 5.0;
        System.out.println("input(weight) --> 2.0\n" +
                "input(destination) --> 'Local'\n" +
                "input(deliverySpeed) --> 'Express'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);

        assertEquals(actualCost, expectedCost, 0.0001, "TC : " + testCaseNumber + " has some problems in calculating cost");
    }

    @Test
    void testInternationalDestinationWithStandardDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(2, "International", "Standard");
        double expectedCost = 10.0;
        System.out.println("input(weight) --> 2.0\n" +
                "input(destination) --> 'International'\n" +
                "input(deliverySpeed) --> 'Standard'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);
        assertEquals(actualCost, expectedCost, "TC : " + testCaseNumber + " has some problems in calculating cost");
    }

    @Test
    void testInternationalDestinationWithExpressDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(2, "International", "Express");
        double expectedCost = 25.0;
        System.out.println("input(weight) --> 2.0\n" +
                "input(destination) --> 'International'\n" +
                "input(deliverySpeed) --> 'Express'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);
        assertEquals(actualCost, expectedCost, "TC : " + testCaseNumber + " has some problems in calculating cost \n");

    }

    @Test
    void testZeroWeightLocalStandardDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(0, "Local", "Standard");
        double expectedCost = 0.0;
        System.out.println("input(weight) --> 0.0\n" +
                "input(destination) --> 'Local'\n" +
                "input(deliverySpeed) --> 'Standard'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);
        assertEquals(actualCost, expectedCost, "TC : " + testCaseNumber + " has some problems in calculating cost \n");

    }

    @Test
    void testZeroWeightLocalExpressDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(0, "Local", "Express");
        double expectedCost = 0.0;
        System.out.println("input(weight) --> 0.0\n" +
                "input(destination) --> 'Local'\n" +
                "input(deliverySpeed) --> 'Express'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);
        assertEquals(actualCost, expectedCost, "TC : " + testCaseNumber + " has some problems in calculating cost \n");

    }

    @Test
    void testZeroWeightInternationalStandardDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(0, "International", "Standard");
        double expectedCost = 0.0;
        System.out.println("input(weight) --> 0.0\n" +
                "input(destination) --> 'International'\n" +
                "input(deliverySpeed) --> 'Standard'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);
        assertEquals(actualCost, expectedCost, "TC : " + testCaseNumber + " has some problems in calculating cost \n");

    }

    @Test
    void testZeroWeightInternationalExpressDelivery() {
        double actualCost = shippingCostCalculator.calculateCost(0, "International", "Express");
        double expectedCost = 0.0;
        System.out.println("input(weight) --> 0.0\n" +
                "input(destination) --> 'International'\n" +
                "input(deliverySpeed) --> 'Express'\n" +
                "Actual Cost : " + actualCost +
                "\nExpected Cost : " + expectedCost);
        assertEquals(actualCost, expectedCost, "TC : " + testCaseNumber + " has some problems in calculating cost \n");

    }

    @Test
    void testNegativeWeightLocalStandardDelivery() {
        System.out.println("input(weight) --> -5\n" +
                "input(destination) --> 'Local'\n" +
                "input(deliverySpeed) --> 'Express'" +
                "\nExpected : Exception must be thrown");
        assertThrows(IllegalArgumentException.class, () -> {
            double actualCost = shippingCostCalculator.calculateCost(-5, "Local", "Standard");
            System.out.println("Actual Cost : " + actualCost);
        });
        System.out.println("Actual : Exception is thrown");
    }

    @Test
    void testNegativeWeightLocalExpressDelivery() {

        System.out.println("input(weight) --> -5\n" +
                "input(destination) --> 'Local'\n" +
                "input(deliverySpeed) --> 'Express'" +
                "\nExpected : Exception must be thrown");
        assertThrows(IllegalArgumentException.class, () -> {
            double actualCost = shippingCostCalculator.calculateCost(-5, "Local", "Express");
            System.out.println("Actual Cost : " + actualCost);
        });
        System.out.println("Actual : Exception is thrown");
    }

    @Test
    void testNegativeWeightInternationalStandardDelivery() {

        System.out.println("input(weight) --> -5\n" +
                "input(destination) --> 'International'\n" +
                "input(deliverySpeed) --> 'Standard'" +
                "\nExpected : Exception must be thrown");
        assertThrows(IllegalArgumentException.class, () -> {
            double actualCost = shippingCostCalculator.calculateCost(-5, "International", "Standard");
            System.out.println("Actual Cost : " + actualCost);
        });
        System.out.println("Actual : Exception is thrown");
    }

    @Test
    void testNegativeWeightInternationalExpressDelivery() {

        System.out.println("input(weight) --> -5\n" +
                "input(destination) --> 'International'\n" +
                "input(deliverySpeed) --> 'Express'" +
                "\nExpected : Exception must be thrown");
        assertThrows(IllegalArgumentException.class, () -> {
            double actualCost = shippingCostCalculator.calculateCost(-5, "International", "Express");
            System.out.println("Actual Cost : " + actualCost);
        });
        System.out.println("Actual : Exception is thrown");
    }


    @AfterAll
    public static void cleanUp() {
        System.out.println("TestShippingCostCalculator is finished");
    }
}
