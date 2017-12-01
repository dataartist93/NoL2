package com.nol2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class TicketView extends JFrame {

	public JButton bt_EnterTicket, bt_ThemeTicket, bt_FreeTicket, bt_pay, bt_cancle;
	public JTable table;
	public JScrollPane scrol_table;
	public DefaultTableModel dtm;
	JLabel la_priceAll;
	DefaultTableCellRenderer dctr;
	TableColumnModel tcm;

	public TicketView() {

		setTitle("티켓주문창");

		bt_FreeTicket = new JButton("자유이용권");
		bt_EnterTicket = new JButton("입장권");
		bt_ThemeTicket = new JButton("테마이용권");

		la_priceAll = new JLabel("총 주문금액 :");
		bt_pay = new JButton("결제");
		bt_cancle = new JButton("취소");

		Object[][] data = new Object[0][5];
		Object[] columnNames = { "티켓종류", "구분", "수량", "가격", "날짜" };
		dtm = new DefaultTableModel(data, columnNames);
		table = new JTable(dtm);
		scrol_table = new JScrollPane(table);
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
		table.setRowSorter(sorter);

		dctr = new DefaultTableCellRenderer();
		dctr.setHorizontalAlignment(SwingConstants.CENTER);
		tcm = table.getColumnModel();
		for (int i = 0; i < columnNames.length; i++) {
			tcm.getColumn(i).setCellRenderer(dctr);
		}
	    
	    
	    bt_FreeTicket.setBounds(95, 134, 604, 73);
	    bt_EnterTicket.setBounds(95, 304, 604, 71);
	    bt_ThemeTicket.setBounds(95, 219, 604, 73);
	    
	    scrol_table.setBounds(95, 387, 604, 318);
	    bt_pay.setBounds(95, 731, 214, 50);
	    bt_cancle.setBounds(485, 731, 214, 50);
	    
	    getContentPane().setLayout(null);
	    getContentPane().add(bt_FreeTicket);
	    getContentPane().add(bt_EnterTicket);
	    getContentPane().add(bt_ThemeTicket);
	    getContentPane().add(scrol_table);
	    getContentPane().add(bt_pay);
	    getContentPane().add(bt_cancle);
	    
	    setBounds(400,100,800,850);
	    //setVisible(true);
	    setResizable(false);
	   // setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}//생성자


	
	public static void main(String[] args) {
		new TicketView();
	}
}
