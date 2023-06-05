public class Police extends Thread {

    public Police() {}

    @Override
    public void run() {
        System.out.println("Tempo restante para a polícia chegar: 10 segundos");

        for (int i = 9; i >= 0; i--) {
            try {
                Thread.sleep(1000);
                System.out.println("Tempo restante para a polícia chegar: " + i + " segundos");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("A polícia chegou! Os hackers estão presos.");
        System.exit(0);
    }
}
