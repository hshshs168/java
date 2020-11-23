import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true){
            int x,y;
            Scanner scanner=new Scanner(System.in);
            System.out.println("输入x：");
            x=scanner.nextInt();
            x=(int)(Math.random()*100);
            y=(int)(Math.random()*100);
            System.out.println(x+","+y);
        }
    }
}
