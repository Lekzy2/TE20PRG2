import javax.swing.JOptionPane;

public class terapi {
    public static void main(String[] args) {

        
        String [] random = { "kys", "uninstall", "garbage", "din åsikter är väldigt fel, fy på dig", "challanger"
        , "idk", "dont care", "leave me alone", "your not worthy of my time", "10/10 would not go again"};


        int x = (int) Math.floor((Math.random()* 10) + 1);

        JOptionPane.showInputDialog("Moral support - the M");

        for (int i = 0; i < 1; i++) {
            JOptionPane.showMessageDialog( null, random[x]);
        }
        
    }
}
