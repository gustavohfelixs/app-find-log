
package leitor;

import javax.swing.JOptionPane;

public class LeitorTeste {
    public static void main(String[] args) {
      String Dir,login, senha;
      Dir = "C:\\Users\\23162795\\Downloads\\login.csv";
      login = JOptionPane.
        showInputDialog("Digite o usuario \\: ");
      senha = JOptionPane.
        showInputDialog("Digite a Senha \\: ");
      LeitorCSV arq = new LeitorCSV();
      boolean a = arq.abreCSV(Dir,login,senha);
       if (a) {
           JOptionPane.showInputDialog("Usúario e/ou senha corretos"); 
        } else {
            JOptionPane.showInputDialog("Usúario e/ou senha incorretos");
        }
     
    }
}
