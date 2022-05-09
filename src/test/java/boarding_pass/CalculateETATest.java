package boarding_pass;

import org.junit.jupiter.api.*;

class CalculateETATest {
    CalculateETA calculateETA;
    @BeforeAll
    static void setUpAll() {
        System.out.println("Should execute before all tests.");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Should execute before each test.");
    }

    @Test
    void calculateETA() {
    }

    @Test
    void shouldGetETA() {
        //assertEquals(1.5f,CalculateETA.getETA(TripCode.DCA_NYA));
        //assertEquals(5.5f,CalculateETA.getETA(TripCode.NYA_LAA));
        //assertEquals(3.5f,CalculateETA.getETA(TripCode.ATL_ORD));
    }

    @AfterEach
    void tearDown() {
        System.out.println("Should execute after each test.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Should execute at the end of all tests.");
    }
}