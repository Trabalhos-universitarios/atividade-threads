public class Vault {
    private final int senhaCorreta;

    public Vault(int senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    public boolean vault(int senhaChutada) {
        return senhaChutada == senhaCorreta;
    }
}
