package com.org.zc;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UiDesign {
	JFrame jFrame = new JFrame("LockControl");
	Container container = jFrame.getContentPane();
	JPanel jPanel1 = new JPanel();
	JPanel jPanel2 = new JPanel();
	JPanel jPanel3 = new JPanel();

	public UiDesign() {
		jFrame.setLayout(null);
		jPanel1.setBounds(20, 40, 460, 130);
		jPanel2.setBounds(20, 190, 460, 130);
		jPanel3.setBounds(20, 340, 460, 100);

		jPanel1.setBorder(BorderFactory.createTitledBorder("ʱ���趨"));
		jPanel2.setBorder(BorderFactory.createTitledBorder("״̬��ʾ"));
		jPanel3.setBorder(BorderFactory.createTitledBorder("��ʱѡ��"));

		container.add(jPanel1);
		container.add(jPanel2);
		container.add(jPanel3);

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
