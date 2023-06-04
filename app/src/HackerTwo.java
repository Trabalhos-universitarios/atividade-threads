public class HackerTwo extends Thread {
    

    public void thread2() {
        Thread hacker2 = new Thread(getThreadGroup(), null, getName(), MAX_PRIORITY);
        hacker2.start();
        System.out.println("This is hacker2: " + hacker2);
    }
}
