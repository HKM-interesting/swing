import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_foreground=new JLabel();
    List<JLabel> label_list=new ArrayList<>();
    int cell=128;
    int array2d[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,0}
    };
    int count=0;
    //构造方法
    public App() {

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL999 = App.class.getResource("img/foreground.png");
        label_foreground.setIcon(new ImageIcon(imgURL999));
        label_foreground.setBounds(0,0,3*cell,4*cell);
        myPanel.add(label_foreground);


        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {

                java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(count+1)+".png");
                label_list.add(new JLabel());
                label_list.get(count).setIcon(new ImageIcon(imgURL));
                label_list.get(count).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(count));
                count++;
            }
        }






        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
