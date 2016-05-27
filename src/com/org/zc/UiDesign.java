package com.org.zc;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.w3c.dom.css.RGBColor;

/**
 * 
 * @author 詹超 界面的显示
 *
 */
public class UiDesign {
	// 控件的初始化
	JFrame jFrame = new JFrame("LockControl");
	Container container = jFrame.getContentPane();
	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();
	JPanel jPanel3 = new JPanel();

	JRadioButton jRadioButton1 = new JRadioButton("设置    时刻");
	JRadioButton jRadioButton2 = new JRadioButton("设置倒计时");
	JRadioButton jRadioButton3 = new JRadioButton("重启");
	JRadioButton jRadioButton4 = new JRadioButton("关机");

	JButton jButton = new JButton("启动任务");
	JLabel jLabel = new JLabel("当前时间", JLabel.CENTER);
	Font font = new Font("Serial", Font.BOLD, 30);

	ButtonGroup buttonGroup1 = new ButtonGroup();
	ButtonGroup buttonGroup2 = new ButtonGroup();

	public UiDesign() {

		jFrame.setLayout(null);// 设置基本容器无布局管理器

		// 设置按钮位置
		jRadioButton1.setBounds(100, 40, 100, 20);
		jRadioButton2.setBounds(100, 90, 100, 20);
		jRadioButton3.setBounds(20, 45, 100, 20);
		jRadioButton4.setBounds(130, 45, 80, 20);
		jButton.setBounds(300, 348, 180, 90);// 启动任务按钮
		jLabel.setFont(font);
		jLabel.setForeground(Color.RED);
		jRadioButton1.setOpaque(false);
		jRadioButton2.setOpaque(false);
		jRadioButton3.setOpaque(false);
		jRadioButton4.setOpaque(false);
		jLabel.setOpaque(false);

		// 单选按钮分组
		buttonGroup1.add(jRadioButton1);
		buttonGroup1.add(jRadioButton2);
		buttonGroup2.add(jRadioButton3);
		buttonGroup2.add(jRadioButton4);

		// 默认状态下的单选按钮设置
		jRadioButton1.setSelected(true);
		jRadioButton3.setSelected(true);

		// 对jPanel容器位置的设置
		jPanel1.setBounds(20, 40, 460, 130);
		jPanel2.setBounds(20, 190, 460, 130);
		jPanel3.setBounds(20, 340, 230, 100);

		// 将JPanel设置成透明色
		jPanel1.setOpaque(false);
		jPanel2.setOpaque(false);
		jPanel3.setOpaque(false);

		// 是指JPanel容器为无不惧挂历器
		jPanel1.setLayout(null);
		// jPanel2.setLayout(null);
		jPanel3.setLayout(null);

		// 对jPanel容器设置边框
		jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white, 2), "时间设定"));
		jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white, 2), "状态显示"));
		jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white, 2), "定时选项"));

		jPanel1.add(jRadioButton1);
		jPanel1.add(jRadioButton2);
		jPanel2.add(jLabel);
		jPanel3.add(jRadioButton3);
		jPanel3.add(jRadioButton4);

		container.add(jPanel1);
		container.add(jPanel2);
		container.add(jPanel3);
		container.add(jButton);
		container.setBackground(Color.cyan);

		jFrame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		jFrame.setSize(510, 500);
		jFrame.setLocation(300, 300);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
	}
}
