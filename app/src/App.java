import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws Exception {
        int senhaCorreta = generateRandomPassword(99999); // Gera uma senha aleatória

        Vault vault = new Vault(senhaCorreta);
        long startTime = System.currentTimeMillis();

        HackerOne hacker1 = new HackerOne(vault, startTime);
        HackerTwo hacker2 = new HackerTwo(vault, startTime);
        Police police = new Police();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(hacker1);
        executorService.submit(hacker2);
        executorService.submit(police);

        executorService.shutdown();
    }

    private static int generateRandomPassword(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);
    }
}
