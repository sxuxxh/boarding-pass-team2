package boarding_pass;

import org.junit.jupiter.api.*;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {
    PriceList priceList;

    @BeforeAll
    static void setUpAll() {
        System.out.println("Should execute before all tests.");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Should execute before each test.");
        priceList = new PriceList(new HashMap<TripCode,Double>());
    }

    @Test
    @DisplayName("Get price-list")
    void shouldGetPriceLst() {
        priceList.populatePriceLst();
        assertFalse(priceList.getPriceLst().isEmpty());
    }

    @Test
    @DisplayName("Populate price-list")
    void shouldPopulatePriceLst() {
        priceList.populatePriceLst();
        assertEquals(9,priceList.getPriceLst().size());
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