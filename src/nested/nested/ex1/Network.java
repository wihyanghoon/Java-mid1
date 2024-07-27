package nested.nested.ex1;

public class Network {
    public void sendMessage(String message) {
        NetworkMessage networkMessage = new NetworkMessage(message);
        networkMessage.print();
    }
}
