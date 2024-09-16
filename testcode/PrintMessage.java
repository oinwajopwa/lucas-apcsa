public class PrintMessage {
    public static void main(String[] args) {
        // Create a new thread to print the message
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("Aaron Amaya is dumb");
                try {
                    // Sleep for 1 second (1000 milliseconds)
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the thread
        thread.start();
    }
}
