package _p147_TercerExamenParcial;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import javax.swing.text.html.HTML;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Frame;

public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> Datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblSexo, lblEC, lblDesc,lblSalario;
    JTextField txtNombre, txtEdad, txtEC, txtDesc, txtSalario, txtSexo;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;

    public App(){
        super("Datos de los Jugadores");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAcercade = new JMenuItem("Acerca de...");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
    
    jdlAcercaDe = new JDialog(this, "Acerca de ..");
    jdlAcercaDe.setSize(300,250);
    jdlAcercaDe.setLocationRelativeTo(null);
    lblDatos = new JLabel("<HTML>Programacion Orientada a Objetos<br> Carlos Alfredo Guzmán Garcia</HTML>",JLabel.CENTER);
    lblDatos.setFont(new Font("Times New Roman", Font.BOLD,18));
    jdlAcercaDe.add(lblDatos);

    setLayout(new GridLayout(2, 1, 0, 0));

    pnlTabla = new JPanel();
    getContentPane().add(pnlTabla);
    spane = new JScrollPane();
    pnlTabla.add(spane);
    table = new JTable();
    table.getTableHeader().setBackground(Color.green);
    table.getTableHeader().setForeground(Color.black);
    spane.setViewportView(table);

    modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Sexo","Estado Civil", "Descripcion", "Salario"});
    table.setModel(modelo);

    pnlDatos = new JPanel();
    getContentPane().add(pnlDatos);
    pnlDatos.setLayout(new GridLayout(4,2,0,0));
    lblNombre = new JLabel("Nombre");
    lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
    txtNombre = new JTextField();
    pnlDatos.add(lblNombre);
    pnlDatos.add(txtNombre);
    lblEdad = new JLabel("Edad");
    lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
    txtEdad = new JTextField();
    pnlDatos.add(lblEdad);
    pnlDatos.add(txtEdad);
    lblSexo = new JLabel("Sexo");
    lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
    txtSexo = new JTextField();
    pnlDatos.add(lblSexo);
    pnlDatos.add(txtSexo);
    lblEC = new JLabel("Estado Civil");
    lblEC.setHorizontalAlignment(SwingConstants.RIGHT);
    txtEC = new JTextField();
    pnlDatos.add(lblEC);
    pnlDatos.add(txtEC);
    lblDesc = new JLabel("Descripcion");
    lblDesc.setHorizontalAlignment(SwingConstants.RIGHT);
    txtDesc = new JTextField();
    pnlDatos.add(lblDesc);
    pnlDatos.add(txtDesc);
    lblSalario = new JLabel("Salario");
    lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
    txtSalario = new JTextField();
    pnlDatos.add(lblSalario);
    pnlDatos.add(txtSalario);
        }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==smnSalir) {
            dispose();
        } else if(e.getSource()==smnAcercade){
            jdlAcercaDe.setVisible(true);
        }
    }
    public void cargarDatos(){
        Object[] obj = new Object[4];
        for(int i=0; i<Datos.size() ; i++){
            obj[0] = Datos.get(i).getNombre();
            obj[1] = Datos.get(i).getEdad();
            obj[2] = Datos.get(i).getSexo();
            obj[3] = Datos.get(i).getEC();
            obj[4] = Datos.get(i).getDesc();
            obj[5] = Datos.get(i).getSalario();
            modelo.addRow(obj);
        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.Datos = Util.inicializarDatos();
        app.cargarDatos();
    }
}
