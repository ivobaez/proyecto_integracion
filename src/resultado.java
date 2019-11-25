import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author iigallardob
 */
public class resultado extends javax.swing.JFrame {
    
    static int internacionalesLocal=150,internacionalesEmpate=240,internacionalesVisita=380;
    static int nacionalLocal=110,nacionalEmpate=200,nacionalVisita=310;
    static int contador1,contador2,contador3,contador4,contador5,contador6,contador7,contador8,contador9,contador10,contador11,contador12,contador13,contador14,contador15,contador16;
    String local="Local", empate="Empate", visita="Visita";

    public resultado(String LigaChilenaLocal1,String LigaChilenaLocal2,String LigaChilenaLocal3,String LigaChilenaLocal4,String CopaLibertadoresLocal1,String CopaLibertadoresLocal2,String CopaLibertadoresLocal3,String CopaLibertadoresLocal4,String UEFALocal1,String UEFALocal2,String UEFALocal3,String UEFALocal4,String EnglandLigaLocal1,String EnglandLigaLocal2,String EnglandLigaLocal3,String EnglandLigaLocal4) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.jpg")).getImage());
        
        int totalApuestaNacional,totalApuestaInternacional, total1;
        String total,total2,total3;
        //Dar valor en pesos a la pauesta para Liga Chilena
        if(LigaChilenaLocal1!=null){
            if (LigaChilenaLocal1.equals(local)){
                contador1=nacionalLocal;
                jTextField1.setText(local);
                jTextField2.setText("$"+contador1);
            }else if(LigaChilenaLocal1.equals(empate)){
                contador1=nacionalEmpate;
                jTextField1.setText(empate);
                jTextField2.setText("$"+contador1);
            }else if(LigaChilenaLocal1.equals(visita)){
                contador1=nacionalVisita;
                jTextField1.setText(visita);
                jTextField2.setText("$"+contador1);
            }
        }
        if(LigaChilenaLocal2!=null){
            if (LigaChilenaLocal2.equals(local)){
                contador2=nacionalLocal;
                jTextField3.setText(local);
                jTextField4.setText("$"+contador2);
            }else if(LigaChilenaLocal2.equals(empate)){
                contador2=nacionalEmpate;
                jTextField3.setText(empate);
                jTextField4.setText("$"+contador2);
            }else if(LigaChilenaLocal2.equals(visita)){
                contador2=nacionalVisita;
                jTextField3.setText(visita);
                jTextField4.setText("$"+contador2);
            }
        }
        if(LigaChilenaLocal3!=null){
            if (LigaChilenaLocal3.equals(local)){
                contador3=nacionalLocal;
                jTextField5.setText(local);
                jTextField6.setText("$"+contador3);
            }else if(LigaChilenaLocal3.equals(empate)){
                contador3=nacionalEmpate;
                jTextField5.setText(empate);
                jTextField6.setText("$"+contador3);
            }else if(LigaChilenaLocal3.equals(visita)){
                contador3=nacionalVisita;
                jTextField5.setText(visita);
                jTextField6.setText("$"+contador3);
            }
        }
        if(LigaChilenaLocal4!=null){
            if (LigaChilenaLocal4.equals(local)){
                contador4=nacionalLocal;
                jTextField7.setText(local);
                jTextField8.setText("$"+contador4);
            }else if(LigaChilenaLocal4.equals(empate)){
                contador4=nacionalEmpate;
                jTextField7.setText(empate);
                jTextField8.setText("$"+contador4);
            }else if(LigaChilenaLocal4.equals(visita)){
                contador4=nacionalVisita;
                jTextField7.setText(visita);
                jTextField8.setText("$"+contador4);
            }
        }
        //Dar valor en pesos para Copa Libertadores
        if(CopaLibertadoresLocal1!=null){
            if (CopaLibertadoresLocal1.equals(local)){
                contador5=internacionalesLocal;
                jTextField9.setText(local);
                jTextField10.setText("$"+contador5);
            }else if(CopaLibertadoresLocal1.equals(empate)){
                contador5=internacionalesEmpate;
                jTextField9.setText(empate);
                jTextField10.setText("$"+contador5);
            }else if(CopaLibertadoresLocal1.equals(visita)){
                contador5=internacionalesVisita;
                jTextField9.setText(visita);
                jTextField10.setText("$"+contador5);
            }
        }
        if(CopaLibertadoresLocal2!=null){
            if (CopaLibertadoresLocal2.equals(local)){
                contador6=internacionalesLocal;
                jTextField11.setText(local);
                jTextField12.setText("$"+contador6);
            }else if(CopaLibertadoresLocal2.equals(empate)){
                contador6=internacionalesEmpate;
                jTextField11.setText(empate);
                jTextField12.setText("$"+contador6);
            }else if(CopaLibertadoresLocal2.equals(visita)){
                contador6=internacionalesVisita;
                jTextField11.setText(visita);
                jTextField12.setText("$"+contador6);
            }
        }
        if(CopaLibertadoresLocal3!=null){
            if (CopaLibertadoresLocal3.equals(local)){
                contador7=internacionalesLocal;
                jTextField13.setText(local);
                jTextField14.setText("$"+contador7);
            }else if(CopaLibertadoresLocal3.equals(empate)){
                contador7=internacionalesEmpate;
                jTextField13.setText(empate);
                jTextField14.setText("$"+contador7);
            }else if(CopaLibertadoresLocal3.equals(visita)){
                contador7=internacionalesVisita;
                jTextField13.setText(visita);
                jTextField14.setText("$"+contador7);
            }
        }
        if(CopaLibertadoresLocal4!=null){
            if (CopaLibertadoresLocal4.equals(local)){
                contador8=internacionalesLocal;
                jTextField15.setText(local);
                jTextField16.setText("$"+contador8);
            }else if(CopaLibertadoresLocal4.equals(empate)){
                contador8=internacionalesEmpate;
                jTextField15.setText(empate);
                jTextField16.setText("$"+contador8);
            }else if(CopaLibertadoresLocal4.equals(visita)){
                contador8=internacionalesVisita;
                jTextField15.setText(visita);
                jTextField16.setText("$"+contador8);
            }
        }
        //Dar valor en pesos para liga UEFA
        if(UEFALocal1!=null){
            if (UEFALocal1.equals(local)){
                contador9=internacionalesLocal;
                jTextField17.setText(local);
                jTextField18.setText("$"+contador9);
            }else if(UEFALocal1.equals(empate)){
                contador9=internacionalesEmpate;
                jTextField17.setText(empate);
                jTextField18.setText("$"+contador9);
            }else if(UEFALocal1.equals(visita)){
                contador9=internacionalesVisita;
                jTextField17.setText(visita);
                jTextField18.setText("$"+contador9);
            }
        }
        if(UEFALocal2!=null){
            if (UEFALocal2.equals(local)){
                contador10=internacionalesLocal;
                jTextField19.setText(local);
                jTextField20.setText("$"+contador10);
            }else if(UEFALocal2.equals(empate)){
                contador10=internacionalesEmpate;
                jTextField19.setText(empate);
                jTextField20.setText("$"+contador10);
            }else if(UEFALocal2.equals(visita)){
                contador10=internacionalesVisita;
                jTextField19.setText(visita);
                jTextField20.setText("$"+contador10);
            }
        }
        if(UEFALocal3!=null){
            if (UEFALocal3.equals(local)){
                contador11=internacionalesLocal;
                jTextField21.setText(local);
                jTextField22.setText("$"+contador11);
            }else if(UEFALocal3.equals(empate)){
                contador11=internacionalesEmpate;
                jTextField21.setText(empate);
                jTextField22.setText("$"+contador11);
            }else if(UEFALocal3.equals(visita)){
                contador11=internacionalesVisita;
                jTextField21.setText(visita);
                jTextField22.setText("$"+contador11);
            }
        }
        if(UEFALocal4!=null){
            if (UEFALocal4.equals(local)){
                contador12=internacionalesLocal;
                jTextField23.setText(local);
                jTextField24.setText("$"+contador12);
            }else if(UEFALocal4.equals(empate)){
                contador12=internacionalesEmpate;
                jTextField23.setText(empate);
                jTextField24.setText("$"+contador12);
            }else if(UEFALocal4.equals(visita)){
                contador12=internacionalesVisita;
                jTextField23.setText(visita);
                jTextField24.setText("$"+contador12);
            }
        }
        //Dar valor 
        if(EnglandLigaLocal1!=null){
            if (EnglandLigaLocal1.equals(local)){
                contador13=internacionalesLocal;
                jTextField25.setText(local);
                jTextField26.setText("$"+contador13);
            }else if(EnglandLigaLocal1.equals(empate)){
                contador13=internacionalesEmpate;
                jTextField25.setText(empate);
                jTextField26.setText("$"+contador13);
            }else if(EnglandLigaLocal1.equals(visita)){
                contador13=internacionalesVisita;
                jTextField25.setText(visita);
                jTextField26.setText("$"+contador13);
            }
        }
        if(EnglandLigaLocal2!=null){
            if (EnglandLigaLocal2.equals(local)){
                contador14=internacionalesLocal;
                jTextField27.setText(local);
                jTextField28.setText("$"+contador14);
            }else if(EnglandLigaLocal2.equals(empate)){
                contador14=internacionalesEmpate;
                jTextField27.setText(empate);
                jTextField28.setText("$"+contador14);
            }else if(EnglandLigaLocal2.equals(visita)){
                contador14=internacionalesVisita;
                jTextField27.setText(visita);
                jTextField28.setText("$"+contador14);
            }
        }
        if(EnglandLigaLocal3!=null){
            if (EnglandLigaLocal3.equals(local)){
                contador15=internacionalesLocal;
                jTextField29.setText(local);
                jTextField30.setText("$"+contador15);
            }else if(EnglandLigaLocal3.equals(empate)){
                contador15=internacionalesEmpate;
                jTextField29.setText(empate);
                jTextField30.setText("$"+contador15);
            }else if(EnglandLigaLocal3.equals(visita)){
                contador15=internacionalesVisita;
                jTextField29.setText(visita);
                jTextField30.setText("$"+contador15);
            }
        }
        if(EnglandLigaLocal4!=null){
            if (EnglandLigaLocal4.equals(local)){
                contador16=internacionalesLocal;
                jTextField31.setText(local);
                jTextField32.setText("$"+contador16);
            }else if(EnglandLigaLocal4.equals(empate)){
                contador16=internacionalesEmpate;
                jTextField31.setText(empate);
                jTextField32.setText("$"+contador16);
            }else if(EnglandLigaLocal4.equals(visita)){
                contador16=internacionalesVisita;
                jTextField31.setText(visita);
                jTextField32.setText("$"+contador16);
            }
        }
        
        totalApuestaNacional = contador1+contador2+contador3+contador4;
        totalApuestaInternacional = contador5+contador6+contador7+contador8+contador9+contador10+contador11+contador12+contador13+contador14+contador15+contador16;
        total1= totalApuestaNacional + totalApuestaInternacional;
        total = Integer.toString(total1);
        total2 = Integer.toString(totalApuestaNacional);
        total3 = Integer.toString(totalApuestaInternacional);
        jTextField34.setText(total2);
        jTextField35.setText(total3);
        jTextField33.setText(total);
    }

    private resultado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    resultado(String nombre, String hola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLigaChilena3 = new javax.swing.JLabel();
        lblUEFAChampionsLeague5 = new javax.swing.JLabel();
        lblCopaLibertadores3 = new javax.swing.JLabel();
        lblEnglandLigaPremier6 = new javax.swing.JLabel();
        lblCopaLibertadores4 = new javax.swing.JLabel();
        lblCopaLibertadores5 = new javax.swing.JLabel();
        lblLigaChilena4 = new javax.swing.JLabel();
        lblLigaChilena6 = new javax.swing.JLabel();
        lblLigaChilena5 = new javax.swing.JLabel();
        lblpelota4 = new javax.swing.JLabel();
        lblEnglandLigaPremier = new javax.swing.JLabel();
        lblEnglandLigaPremier1 = new javax.swing.JLabel();
        lblCopaLibertadores7 = new javax.swing.JLabel();
        lblEnglandLigaPremier2 = new javax.swing.JLabel();
        lblUEFAChampionsLeague3 = new javax.swing.JLabel();
        lblEnglandLigaPremier3 = new javax.swing.JLabel();
        lblEnglandLigaPremier4 = new javax.swing.JLabel();
        lblpelota3 = new javax.swing.JLabel();
        lblpelota1 = new javax.swing.JLabel();
        lblLigaChilena = new javax.swing.JLabel();
        lblLigaChilena1 = new javax.swing.JLabel();
        lblLigaChilena2 = new javax.swing.JLabel();
        lblEnglandLigaPremier5 = new javax.swing.JLabel();
        lblUEFAChampionsLeague = new javax.swing.JLabel();
        lblUEFAChampionsLeague1 = new javax.swing.JLabel();
        lblUEFAChampionsLeague4 = new javax.swing.JLabel();
        lblUEFAChampionsLeague2 = new javax.swing.JLabel();
        lblUEFAChampionsLeague6 = new javax.swing.JLabel();
        lblpelota2 = new javax.swing.JLabel();
        lblCopaLibertadores = new javax.swing.JLabel();
        lblCopaLibertadores1 = new javax.swing.JLabel();
        lblCopaLibertadores2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        lblLigaChilena7 = new javax.swing.JLabel();
        lblLigaChilena8 = new javax.swing.JLabel();
        lblLigaChilena9 = new javax.swing.JLabel();
        lblLigaChilena10 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        lblLigaChilena11 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        lblLigaChilena12 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        lblLigaChilena13 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BET366");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apuesta-triangle.jpg"))); // NOI18N

        lblLigaChilena3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLigaChilena3.setText("15:00 - Palestino VS Univ De Chile");

        lblUEFAChampionsLeague5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUEFAChampionsLeague5.setText("14:45 - Red Star Belgr VS Helsinki");

        lblCopaLibertadores3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCopaLibertadores3.setText("20:30 - Godoy Cruz VS Palmeiras");

        lblEnglandLigaPremier6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEnglandLigaPremier6.setText("11:30 - Manchester Utd VS Chelsea");

        lblCopaLibertadores4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCopaLibertadores4.setText("24 de jul. de 2019");

        lblCopaLibertadores5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCopaLibertadores5.setText("18:15 - Nacional VS Internacional");

        lblLigaChilena4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLigaChilena4.setText("28 de jul. de 2019");

        lblLigaChilena6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLigaChilena6.setText("15:00 - Huachipato VS Univ Catolica");

        lblLigaChilena5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLigaChilena5.setText("17:30 - Colo Colo VS Everton De Vina");

        lblpelota4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pelota.jpg"))); // NOI18N

        lblEnglandLigaPremier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEnglandLigaPremier.setText("England Liga Premier ");

        lblEnglandLigaPremier1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnglandLigaPremier1.setText("9 de ago. de 2019");

        lblCopaLibertadores7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCopaLibertadores7.setText("20:30 - Emelec VS Flamengo");

        lblEnglandLigaPremier2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEnglandLigaPremier2.setText("15:00 - Liverpool VS Norwich");

        lblUEFAChampionsLeague3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUEFAChampionsLeague3.setText("14:00 - Ferencvaros VS Valletta");

        lblEnglandLigaPremier3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEnglandLigaPremier3.setText("07:30 - West Ham VS Manchester City");

        lblEnglandLigaPremier4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnglandLigaPremier4.setText("11 de ago. de 2019");

        lblpelota3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pelota.jpg"))); // NOI18N

        lblpelota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pelota.jpg"))); // NOI18N

        lblLigaChilena.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena.setText("Apuesta");

        lblLigaChilena1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLigaChilena1.setText("27 de jul. de 2019");

        lblLigaChilena2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLigaChilena2.setText("20:00 - Audax Italiano VS Iquique");

        lblEnglandLigaPremier5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEnglandLigaPremier5.setText("09:00 - Newcastle VS Arsenal");

        lblUEFAChampionsLeague.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUEFAChampionsLeague.setText("UEFA Champions League");

        lblUEFAChampionsLeague1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUEFAChampionsLeague1.setText("24 de jul. de 2019");

        lblUEFAChampionsLeague4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUEFAChampionsLeague4.setText("28 de jul. de 2019");

        lblUEFAChampionsLeague2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUEFAChampionsLeague2.setText("13:00 - Bate Borisov VS Rosenborg");

        lblUEFAChampionsLeague6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUEFAChampionsLeague6.setText("16:00 - Maribor VS Aik Stockholm");

        lblpelota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pelota.jpg"))); // NOI18N

        lblCopaLibertadores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCopaLibertadores.setText("Copa Libertadores");

        lblCopaLibertadores1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCopaLibertadores1.setText("23 de jul. de 2019");

        lblCopaLibertadores2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCopaLibertadores2.setText("18:15 - River Plate VS Cruzeiro");

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.setEditable(false);

        jTextField5.setEditable(false);

        jTextField6.setEditable(false);

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        jTextField9.setEditable(false);

        jTextField10.setEditable(false);

        jTextField11.setEditable(false);

        jTextField12.setEditable(false);

        jTextField13.setEditable(false);

        jTextField14.setEditable(false);

        jTextField15.setEditable(false);

        jTextField16.setEditable(false);

        jTextField17.setEditable(false);

        jTextField18.setEditable(false);

        jTextField19.setEditable(false);

        jTextField20.setEditable(false);

        jTextField21.setEditable(false);

        jTextField22.setEditable(false);

        jTextField23.setEditable(false);

        jTextField24.setEditable(false);

        jTextField25.setEditable(false);

        jTextField26.setEditable(false);

        jTextField27.setEditable(false);

        jTextField28.setEditable(false);

        jTextField29.setEditable(false);

        jTextField30.setEditable(false);

        jTextField31.setEditable(false);

        jTextField32.setEditable(false);

        lblLigaChilena7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena7.setText("Liga Chilena");

        lblLigaChilena8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena8.setText("Valor $");

        lblLigaChilena9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena9.setText("Apuesta");

        lblLigaChilena10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena10.setText("Valor $");

        jButtonAceptar.setText("Confirmar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        lblLigaChilena11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena11.setText("Total Internacional $");

        jTextField33.setEditable(false);
        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblLigaChilena12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena12.setText("Total Nacional $");

        jTextField34.setEditable(false);
        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblLigaChilena13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLigaChilena13.setText("Total Cartola $");

        jTextField35.setEditable(false);
        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpelota1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLigaChilena1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLigaChilena4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLigaChilena5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblLigaChilena6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblLigaChilena2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblLigaChilena3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(lblLigaChilena7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(59, 59, 59)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblLigaChilena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblLigaChilena8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblpelota2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCopaLibertadores1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCopaLibertadores4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblCopaLibertadores, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCopaLibertadores5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCopaLibertadores3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCopaLibertadores2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblCopaLibertadores7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLigaChilena12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLigaChilena11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblpelota4)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEnglandLigaPremier1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnglandLigaPremier, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnglandLigaPremier4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUEFAChampionsLeague4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUEFAChampionsLeague1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblpelota3)
                                            .addGap(26, 26, 26)
                                            .addComponent(lblUEFAChampionsLeague, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblUEFAChampionsLeague2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblUEFAChampionsLeague3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUEFAChampionsLeague6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUEFAChampionsLeague5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEnglandLigaPremier5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEnglandLigaPremier6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblEnglandLigaPremier2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnglandLigaPremier3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblLigaChilena9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLigaChilena10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 4, Short.MAX_VALUE)))))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblLigaChilena13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblpelota3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUEFAChampionsLeague, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLigaChilena9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLigaChilena10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUEFAChampionsLeague1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUEFAChampionsLeague2)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUEFAChampionsLeague3)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblUEFAChampionsLeague4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUEFAChampionsLeague6)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUEFAChampionsLeague5)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblpelota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLigaChilena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLigaChilena8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblLigaChilena7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLigaChilena1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLigaChilena2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLigaChilena3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(lblLigaChilena4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLigaChilena5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLigaChilena6)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblpelota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCopaLibertadores, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCopaLibertadores1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCopaLibertadores2)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCopaLibertadores3)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCopaLibertadores4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCopaLibertadores5)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCopaLibertadores7)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblpelota4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEnglandLigaPremier, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEnglandLigaPremier1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnglandLigaPremier2)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnglandLigaPremier3)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblEnglandLigaPremier4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEnglandLigaPremier6)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEnglandLigaPremier5)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAceptar)
                            .addComponent(jButtonVolver)
                            .addComponent(jButtonSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLigaChilena12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLigaChilena11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLigaChilena13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea Salir?","BET366", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (resp==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        int resp1 = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea volver atras, porque perdera los datos ingresado?","BET366", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (resp1==0){
            this.setEnabled(false);
            this.setVisible(false);
            cartolaa cart = new  cartolaa();
            cart.setVisible(true);            
        }
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea confirmar la Operación para Salir?","BET366", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showConfirmDialog(null, "Desea confirmar la Operación","bet366",JOptionPane.WARNING_MESSAGE);
        if (resp==0){
            System.exit(0);
        }else if (resp==1){
            
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCopaLibertadores;
    private javax.swing.JLabel lblCopaLibertadores1;
    private javax.swing.JLabel lblCopaLibertadores2;
    private javax.swing.JLabel lblCopaLibertadores3;
    private javax.swing.JLabel lblCopaLibertadores4;
    private javax.swing.JLabel lblCopaLibertadores5;
    private javax.swing.JLabel lblCopaLibertadores7;
    private javax.swing.JLabel lblEnglandLigaPremier;
    private javax.swing.JLabel lblEnglandLigaPremier1;
    private javax.swing.JLabel lblEnglandLigaPremier2;
    private javax.swing.JLabel lblEnglandLigaPremier3;
    private javax.swing.JLabel lblEnglandLigaPremier4;
    private javax.swing.JLabel lblEnglandLigaPremier5;
    private javax.swing.JLabel lblEnglandLigaPremier6;
    private javax.swing.JLabel lblLigaChilena;
    private javax.swing.JLabel lblLigaChilena1;
    private javax.swing.JLabel lblLigaChilena10;
    private javax.swing.JLabel lblLigaChilena11;
    private javax.swing.JLabel lblLigaChilena12;
    private javax.swing.JLabel lblLigaChilena13;
    private javax.swing.JLabel lblLigaChilena2;
    private javax.swing.JLabel lblLigaChilena3;
    private javax.swing.JLabel lblLigaChilena4;
    private javax.swing.JLabel lblLigaChilena5;
    private javax.swing.JLabel lblLigaChilena6;
    private javax.swing.JLabel lblLigaChilena7;
    private javax.swing.JLabel lblLigaChilena8;
    private javax.swing.JLabel lblLigaChilena9;
    private javax.swing.JLabel lblUEFAChampionsLeague;
    private javax.swing.JLabel lblUEFAChampionsLeague1;
    private javax.swing.JLabel lblUEFAChampionsLeague2;
    private javax.swing.JLabel lblUEFAChampionsLeague3;
    private javax.swing.JLabel lblUEFAChampionsLeague4;
    private javax.swing.JLabel lblUEFAChampionsLeague5;
    private javax.swing.JLabel lblUEFAChampionsLeague6;
    private javax.swing.JLabel lblpelota1;
    private javax.swing.JLabel lblpelota2;
    private javax.swing.JLabel lblpelota3;
    private javax.swing.JLabel lblpelota4;
    // End of variables declaration//GEN-END:variables
}
