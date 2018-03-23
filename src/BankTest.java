import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
    private ClientsQueue queue;

    @Before
    public void beforeTest() {
        queue = new ClientsQueue();
        queue.enqueue(new Client("John", 20));
        queue.enqueue(new Client("Maria", 50));
        queue.enqueue(new Client("Alex", 70));
        queue.enqueue(new Client("Martin", 18));
        queue.enqueue(new Client("Luis", 31));
        queue.enqueue(new Client("Megan", 60));
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