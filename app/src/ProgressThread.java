public class ProgressThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Tempo restante para a polícia chegar: " + i + " segundos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A polícia chegou! Os hackers estão presos.");
        System.exit(0);
    }
}
