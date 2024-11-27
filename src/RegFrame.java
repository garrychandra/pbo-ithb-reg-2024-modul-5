
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;

import javax.swing.*;

import org.jdatepicker.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class RegFrame extends JFrame implements ActionListener{
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
    private JTextField tKec;
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
    private File fotoFile;
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
        this.setTitle("Form Input Data Penduduk");
        this.setBounds(300, 90, 600, 1200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        title = new JLabel("Form Input Data Penduduk");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(600, 30);
        title.setLocation(125, 30);
        this.add(title);

        nik = new JLabel("NIK");
        nik.setFont(new Font("Arial", Font.PLAIN, 15));
        nik.setSize(150,20);
        nik.setLocation(25,100);
        this.add(nik);

        tNik = new JTextField();
        tNik.setFont(new Font("Arial", Font.PLAIN, 15));
        tNik.setSize(200,20);
        tNik.setLocation(180,100);
        this.add(tNik);

        name = new JLabel("Nama Lengkap");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(150,20);
        name.setLocation(25,125);
        this.add(name);

        tName = new JTextField();
        tName.setFont(new Font("Arial", Font.PLAIN, 15));
        tName.setSize(200,20);
        tName.setLocation(180,125);
        this.add(tName);

        tempatLahir = new JLabel("Tempat Lahir");
        tempatLahir.setFont(new Font("Arial", Font.PLAIN, 15));
        tempatLahir.setSize(150,20);
        tempatLahir.setLocation(25,150);
        this.add(tempatLahir);

        tTempatLahir = new JTextField();
        tTempatLahir.setFont(new Font("Arial", Font.PLAIN, 15));
        tTempatLahir.setSize(200,20);
        tTempatLahir.setLocation(180,150);
        this.add(tTempatLahir);

        tanggalLahir = new JLabel("Tanggal Lahir");
        tanggalLahir.setFont(new Font("Arial", Font.PLAIN, 15));
        tanggalLahir.setSize(150,20);
        tanggalLahir.setLocation(25,180);
        this.add(tanggalLahir);

        /* 
        JDateComponentFactory fac = new JDateComponentFactory();
        JDatePickerImpl datePicker = (JDatePickerImpl) fac.createJDatePicker();*/
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        dTanggalLahir = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        dTanggalLahir.setSize(200, 30);
        dTanggalLahir.setLocation(180,175);
        this.add(dTanggalLahir);
        
        kelamin = new JLabel("Jenis Kelamin");
        kelamin.setFont(new Font("Arial", Font.PLAIN, 15));
        kelamin.setSize(150,20);
        kelamin.setLocation(25,210);
        this.add(kelamin);

        pria = new JRadioButton("Pria");
        pria.setLocation(180,210);
        pria.setSize(75,20);
        wanita = new JRadioButton("Wanita");
        wanita.setLocation(260,210);
        wanita.setSize(75,20);
        ButtonGroup grupKelamin = new ButtonGroup();
        grupKelamin.add(pria);
        grupKelamin.add(wanita);
        this.add(pria);
        this.add(wanita);

        golDarah = new JLabel("Golongan Darah");
        golDarah.setFont(new Font("Arial", Font.PLAIN, 15));
        golDarah.setSize(150,20);
        golDarah.setLocation(25,235);
        this.add(golDarah);

        gola = new JRadioButton("A");
        gola.setLocation(180,235);
        gola.setSize(40,20);
        golb = new JRadioButton("B");
        golb.setLocation(225,235);
        golb.setSize(40,20);
        golab = new JRadioButton("AB");
        golab.setLocation(270,235);
        golab.setSize(50,20);
        golo = new JRadioButton("O");
        golo.setLocation(325,235);
        golo.setSize(40,20);
        ButtonGroup golDarahGrup = new ButtonGroup();
        golDarahGrup.add(gola);
        golDarahGrup.add(golb);
        golDarahGrup.add(golab);
        golDarahGrup.add(golo);
        this.add(gola);
        this.add(golb);
        this.add(golab);
        this.add(golo);

        alamat = new JLabel("Alamat");
        alamat.setFont(new Font("Arial", Font.PLAIN, 15));
        alamat.setSize(150,20);
        alamat.setLocation(25,260);
        this.add(alamat);

        tAlamat = new JTextField();
        tAlamat.setFont(new Font("Arial", Font.PLAIN, 15));
        tAlamat.setSize(200,20);
        tAlamat.setLocation(180,260);
        this.add(tAlamat);

        rtrw = new JLabel("RT/RW");
        rtrw.setFont(new Font("Arial", Font.PLAIN, 15));
        rtrw.setSize(150,20);
        rtrw.setLocation(25,285);
        this.add(rtrw);

        tRtrw = new JTextField();
        tRtrw.setFont(new Font("Arial", Font.PLAIN, 15));
        tRtrw.setSize(200,20);
        tRtrw.setLocation(180,285);
        this.add(tRtrw);

        keldesa = new JLabel("Kel/Desa");
        keldesa.setFont(new Font("Arial", Font.PLAIN, 15));
        keldesa.setSize(150,20);
        keldesa.setLocation(25,310);
        this.add(keldesa);

        tKeldesa = new JTextField();
        tKeldesa.setFont(new Font("Arial", Font.PLAIN, 15));
        tKeldesa.setSize(200,20);
        tKeldesa.setLocation(180,310);
        this.add(tKeldesa);

        kec = new JLabel("Kecamatan");
        kec.setFont(new Font("Arial", Font.PLAIN, 15));
        kec.setSize(150,20);
        kec.setLocation(25,335);
        this.add(kec);

        tKec = new JTextField();
        tKec.setFont(new Font("Arial", Font.PLAIN, 15));
        tKec.setSize(200,20);
        tKec.setLocation(180,335);
        this.add(tKec);

        agama = new JLabel("Agama");
        agama.setFont(new Font("Arial", Font.PLAIN, 15));
        agama.setSize(150,20);
        agama.setLocation(25,360);
        this.add(agama);

        tAgama = new JComboBox(listAgama);
        tAgama.setSelectedIndex(0);
        tAgama.setLocation(180,360);
        tAgama.setSize(200,20);
        this.add(tAgama);

        statusKawin = new JLabel("Status Perkawinan");
        statusKawin.setFont(new Font("Arial", Font.PLAIN, 15));
        statusKawin.setSize(150,20);
        statusKawin.setLocation(25,385);
        this.add(statusKawin);

        tStatusKawin = new JComboBox(listStatusKawin);
        tStatusKawin.setSelectedIndex(0);
        tStatusKawin.setLocation(180,385);
        tStatusKawin.setSize(200,20);
        this.add(tStatusKawin);

        pekerjaan = new JLabel("Pekerjaan");
        pekerjaan.setFont(new Font("Arial", Font.PLAIN, 15));
        pekerjaan.setSize(150,20);
        pekerjaan.setLocation(25,410);
        this.add(pekerjaan);

        karyawanSwasta = new JCheckBox("Karyawan Swasta");
        karyawanSwasta.setFont(new Font("Arial", Font.PLAIN, 15));
        karyawanSwasta.setBounds(175,410, 150,20);
        this.add(karyawanSwasta);

        pns = new JCheckBox("Pegawai Negri Sipil");
        pns.setFont(new Font("Arial", Font.PLAIN, 15));
        pns.setBounds(175,435, 150,20);
        this.add(pns);

        wiraswasta = new JCheckBox("Wiraswasta");
        wiraswasta.setFont(new Font("Arial", Font.PLAIN, 15));
        wiraswasta.setBounds(175,460, 150,20);
        this.add(wiraswasta);

        akademisi = new JCheckBox("Akademisi");
        akademisi.setFont(new Font("Arial", Font.PLAIN, 15));
        akademisi.setBounds(175,485, 150,20);
        this.add(akademisi);

        pengangguran = new JCheckBox("Pengangguran");
        pengangguran.setFont(new Font("Arial", Font.PLAIN, 15));
        pengangguran.setBounds(175,510, 150,20);
        pengangguran.addActionListener(this);
        this.add(pengangguran);


        









/*/
        foto = new JLabel("Foto");
        foto.setFont(new Font("Arial", Font.PLAIN, 15));
        foto.setSize(150,20);
        foto.setLocation(25,410);
        this.add(foto);

        openFoto = new JButton("Open File");
        openFoto.addActionListener(this);
        openFoto.setLocation(180,410);
        openFoto.setSize(100,20);
        this.add(openFoto);

        fotoFilePath = new JLabel("No File Selected");
        fotoFilePath.setFont(new Font("Arial", Font.PLAIN, 15));
        fotoFilePath.setSize(150,20);
        fotoFilePath.setLocation(285,410);
        this.add(fotoFilePath);
        */

        

        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == openFoto){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                fotoFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                fotoFilePath.setText(fotoFile.getName());
            }
        }

        if(e.getSource() == pengangguran){
            wiraswasta.setEnabled(false);
            akademisi.setEnabled(false);
            pns.setEnabled(false);
            karyawanSwasta.setEnabled(false);
        }


    }
    
    


    
}
