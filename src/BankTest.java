import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
    ClientsQueue queue;

    @Before
    public void beforeTest() {
        Client c1 = new Client("John", 20);
        Client c2 = new Client("Maria", 50);
        Client c3 = new Client("Alex", 70);
        Client c4 = new Client("Martin", 18);
        Client c5 = new Client("Luis", 31);
        Client c6 = new Client("Megan", 60);

        queue = new ClientsQueue();
        queue.enqueue(c1);
        queue.enqueue(c2);
        queue.enqueue(c3);
        queue.enqueue(c4);
        queue.enqueue(c5);
        queue.enqueue(c6);
    }

    @org.junit.Test
    public void priorityTellerTest() {
        Client client = queue.dequeue(1);

        assertEquals("Alex", client.getName());
    }

    @Test
    public void defaultTellerTest() {
        assertEquals("John", queue.dequeue(6).getName());
        assertEquals("Maria", queue.dequeue(8).getName());
        assertEquals("Martin", queue.dequeue(7).getName());
        assertEquals("Luis", queue.dequeue(9).getName());
    }
}