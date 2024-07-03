import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");
        MyHandler handler = new MyHandler();
        Server server = new Server();
    }
}