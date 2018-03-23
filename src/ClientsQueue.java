import java.util.LinkedList;

public class ClientsQueue {
    private static final int MAX_PRIORITY_TELLER_COUNT = 5;

    private LinkedList<Client> clients;
    private LinkedList<Client> seniors;

    public ClientsQueue() {
        this.clients = new LinkedList<>();
        this.seniors = new LinkedList<>();
    }

    public void enqueue(Client c) {
        if (c.getAge() > Client.SENIORITY_START_AGE) {
            this.seniors.addFirst(c);
        } else {
            this.clients.addFirst(c);
        }
    }

    public Client dequeue(int teller) {
        if (teller <= MAX_PRIORITY_TELLER_COUNT) {
            return this.seniors.removeLast();
        }

        return this.clients.removeLast();
    }
}
