public class Police extends Thread {
    private static final int TEMPO_MAXIMO = 10000; // 10 segundos
    private final HackerOne hacker1;
    private final HackerTwo hacker2;

    public Police(HackerOne hacker1, HackerTwo hacker2) {
        this.hacker1 = hacker1;
        this.hacker2 = hacker2;
    }

    @Override
    public void run() {
        try {
            System.out.println("\nTempo restante para a polícia chegar: 10 segundos");
            Thread.sleep(TEMPO_MAXIMO);
            synchronized (System.out) {
                System.out.println("A polícia chegou e prendeu os hackers!");
                System.exit(0); // Encerra o programa após a chegada da polícia
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
