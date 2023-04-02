package com.mycompany.ifstorage;
import java.awt.Color;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;



/**
 *
 * @author khadu
 */
public class Fornecedores extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Fornecedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopBar = new javax.swing.JPanel();
        pnlActions = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        pnlFundo = new javax.swing.JPanel();
        pnlBarraLetarl = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlRelatorio = new javax.swing.JPanel();
        lblRelatorio = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        lblDados = new javax.swing.JLabel();
        pnlCardapio = new javax.swing.JPanel();
        lblCardapio = new javax.swing.JLabel();
        lblFornecedores = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Home"); // NOI18N
        setUndecorated(true);

        pnlTopBar.setBackground(new java.awt.Color(23, 136, 44));
        pnlTopBar.setLayout(new java.awt.BorderLayout());

        pnlActions.setMaximumSize(new java.awt.Dimension(150, 30));
        pnlActions.setOpaque(false);

        lblMin.setBackground(new java.awt.Color(23, 136, 44));
        lblMin.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\mim.png")); // NOI18N
        lblMin.setLabelFor(lblMin);
        lblMin.setOpaque(true);
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinMousePressed(evt);
            }
        });
        pnlActions.add(lblMin);
        // Adicionar o MouseListener ao JPanel pnlMenu

        lblMin.addMouseListener(new MouseAdapter() {
            private Color hoverColor = new Color(18, 65, 31); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                lblMin.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblMin.setBackground(new Color(23, 136, 44));
            }
        });

        lblMax.setBackground(new java.awt.Color(23, 136, 44));
        lblMax.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\max.png")); // NOI18N
        lblMax.setLabelFor(lblMax);
        lblMax.setOpaque(true);
        lblMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMaxMousePressed(evt);
            }
        });
        pnlActions.add(lblMax);
        // Adicionar o MouseListener ao JPanel pnlMenu
        lblMax.addMouseListener(new MouseAdapter() {
            private Color hoverColor = new Color(18, 65, 31); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                lblMax.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblMax.setBackground(new Color(23, 136, 44));
            }
        });

        lblExit.setBackground(new java.awt.Color(23, 136, 44));
        lblExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\exit.png")); // NOI18N
        lblExit.setLabelFor(lblExit);
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitMousePressed(evt);
            }
        });
        pnlActions.add(lblExit);
        // Adicionar o MouseListener ao JPanel pnlMenu
        lblExit.addMouseListener(new MouseAdapter() {
            private Color hoverColor = new Color(255, 10, 10); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                lblExit.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblExit.setBackground(new Color(23, 136, 44));
            }
        });

        pnlTopBar.add(pnlActions, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlTopBar, java.awt.BorderLayout.PAGE_START);
        pnlTopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTopBarMouseDragged(evt);
            }
        });
        pnlTopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTopBarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTopBarMousePressed(evt);
            }
        });

        pnlFundo.setBackground(new java.awt.Color(23, 136, 44));

        pnlBarraLetarl.setBackground(new java.awt.Color(23, 136, 44));

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\logo.png")); // NOI18N
        lblLogo.setLabelFor(lblLogo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("iFstorage");

        pnlRelatorio.setBackground(new java.awt.Color(23, 136, 44));
        pnlRelatorio.setForeground(new java.awt.Color(255, 255, 255));

        lblRelatorio.setBackground(new java.awt.Color(0, 0, 0));
        lblRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorio.setText("Relatório");

        javax.swing.GroupLayout pnlRelatorioLayout = new javax.swing.GroupLayout(pnlRelatorio);
        pnlRelatorio.setLayout(pnlRelatorioLayout);
        pnlRelatorioLayout.setHorizontalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlRelatorioLayout.setVerticalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenu.setBackground(new java.awt.Color(23, 136, 44));
        pnlMenu.setForeground(new java.awt.Color(255, 255, 255));

        lblMenu.setBackground(new java.awt.Color(0, 0, 0));
        lblMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("Menu");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlDados.setBackground(new java.awt.Color(23, 136, 44));
        pnlDados.setForeground(new java.awt.Color(255, 255, 255));
        pnlDados.setPreferredSize(new java.awt.Dimension(190, 50));

        lblDados.setBackground(new java.awt.Color(0, 0, 0));
        lblDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDados.setForeground(new java.awt.Color(255, 255, 255));
        lblDados.setText("Dados");

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblDados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlCardapio.setBackground(new java.awt.Color(23, 136, 44));
        pnlCardapio.setForeground(new java.awt.Color(255, 255, 255));

        lblCardapio.setBackground(new java.awt.Color(0, 0, 0));
        lblCardapio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCardapio.setForeground(new java.awt.Color(255, 255, 255));
        lblCardapio.setText("Cardapio");

        javax.swing.GroupLayout pnlCardapioLayout = new javax.swing.GroupLayout(pnlCardapio);
        pnlCardapio.setLayout(pnlCardapioLayout);
        pnlCardapioLayout.setHorizontalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardapioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlCardapioLayout.setVerticalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBarraLetarlLayout = new javax.swing.GroupLayout(pnlBarraLetarl);
        pnlBarraLetarl.setLayout(pnlBarraLetarlLayout);
        pnlBarraLetarlLayout.setHorizontalGroup(
            pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLetarlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo)
                    .addGroup(pnlBarraLetarlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraLetarlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlBarraLetarlLayout.setVerticalGroup(
            pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLetarlLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(683, Short.MAX_VALUE))
        );

        //Definindo coloração
        pnlRelatorio.setBackground(new java.awt.Color(23, 136, 44));
        pnlRelatorio.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlRelatorio.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlRelatorio.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlRelatorio.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlRelatorio.setBackground(originalColor);
            }
        });
        //Definindo coloração
        pnlMenu.setBackground(new java.awt.Color(23, 136, 44));
        pnlMenu.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlMenu.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlMenu.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlMenu.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlMenu.setBackground(originalColor);
            }
        });
        //Definindo coloração
        pnlDados.setBackground(new java.awt.Color(23, 136, 44));
        pnlDados.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlDados.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlDados.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlDados.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlDados.setBackground(originalColor);
            }
        });
        //Definindo coloração
        pnlCardapio.setBackground(new java.awt.Color(23, 136, 44));
        pnlCardapio.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlCardapio.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlCardapio.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlCardapio.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlCardapio.setBackground(originalColor);
            }
        });

        lblFornecedores.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        lblFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lblFornecedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFornecedores.setText("Fornecedores");

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atualizar");

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Deletar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tblFornecedores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"oi", "oi", "oi",  new Integer(1)},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Cnpj", "Produto", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblFornecedores.setRowHeight(40);
        tblFornecedores.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblFornecedores.setShowGrid(true);
        jScrollPane1.setViewportView(tblFornecedores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlBarraLetarl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(lblFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBarraLetarl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFornecedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFundo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMaxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMousePressed
        if (Fornecedores.this.getExtendedState() == MAXIMIZED_BOTH) {
            Fornecedores.this.setExtendedState(JFrame.NORMAL);
        } else {
            Fornecedores.this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_lblMaxMousePressed

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblExitMousePressed

    private void lblMinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMousePressed
        Fornecedores.this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    //Funções para Movimenta janela
    
    int xy, xx;
    
    private void pnlTopBarMousePressed(java.awt.event.MouseEvent evt) {                                    
        xx = evt.getX();
        xy = evt.getY();
    }                                   

    private void pnlTopBarMouseClicked(java.awt.event.MouseEvent evt) {                                    
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            if (Fornecedores.this.getExtendedState() == MAXIMIZED_BOTH) {
                Fornecedores.this.setExtendedState(JFrame.NORMAL);
            } else {
                Fornecedores.this.setExtendedState(MAXIMIZED_BOTH);
            }
        }
    }                                   

    private void pnlTopBarMouseDragged(java.awt.event.MouseEvent evt) {                                    
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    } 
    
    //Fim das funções para movimenta janela
    
    
    /*Funções para que os botões maximizar, minimizar e close funcionem
    
    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {                                      
        System.exit(0);
    }                                     

    private void lblMaximizeMousePressed(java.awt.event.MouseEvent evt) {                                         
        if (Inicio.this.getExtendedState() == MAXIMIZED_BOTH) {
            Inicio.this.setExtendedState(JFrame.NORMAL);
        } else {
            Inicio.this.setExtendedState(MAXIMIZED_BOTH);
        }
    }                                        

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {                                         
        Inicio.this.setState(Frame.ICONIFIED);
    }  
    
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFornecedores;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JPanel pnlActions;
    private javax.swing.JPanel pnlBarraLetarl;
    private javax.swing.JPanel pnlCardapio;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlRelatorio;
    private javax.swing.JPanel pnlTopBar;
    private javax.swing.JTable tblFornecedores;
    // End of variables declaration//GEN-END:variables
}
