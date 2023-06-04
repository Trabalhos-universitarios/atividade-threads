public class HackerOne extends Thread {


    public void thread1() {
        Thread hacker1 = new Thread(getThreadGroup(), null, getName(), MAX_PRIORITY);
        System.out.println("This is hacker 1: " + hacker1);

    }
    
}
