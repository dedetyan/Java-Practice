class ElapsedTime extends Thread{
    private int ct = 0;
    private double sec;
    public volatile boolean running = true;

    @Override
    public void run(){
        try {
            System.out.println("計測開始");
            while(running) {
                Thread.sleep(100);
                ct++;
            }
            sec = ct * ((double)100 / 1000);
            System.out.println("計測終了");
            System.out.println("経過時間：" + sec + "秒");

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}