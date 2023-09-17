package lpp.projetofinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class InterfaceGrafica extends javax.swing.JPanel {

    ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();
    //ArrayList<Funcionarios> listaFuncionarios2 = new ArrayList<>();

    Interface i = new Funcionarios();

    String nome, niveldeExperiência, departamento, cargo, tipo;
    int salarioHora, cc, horas_feitas, tempototal_estagio;
    boolean database, seguranca, otimizacao, acessibilidade, usabilidade;

    DefaultTableModel dm;

    public InterfaceGrafica() {
        initComponents();
        CreateColumns();
        ContarRegistos();
        Collections.sort(listaFuncionarios, new salarioComparator());
        //i.calcularSalario();
        jLabel9.setVisible(false);
        jTextField5.setVisible(false);
        //jLabel10.setVisible(false);
        //jTextField6.setVisible(false);
        jLabel11.setVisible(false);
        jTextField7.setVisible(false);
        jLabel12.setVisible(false);
        jTextField8.setVisible(false);
        jComboBox2.setVisible(false);

        jLabel15.setVisible(false);
        jTextField9.setVisible(false);
        jLabel16.setVisible(false);
        jTextField10.setVisible(false);
        jLabel17.setVisible(false);
        jTextField11.setVisible(false);

        jLabel18.setVisible(false);

        jLabel19.setVisible(false);
        jButton7.setVisible(false);

        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);

        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jCheckBox5.setVisible(false);
        jCheckBox6.setVisible(false);
        jCheckBox7.setVisible(false);

        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        jCheckBox8.setVisible(false);
        jCheckBox9.setVisible(false);
        jCheckBox10.setVisible(false);
    }

    public void CreateColumns() {
        dm = (DefaultTableModel) jTable1.getModel();
    }

    //método para os registos 
    public void ContarRegistos() {
        //declara filas do tipo inteiro e iguala à contagem das linhas da tabela
        int filas = jTable1.getRowCount();
        //depois de adicionados ou removidos dados os registos alteram-se
        jTextField4.setText(" " + filas + " registo(s) ");
    }

    //método para ordenar o preço
    public class salarioComparator implements Comparator<Funcionarios> {

        @Override
        public int compare(Funcionarios t, Funcionarios t1) {
            return (int) (t.getSalarioHora() - t1.getSalarioHora());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Inserção de registos");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Salário");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cartão de Cidadão");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setText("Total de registos");

        jLabel6.setText("Inserido(s):");

        jTextField4.setEditable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Salário", "Cartão de cidadão", "Cargo", "Horas feitas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Ordenar Salário");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cargo");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Desenvolvedor", "Estagiário", "CEO" }));
        jComboBox1.setToolTipText("\n");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Departamento");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Horas feitas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tempo de estágio");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nível de Experiência");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Ver Informação Adicional");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Acessibilidade");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Usabilidade");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Database");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Segurança");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Otimização");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(162, 162, 162))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(149, 149, 149))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel3)))
                                            .addComponent(jLabel11))
                                        .addGap(121, 121, 121)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(110, 110, 110))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(jLabel21)
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel24)
                                        .addGap(36, 36, 36)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jButton2)
                                .addGap(47, 47, 47)
                                .addComponent(jButton3)
                                .addGap(38, 38, 38)
                                .addComponent(jButton6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jCheckBox1)
                        .addGap(130, 130, 130)
                        .addComponent(jCheckBox2)
                        .addGap(108, 108, 108)
                        .addComponent(jCheckBox5)
                        .addGap(92, 92, 92)
                        .addComponent(jCheckBox6)
                        .addGap(87, 87, 87)
                        .addComponent(jCheckBox7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35))
                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jLabel24)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel13.setText("Cálculo do salário");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel14.setText("Pesquisa de funcionário");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Pesquisa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Departamento: ");

        jTextField9.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tempo de estágio:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Nível de experiência:");

        jTextField10.setEditable(false);

        jTextField11.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel18.setText("Informação Adicional");

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel19.setText("Cálculo de Horas restantes");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Calcular");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Acessibilidade:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Usabilidade:");

        jCheckBox3.setEnabled(false);

        jCheckBox4.setEnabled(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Database:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Segurança:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Otimização:");

        jCheckBox8.setEnabled(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setEnabled(false);

        jCheckBox10.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20))))
                            .addGap(12, 12, 12))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel29)))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField10)
                                .addComponent(jTextField9)
                                .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox9))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addGap(27, 27, 27)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedCargo = (String) jComboBox1.getSelectedItem();
        String selectedTipo = (String) jComboBox2.getSelectedItem();

        DefaultTableModel val = (DefaultTableModel) jTable1.getModel();

        if (selectedCargo.equals("CEO")) {
            //jLabel10.setVisible(false);
            //jTextField6.setVisible(false);
            jLabel11.setVisible(false);
            jTextField7.setVisible(false);

            jLabel12.setVisible(false);
            jTextField8.setVisible(false);

            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jLabel24.setVisible(false);
            jLabel25.setVisible(false);
            jLabel26.setVisible(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);

            jLabel9.setVisible(true);
            jTextField5.setVisible(true);
        } else if (selectedCargo.equals("Estagiário")) {
            jLabel9.setVisible(false);
            jTextField5.setVisible(false);

            jLabel12.setVisible(false);
            jTextField8.setVisible(false);

            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jLabel24.setVisible(false);
            jLabel25.setVisible(false);
            jLabel26.setVisible(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
            //jLabel10.setVisible(true);
            //jTextField6.setVisible(true);
            jLabel11.setVisible(true);
            jTextField7.setVisible(true);
        } else if (selectedCargo.equals("Desenvolvedor")) {
            jLabel9.setVisible(false);
            jTextField5.setVisible(false);

            //jLabel10.setVisible(false);
            //jTextField6.setVisible(false);
            jLabel11.setVisible(false);
            jTextField7.setVisible(false);

            /*jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jLabel23.setVisible(false);
            jLabel24.setVisible(false);
            jLabel25.setVisible(false);

            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);*/
            jLabel12.setVisible(true);
            jTextField8.setVisible(true);
        }

        // Verificar se o cargo selecionado é "Desenvolvedor"
        if (selectedCargo.equals("Desenvolvedor")) {
            // Exibir o segundo JComboBox para selecionar o tipo de desenvolvedor
            jComboBox2.setVisible(true);
            // Limpar as opções existentes no jComboBox2
            //jComboBox2.removeAllItems();
            if (jComboBox2.getItemCount() == 0) {
                jComboBox2.addItem("Selecione");
                jComboBox2.addItem("Frontend");
                jComboBox2.addItem("Backend");
                jComboBox2.addItem("Fullstack");
            }
        } else {
            // Caso contrário, ocultar o segundo JComboBox
            jComboBox2.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //criar um inteiro fila e igual à contagem de linhas da tabela
        int fila = jTable1.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            //remover as linhas da tabela
            dm.removeRow(i);
            //ordenar o preço com o método implementado no início do código
            Collections.sort(listaFuncionarios, new salarioComparator());
        }

        DefaultTableModel val = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionarios funcionario = listaFuncionarios.get(i);

            if (funcionario instanceof CEO) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel17.setVisible(false);
                jTextField11.setVisible(false);
                jLabel18.setVisible(false);

                departamento = ((CEO) funcionario).getDepartamento();
                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo(), funcionario.getHoras_feitas()});
            } else if (funcionario instanceof Estagiario) {

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel17.setVisible(false);
                jTextField11.setVisible(false);
                jLabel18.setVisible(false);

                tempototal_estagio = ((Estagiario) funcionario).getTempototal_estagio();
                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo(), funcionario.getHoras_feitas()});
            } else if (funcionario instanceof DevFrontEnd) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);

                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                niveldeExperiência = ((DevFrontEnd) funcionario).getNiveldeExperiência();
                tipo = ((DevFrontEnd) funcionario).getTipo();
                acessibilidade = ((DevFrontEnd) funcionario).isAcessibilidade();
                usabilidade = ((DevFrontEnd) funcionario).isUsabilidade();

                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo() + " - " + tipo, funcionario.getHoras_feitas()});
            } else if (funcionario instanceof DevBackEnd) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);

                niveldeExperiência = ((DevBackEnd) funcionario).getNiveldeExperiência();
                tipo = ((DevBackEnd) funcionario).getTipo();
                database = ((DevBackEnd) funcionario).isDatabase();
                seguranca = ((DevBackEnd) funcionario).isSeguranca();
                otimizacao = ((DevBackEnd) funcionario).isOtimizacao();

                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo() + " - " + tipo, funcionario.getHoras_feitas()});
            } else if (funcionario instanceof DevFullStack) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                niveldeExperiência = ((DevFullStack) funcionario).getNiveldeExperiência();
                tipo = ((DevFullStack) funcionario).getTipo();
                database = ((DevFullStack) funcionario).isDatabase();
                seguranca = ((DevFullStack) funcionario).isSeguranca();
                otimizacao = ((DevFullStack) funcionario).isOtimizacao();
                acessibilidade = ((DevFullStack) funcionario).isAcessibilidade();
                usabilidade = ((DevFullStack) funcionario).isUsabilidade();

                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo() + " - " + tipo, funcionario.getHoras_feitas()});
            } else if (funcionario instanceof Desenvolvedor) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                niveldeExperiência = ((Desenvolvedor) funcionario).getNiveldeExperiência();
                //tipo = ((Desenvolvedor) funcionario).getTipo();
                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo(), funcionario.getHoras_feitas()});
            }
        }

        JOptionPane.showMessageDialog(null, "Dados ordenados pelo salário");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //declarar a linha selecionada do tipo inteiro e iguala a uma linha da tabela
        int linhaSelecionada = jTable1.getSelectedRow();
        //selecionar a linha da tabela para depois remover
        ((DefaultTableModel) jTable1.getModel()).removeRow(jTable1.getSelectedRow());
        //remover da tabela a linha selecionada
        listaFuncionarios.remove(linhaSelecionada);

        try {
            ObjectOutputStream cout = new ObjectOutputStream(
                    new FileOutputStream("dados.txt"));
            cout.writeObject(listaFuncionarios);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream cin = new ObjectInputStream(
                    new FileInputStream("dados.txt"));
            listaFuncionarios = (ArrayList) cin.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //depois de inserido um livro, os campos ficam em branco
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        jLabel15.setVisible(false);
        jTextField9.setText("");
        jTextField9.setVisible(false);

        jLabel16.setVisible(false);
        jTextField10.setText("");
        jTextField10.setVisible(false);

        jLabel17.setVisible(false);
        jTextField11.setText("");
        jTextField11.setVisible(false);

        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jButton7.setVisible(false);

        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        jCheckBox5.setVisible(false);
        jCheckBox6.setVisible(false);
        jCheckBox7.setVisible(false);
        jCheckBox8.setVisible(false);
        jCheckBox9.setVisible(false);
        jCheckBox10.setVisible(false);

        JOptionPane.showMessageDialog(null, "Dados eliminados com sucesso");

        //assim que inserido um funcionário, este método conta os registos
        ContarRegistos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //colocar as variáveis nos respetivos campos
        String nome = jTextField1.getText();
        int salarioHora = Integer.parseInt(jTextField2.getText());
        int cc = Integer.parseInt(jTextField3.getText());

        String cargo = (String) jComboBox1.getSelectedItem();

        int horas_feitas = Integer.parseInt(jTextField6.getText());

        String selectedCargo = (String) jComboBox1.getSelectedItem();
        String selectedTipo = (String) jComboBox2.getSelectedItem();

        if (selectedCargo.equals("CEO")) {
            String departamento = jTextField5.getText();
            CEO dep = new CEO(nome, salarioHora, cc, cargo, horas_feitas, departamento);
            listaFuncionarios.add(dep);
        } else if (selectedCargo.equals("Estagiário")) {
            //int horas_feitas = Integer.parseInt(jTextField6.getText());
            int tempototal_estagio = Integer.parseInt(jTextField7.getText());
            Estagiario hor = new Estagiario(nome, salarioHora, cc, cargo, horas_feitas, tempototal_estagio);
            listaFuncionarios.add(hor);
        } else if (selectedCargo.equals("Desenvolvedor") && selectedTipo.equals("Frontend")) {
            String tipo = "Frontend";
            String niveldeExperiência = jTextField8.getText();
            boolean acessibilidade = jCheckBox1.isSelected();
            boolean usabilidade = jCheckBox2.isSelected();
            DevFrontEnd devfront = new DevFrontEnd(nome, salarioHora, cc, cargo, horas_feitas, acessibilidade, usabilidade, niveldeExperiência, tipo);
            listaFuncionarios.add(devfront);
        } else if (selectedCargo.equals("Desenvolvedor") && selectedTipo.equals("Backend")) {
            String tipo = "Backend";
            String niveldeExperiência = jTextField8.getText();
            boolean database = jCheckBox5.isSelected();
            boolean seguranca = jCheckBox6.isSelected();
            boolean otimizacao = jCheckBox7.isSelected();
            DevBackEnd devback = new DevBackEnd(nome, salarioHora, cc, cargo, horas_feitas, database, seguranca, otimizacao, niveldeExperiência, tipo);
            listaFuncionarios.add(devback);
        } else if (selectedCargo.equals("Desenvolvedor") && selectedTipo.equals("Fullstack")) {
            String tipo = "Fullstack";
            String niveldeExperiência = jTextField8.getText();
            boolean acessibilidade = jCheckBox1.isSelected();
            boolean usabilidade = jCheckBox2.isSelected();
            boolean database = jCheckBox5.isSelected();
            boolean seguranca = jCheckBox6.isSelected();
            boolean otimizacao = jCheckBox7.isSelected();
            DevFullStack devfull = new DevFullStack(nome, salarioHora, cc, cargo, horas_feitas, database, seguranca, otimizacao, acessibilidade, usabilidade, niveldeExperiência, tipo);
            listaFuncionarios.add(devfull);
        } else if (selectedCargo.equals("Desenvolvedor")) {
            String tipo = "";
            String niveldeExperiência = jTextField8.getText();
            Desenvolvedor dev = new Desenvolvedor(nome, salarioHora, cc, cargo, horas_feitas, niveldeExperiência, tipo);
            listaFuncionarios.add(dev);
        }

        //dar print ao array
        System.out.println(listaFuncionarios);

        try {
            ObjectOutputStream cout = new ObjectOutputStream(
                    new FileOutputStream("dados.txt"));
            cout.writeObject(listaFuncionarios);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream cin = new ObjectInputStream(
                    new FileInputStream("dados.txt"));
            listaFuncionarios = (ArrayList) cin.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(listaFuncionarios);

        DefaultTableModel val = (DefaultTableModel) jTable1.getModel();
        //colocar a tabela a zeros quando se adiciona valores
        val.setRowCount(0);

        jLabel19.setVisible(false);
        jButton7.setVisible(false);
        jLabel15.setVisible(false);
        jTextField9.setVisible(false);
        jLabel16.setVisible(false);
        jTextField10.setVisible(false);
        jLabel17.setVisible(false);
        jTextField11.setVisible(false);
        jLabel18.setVisible(false);

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionarios funcionario = listaFuncionarios.get(i);

            if (funcionario instanceof CEO) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel17.setVisible(false);
                jTextField11.setVisible(false);
                jLabel18.setVisible(false);

                departamento = ((CEO) funcionario).getDepartamento();
                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo(), funcionario.getHoras_feitas()});
            } else if (funcionario instanceof Estagiario) {

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel17.setVisible(false);
                jTextField11.setVisible(false);
                jLabel18.setVisible(false);

                tempototal_estagio = ((Estagiario) funcionario).getTempototal_estagio();
                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo(), funcionario.getHoras_feitas()});
            } else if (funcionario instanceof DevFrontEnd) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);

                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                niveldeExperiência = ((DevFrontEnd) funcionario).getNiveldeExperiência();
                tipo = ((DevFrontEnd) funcionario).getTipo();
                acessibilidade = ((DevFrontEnd) funcionario).isAcessibilidade();
                usabilidade = ((DevFrontEnd) funcionario).isUsabilidade();

                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo() + " - " + tipo, funcionario.getHoras_feitas()});
            } else if (funcionario instanceof DevBackEnd) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);

                niveldeExperiência = ((DevBackEnd) funcionario).getNiveldeExperiência();
                tipo = ((DevBackEnd) funcionario).getTipo();
                database = ((DevBackEnd) funcionario).isDatabase();
                seguranca = ((DevBackEnd) funcionario).isSeguranca();
                otimizacao = ((DevBackEnd) funcionario).isOtimizacao();

                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo() + " - " + tipo, funcionario.getHoras_feitas()});
            } else if (funcionario instanceof DevFullStack) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                niveldeExperiência = ((DevFullStack) funcionario).getNiveldeExperiência();
                tipo = ((DevFullStack) funcionario).getTipo();
                database = ((DevFullStack) funcionario).isDatabase();
                seguranca = ((DevFullStack) funcionario).isSeguranca();
                otimizacao = ((DevFullStack) funcionario).isOtimizacao();
                acessibilidade = ((DevFullStack) funcionario).isAcessibilidade();
                usabilidade = ((DevFullStack) funcionario).isUsabilidade();

                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo() + " - " + tipo, funcionario.getHoras_feitas()});
            } else if (funcionario instanceof Desenvolvedor) {
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel18.setVisible(false);

                niveldeExperiência = ((Desenvolvedor) funcionario).getNiveldeExperiência();
                //tipo = ((Desenvolvedor) funcionario).getTipo();
                val.addRow(new Object[]{funcionario.getNome(), funcionario.getSalarioHora(), funcionario.getCc(), funcionario.getCargo(), funcionario.getHoras_feitas()});
            }
        }

        //depois de inserido um funcionário, os campos ficam em branco
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");

        //depois de inserido um funcionário, passa para o primeiro campo
        jTextField1.requestFocus();

        //assim que inserido um funcionário, este método conta os registos
        ContarRegistos();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        String selectedTipo = (String) jComboBox2.getSelectedItem();
        if (selectedTipo.equals("Selecione")) {
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
            jLabel24.setVisible(false);
            jLabel25.setVisible(false);
            jLabel26.setVisible(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
        } else if (selectedTipo.equals("Frontend")) {
            jLabel20.setVisible(true);
            jLabel21.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jLabel12.setVisible(true);
            jTextField8.setVisible(true);

            jLabel24.setVisible(false);
            jLabel25.setVisible(false);
            jLabel26.setVisible(false);
            jCheckBox5.setVisible(false);
            jCheckBox6.setVisible(false);
            jCheckBox7.setVisible(false);
        } else if (selectedTipo.equals("Backend")) {
            jLabel24.setVisible(true);
            jLabel25.setVisible(true);
            jLabel26.setVisible(true);
            jCheckBox5.setVisible(true);
            jCheckBox6.setVisible(true);
            jCheckBox7.setVisible(true);
            jLabel12.setVisible(true);
            jTextField8.setVisible(true);

            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jCheckBox1.setVisible(false);
            jCheckBox2.setVisible(false);
        } else if (selectedTipo.equals("Fullstack")) {
            jLabel12.setVisible(true);
            jTextField8.setVisible(true);
            jLabel20.setVisible(true);
            jLabel21.setVisible(true);
            jCheckBox1.setVisible(true);
            jCheckBox2.setVisible(true);
            jLabel24.setVisible(true);
            jLabel25.setVisible(true);
            jLabel26.setVisible(true);
            jCheckBox5.setVisible(true);
            jCheckBox6.setVisible(true);
            jCheckBox7.setVisible(true);
        }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //botão para procurar o funcionário
        String input = JOptionPane.showInputDialog(this, "Pesquise um funcionário");
        //variável booleana igualada a false
        boolean encontrado = false;
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            //se no array existir, o funcionário procurado, retorna true 
            if (listaFuncionarios.get(i).nome.equalsIgnoreCase(input)) {
                encontrado = true;

                jTextField1.setText(listaFuncionarios.get(i).nome);
                jTextField2.setText(String.valueOf(listaFuncionarios.get(i).salarioHora));
                jTextField3.setText(String.valueOf(listaFuncionarios.get(i).cc));
                jComboBox1.setSelectedItem(listaFuncionarios.get(i).cargo);
                jTextField6.setText(String.valueOf(listaFuncionarios.get(i).horas_feitas));

                if (listaFuncionarios.get(i) instanceof CEO) {
                    jLabel19.setVisible(false);
                    jButton7.setVisible(false);
                    jTextField5.setText(((CEO) listaFuncionarios.get(i)).getDepartamento());
                } 

                else if (listaFuncionarios.get(i) instanceof Estagiario) {
                    //jLabel19.setVisible(true);
                    //jButton7.setVisible(true);
                    Estagiario estagiario = (Estagiario) listaFuncionarios.get(i);
                    jTextField7.setText(String.valueOf(estagiario.getTempototal_estagio()));
                } 

                else if (listaFuncionarios.get(i) instanceof DevFrontEnd) {
                    jLabel19.setVisible(false);
                    jButton7.setVisible(false);
                    jLabel20.setVisible(true);
                    jCheckBox1.setVisible(true);
                    jLabel21.setVisible(true);
                    jCheckBox2.setVisible(true);

                    jLabel24.setVisible(false);
                    jCheckBox5.setVisible(false);
                    jLabel25.setVisible(false);
                    jCheckBox6.setVisible(false);
                    jLabel26.setVisible(false);
                    jCheckBox7.setVisible(false);
                    DevFrontEnd devfront = (DevFrontEnd) listaFuncionarios.get(i);
                    jTextField8.setText(devfront.getNiveldeExperiência());
                    jComboBox2.setSelectedItem("Frontend");

                } else if (listaFuncionarios.get(i) instanceof DevBackEnd) {
                    jLabel19.setVisible(false);
                    jButton7.setVisible(false);
                    jLabel24.setVisible(true);
                    jCheckBox5.setVisible(true);
                    jLabel25.setVisible(true);
                    jCheckBox6.setVisible(true);
                    jLabel26.setVisible(true);
                    jCheckBox7.setVisible(true);

                    jLabel20.setVisible(false);
                    jCheckBox1.setVisible(false);
                    jLabel21.setVisible(false);
                    jCheckBox2.setVisible(false);
                    DevBackEnd devback = (DevBackEnd) listaFuncionarios.get(i);
                    jTextField8.setText(devback.getNiveldeExperiência());
                    jComboBox2.setSelectedItem("Backend");
                } else if (listaFuncionarios.get(i) instanceof DevFullStack) {
                    jLabel19.setVisible(false);
                    jButton7.setVisible(false);
                    jLabel20.setVisible(true);
                    jCheckBox1.setVisible(true);
                    jLabel21.setVisible(true);
                    jCheckBox2.setVisible(true);
                    jLabel24.setVisible(true);
                    jCheckBox5.setVisible(true);
                    jLabel25.setVisible(true);
                    jCheckBox6.setVisible(true);
                    jLabel26.setVisible(true);
                    jCheckBox7.setVisible(true);
                    DevFullStack devfull = (DevFullStack) listaFuncionarios.get(i);
                    jTextField8.setText(devfull.getNiveldeExperiência());
                    jComboBox2.setSelectedItem("Fullstack");
                } else if (listaFuncionarios.get(i) instanceof Desenvolvedor) {
                    jLabel19.setVisible(false);
                    jButton7.setVisible(false);
                    jLabel20.setVisible(false);
                    jCheckBox1.setVisible(false);
                    jLabel21.setVisible(false);
                    jCheckBox2.setVisible(false);
                    jLabel24.setVisible(false);
                    jCheckBox5.setVisible(false);
                    jLabel25.setVisible(false);
                    jCheckBox6.setVisible(false);
                    jLabel26.setVisible(false);
                    jCheckBox7.setVisible(false);
                    Desenvolvedor desenvolvedor = (Desenvolvedor) listaFuncionarios.get(i);
                    jTextField8.setText(desenvolvedor.getNiveldeExperiência());
                    jComboBox2.setSelectedItem("Selecione");
                } 
            }
        }
        if (encontrado) {
            //caso o encontrado, ou seja o funcionário, fosse verdade o funcionário é encontrado
            JOptionPane.showMessageDialog(jButton5, "Funcionário encontrado!");
        } else {
            //caso contrário, o funcionário não é encontrado
            JOptionPane.showMessageDialog(jButton5, "Funcionário não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();

        // Verifique se alguma linha foi selecionada
        if (linhaSelecionada != -1) {
            int salarioHora = (int) jTable1.getValueAt(linhaSelecionada, 1);
            int horas_feitas = (int) jTable1.getValueAt(linhaSelecionada, 4);

            // Crie uma instância de Funcionarios
            Funcionarios funcionario = new Funcionarios();

            // Configure o valor do salarioHora
            funcionario.setSalarioHora(salarioHora);
            funcionario.setHoras_feitas(horas_feitas);

            // Crie uma referência da interface Interface
            Interface i = funcionario;

            // Chame o método calcularSalario() e obtenha o resultado
            int salario = i.calcularSalario();

            // Exiba o resultado em um diálogo de mensagem
            JOptionPane.showMessageDialog(null, "O salário é: " + salario);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada.");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /*int linhaSelecionada = jTable1.getSelectedRow();

        // Verifique se alguma linha foi selecionada
        if (linhaSelecionada != -1) {
            String cargo = (String) jTable1.getValueAt(linhaSelecionada, 3);
            String selectedTipo = (String) jComboBox2.getSelectedItem();

            if (cargo.equals("CEO")) {
                //Título informação adicional
                jLabel18.setVisible(true);

                jLabel15.setVisible(true);
                jTextField9.setVisible(true);

                //Método de estagiário
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jLabel16.setVisible(false);
                jTextField10.setVisible(false);

                jLabel17.setVisible(false);
                jTextField11.setVisible(false);

                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                jTextField9.setText(((CEO) listaFuncionarios.get(linhaSelecionada)).getDepartamento());
            } else if (cargo.equals("Estagiário")) {
                jLabel16.setVisible(true);
                jTextField10.setVisible(true);
                jLabel18.setVisible(true);

                //Método de estagiário
                jLabel19.setVisible(true);
                jButton7.setVisible(true);

                jLabel15.setVisible(false);
                jTextField9.setVisible(false);

                jLabel17.setVisible(false);
                jTextField11.setVisible(false);

                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                jTextField10.setText(String.valueOf(((Estagiario) listaFuncionarios.get(linhaSelecionada)).getTempototal_estagio()));
            } else if (cargo.equals("Desenvolvedor - Frontend") && selectedTipo.equals("Frontend")) {
                //funcionario instanceof DevBackEnd
                //Título informação adicional
                jLabel18.setVisible(true);

                //Atributos referentes a desenvolvedor Frontend
                jLabel17.setVisible(true);
                jTextField11.setVisible(true);

                jLabel20.setVisible(true);
                jLabel21.setVisible(true);
                jLabel22.setVisible(true);
                jLabel23.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);

                //Atributos não referentes a desenvolvedor Frontend
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);

                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                //Método de estagiário
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jTextField11.setText(((DevFrontEnd) listaFuncionarios.get(linhaSelecionada)).getNiveldeExperiência());
                jCheckBox3.setSelected(((DevFrontEnd) listaFuncionarios.get(linhaSelecionada)).isAcessibilidade());
                jCheckBox4.setSelected(((DevFrontEnd) listaFuncionarios.get(linhaSelecionada)).isUsabilidade());
            } else if (cargo.equals("Desenvolvedor - Backend") && selectedTipo.equals("Backend")) {
                //Título informação adicional
                jLabel18.setVisible(true);

                //Atributos referentes a desenvolvedor Backend
                jLabel17.setVisible(true);
                jTextField11.setVisible(true);

                jLabel24.setVisible(true);
                jLabel25.setVisible(true);
                jLabel26.setVisible(true);
                jLabel27.setVisible(true);
                jLabel28.setVisible(true);
                jLabel29.setVisible(true);
                jCheckBox5.setVisible(true);
                jCheckBox6.setVisible(true);
                jCheckBox7.setVisible(true);
                jCheckBox8.setVisible(true);
                jCheckBox9.setVisible(true);
                jCheckBox10.setVisible(true);

                //Atributos não referentes a desenvolvedor Backend
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);

                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);

                //Método de estagiário
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jTextField11.setText(((DevBackEnd) listaFuncionarios.get(linhaSelecionada)).getNiveldeExperiência());
                jCheckBox8.setSelected(((DevBackEnd) listaFuncionarios.get(linhaSelecionada)).isDatabase());
                jCheckBox9.setSelected(((DevBackEnd) listaFuncionarios.get(linhaSelecionada)).isSeguranca());
                jCheckBox10.setSelected(((DevBackEnd) listaFuncionarios.get(linhaSelecionada)).isOtimizacao());
            } else if (cargo.equals("Desenvolvedor - Fullstack") && selectedTipo.equals("Fullstack")) {
                //Título informação adicional
                jLabel18.setVisible(true);

                //Atributos referentes a desenvolvedor Fullstack
                jLabel17.setVisible(true);
                jTextField11.setVisible(true);

                jLabel20.setVisible(true);
                jLabel21.setVisible(true);
                jLabel22.setVisible(true);
                jLabel23.setVisible(true);
                jLabel24.setVisible(true);
                jLabel25.setVisible(true);
                jLabel26.setVisible(true);
                jLabel27.setVisible(true);
                jLabel28.setVisible(true);
                jLabel29.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jCheckBox5.setVisible(true);
                jCheckBox6.setVisible(true);
                jCheckBox7.setVisible(true);
                jCheckBox8.setVisible(true);
                jCheckBox9.setVisible(true);
                jCheckBox10.setVisible(true);

                //Atributos não referentes a desenvolvedor Fullstack
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);

                //Método de estagiário
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                jTextField11.setText(((DevFullStack) listaFuncionarios.get(linhaSelecionada)).getNiveldeExperiência());
                jCheckBox3.setSelected(((DevFullStack) listaFuncionarios.get(linhaSelecionada)).isAcessibilidade());
                jCheckBox4.setSelected(((DevFullStack) listaFuncionarios.get(linhaSelecionada)).isUsabilidade());
                jCheckBox8.setSelected(((DevFullStack) listaFuncionarios.get(linhaSelecionada)).isDatabase());
                jCheckBox9.setSelected(((DevFullStack) listaFuncionarios.get(linhaSelecionada)).isSeguranca());
                jCheckBox10.setSelected(((DevFullStack) listaFuncionarios.get(linhaSelecionada)).isOtimizacao());
            } else if (cargo.equals("Desenvolvedor")) {
                //Título informação adicional
                jLabel18.setVisible(true);

                jLabel17.setVisible(true);
                jTextField11.setVisible(true);

                //Método de estagiário
                jLabel19.setVisible(false);
                jButton7.setVisible(false);

                //Atributos não referentes a desenvolvedor
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);

                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                jTextField11.setText(((Desenvolvedor) listaFuncionarios.get(linhaSelecionada)).getNiveldeExperiência());
            }
        }*/

        int linhaSelecionada = jTable1.getSelectedRow();

        // Verifique se alguma linha foi selecionada
        if (linhaSelecionada != -1) {
            String cargo = (String) jTable1.getValueAt(linhaSelecionada, 3);
            //String selectedCargo = (String) jComboBox1.getSelectedItem();
            //String selectedTipo = (String) jComboBox2.getSelectedItem();

            if (cargo.equals("CEO")) {
                CEO ceo = (CEO) listaFuncionarios.get(linhaSelecionada);

                // Exibe os componentes específicos do CEO
                //elementos do lado direito
                jLabel15.setVisible(true);
                jTextField9.setVisible(true);
                jLabel18.setVisible(true);
                jLabel19.setVisible(false);
                jButton7.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel17.setVisible(false);
                jTextField11.setVisible(false);

                //elementos do lado esquerdo
                jLabel11.setVisible(false);
                jTextField7.setVisible(false);
                jLabel9.setVisible(true);
                jTextField5.setVisible(true);
                jLabel12.setVisible(false);
                jTextField8.setVisible(false);

                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                jTextField9.setText(ceo.getDepartamento());
            } else if (cargo.equals("Estagiário")) {
                Estagiario estagiario = (Estagiario) listaFuncionarios.get(linhaSelecionada);

                // Exibe os componentes específicos do Estagiário
                //elementos do lado direito
                jLabel16.setVisible(true);
                jTextField10.setVisible(true);
                jLabel18.setVisible(true);
                jLabel19.setVisible(true);
                jButton7.setVisible(true);
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel17.setVisible(false);
                jTextField11.setVisible(false);

                //Assim que selecionada a linha que possua cargo Estagiário
                //se se clicar no Ver Informação Adicional, irá ficar visível o campo Tempo Estágio
                //para que seja mais fácil de mostrar do lado direito
                //elementos do lado esquerdo
                jLabel11.setVisible(true);
                jTextField7.setVisible(true);
                jLabel9.setVisible(false);
                jTextField5.setVisible(false);
                jLabel12.setVisible(false);
                jTextField8.setVisible(false);

                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                jTextField10.setText(String.valueOf(estagiario.getTempototal_estagio()));
            } else if (cargo.equals("Desenvolvedor")) {
                Desenvolvedor desenvolvedor = (Desenvolvedor) listaFuncionarios.get(linhaSelecionada);

                // Exibe os componentes específicos do Desenvolvedor
                //elementos do lado direito
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel18.setVisible(true);
                jLabel19.setVisible(false);
                jButton7.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel17.setVisible(true);
                jTextField11.setVisible(true);

                //elementos do lado esquerdo
                jLabel11.setVisible(false);
                jTextField7.setVisible(false);
                jLabel9.setVisible(false);
                jTextField5.setVisible(false);
                jLabel12.setVisible(true);
                jTextField8.setVisible(true);

                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                jTextField11.setText(desenvolvedor.getNiveldeExperiência());
            } else if (cargo.equals("Desenvolvedor - Frontend")) {
                DevFrontEnd devFrontEnd = (DevFrontEnd) listaFuncionarios.get(linhaSelecionada);

                // Exibe os componentes específicos do Desenvolvedor Frontend
                //elementos do lado direito
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel18.setVisible(true);
                jLabel19.setVisible(false);
                jButton7.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel17.setVisible(true);
                jTextField11.setVisible(true);
                jLabel22.setVisible(true);
                jLabel23.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);

                //elementos do lado esquerdo
                jLabel20.setVisible(true);
                jLabel21.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox1.setSelected(false);
                jCheckBox2.setVisible(true);
                jCheckBox2.setSelected(false);
                jLabel11.setVisible(false);
                jTextField7.setVisible(false);
                jLabel9.setVisible(false);
                jTextField5.setVisible(false);
                jLabel12.setVisible(true);
                jTextField8.setVisible(true);

                jLabel24.setVisible(false);
                jLabel25.setVisible(false);
                jLabel26.setVisible(false);
                jLabel27.setVisible(false);
                jLabel28.setVisible(false);
                jLabel29.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);
                jCheckBox7.setVisible(false);
                jCheckBox8.setVisible(false);
                jCheckBox9.setVisible(false);
                jCheckBox10.setVisible(false);

                jTextField11.setText(devFrontEnd.getNiveldeExperiência());
                jCheckBox3.setSelected(devFrontEnd.isAcessibilidade());
                jCheckBox4.setSelected(devFrontEnd.isUsabilidade());
            } else if (cargo.equals("Desenvolvedor - Backend")) {
                DevBackEnd devBackEnd = (DevBackEnd) listaFuncionarios.get(linhaSelecionada);

                // Exibe os componentes específicos do Desenvolvedor Backend
                //elementos do lado direito
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel18.setVisible(true);
                jLabel19.setVisible(false);
                jButton7.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel17.setVisible(true);
                jTextField11.setVisible(true);
                jLabel22.setVisible(false);
                jLabel23.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jLabel27.setVisible(true);
                jLabel28.setVisible(true);
                jLabel29.setVisible(true);
                jCheckBox8.setVisible(true);
                jCheckBox9.setVisible(true);
                jCheckBox10.setVisible(true);

                //elementos do lado esquerdo
                jLabel20.setVisible(false);
                jLabel21.setVisible(false);
                jCheckBox1.setVisible(false);
                jCheckBox2.setVisible(false);
                jLabel24.setVisible(true);
                jLabel25.setVisible(true);
                jLabel26.setVisible(true);
                jCheckBox5.setVisible(true);
                jCheckBox5.setSelected(false);
                jCheckBox6.setVisible(true);
                jCheckBox6.setSelected(false);
                jCheckBox7.setVisible(true);
                jCheckBox7.setSelected(false);
                jLabel11.setVisible(false);
                jTextField7.setVisible(false);
                jLabel9.setVisible(false);
                jTextField5.setVisible(false);
                jLabel12.setVisible(true);
                jTextField8.setVisible(true);

                jTextField11.setText(devBackEnd.getNiveldeExperiência());
                jCheckBox8.setSelected(devBackEnd.isDatabase());
                jCheckBox9.setSelected(devBackEnd.isSeguranca());
                jCheckBox10.setSelected(devBackEnd.isOtimizacao());
            } else if (cargo.equals("Desenvolvedor - Fullstack")) {
                DevFullStack devFullStack = (DevFullStack) listaFuncionarios.get(linhaSelecionada);

                // Exibe os componentes específicos do Desenvolvedor Fullstack
                //elementos do lado direito
                jLabel15.setVisible(false);
                jTextField9.setVisible(false);
                jLabel18.setVisible(true);
                jLabel19.setVisible(false);
                jButton7.setVisible(false);
                jLabel16.setVisible(false);
                jTextField10.setVisible(false);
                jLabel17.setVisible(true);
                jTextField11.setVisible(true);
                jLabel22.setVisible(true);
                jLabel23.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jLabel27.setVisible(true);
                jLabel28.setVisible(true);
                jLabel29.setVisible(true);
                jCheckBox8.setVisible(true);
                jCheckBox9.setVisible(true);
                jCheckBox10.setVisible(true);

                //elementos do lado esquerdo
                jLabel20.setVisible(true);
                jLabel21.setVisible(true);
                jCheckBox1.setVisible(true);
                jCheckBox1.setSelected(false);
                jCheckBox2.setVisible(true);
                jCheckBox2.setSelected(false);
                jLabel24.setVisible(true);
                jLabel25.setVisible(true);
                jLabel26.setVisible(true);
                jCheckBox5.setVisible(true);
                jCheckBox5.setSelected(false);
                jCheckBox6.setVisible(true);
                jCheckBox6.setSelected(false);
                jCheckBox7.setVisible(true);
                jCheckBox7.setSelected(false);
                jLabel11.setVisible(false);
                jTextField7.setVisible(false);
                jLabel9.setVisible(false);
                jTextField5.setVisible(false);
                jLabel12.setVisible(true);
                jTextField8.setVisible(true);

                jTextField11.setText(devFullStack.getNiveldeExperiência());
                jCheckBox3.setSelected(devFullStack.isAcessibilidade());
                jCheckBox4.setSelected(devFullStack.isUsabilidade());
                jCheckBox8.setSelected(devFullStack.isDatabase());
                jCheckBox9.setSelected(devFullStack.isSeguranca());
                jCheckBox10.setSelected(devFullStack.isOtimizacao());
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int linhaSelecionada = jTable1.getSelectedRow();
        int tempototal_estagio = Integer.parseInt(jTextField10.getText());

        // Verifique se alguma linha foi selecionada
        if (linhaSelecionada != -1) {
            int horas_feitas = (int) jTable1.getValueAt(linhaSelecionada, 4);

            if (jTextField10.isVisible()) {
                tempototal_estagio = Integer.parseInt(jTextField10.getText());
            } else if (jTextField10.isVisible()) {
                tempototal_estagio = Integer.parseInt(jTextField10.getText());
            }

            // Crie uma instância de Funcionarios
            Estagiario estagiario = new Estagiario();

            // Configure o valor do salarioHora
            estagiario.setHoras_feitas(horas_feitas);
            estagiario.setTempototal_estagio(tempototal_estagio);

            // Crie uma referência da interface Interface
            //Estagiario calculo = new Estagiario();
            // Chame o método calcularSalario() e obtenha o resultado
            int calculoHoras = estagiario.CalcularHorasRestantes();

            // Exiba o resultado em um diálogo de mensagem
            JOptionPane.showMessageDialog(null, "Faltam realizar: " + calculoHoras);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada.");
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
