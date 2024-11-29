
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;
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
    ButtonGroup grupKelamin;
    private JLabel golDarah;
    private JRadioButton gola;
    private JRadioButton golb;
    private JRadioButton golab;
    private JRadioButton golo;
    ButtonGroup golDarahGrup;
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
    ButtonGroup wnButtonGroup;
    private JTextField tWna;
    private JLabel foto;
    private JButton openFoto;
    private File fotoFile;
    private JLabel fotoFilePath;
    private JLabel ttd;
    private JButton openTtd;
    private File fileTtd;
    private JLabel ttdFilePath;
    private JLabel berlakuHingga;
    private JTextField tBerlakuHingga;
    private JLabel kotaPembuatan;
    private JTextField tKotaPembuatan;
    private JLabel tanggalPembuatan;
    private JDatePickerImpl dTanggalPembuatan;
    private JButton insert;
    private String[] data = new String[19];

    private String listAgama[] = {"Kristen", "Katolik", "Muslim", "Buddha", "Hindu"};
    private String listStatusKawin[] = {"Belum Menikah", "Menikah", "Janda/Duda"};

    public RegFrame(){
        this.setTitle("Form Input Data Penduduk");
        this.setSize(430, 800);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        title = new JLabel("Form Input Data Penduduk");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(600, 30);
        title.setLocation(25, 30);
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
        pria.setActionCommand("Pria");
        wanita = new JRadioButton("Wanita");
        wanita.setLocation(260,210);
        wanita.setSize(75,20);
        wanita.setActionCommand("Wanita");
        grupKelamin = new ButtonGroup();
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
        gola.setActionCommand("A");
        golb = new JRadioButton("B");
        golb.setLocation(225,235);
        golb.setSize(40,20);
        golb.setActionCommand("B");
        golab = new JRadioButton("AB");
        golab.setLocation(270,235);
        golab.setSize(50,20);
        golab.setActionCommand("AB");
        golo = new JRadioButton("O");
        golo.setLocation(325,235);
        golo.setSize(40,20);
        golo.setActionCommand("O");
        golDarahGrup = new ButtonGroup();
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

        kewarganegaraan = new JLabel("Kewarganegaraan");
        kewarganegaraan.setFont(new Font("Arial", Font.PLAIN, 15));
        kewarganegaraan.setSize(150,20);
        kewarganegaraan.setLocation(25,535);
        this.add(kewarganegaraan);

        wni = new JRadioButton("WNI");
        wni.setLocation(180,535);
        wni.setSize(75,20);
        wni.setActionCommand("WNI");
        wni.addActionListener(this);
        wna = new JRadioButton("WNA");
        wna.setActionCommand("WNA");
        wna.setLocation(260,535);
        wna.setSize(75,20);
        wna.addActionListener(this);

        tWna = new JTextField();
        tWna.setFont(new Font("Arial", Font.PLAIN, 15));
        tWna.setSize(150,20);
        tWna.setLocation(180,560);
        tWna.setVisible(false);
        this.add(tWna);

        wnButtonGroup = new ButtonGroup();
        wnButtonGroup.add(wni);
        wnButtonGroup.add(wna);
        this.add(wni);
        this.add(wna);

        foto = new JLabel("Foto");
        foto.setFont(new Font("Arial", Font.PLAIN, 15));
        foto.setSize(150,20);
        foto.setLocation(25,585);
        this.add(foto);

        openFoto = new JButton("Open File");
        openFoto.addActionListener(this);
        openFoto.setLocation(180,585);
        openFoto.setSize(100,20);
        this.add(openFoto);

        fotoFilePath = new JLabel("No File Selected");
        fotoFilePath.setFont(new Font("Arial", Font.PLAIN, 15));
        fotoFilePath.setSize(150,20);
        fotoFilePath.setLocation(285,585);
        this.add(fotoFilePath);

        
        ttd = new JLabel("Foto");
        ttd.setFont(new Font("Arial", Font.PLAIN, 15));
        ttd.setSize(150,20);
        ttd.setLocation(25,610);
        this.add(ttd);

        openTtd = new JButton("Open File");
        openTtd.addActionListener(this);
        openTtd.setLocation(180,610);
        openTtd.setSize(100,20);
        this.add(openTtd);

        ttdFilePath = new JLabel("No File Selected");
        ttdFilePath.setFont(new Font("Arial", Font.PLAIN, 15));
        ttdFilePath.setSize(150,20);
        ttdFilePath.setLocation(285,610);
        this.add(ttdFilePath);

        berlakuHingga = new JLabel("Berlaku Hingga");
        berlakuHingga.setFont(new Font("Arial", Font.PLAIN, 15));
        berlakuHingga.setSize(150,20);
        berlakuHingga.setLocation(25,635);
        this.add(berlakuHingga);

        tBerlakuHingga = new JTextField();
        tBerlakuHingga.setFont(new Font("Arial", Font.PLAIN, 15));
        tBerlakuHingga.setSize(200,20);
        tBerlakuHingga.setLocation(180,635);
        this.add(tBerlakuHingga);

        kotaPembuatan = new JLabel("Kota Pembuatan");
        kotaPembuatan.setFont(new Font("Arial", Font.PLAIN, 15));
        kotaPembuatan.setSize(150,20);
        kotaPembuatan.setLocation(25,660);
        this.add(kotaPembuatan);

        tKotaPembuatan = new JTextField();
        tKotaPembuatan.setFont(new Font("Arial", Font.PLAIN, 15));
        tKotaPembuatan.setSize(200,20);
        tKotaPembuatan.setLocation(180,660);
        this.add(tKotaPembuatan);

        tanggalPembuatan = new JLabel("Tanggal Pembuatan");
        tanggalPembuatan.setFont(new Font("Arial", Font.PLAIN, 15));
        tanggalPembuatan.setSize(150,20);
        tanggalPembuatan.setLocation(25,685);
        this.add(tanggalPembuatan);

        UtilDateModel model2 = new UtilDateModel();
        Properties p2 = new Properties();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p2);
        dTanggalPembuatan = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
        dTanggalPembuatan.setSize(200, 30);
        dTanggalPembuatan.setLocation(180,685);
        this.add(dTanggalPembuatan);
        
        insert = new JButton("Insert Data");
        insert.setSize(200, 30);
        insert.setLocation(100,720);
        insert.addActionListener(this);
        this.add(insert);
        
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

        if(e.getSource() == openTtd){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                fileTtd = new File(fileChooser.getSelectedFile().getAbsolutePath());
                ttdFilePath.setText(fileTtd.getName());
            }
        }

        if(e.getSource() == pengangguran){
            if(pengangguran.isSelected()){
                wiraswasta.setEnabled(false);
                akademisi.setEnabled(false);
                pns.setEnabled(false);
                karyawanSwasta.setEnabled(false);
                wiraswasta.setSelected(false);
                akademisi.setSelected(false);
                pns.setSelected(false);
                karyawanSwasta.setSelected(false);
            }
            else{
                wiraswasta.setEnabled(true);
                akademisi.setEnabled(true);
                pns.setEnabled(true);
                karyawanSwasta.setEnabled(true);
            }
        }

        if(e.getSource() == wna){
            tWna.setVisible(true);

        }

        if(e.getSource() == wni){
            tWna.setVisible(false);
        }

        if(e.getSource() == insert) {
            JOptionPane optionPane = new JOptionPane();
            //cara ambil tanggal
            //String s = dTanggalLahir.getJFormattedTextField().getText();
            //System.out.println(s);
            
            /*/
            if(tNik.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"NIK Kosong","NIK Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tName.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Nama Kosong","Nama Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tTempatLahir.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Tempat Lahir Kosong","Tempat Lahir Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(dTanggalLahir.getJFormattedTextField().getText().equals("")){
                optionPane.showMessageDialog(null,"Tanggal Lahir Kosong","Tanggal Lahir Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(grupKelamin.getSelection() == null ){
                optionPane.showMessageDialog(null,"Jenis Kelamin Kosong","Jenis Kelamin Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(golDarahGrup.getSelection() == null ){
                optionPane.showMessageDialog(null,"Golongan Darah Kosong","Golongan Darah Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tAlamat.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Alamat Kosong","Alamat Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tRtrw.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"RT/RW Kosong","RT/RW Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tKeldesa.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Kelurahan/Desa Kosong","Kelurahan/Desa Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tKec.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Kecamatan Kosong","Kecamatan Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tAgama.getSelectedItem().toString().equals("")){
                optionPane.showMessageDialog(null,"Agama Kosong","Agama Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tStatusKawin.getSelectedItem().toString().equals("")){
                optionPane.showMessageDialog(null,"Status Perkawinan Kosong","Status Perkawinan Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(!karyawanSwasta.isSelected() && !pns.isSelected() && !wiraswasta.isSelected() && !akademisi.isSelected() && !pengangguran.isSelected()){
                optionPane.showMessageDialog(null,"Pekerjaan Kosong","Pekerjaan Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(wnButtonGroup.getSelection() == null ){
                optionPane.showMessageDialog(null,"Kewarganegaraan Kosong","Kewarganegaraan Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(wnButtonGroup.getSelection().getActionCommand().equals("WNA") && tWna.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Kewarganegaraan Kosong","Kewarganegaraan Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(fotoFile.getAbsolutePath().equals("")){
                optionPane.showMessageDialog(null,"Foto Kosong","Foto Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(fileTtd.getAbsolutePath().equals("")){
                optionPane.showMessageDialog(null,"Tanda Tangan Kosong","Tanda Tangan Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tBerlakuHingga.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Berlaku Hingga Kosong","Berlaku Hingga Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(tKotaPembuatan.getText().trim().isEmpty()){
                optionPane.showMessageDialog(null,"Kota Pembuatan Kosong","Kota Pembuatan Kosong", JOptionPane.ERROR_MESSAGE);
            } else if(dTanggalPembuatan.getJFormattedTextField().getText().equals("")){
                optionPane.showMessageDialog(null,"Tanggal Pembuatan Kosong","Tanggal Pembuatan Kosong", JOptionPane.ERROR_MESSAGE);
            } else {
                //input data ke string array
                data[0] = tNik.getText().trim();
                data[1] = tName.getText().trim();
                data[2] = tTempatLahir.getText().trim();
                data[3] = dTanggalLahir.getJFormattedTextField().getText();
                data[4] = grupKelamin.getSelection().getActionCommand();
                data[5] = golDarahGrup.getSelection().getActionCommand();
                data[6] = tAlamat.getText().trim();
                data[7] = tRtrw.getText().trim();
                data[8] = tKeldesa.getText().trim();
                data[9] = tKec.getText().trim();
                data[10] = tAgama.getSelectedItem().toString();
                data[11] = tStatusKawin.getSelectedItem().toString();

                String s = "";
                if(karyawanSwasta.isSelected()){
                    s += "Karyawan Swasta, ";
                }
                if(pns.isSelected()){
                    s += "PNS, ";
                }
                if(akademisi.isSelected()){
                    s += "Akademisi, ";
                }
                if(wiraswasta.isSelected()){
                    s += "Wiraswasta, ";
                }
                data[12] = s.substring(0, s.length()-2);
                data[13] = wnButtonGroup.getSelection().getActionCommand();
                if (data[13].equals("WNA")) {
                    data[13] += " (" + tWna.getText().trim() + ")";
                }
                data[14] = fotoFile.getAbsolutePath();
                data[15] = fileTtd.getAbsolutePath();
                data[16] = tBerlakuHingga.getText().trim();
                data[17] = tKotaPembuatan.getText().trim();
                data[18] = dTanggalPembuatan.getJFormattedTextField().getText();
                */
                JFrame f = new JFrame();
                try {
                    f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Garry\\Documents\\school stuff\\ithb\\pbo\\pbo-ithb-reg-2024-modul-5\\src\\img\\templatektp.jpg")))));
                } catch (IOException err) {
                    err.printStackTrace();
                }
                f.setSize(500,317);
                f.pack();
                f.setVisible(true);
                JLabel ktp = new JLabel("Republik Harapan Bangsa");
                ktp.setFont(new Font("Arial", Font.PLAIN, 30));
                ktp.setSize(400, 30);
                ktp.setLocation(80, 15);
                f.add(ktp);
                JLabel ktpNik = new JLabel("1234312321321");
                ktpNik.setFont(new Font("Arial", Font.PLAIN, 25));
                ktpNik.setBounds(110,50,500,40);
                f.add(ktpNik);
                JLabel ktpNama = new JLabel("Garry Alexander Chandra");
        
        }
    }
}
