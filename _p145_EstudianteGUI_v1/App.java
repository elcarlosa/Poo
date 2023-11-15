package _p145_EstudianteGUI_v1;

import javax.crypto.spec.DESKeySpec;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.ArrayList;

public abstract class App extends JFrame implements ActionListener {
    ArrayList<Estudiante> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir,smnAcercade, smnGuardar;
    JPanel pnlTabla,pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblPeso,lblCorreo;
    JTextField txtNombre,txtEdad,txtPeso,txtCorreo;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    
    public App(){
        super("Datos de Estudiantes");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        smnAbrir=new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        smnSalir = new JMenuItem();
        smnSalir.addActionListener(this);
        smnGuardar = new JMenuItem("Salir");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAcercade = new JMenuItem("Acerca de...");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
    jdlAcercaDe = new JDialog(this,"Acerca de..");
    jdlAcercaDe.setSize(300,250);
    jdlAcercaDe.setLocationRelativeTo(null);
    lblDatos = new JLabel("<html>Programación Oriendada a Objetos I<br>Carlos ALfredo GG</html>",JLabel.CENTER);
    lblDatos.setFont(new Font("Times New Roman",Font.BOLD,18));
    jdlAcercaDe.add(lblDatos);

    setLayout(new GridLayout(2,1,0,0));

    pnlTabla = new JPanel();
    getContentPane().add(pnlTabla);
    spane = new JScrollPane();
    pnlTabla.add(spane);
    table = new JTable();
    table.getTableHeader().setBackground(Color.yellow);
    table.getTableHeader().setForeground(Color.black);
    spane.setViewportView(table);

    modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});
    table.setModel(modelo);

    pnlDatos = new JPanel();
    getContentPane().add(pnlDatos);
    pnlDatos.setLayout(new GridLayout(4, 2, 0,0));
    lblNombre = new JLabel("Nombre");
    }

}