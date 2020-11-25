import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()== KeyEvent.VK_ENTER){
                    if(textArea_A.getText().equals("吴彦祖")){
                        textArea_B.setText("你答对了！！");
                    }else if(e.getKeyCode()== KeyEvent.VK_ENTER){
                        textArea_B.setText("丑拒！！");
                }
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(100,100,300,100);
        textArea_B.setBounds(100,300,300,100);
        textArea_A.setBackground(Color.orange);
        textArea_B.setBackground(Color.yellow);
        textArea_A.setText("魔镜魔镜，谁是世界上最漂亮的人啊？？");
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
