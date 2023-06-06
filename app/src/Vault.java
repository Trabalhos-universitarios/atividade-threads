public class Vault {
    private final int senhaCorreta;
    private boolean cofreAberto;

    public Vault(int senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
        this.cofreAberto = false;
    }

    public synchronized boolean isSenhaCorreta(int senhaChutada) {
        if (senhaChutada == senhaCorreta && !cofreAberto) {
            cofreAberto = true;
            return true;
        }
        return false;
    }

    public boolean isCofreAberto() {
        return cofreAberto;
    }
}
