
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;

import org.jdatepicker.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class RegFrame extends JFrame{
    private Container c;
    private JLabel title;
    private JLabel nik;
    private JTextField tNik;
    private JLabel name;
    private JTextField tName;
    private JLabel tempatLahir;
    private JTextField tTempatLahir;
    private JLabel tanggalLahir;
    private JDatePickerImpl dTanggalLahir; 
    private JLabel kelamin;
    private JRadioButton pria;
    private JRadioButton wanita;
    private JLabel golDarah;
    private JRadioButton gola;
    private JRadioButton golb;
    private JRadioButton golab;
    private JRadioButton golo;
    private JLabel alamat;
    private JTextField tAlamat;
    private JLabel rtrw;
    private JTextField tRtrw;
    private JLabel keldesa;
    private JTextField tKeldesa;
    private JLabel kec;
    private JTextArea tKec;
    private JLabel agama;
    private JComboBox tAgama;
    private JLabel statusKawin;
    private JComboBox tStatusKawin;
    private JLabel pekerjaan;
    private JCheckBox karyawanSwasta;
    private JCheckBox pns;
    private JCheckBox wiraswasta;
    private JCheckBox akademisi;
    private JCheckBox pengangguran;
    private JLabel kewarganegaraan;
    private JRadioButton wni;
    private JRadioButton wna;
    private JTextField tWna;
    private JLabel foto;
    private JButton openFoto;
    private JFileChooser filePhoto;
    private JLabel fotoFilePath;
    private JLabel ttd;
    private JButton openTtd;
    private JFileChooser fileTtd;
    private JLabel ttdFilePath;
    private JLabel berlakuHingga;
    private JTextField tBerlakuHingga;
    private JLabel kotaPembuatan;
    private JTextField tKotaPembuatan;
    private JLabel tanggalPembuatan;
    private JDatePicker pTanggalPembuatan;
    private JButton insert;

    private String listAgama[] = {"Kristen", "Katolik", "Muslim", "Buddha", "Hindu"};
    private String listStatusKawin[] = {"Belum Menikah", "Menikah", "Janda/Duda"};

    public RegFrame(){
        setTitle("Form Input Data Penduduk");
        setBounds(300, 90, 600, 1200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Form Input Data Penduduk");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(600, 30);
        title.setLocation(125, 30);
        c.add(title);

        nik = new JLabel("NIK");
        nik.setFont(new Font("Arial", Font.PLAIN, 15));
        nik.setSize(150,20);
        nik.setLocation(25,100);
        c.add(nik);

        tNik = new JTextField();
        tNik.setFont(new Font("Arial", Font.PLAIN, 15));
        tNik.setSize(200,20);
        tNik.setLocation(180,100);
        c.add(tNik);

        name = new JLabel("Nama Lengkap");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(150,20);
        name.setLocation(25,125);
        c.add(name);

        tName = new JTextField();
        tName.setFont(new Font("Arial", Font.PLAIN, 15));
        tName.setSize(200,20);
        tName.setLocation(180,125);
        c.add(tName);

        tempatLahir = new JLabel("Tempat Lahir");
        tempatLahir.setFont(new Font("Arial", Font.PLAIN, 15));
        tempatLahir.setSize(150,20);
        tempatLahir.setLocation(25,150);
        c.add(tempatLahir);

        tTempatLahir = new JTextField();
        tTempatLahir.setFont(new Font("Arial", Font.PLAIN, 15));
        tTempatLahir.setSize(200,20);
        tTempatLahir.setLocation(180,150);
        c.add(tTempatLahir);

        tanggalLahir = new JLabel("Tanggal Lahir");
        tanggalLahir.setFont(new Font("Arial", Font.PLAIN, 15));
        tanggalLahir.setSize(150,20);
        tanggalLahir.setLocation(25,180);
        c.add(tanggalLahir);

        /* 
        JDateComponentFactory fac = new JDateComponentFactory();
        JDatePickerImpl datePicker = (JDatePickerImpl) fac.createJDatePicker();*/
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        dTanggalLahir = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        System.out.println(dTanggalLahir.getJFormattedTextField());
        dTanggalLahir.setBounds(200, 200, 200, 50);
        dTanggalLahir.setLocation(180,175);
        c.add(dTanggalLahir);


        setVisible(true);

    }

    


    
}
