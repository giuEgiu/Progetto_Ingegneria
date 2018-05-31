/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import GestioneTabella.MyTableCellRenderer;
import com.toedter.calendar.JDateChooser;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author giuli
 */
public abstract class GeneralPanel extends javax.swing.JPanel {

    /**
     * Creates new form GeneralPanel
     */
    public GeneralPanel() {
        initComponents();
        buttonAdvGeneral.setActionCommand("ADVSEARCH");
        buttonBackSearchGeneral.setActionCommand("BACKSEARCH");
        buttonCreateGeneral.setActionCommand("CREATE");
        buttonOkSearchGeneral.setActionCommand("CERCA");

        buttonDeleteSearch.setEnabled(false);
        buttonDeleteAdvSearch.setEnabled(false);
        createPanel.setVisible(false);
        tableSearchGeneral.setDefaultRenderer(Object.class,new MyTableCellRenderer());
        jScrollPane1.getViewport().setOpaque(false);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textSearchGeneral = new javax.swing.JTextField();
        buttonOkSearchGeneral = new javax.swing.JButton();
        buttonAdvGeneral = new javax.swing.JButton();
        buttonCreateGeneral = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearchGeneral = new javax.swing.JTable();
        jPanelAdvSearch = new javax.swing.JPanel();
        comboTypeGeneralSearch = new javax.swing.JComboBox<>();
        textCodeGeneralSearch = new javax.swing.JTextField();
        textNameGeneralSearch = new javax.swing.JTextField();
        textCfGeneralSearch = new javax.swing.JTextField();
        buttonOkAdvSearchGeneral = new javax.swing.JButton();
        buttonBackSearchGeneral = new javax.swing.JButton();
        dateFromGeneral = new com.toedter.calendar.JDateChooser();
        dateToGeneral = new com.toedter.calendar.JDateChooser();
        fromAdvSearch = new javax.swing.JLabel();
        toAdvSearch = new javax.swing.JLabel();
        buttonDeleteAdvSearch = new javax.swing.JButton();
        comboGenereType = new javax.swing.JComboBox<>();
        createPanel = new javax.swing.JPanel();
        buttonBackCreate = new javax.swing.JButton();
        buttonCreate = new javax.swing.JButton();
        panelCreateEvent = new javax.swing.JPanel();
        descriptionArea = new javax.swing.JTextArea();
        comboGenEventCreate = new javax.swing.JComboBox<>();
        dateCreateEvent = new com.toedter.calendar.JDateChooser();
        comboTypeEventCreate = new javax.swing.JComboBox<>();
        textNameEventCreate = new javax.swing.JTextField();
        comboPlaceEvent = new javax.swing.JComboBox<>();
        panelCreateSecurity = new javax.swing.JPanel();
        textPasswordCreate = new javax.swing.JTextField();
        textUsernameCreate = new javax.swing.JTextField();
        textNumberCreate = new javax.swing.JTextField();
        textSalaryCreate = new javax.swing.JTextField();
        textEmailCreate = new javax.swing.JTextField();
        textCFCreate = new javax.swing.JTextField();
        textNameCreate = new javax.swing.JTextField();
        textSurnameCreate = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        buttonDeleteSearch = new javax.swing.JButton();
        SfondoGeneralPanel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(590, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(590, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSearchGeneral.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        textSearchGeneral.setForeground(new java.awt.Color(153, 153, 153));
        textSearchGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSearchGeneralMouseClicked(evt);
            }
        });
        textSearchGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchGeneralActionPerformed(evt);
            }
        });
        textSearchGeneral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSearchGeneralKeyPressed(evt);
            }
        });
        add(textSearchGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        buttonOkSearchGeneral.setBackground(new java.awt.Color(255, 222, 177));
        buttonOkSearchGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/okButton.png"))); // NOI18N
        add(buttonOkSearchGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, 30));

        buttonAdvGeneral.setBackground(new java.awt.Color(255, 222, 177));
        buttonAdvGeneral.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        add(buttonAdvGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 30));

        buttonCreateGeneral.setBackground(new java.awt.Color(255, 222, 177));
        buttonCreateGeneral.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        buttonCreateGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateGeneralActionPerformed(evt);
            }
        });
        add(buttonCreateGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 150, 30));

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 600));

        tableSearchGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableSearchGeneral.setToolTipText("");
        tableSearchGeneral.setOpaque(false);
        jScrollPane1.setViewportView(tableSearchGeneral);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 570, 600));

        jPanelAdvSearch.setOpaque(false);
        jPanelAdvSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboTypeGeneralSearch.setBackground(new java.awt.Color(255, 222, 177));
        comboTypeGeneralSearch.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        comboTypeGeneralSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tipo" }));
        jPanelAdvSearch.add(comboTypeGeneralSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 30));

        textCodeGeneralSearch.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        textCodeGeneralSearch.setForeground(new java.awt.Color(153, 153, 153));
        jPanelAdvSearch.add(textCodeGeneralSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 30));

        textNameGeneralSearch.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        textNameGeneralSearch.setForeground(new java.awt.Color(153, 153, 153));
        textNameGeneralSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameGeneralSearchActionPerformed(evt);
            }
        });
        jPanelAdvSearch.add(textNameGeneralSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 30));

        textCfGeneralSearch.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jPanelAdvSearch.add(textCfGeneralSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 120, 30));

        buttonOkAdvSearchGeneral.setBackground(new java.awt.Color(255, 222, 177));
        buttonOkAdvSearchGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/okButton.png"))); // NOI18N
        jPanelAdvSearch.add(buttonOkAdvSearchGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 40, 30));

        buttonBackSearchGeneral.setBackground(new java.awt.Color(255, 222, 177));
        buttonBackSearchGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/backIcon.png"))); // NOI18N
        jPanelAdvSearch.add(buttonBackSearchGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 40, 30));

        dateFromGeneral.setBackground(new java.awt.Color(255, 222, 177));
        jPanelAdvSearch.add(dateFromGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 130, 30));

        dateToGeneral.setBackground(new java.awt.Color(255, 222, 177));
        jPanelAdvSearch.add(dateToGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, 30));

        fromAdvSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fromAdvSearch.setText("FROM");
        jPanelAdvSearch.add(fromAdvSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, 30));

        toAdvSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        toAdvSearch.setText("TO");
        jPanelAdvSearch.add(toAdvSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 20, 30));

        buttonDeleteAdvSearch.setBackground(new java.awt.Color(255, 222, 177));
        buttonDeleteAdvSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete.png"))); // NOI18N
        jPanelAdvSearch.add(buttonDeleteAdvSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 40, 30));

        comboGenereType.setBackground(new java.awt.Color(255, 222, 177));
        comboGenereType.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        comboGenereType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "genere", " " }));
        jPanelAdvSearch.add(comboGenereType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 120, 30));

        add(jPanelAdvSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 90));

        createPanel.setOpaque(false);
        createPanel.setPreferredSize(new java.awt.Dimension(590, 600));
        createPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonBackCreate.setBackground(new java.awt.Color(255, 222, 177));
        buttonBackCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/backIcon.png"))); // NOI18N
        createPanel.add(buttonBackCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 50, 40));

        buttonCreate.setBackground(new java.awt.Color(255, 222, 177));
        buttonCreate.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        buttonCreate.setText("CREATE!");
        createPanel.add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 100, 40));

        panelCreateEvent.setOpaque(false);
        panelCreateEvent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        descriptionArea.setText("Description...");
        panelCreateEvent.add(descriptionArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 400, 110));

        comboGenEventCreate.setBackground(new java.awt.Color(255, 222, 177));
        comboGenEventCreate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genere Evento" }));
        panelCreateEvent.add(comboGenEventCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 30));
        panelCreateEvent.add(dateCreateEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 150, 30));

        comboTypeEventCreate.setBackground(new java.awt.Color(255, 222, 177));
        comboTypeEventCreate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Evento" }));
        panelCreateEvent.add(comboTypeEventCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 30));

        textNameEventCreate.setText("Name Event");
        panelCreateEvent.add(textNameEventCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 30));

        comboPlaceEvent.setBackground(new java.awt.Color(255, 222, 177));
        comboPlaceEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luoghi" }));
        panelCreateEvent.add(comboPlaceEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, 30));

        createPanel.add(panelCreateEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 420, 340));

        panelCreateSecurity.setOpaque(false);
        panelCreateSecurity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPasswordCreate.setForeground(new java.awt.Color(153, 153, 153));
        textPasswordCreate.setText("Insert Password Here");
        panelCreateSecurity.add(textPasswordCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 150, 30));

        textUsernameCreate.setForeground(new java.awt.Color(153, 153, 153));
        textUsernameCreate.setText("Insert Username Here");
        panelCreateSecurity.add(textUsernameCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 30));

        textNumberCreate.setForeground(new java.awt.Color(153, 153, 153));
        textNumberCreate.setText("Insert Telephon Number Here");
        panelCreateSecurity.add(textNumberCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));

        textSalaryCreate.setForeground(new java.awt.Color(153, 153, 153));
        textSalaryCreate.setText("Insert Salary Here");
        panelCreateSecurity.add(textSalaryCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 150, 30));

        textEmailCreate.setForeground(new java.awt.Color(153, 153, 153));
        textEmailCreate.setText("Insert Email Here");
        textEmailCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailCreateActionPerformed(evt);
            }
        });
        panelCreateSecurity.add(textEmailCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 30));

        textCFCreate.setForeground(new java.awt.Color(153, 153, 153));
        textCFCreate.setText("Insert CF Here");
        panelCreateSecurity.add(textCFCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 30));

        textNameCreate.setForeground(new java.awt.Color(153, 153, 153));
        textNameCreate.setText("Insert Name Here");
        panelCreateSecurity.add(textNameCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        textSurnameCreate.setForeground(new java.awt.Color(153, 153, 153));
        textSurnameCreate.setText("Insert Surname Here");
        panelCreateSecurity.add(textSurnameCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 150, 30));

        jDateChooser1.setBackground(new java.awt.Color(255, 222, 177));
        panelCreateSecurity.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 140, 30));

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATE OF BIRTH");
        panelCreateSecurity.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 264, 140, 30));

        createPanel.add(panelCreateSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 420, 340));

        add(createPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 600));

        buttonDeleteSearch.setBackground(new java.awt.Color(255, 222, 177));
        buttonDeleteSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete.png"))); // NOI18N
        buttonDeleteSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteSearchActionPerformed(evt);
            }
        });
        add(buttonDeleteSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 67, 40, 30));

        SfondoGeneralPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/pastello.jpg"))); // NOI18N
        add(SfondoGeneralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void textSearchGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSearchGeneralMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchGeneralMouseClicked

    private void textSearchGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchGeneralActionPerformed

    private void textSearchGeneralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchGeneralKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchGeneralKeyPressed

    private void buttonCreateGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCreateGeneralActionPerformed

    private void textEmailCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailCreateActionPerformed

    private void textNameGeneralSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameGeneralSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameGeneralSearchActionPerformed

    private void buttonDeleteSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteSearchActionPerformed

    public JButton getButtonCreate() {
        return buttonCreate;
    }

    public JComboBox<String> getComboGenEventCreate() {
        return comboGenEventCreate;
    }

    public JComboBox<String> getComboPlaceEvent() {
        return comboPlaceEvent;
    }

    public JComboBox<String> getComboTypeEventCreate() {
        return comboTypeEventCreate;
    }

    public JDateChooser getDateCreateEvent() {
        return dateCreateEvent;
    }

    public JTextArea getDescriptionArea() {
        return descriptionArea;
    }

    public JComboBox<String> getComboGenereType() {
        return comboGenereType;
    }

    public void setComboGenereType(JComboBox<String> comboGenereType) {
        this.comboGenereType = comboGenereType;
    }

    public JDateChooser getDateFromGeneral() {
        return dateFromGeneral;
    }

    public void setDateFromGeneral(JDateChooser dateFromGeneral) {
        this.dateFromGeneral = dateFromGeneral;
    }

    public JDateChooser getDateToGeneral() {
        return dateToGeneral;
    }

    public void setDateToGeneral(JDateChooser dateToGeneral) {
        this.dateToGeneral = dateToGeneral;
    }

    public JButton getDeleteAdvSearch() {
        return buttonDeleteAdvSearch;
    }

    public void setDeleteAdvSearch(JButton deleteAdvSearch) {
        this.buttonDeleteAdvSearch = deleteAdvSearch;
    }

    public JTextField getTextNameCreate() {
        return textNameCreate;
    }

    public JTextField getTextNameEventCreate() {
        return textNameEventCreate;
    }

    public JPanel getPanelCreateEvent() {
        return panelCreateEvent;
    }

    public void setPanelCreateEvent(JPanel panelCreateEvent) {
        this.panelCreateEvent = panelCreateEvent;
    }

    public JPanel getPanelCreateSecurity() {
        return panelCreateSecurity;
    }

    public void setPanelCreateSecurity(JPanel panelCreateSecurity) {
        this.panelCreateSecurity = panelCreateSecurity;
    }

    public JTextField getTextCfGeneralSearch() {
        return textCfGeneralSearch;
    }

    public void setTextCfGeneralSearch(JTextField textCfGeneral) {
        this.textCfGeneralSearch = textCfGeneral;
    }

    public JPanel getCreatePanel() {
        return createPanel;
    }
    
    public JButton getButtonAdvGeneral() {
        return buttonAdvGeneral;
    }

    public void setButtonAdvGeneral(JButton buttonAdvGeneral) {
        this.buttonAdvGeneral = buttonAdvGeneral;
    }

    public JButton getButtonOkAdvSearchGeneral() {
        return buttonOkAdvSearchGeneral;
    }

    public void setButtonOkAdvSearchGeneral(JButton buttonOkAdvSearchGeneral) {
        this.buttonOkAdvSearchGeneral = buttonOkAdvSearchGeneral;
    }

    public JButton getButtonBackSearchGeneral() {
        return buttonBackSearchGeneral;
    }

    public void setButtonBackSearchGeneral(JButton buttonBackSearchGeneral) {
        this.buttonBackSearchGeneral = buttonBackSearchGeneral;
    }

    public JButton getButtonCreateGeneral() {
        return buttonCreateGeneral;
    }

    public void setButtonCreateGeneral(JButton buttonCreateGeneral) {
        this.buttonCreateGeneral = buttonCreateGeneral;
    }

    public JButton getButtonOkSearchGeneral() {
        return buttonOkSearchGeneral;
    }

    public JButton getButtonBackCreate() {
        return buttonBackCreate;
    }

    public void setButtonBackCreate(JButton buttonBackCreateSecurity) {
        this.buttonBackCreate = buttonBackCreateSecurity;
    }

    public JButton getButtonCreateSecurity() {
        return buttonCreate;
    }

    public void setButtonCreateSecurity(JButton buttonCreateSecurity) {
        this.buttonCreate = buttonCreateSecurity;
    }

    public JLabel getjLabel1() {
        return SfondoGeneralPanel;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.SfondoGeneralPanel = jLabel1;
    }

    public JTextField getTextCFCreate() {
        return textCFCreate;
    }

    public void setTextCFCreate(JTextField textCFCreate) {
        this.textCFCreate = textCFCreate;
    }

    public JTextField getTextEmailCreate() {
        return textEmailCreate;
    }

    public void setTextEmailCreate(JTextField textEmailCreate) {
        this.textEmailCreate = textEmailCreate;
    }

    public JTextField getTextNameSecurityCreate() {
        return textNameCreate;
    }

    public void setTextNameSecurityCreate(JTextField textNameSecurityCreate) {
        this.textNameCreate = textNameSecurityCreate;
    }

    public JTextField getTextNumberCreate() {
        return textNumberCreate;
    }

    public void setTextNumberCreate(JTextField textNumberCreate) {
        this.textNumberCreate = textNumberCreate;
    }

    public JTextField getTextPasswordCreate() {
        return textPasswordCreate;
    }

    public void setTextPasswordCreate(JTextField textPasswordCreate) {
        this.textPasswordCreate = textPasswordCreate;
    }

    public JTextField getTextSalaryCreate() {
        return textSalaryCreate;
    }

    public void setTextSalaryCreate(JTextField textSalaryCreate) {
        this.textSalaryCreate = textSalaryCreate;
    }

    public JTextField getTextSurnameCreate() {
        return textSurnameCreate;
    }

    public void setTextSurnameCreate(JTextField textSurnameCreate) {
        this.textSurnameCreate = textSurnameCreate;
    }

    public JTextField getTextUsernameCreate() {
        return textUsernameCreate;
    }

    public void setTextUsernameCreate(JTextField textUsernameCreate) {
        this.textUsernameCreate = textUsernameCreate;
    }

    public void setButtonOkSearchGeneral(JButton buttonOkSearchGeneral) {
        this.buttonOkSearchGeneral = buttonOkSearchGeneral;
    }

    public JComboBox<String> getComboTypeGeneralSearch() {
        return comboTypeGeneralSearch;
    }

    public void setComboTypeGeneralSearch(JComboBox<String> comboTypeGeneralSearch) {
        this.comboTypeGeneralSearch = comboTypeGeneralSearch;
    }

    public JDateChooser getDateGeneral() {
        return dateFromGeneral;
    }

    public void setDateGeneral(JDateChooser dateGeneral) {
        this.dateFromGeneral = dateGeneral;
    }

    public JPanel getjPanelAdvSearch() {
        return jPanelAdvSearch;
    }

    public void setjPanelAdvSearch(JPanel jPanelAdvSearch) {
        this.jPanelAdvSearch = jPanelAdvSearch;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTableSearchGeneral() {
        return tableSearchGeneral;
    }

    public void setTableSearchGeneral(JTable tableSearchGeneral) {
        this.tableSearchGeneral = tableSearchGeneral;
    }

    public JTextField getTextCodeGeneralSearch() {
        return textCodeGeneralSearch;
    }

    public void setTextCodeGeneralSearch(JTextField textCodeGeneralSearch) {
        this.textCodeGeneralSearch = textCodeGeneralSearch;
    }

    public JTextField getTextNameGeneralSearch() {
        return textNameGeneralSearch;
    }

    public void setTextNameGeneralSearch(JTextField textNameGeneralSearch) {
        this.textNameGeneralSearch = textNameGeneralSearch;
    }

    public JButton getDeleteSearch() {
        return buttonDeleteSearch;
    }

    public void setDeleteSearch(JButton deleteSearch) {
        this.buttonDeleteSearch = deleteSearch;
    }

    public JTextField getTextSearchGeneral() {
        return textSearchGeneral;
    }

    public void setTextSearchGeneral(JTextField textSearchGeneral) {
        this.textSearchGeneral = textSearchGeneral;
    }   
    
    public void setNameSearch()
    {
        textSearchGeneral.setText("Insert Name Here...");
    }
 
    
    
    public void updateTable(Object arg) {

    }
    
    public void changeAdvGeneral()
    {
            getButtonAdvGeneral().setVisible(false);
            getButtonCreateGeneral().setVisible(false);
            getTextSearchGeneral().setVisible(false);
            getButtonOkSearchGeneral().setVisible(false);
            getjPanelAdvSearch().setVisible(true);
            getDeleteSearch().setVisible(false);
    }
    
    public void backNormalSearch()
    {
            getButtonAdvGeneral().setVisible(true);
            getButtonCreateGeneral().setVisible(true);
            getTextSearchGeneral().setVisible(true);
            getButtonOkSearchGeneral().setVisible(true);
            getjPanelAdvSearch().setVisible(false);
            getDeleteSearch().setVisible(true);
    }
    
    public void DontUpdateRow() {
        
    }
    
    
     public void resetValueTable(int row,int column,String oldvalue) {
            
            tableSearchGeneral.getModel().setValueAt((String) oldvalue, row, column);
     }  

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SfondoGeneralPanel;
    private javax.swing.JButton buttonAdvGeneral;
    private javax.swing.JButton buttonBackCreate;
    private javax.swing.JButton buttonBackSearchGeneral;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonCreateGeneral;
    private javax.swing.JButton buttonDeleteAdvSearch;
    private javax.swing.JButton buttonDeleteSearch;
    private javax.swing.JButton buttonOkAdvSearchGeneral;
    private javax.swing.JButton buttonOkSearchGeneral;
    private javax.swing.JComboBox<String> comboGenEventCreate;
    private javax.swing.JComboBox<String> comboGenereType;
    private javax.swing.JComboBox<String> comboPlaceEvent;
    private javax.swing.JComboBox<String> comboTypeEventCreate;
    private javax.swing.JComboBox<String> comboTypeGeneralSearch;
    private javax.swing.JPanel createPanel;
    private com.toedter.calendar.JDateChooser dateCreateEvent;
    private com.toedter.calendar.JDateChooser dateFromGeneral;
    private com.toedter.calendar.JDateChooser dateToGeneral;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JLabel fromAdvSearch;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelAdvSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCreateEvent;
    private javax.swing.JPanel panelCreateSecurity;
    private javax.swing.JTable tableSearchGeneral;
    private javax.swing.JTextField textCFCreate;
    private javax.swing.JTextField textCfGeneralSearch;
    private javax.swing.JTextField textCodeGeneralSearch;
    private javax.swing.JTextField textEmailCreate;
    private javax.swing.JTextField textNameCreate;
    private javax.swing.JTextField textNameEventCreate;
    private javax.swing.JTextField textNameGeneralSearch;
    private javax.swing.JTextField textNumberCreate;
    private javax.swing.JTextField textPasswordCreate;
    private javax.swing.JTextField textSalaryCreate;
    private javax.swing.JTextField textSearchGeneral;
    private javax.swing.JTextField textSurnameCreate;
    private javax.swing.JTextField textUsernameCreate;
    private javax.swing.JLabel toAdvSearch;
    // End of variables declaration//GEN-END:variables

   


    

}
