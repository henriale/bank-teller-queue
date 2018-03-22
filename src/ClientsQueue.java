import java.util.LinkedList;

public class ClientsQueue {
    private LinkedList<Client> clients;
    private LinkedList<Client> seniors;

    public ClientsQueue() {
        this.clients = new LinkedList<>();
        this.seniors = new LinkedList<>();
    }

    public void enqueue(Client c) {
        if (c.getAge() > 65) {
            this.seniors.addFirst(c);
        } else {
            this.clients.addFirst(c);
        }
    }

    public Client dequeue(int teller) {
        if (teller < 6) {
            return this.seniors.removeLast();
        }

        return this.clients.removeLast();
    }
}
