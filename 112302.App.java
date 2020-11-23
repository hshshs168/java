public class App {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            int x,y;
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            System.out.println(x+","+y);
        }
    }
}
