public class MusicPlayer extends Thread {

    public void run() {
        System.out.println("Playing song...");
        
        try {
            System.out.println("Progress 1");
            Thread.sleep(1000);

            System.out.println("Progress 2");
            Thread.sleep(1000);

            System.out.println("Progress 3");
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.start();

        try {
            mp.join();  // ensures correct order
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}