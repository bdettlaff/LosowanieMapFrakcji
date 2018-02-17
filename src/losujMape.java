import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class losujMape extends JFrame implements ActionListener
{

	JButton bRandomMF; 
	JButton bShowFactions;
	JButton bShowMaps;
	JButton bExport;
	JButton bInstruction;
	JButton bExit;
	JLabel lHeader;
	JLabel lVersion;
	JTextArea taInstruction;
	JTable tFactions;
	JTable tMaps;
	
	
	
		public losujMape()
		{
			setSize(500,400);
			setTitle("M&F");
			setLayout(null);
			setResizable(false);
			
			bRandomMF = new JButton("Losuj mapy i frakcje");
			bRandomMF.setBounds(50, 100 , 150, 25);
			add(bRandomMF);
			bRandomMF.addActionListener(this);
			
			bShowFactions = new JButton("Poka¿ Frakcje");
			bShowFactions.setBounds(50, 130, 150, 25);
			add(bShowFactions);
			bShowFactions.addActionListener(this);
			
			bShowMaps = new JButton("Poka¿ Mapy");
			bShowMaps.setBounds(50, 160, 150, 25);
			add(bShowMaps);
			bShowMaps.addActionListener(this);
			
			bExport = new JButton("Eksport do TXT");
			bExport.setBounds(50, 190, 150, 25);
			add(bExport);
			bExport.addActionListener(this);
			
			bInstruction = new JButton("Instrukcja");
			bInstruction.setBounds(50, 220, 150, 25);
			add(bInstruction);
			bInstruction.addActionListener(this);
			
			bExit = new JButton("Wyjœcie");
			bExit.setBounds(50, 250, 150, 25);
			add(bExit);
			bExit.addActionListener(this);
					
			lHeader = new JLabel("MENU");
			lHeader.setBounds(325, 75, 150, 50);
			add(lHeader);
			
			lVersion = new JLabel("Wersja: 0.1");
			lVersion.setBounds(410, 325, 150, 50);
			add(lVersion);
			
			taInstruction = new JTextArea(10,15);
			taInstruction.setBounds(230, 110, 225, 200);
			taInstruction.setLineWrap(true);
			taInstruction.setVisible(false);
			add(taInstruction);
			
			
			pokazMapy pokazM = new pokazMapy();
			tMaps= new JTable(pokazM.tablica, pokazM.naglowek);
			tMaps.setBounds(230, 110, 225, 192);
			tMaps.setVisible(false);
			add(tMaps);
			
			pokazFrakcje pokazF = new pokazFrakcje();
			tFactions= new JTable(pokazF.tablica, pokazF.naglowek);
			tFactions.setBounds(230, 110, 225, 65);
			tFactions.setVisible(false);
			add(tFactions);
			
			
			
		}
		
		
		
		public static void main(String[] args) 
		{
			losujMape moje_okno = new losujMape();
			moje_okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			moje_okno.setVisible(true);					
		}



		@Override
		public void actionPerformed(ActionEvent event) 
		{
			Object source = event.getSource();
			if(source==bExit)
			{
				dispose();
			}
			else if(source==bRandomMF)
			{
				
			}
			else if(source==bShowMaps)
			{
				tMaps.setVisible(true);
				lHeader.setText("Mapy");
				
				taInstruction.setVisible(false);
				tFactions.setVisible(false);
				
			}
			else if(source==bShowFactions)
			{
				tFactions.setVisible(true);
				lHeader.setText("Frakcje");
				
				taInstruction.setVisible(false);
				tMaps.setVisible(false);
			}
			else if(source==bExport)
			{
				
			}	
			else if(source==bInstruction)
			{
				taInstruction.setVisible(true);
				lHeader.setText("Instrukcja");
				taInstruction.setText("Program s³u¿y do losowania map oraz \nfrakcji w grze Dzikie Pola. \n"
						+ "Poka¿ Mapy oraz Poka¿ Frakcje \nudostêpnia wszystkie mapy oraz frakcje, które s¹"
						+ "uwzglêdniane podczas \nlosowania. Po klikniêciu eksport do TXT, na pulpicie pojawia "
						+ "siê gotowy kod \nHTML do umieszczenia na stronie.");
				
				tMaps.setVisible(false);
				tFactions.setVisible(false);
			}
		}
		
		
}



