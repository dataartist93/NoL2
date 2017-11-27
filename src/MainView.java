import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;


public class MainView extends JFrame {//implements Runnable {
   JLabel la_time;
   public JButton bt_admin;
   // JPanel menu1p, menu2p, menu3p, menu4p, menu5p, menu6p, menu7p, menu8p;
   public JButton bt_menu1, bt_menu2, bt_menu3, bt_menu4, bt_menu5, bt_menu6, bt_menu7, bt_menu8;
   public JLabel la_menu1, la_menu2, la_menu3, la_menu4, la_menu5, la_menu6, la_menu7, la_menu8;
   JTextField tf_count1, tf_count2, tf_count3, tf_count4, tf_count5, tf_count6, tf_count7, tf_count8;
   public JLabel la_price1, la_price2, la_price3, la_price4, la_price5, la_price6, la_price7, la_price8;
   public JTable table;
   public JScrollPane scrol_table;
   public DefaultTableModel dtm;
   public JLabel la_count1, la_count2, la_count3, la_count4, la_count5, la_count6, la_count7, la_count8;

   public JLabel la_priceAll, la_result;
   public JButton bt_pay, bt_cancelMenu, bt_cancelAll;
   public ImageIcon icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8;
   DefaultTableCellRenderer dctr;
   TableColumnModel tcm;
   
   public MainView() { // 배열써서 일괄적으

      setTitle("MainView");

      
      setLayout(null);
      bt_admin = new JButton("관리자"); 
      
      bt_admin.setBounds(695, 35, 80, 30);

      icon1 = new ImageIcon("");
      icon2 = new ImageIcon("");
      icon3 = new ImageIcon("");
      icon4 = new ImageIcon("");
      icon5 = new ImageIcon("");
      icon6 = new ImageIcon("");
      icon7 = new ImageIcon("");
      icon8 = new ImageIcon("");

      bt_menu1 = new JButton("", icon1);
      bt_menu2 = new JButton("", icon2);
      bt_menu3 = new JButton("", icon3);
      bt_menu4 = new JButton("", icon4);
      bt_menu5 = new JButton("", icon5);
      bt_menu6 = new JButton("", icon6);
      bt_menu7 = new JButton("", icon7);
      bt_menu8 = new JButton("", icon8);
      
      // 피자= 피자헛, 사이드디시=미스터피자, 음료=피자헛
      la_menu1 = new JLabel(""); // 8
      la_menu2 = new JLabel(""); // 7
      la_menu3 = new JLabel(""); // 6
      la_menu4 = new JLabel(""); // 6
      la_menu5 = new JLabel(""); // 8
      la_menu6 = new JLabel(""); // 9
      la_menu7 = new JLabel(""); // 9
      la_menu8 = new JLabel(""); // 8

      la_price1 = new JLabel("");
      la_price2 = new JLabel("");
      la_price3 = new JLabel("");
      la_price4 = new JLabel("");
      la_price5 = new JLabel("");
      la_price6 = new JLabel("");
      la_price7 = new JLabel("");
      la_price8 = new JLabel("");
      
      la_count1 = new JLabel("");
      la_count2 = new JLabel("");
      la_count3 = new JLabel("");
      la_count4 = new JLabel("");
      la_count5 = new JLabel("");
      la_count6 = new JLabel("");
      la_count7 = new JLabel("");
      la_count8 = new JLabel("");

      bt_menu1.add(la_menu1);
      bt_menu1.add(la_price1);
      bt_menu1.setBounds(35, 125, 155, 125);//+10,+55,-25,-25 
      la_menu1.setBounds(45, 255, 180, 30);// +20,+35
      la_price1.setBounds(125, 280, 60, 30);// +100,+30
      la_price1.setForeground(Color.yellow);

      bt_menu2.add(la_menu2);
      bt_menu2.add(la_price2);
      bt_menu2.setBounds(225, 125, 155, 125);
      la_menu2.setBounds(235, 255, 180, 30);
      la_price2.setBounds(315, 280, 60, 30);
      la_price2.setForeground(Color.yellow);

      bt_menu3.add(la_menu3);
      bt_menu3.add(la_price3);
      bt_menu3.setBounds(415, 125, 155, 125);
      la_menu3.setBounds(425, 255, 180, 30);
      la_price3.setBounds(505, 280, 60, 30);
      la_price3.setForeground(Color.yellow);

      bt_menu4.add(la_menu4);
      bt_menu4.add(la_price4);
      bt_menu4.setBounds(605, 125, 155, 125);
      la_menu4.setBounds(615, 255, 180, 30);
      la_price4.setBounds(695, 280, 60, 30);
      la_price4.setForeground(Color.yellow);

      bt_menu5.add(la_menu5);
      bt_menu5.add(la_price5);
      bt_menu5.setBounds(35, 345, 155, 125);//+10,+35,-25,-25
      la_menu5.setBounds(45, 475, 180, 30);// +20,+15
      la_price5.setBounds(125, 500, 60, 30);//+100+10
      la_price5.setForeground(Color.yellow);

      bt_menu6.add(la_menu6);
      bt_menu6.add(la_price6);
      bt_menu6.setBounds(225, 345, 155, 125);
      la_menu6.setBounds(235, 475, 180, 30);
      la_price6.setBounds(315, 500, 60, 30);
      la_price6.setForeground(Color.yellow);

      bt_menu7.add(la_menu7);
      bt_menu7.add(la_price7);
      bt_menu7.setBounds(415, 345, 155, 125);
      la_menu7.setBounds(425, 475, 180, 30);
      la_price7.setBounds(505, 500, 60, 30);
      la_price7.setForeground(Color.yellow);

      bt_menu8.add(la_menu8);
      bt_menu8.add(la_price8);
      bt_menu8.setBounds(605, 345, 155, 125);
      la_menu8.setBounds(615, 475, 180, 30);
      la_price8.setBounds(695, 500, 60, 30);
      la_price8.setForeground(Color.yellow);

      bt_menu1.setVisible(false);
      bt_menu2.setVisible(false);
      bt_menu3.setVisible(false);
      bt_menu4.setVisible(false);
      bt_menu5.setVisible(false);
      bt_menu6.setVisible(false);
      bt_menu7.setVisible(false);
      bt_menu8.setVisible(false);

      Object[][] data = new Object[0][4];
      Object[] columnNames = { "번호", "메뉴", "수량", "가격" };
      dtm = new DefaultTableModel(data, columnNames);
      table = new JTable(dtm);
      scrol_table = new JScrollPane(table);
      table.getColumnModel().getColumn(0).setPreferredWidth(5);
      table.getColumnModel().getColumn(1).setPreferredWidth(400);
      table.getColumnModel().getColumn(2).setPreferredWidth(5);
      table.getColumnModel().getColumn(3).setPreferredWidth(100);
      
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
		table.setRowSorter(sorter);

      dctr = new DefaultTableCellRenderer();
      dctr.setHorizontalAlignment(SwingConstants.CENTER);
      tcm = table.getColumnModel();
      for(int i=0; i<columnNames.length; i++) {
         tcm.getColumn(i).setCellRenderer(dctr);
      }
      
      scrol_table.setBounds(25, 585, 750, 180);//+0,+25

      la_priceAll = new JLabel("총 주문금액 :");
      la_result = new JLabel("");
      bt_cancelMenu = new JButton("선택 취소");
      bt_cancelAll = new JButton("전체 취소");
      bt_pay = new JButton("결제");

      la_priceAll.setBounds(35, 785, 110, 100);
      la_priceAll.setForeground(Color.white);
      la_result.setBounds(180, 785, 110, 100); 
      la_result.setForeground(Color.white);
      bt_cancelMenu.setBounds(325, 805, 120, 60); // 총공간:800-300=500, 여백:500-360=140-60=80
      bt_cancelAll.setBounds(455, 805, 120, 60);
      bt_pay.setBounds(585, 805, 190, 60); //y+10 w+50

      add(bt_admin);      
      add(bt_menu1);      add(bt_menu2);      add(bt_menu3);      add(bt_menu4);
      add(la_menu1);      add(la_menu2);      add(la_menu3);      add(la_menu4);
      add(la_price1);     add(la_price2);     add(la_price3);     add(la_price4);
      
      add(bt_menu5);      add(bt_menu6);      add(bt_menu7);      add(bt_menu8);
      add(la_menu5);      add(la_menu6);      add(la_menu7);      add(la_menu8);
      add(la_price5);     add(la_price6);     add(la_price7);     add(la_price8);

      add(scrol_table);

      add(la_priceAll);      add(la_result);

      add(bt_cancelMenu);      add(bt_pay);      add(bt_cancelAll);

      setBounds(300, 50, 800, 950);
      setResizable(false);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
	new MainView();
}
   
}