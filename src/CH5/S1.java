package CH5;
 import java.awt.*;
import java.awt.event.*;

public class S1 {
    public static void main(String[] args) {
        // 在事件调度线程中启动GUI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                // 创建 Frame 和其他组件
                Frame frame = new Frame("按鈕點擊範例");
                Button button = new Button("按下我!");
                Label label = new Label("等待點擊...");
                
                // 设置组件位置和大小
                button.setBounds(100, 100, 80, 30);
                label.setBounds(100, 150, 200, 30);
                
                // 按钮点击事件监听
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        label.setText("按鈕已被點擊!");
                    }
                });
                
                // 添加组件到 Frame
                frame.add(button);
                frame.add(label);
                
                // 设置 Frame 属性
                frame.setSize(300, 300);
                frame.setLayout(null); // 使用 null 布局
                frame.setVisible(true);
                
                // 监听窗口关闭事件
                frame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0); // 退出程序
                    }
                });
            }
        });
    }
}
