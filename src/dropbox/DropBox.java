package dropbox;

import dropbox.GUI.GUI;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DropBox
{
    public static void main(String[] args) throws IOException
    {
       
        GUI gui = GUI.getForm();
        gui.loadPanel("splash");
        gui.openForm();
        
        //long t= System.currentTimeMillis();
        //long end = t+2000;
        //while(System.currentTimeMillis() < end); 
        
        gui.loadPanel("login");
       
        
          
        /*File file = new File("./src/CloudStorage/123.txt");
        
        if(!Desktop.isDesktopSupported())
        {
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists())
            desktop.open(file);
        else
        {
            file.createNewFile();
            desktop.open(file);
        }
        
        file.renameTo(new File("./src/CloudStorage/223.txt"));
      */
        
          
    }
    
}
