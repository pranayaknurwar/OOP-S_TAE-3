package unit_4_exception_handling;

public class MusicPlayer extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Playing song...");
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000);
                System.out.println("Progress " + i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.start();
    }
}
