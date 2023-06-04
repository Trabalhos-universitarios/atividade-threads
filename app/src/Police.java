public class Police extends Thread {


    public void police() {
        Thread police = new Thread(getThreadGroup(), null, getName(), MAX_PRIORITY);
        police.start();
        System.out.println("This is thread police: " + police);
    }
    
}
