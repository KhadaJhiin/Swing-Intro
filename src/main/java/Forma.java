import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;


    //We created the constructor
    public Forma(){
        inicializarForma();
//        campoTexto.addActionListener(e -> {
//            replicarTexto();
//        });

        //Method to duplicate text without needing to enter
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    //We created the method
    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    //We created method tex replication

    private void replicarTexto(){
        this.replicadorLabel.setText(this.campoTexto.getText());
    }

    //We created the main method
    public static void main(String[] args) {

        //We agreed the dark mode
        FlatDarculaLaf.setup();

        Forma forma = new Forma();
        forma.setVisible(true);

    }

}
