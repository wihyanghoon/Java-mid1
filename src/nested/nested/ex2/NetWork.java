package nested.nested.ex2;

public class NetWork {
    public void sendMessage(String message) {
        NetworkMessage networkMessage = new NetworkMessage(message);
        networkMessage.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
