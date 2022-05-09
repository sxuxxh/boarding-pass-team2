package boarding_pass;

import org.junit.jupiter.api.*;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ETAListTest {
    ETAList etaList;

    @BeforeAll
    static void setUpAll() {
        System.out.println("Should execute before all tests.");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Should execute before each test.");
        etaList = new ETAList(new HashMap<TripCode,Float>());
    }

    @Test
    @DisplayName("Get eta-list")
    void shouldGetEtaLst() {
        etaList.populateETALst();
        assertFalse(etaList.getEtaLst().isEmpty());
    }

    @Test
    @DisplayName("Populate eta-list")
    void shouldPopulateEtaLst() {
        etaList.populateETALst();
        assertEquals(9,etaList.getEtaLst().size());
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