public class ProgressThread extends Thread {

    String color = "\u001B["; // função que permite trocar cor no console

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.print("\rTempo restante para a polícia chegar: " + i + " segundos ");
            for (int j = 0; j < i; j++) {
                if (i >= 7) {
                    System.out.print(color + 32 + "m" + "*" + color + "m");
                } else if (i < 7 && i >= 4) {
                    System.out.print(color + 33 + "m" + "*" + color + "m");
                } else {
                    System.out.print(color + 31 + "m" + "#" + color + "m");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nA polícia chegou! Os hackers estão presos.");
        System.exit(0);
    }
}
