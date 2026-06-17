package com.swjtu.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class demo1 {
    public static void main(String[] args) {
        JFrame gameJframe = new JFrame();
        gameJframe.setTitle("cs2");
        gameJframe.setSize(800, 600);
        gameJframe.setAlwaysOnTop(true);
        gameJframe.setLocationRelativeTo(null);
        gameJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameJframe.setLayout(null);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu changejMenu = new JMenu("换图");
        JMenu functionjMenu = new JMenu("功能");
        JMenu aboutjMenu = new JMenu("关于我们");

        JMenuItem restartjMenuItem = new JMenuItem("重新开始");
        JMenuItem reloginjMenuItem = new JMenuItem("切换账号");
        JMenuItem exitjMenuItem = new JMenuItem("退出游戏");
        JMenuItem sportjMenuItem = new JMenuItem("运动");
        JMenuItem animaljMenuItem = new JMenuItem("动物");
        JMenuItem foodjMenuItem = new JMenuItem("食物");

        JMenuItem aboutjMenuItem = new JMenuItem("个人账号");

        functionjMenu.add(restartjMenuItem);
        functionjMenu.add(reloginjMenuItem);
        functionjMenu.add(exitjMenuItem);

        aboutjMenu.add(aboutjMenuItem);

        changejMenu.add(sportjMenuItem);
        changejMenu.add(animaljMenuItem);
        changejMenu.add(foodjMenuItem);

        functionjMenu.add(changejMenu);
        jMenuBar.add(functionjMenu);
        jMenuBar.add(aboutjMenu);

        gameJframe.setJMenuBar(jMenuBar);

        ImageIcon icon = new ImageIcon("E:\\develop\\2026_swjtu\\2026_06\\image\\FJW.jpg");
        JLabel jlabel = new JLabel(icon);
        jlabel.setBounds(0,0,105,105);
        gameJframe.add(jlabel);

        JButton jbt = new JButton("点我");
        jbt.setBounds(200,200,100,50);
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("牛逼");
            }
        });
        gameJframe.getContentPane().add(jbt);

        JButton jbt1 = new JButton("来");
        jbt1.setBounds(300,300,100,50);
        jbt1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("点击");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("按下");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("释放");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("进入");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("离开");
            }
        });
        gameJframe.getContentPane().add(jbt1);
        gameJframe.setVisible(true);
    }
}
