package pattern.concurrent.a;
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Deposit drop = new Deposit();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
