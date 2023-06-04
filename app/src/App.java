public class App {
    public static void main(String[] args) throws Exception {
        

        HackerOne hacker1 = new HackerOne();
        hacker1.thread1();

        HackerTwo hacker2 = new HackerTwo();
        hacker2.thread2();

        Police police = new Police();
        police.police();
    }
}
