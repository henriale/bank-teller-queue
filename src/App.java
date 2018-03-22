public class App {
    public static void main(String[] args) {
        Client c1 = new Client("John", 20);
        Client c2 = new Client("Maria", 50);
        Client c3 = new Client("Alex", 70);
        Client c4 = new Client("Martin", 18);
        Client c5 = new Client("Luis", 31);

        ClientsQueue queue = new ClientsQueue();
        queue.enqueue(c1);
        queue.enqueue(c2);
        queue.enqueue(c3);
        queue.enqueue(c4);
        queue.enqueue(c5);

        Client c = queue.dequeue(1);

        System.out.println(c.getName().equals(c3.getName()));
    }
}