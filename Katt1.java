import javax.swing.JOptionPane;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class Katt1 {
    public static void main(String[] args) {
        
        String greeting = JOptionPane.showInputDialog("k");
        for(int i = 0; i + 1 <= Message.lenght(); i++){
        char c = Message.CharAt(i);
        
        }
    }
}
