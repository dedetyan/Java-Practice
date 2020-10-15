public class SpeedTest {
    public static void main(String[] args) {
        ElapsedTime et = new ElapsedTime();
        et.start();
        //ここから計測対象の処理
        for(int i=0; i<5000; i++){
            System.out.println("表示"+i+"回目");
        }
        //ここまで計測対象の処理
        et.running = false;
    }
}
