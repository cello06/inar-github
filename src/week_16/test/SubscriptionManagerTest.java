package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.SubscriptionManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubscriptionManagerTest {
    static int testCaseNumber = 1;

    @BeforeAll
    public static void init() {
        System.out.println("SubscriptionManagerTest is started");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("---------------TC_" + testCaseNumber + ": is started---------------");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("---------------TC_" + testCaseNumber + ": is finished--------------");
        System.out.println("###############################################");
        testCaseNumber++;
    }

    @Test
    public void testFreeTierEmailNotificationEnabledAutoRenewal() {
        String actualResult = SubscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.EMAIL,
                SubscriptionManager.AutoRenewal.ENABLED);
        String expectedResult = "Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED";

        System.out.println("testFreeTierEmailNotificationEnabledAutoRenewal test case\n" +
                "Tier = FREE\n" +
                "Notification = EMAIL\n" +
                "AutoRenewal = ENABLED\n" +
                "Expected Result  --> " + expectedResult +
                "\nActual Result --> " + actualResult);
        assertEquals(actualResult, expectedResult, "configureSubscription() method is not working properly!");
    }

    @Test
    public void testStandardTierSmsNotificationDisabledAutoRenewal() {
        String actualResult = SubscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.SMS,
                SubscriptionManager.AutoRenewal.DISABLED);
        String expectedResult = "Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED";

        System.out.println("testStandardTierSmsNotificationDisabledAutoRenewal test case\n" +
                "Tier = STANDARD\n" +
                "Notification = SMS\n" +
                "AutoRenewal = DISABLED\n" +
                "Expected Result  --> " + expectedResult +
                "\nActual Result --> " + actualResult);
        assertEquals(actualResult, expectedResult, "configureSubscription() method is not working properly!");
    }

    @Test
    public void testPremiumTierNoneNotificationEnabledAutoRenewal() {
        String actualResult = SubscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.NONE,
                SubscriptionManager.AutoRenewal.ENABLED);
        String expectedResult = "Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED";

        System.out.println("testPremiumTierNoneNotificationEnabledAutoRenewal test case\n" +
                "Tier = PREMIUM\n" +
                "Notification = NONE\n" +
                "AutoRenewal = ENABLED\n" +
                "Expected Result  --> " + expectedResult +
                "\nActual Result --> " + actualResult);
        assertEquals(actualResult, expectedResult, "configureSubscription() method is not working properly!");
    }

    @Test
    public void testFreeTierSmsNotificationDisabledAutoRenewal() {
        String actualResult = SubscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.SMS,
                SubscriptionManager.AutoRenewal.DISABLED);
        String expectedResult = "Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED";

        System.out.println("testFreeTierSmsNotificationDisabledAutoRenewal test case\n" +
                "Tier = FREE\n" +
                "Notification = SMS\n" +
                "AutoRenewal = DISABLED\n" +
                "Expected Result  --> " + expectedResult +
                "\nActual Result --> " + actualResult);
        assertEquals(actualResult, expectedResult, "configureSubscription() method is not working properly!");
    }

    @Test
    public void testStandardTierEmailNotificationEnabledAutoRenewal() {
        String actualResult = SubscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.EMAIL,
                SubscriptionManager.AutoRenewal.ENABLED);
        String expectedResult = "Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED";

        System.out.println("testStandardTierEmailNotificationEnabledAutoRenewal test case\n" +
                "Tier = STANDARD\n" +
                "Notification = EMAIL\n" +
                "AutoRenewal = ENABLED\n" +
                "Expected Result  --> " + expectedResult +
                "\nActual Result --> " + actualResult);
        assertEquals(actualResult, expectedResult, "configureSubscription() method is not working properly!");
    }

    @Test
    public void testPremiumTierSmsNotificationDisabledAutoRenewal() {
        String actualResult = SubscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.SMS,
                SubscriptionManager.AutoRenewal.DISABLED);
        String expectedResult = "Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED";

        System.out.println("testPremiumTierSmsNotificationDisabledAutoRenewal test case\n" +
                "Tier = PREMIUM\n" +
                "Notification = SMS\n" +
                "AutoRenewal = DISABLED\n" +
                "Expected Result  --> " + expectedResult +
                "\nActual Result --> " + actualResult);
        assertEquals(actualResult, expectedResult, "configureSubscription() method is not working properly!");
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("SubscriptionManagerTest is finished");
    }
}
