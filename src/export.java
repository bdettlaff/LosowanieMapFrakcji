import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.filechooser.FileSystemView;


public class export {
     
     public String pobierzPulpit ()
     {
    	 String path = new String();
    	 File sciezka = FileSystemView.getFileSystemView().getHomeDirectory();
    	 path=sciezka.getAbsolutePath().toString();
    	 return path;
     }
     
     public void zapiszPlik(String sciezka, String mapa, String frakcjaPierwsza, String frakcjaDruga) throws FileNotFoundException
     {
    	 PrintWriter zapis = new PrintWriter(sciezka+"\\M&F.txt");
    	 zapis.println("<b>Frakcje:</b><i>" + frakcjaPierwsza + "</i>" +" vs. "+ "<i>" + frakcjaDruga + "</i>");
    	 zapis.println("<b>Mapa:</b><i>"+ mapa + "</i>");
    	 zapis.close();
     }
    
}
