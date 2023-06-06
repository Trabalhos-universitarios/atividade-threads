import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int senhaCorreta = generateRandomPassword(999999); // Gera uma senha aleatória de 6 dígitos

        Vault vault = new Vault(senhaCorreta);
        long startTime = System.currentTimeMillis();

        HackerOne hacker1 = new HackerOne(vault, startTime);
        HackerTwo hacker2 = new HackerTwo(vault, startTime);
        ProgressThread progressThread = new ProgressThread();

        hacker1.start();
        hacker2.start();
        progressThread.start();

        // Aguardar a conclusão das threads
        hacker1.join();
        hacker2.join();
        progressThread.join();

        System.out.println("A polícia chegou e prendeu os hackers!");
    }

    private static int generateRandomPassword(int max) {
        Random random = new Random();
        return random.nextInt(max + 1);
    }
}
