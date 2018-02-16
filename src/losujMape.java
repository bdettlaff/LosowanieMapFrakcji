import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class losujMape extends JFrame implements ActionListener
{

	JButton bRandomMF; 
	JButton bShowFactions;
	JButton bShowMaps;
	JButton bExport;
	JButton bInstruction;
	JButton bExit;
	JLabel lRandomMF;
	JLabel lInstruction;
	
	
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
					
			lInstruction = new JLabel("INSTRUKCJA");
			lInstruction.setBounds(275, 75, 150, 50);
			add(lInstruction);
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
				
			}
			else if(source==bShowFactions)
			{
				
			}
			else if(source==bExport)
			{
				
			}	
			else if(source==bInstruction)
			{
				lInstruction.setText("Tutaj bêdzie instrukcja \n ");
						
			}
		}
		
		
}



