package lpp.projetofinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class LPPProjetoFinal extends JFrame {

    public LPPProjetoFinal(){
        getContentPane().add(new InterfaceGrafica());
        setTitle("Gestão de Empresa");
        setSize(1250,850);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        LPPProjetoFinal obj = new LPPProjetoFinal();

        //ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();
        //listaFuncionarios.add(new Funcionarios("Teste1", 1, 1, "Teste1"));
        //listaFuncionarios.add(new Funcionarios("Teste2", 2, 2, "Teste2"));
        //listaFuncionarios.add(new Funcionarios("Teste3", 3, 3, "Teste3"));

        //System.out.println(listaFuncionarios);

        /*try {
            ObjectOutputStream cout = new ObjectOutputStream(
                    new FileOutputStream("dados.txt"));
            cout.writeObject(listaFuncionarios);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Funcionarios> listaFuncionarios2 = new ArrayList<>();

        try {
            ObjectInputStream cin = new ObjectInputStream(
                    new FileInputStream("dados.txt"));
            listaFuncionarios2 = (ArrayList) cin.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(listaFuncionarios2);*/
    }
}
