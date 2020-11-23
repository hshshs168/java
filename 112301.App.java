import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int x,y,z;
        while (true){
            Scanner scanner=new Scanner(System.in);
            z=scanner.nextInt();
            if (z==1) {
                x = (int) (Math.random() * 100);
                y = (int) (Math.random() * 100);
                System.out.println(x + "," + y);
            }else{
                System.out.println("输入错误");
            }
        }
    }
}
