import javax.swing.JOptionPane;

public class Crypt {
  public static void main(String[] args) {
    // m = message k = key
    String m = JOptionPane.showInputDialog("sauce");
    String krypt = "";
    char k = ')';
    int i = Integer.parseInt(m);
    String n = Integer.toBinaryString(i);
    int b = Integer.parseInt(n);
    String tobinary = JOptionPane.showMessageDialog();
  }  
}



//*
//*Static int crypt(int m,int k){
//*  int c = m ^ k;
//*  return c;
//*}
//*String message = JOptionPane.showInputDialog("give us your semen sauece");
    

//*int i;
//*JOptionPane.showMessageDialog(Integer.toBinaryString(i)); *