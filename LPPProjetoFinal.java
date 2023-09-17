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
    }
}
