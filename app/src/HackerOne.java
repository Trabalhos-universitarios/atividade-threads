public class HackerOne implements Runnable {
    private final Vault vault;
    private final long startTime;

    public HackerOne(Vault vault, long startTime) {
        this.vault = vault;
        this.startTime = startTime;
    }

    @Override
    public void run() {
        int senhaChutada = 0;
        boolean senhaEncontrada = false;

        while (!senhaEncontrada && senhaChutada <= 99999) {
            if (vault.vault(senhaChutada)) {
                senhaEncontrada = true;
                long elapsedTime = System.currentTimeMillis() - startTime;
                System.out.println("HackerOne abriu o cofre com a senha: " + senhaChutada);
                System.out.println("Tempo necessário: " + elapsedTime + " milissegundos");
                System.exit(0);
            } else {
                senhaChutada++;
            }
        }

        System.out.println("HackerOne não conseguiu abrir o cofre.");
    }
}
