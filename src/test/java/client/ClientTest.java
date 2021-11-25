package client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client first;
    private Client second;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        first = new Client("Alice", 21, "female", "alice@outlook.com");
        second = new Client("Bob", 30, "male", "bob@gmail.com");
    }

    @Test
    void getName() {
        assertEquals("Alice", first.getName());
        assertNotEquals("bob", second.getName());
    }

    @Test
    void getAge() {
        assertEquals(21, first.getAge());
        assertEquals(30, second.getAge());
    }

    @Test
    void getEmail() {
        assertEquals("alice@outlook.com", first.getEmail());
        assertNotEquals("bob@outlook.com", second.getEmail());
    }
}