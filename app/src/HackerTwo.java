public class HackerTwo implements Runnable {
    private final Vault vault;
    private final long startTime;

    public HackerTwo(Vault vault, long startTime) {
        this.vault = vault;
        this.startTime = startTime;
    }

    @Override
    public void run() {
        int senhaChutada = 99999;
        boolean senhaEncontrada = false;

        while (!senhaEncontrada && senhaChutada >= 0) {
            if (vault.vault(senhaChutada)) {
                senhaEncontrada = true;
                long elapsedTime = System.currentTimeMillis() - startTime;
                System.out.println("HackerTwo abriu o cofre com a senha: " + senhaChutada);
                System.out.println("Tempo necessário: " + elapsedTime + " milissegundos");
                System.exit(0);
            } else {
                senhaChutada--;
            }
        }

        System.out.println("HackerTwo não conseguiu abrir o cofre.");
    }
}
