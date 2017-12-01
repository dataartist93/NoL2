package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PrepassSmView extends JFrame {
	public JButton bt_reset, bt_submit;
	public JTable table;
	public JScrollPane scroll;
	public DefaultTableModel dtm;

	public PrepassSmView() {
		setTitle("프리패스 내역");

		bt_reset = new JButton("예약취소");
		bt_submit = new JButton("확인");

		Object[][] data = new Object[0][3];
		Object[] columNames = { "놀이기구명", "탑승시간", "탑승인원" };
		dtm = new DefaultTableModel(data, columNames);
		table = new JTable(dtm);
		scroll = new JScrollPane(table);
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
		table.setRowSorter(sorter);

		bt_reset.setBounds(165, 328, 90, 25);
		bt_submit.setBounds(34, 328, 90, 25);
		scroll.setBounds(14, 12, 266, 292);

		setBounds(350, 200, 300, 414);
		getContentPane().setLayout(null);
		getContentPane().add(bt_submit);
		getContentPane().add(bt_reset);
		getContentPane().add(scroll);

		//setVisible(true);
		setResizable(false);
	}

	public void showMsg(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}// showMsg

}
