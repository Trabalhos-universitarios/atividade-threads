public class HackerTwo extends Thread {
    private final Vault vault;
    private final long startTime;

    public HackerTwo(Vault vault, long startTime) {
        this.vault = vault;
        this.startTime = startTime;
    }

    @Override
    public void run() {
        // Implemente aqui a lógica do HackerTwo para tentar abrir o cofre
        // Força bruta - Contador decrescente
        int senhaChutada = 999999;
        while (!vault.isCofreAberto() && senhaChutada >= 0) {
            if (vault.isSenhaCorreta(senhaChutada)) {
                synchronized (System.out) {
                    long endTime = System.currentTimeMillis();
                    System.out.println("\nHackerTwo abriu o cofre com a senha: " + senhaChutada);
                    System.out.println("Tempo necessário: " + (endTime - startTime) + " milissegundos");
                    System.exit(0); // Encerra o programa após a abertura do cofre
                }
            }
            senhaChutada--;
        }
    }
}
