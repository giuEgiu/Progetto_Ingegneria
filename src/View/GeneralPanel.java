/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import GestioneTabella.MyTableCellRenderer;
import GestioneTabella.MyDefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author giuli
 */
public class GeneralPanel extends javax.swing.JPanel implements Observer {

    /**
     * Creates new form GeneralPanel
     */
    public GeneralPanel() {
        initComponents();
        buttonAdvGeneral.setActionCommand("ADVSEARCH");
        buttonBackSearchGeneral.setActionCommand("BACKSEARCH");
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
        buttonOkAdvSearchGeneral = new javax.swing.JButton();
        dateGeneral = new com.toedter.calendar.JDateChooser();
        buttonBackSearchGeneral = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(560, 390));
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
        add(buttonOkSearchGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, 30));

        buttonAdvGeneral.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        add(buttonAdvGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 30));

        buttonCreateGeneral.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        buttonCreateGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateGeneralActionPerformed(evt);
            }
        });
        add(buttonCreateGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 150, 30));

        jScrollPane1.setOpaque(false);

        tableSearchGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableSearchGeneral.setOpaque(false);
        jScrollPane1.setViewportView(tableSearchGeneral);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 570, 290));

        jPanelAdvSearch.setOpaque(false);
        jPanelAdvSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboTypeGeneralSearch.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jPanelAdvSearch.add(comboTypeGeneralSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        textCodeGeneralSearch.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        textCodeGeneralSearch.setForeground(new java.awt.Color(153, 153, 153));
        jPanelAdvSearch.add(textCodeGeneralSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 30));

        textNameGeneralSearch.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        textNameGeneralSearch.setForeground(new java.awt.Color(153, 153, 153));
        jPanelAdvSearch.add(textNameGeneralSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 150, 30));
        jPanelAdvSearch.add(buttonOkAdvSearchGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 30, 30));
        jPanelAdvSearch.add(dateGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, 30));
        jPanelAdvSearch.add(buttonBackSearchGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 30, 30));

        add(jPanelAdvSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/pastello.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 410));
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
        return dateGeneral;
    }

    public void setDateGeneral(JDateChooser dateGeneral) {
        this.dateGeneral = dateGeneral;
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

    public JTextField getTextSearchGeneral() {
        return textSearchGeneral;
    }

    public void setTextSearchGeneral(JTextField textSearchGeneral) {
        this.textSearchGeneral = textSearchGeneral;
    }

    public void setControllerGeneralButton(ActionListener contr)
    {
        //buttonOkSearchGeneral.addActionListener(contr);
        buttonBackSearchGeneral.addActionListener(contr);
        buttonAdvGeneral.addActionListener(contr);
    }
    
    public void setMouseListener(MouseListener m)
    {
        textSearchGeneral.addMouseListener(m);
    }
    
    
    
    public void setNameSearch()
    {
        textSearchGeneral.setText("Insert Name Here...");
    }
    
    public void setFocusController(FocusListener f)
    {
        textSearchGeneral.addFocusListener(f);
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void changeAdvGeneral()
    {
            getButtonAdvGeneral().setVisible(false);
            getButtonCreateGeneral().setVisible(false);
            getTextSearchGeneral().setVisible(false);
            getButtonOkSearchGeneral().setVisible(false);
            getjPanelAdvSearch().setVisible(true);
    }
    
    public void backNormalSearch()
    {
            getButtonAdvGeneral().setVisible(true);
            getButtonCreateGeneral().setVisible(true);
            getTextSearchGeneral().setVisible(true);
            getButtonOkSearchGeneral().setVisible(true);
            getjPanelAdvSearch().setVisible(false);
    }
    
    public void DontUpdateRow() {
        
    }
    
    public void setCellEditable() {
         int row = tableSearchGeneral.getSelectedRow();
         int col = tableSearchGeneral.getSelectedColumn();
         MyDefaultTableModel mod = (MyDefaultTableModel) tableSearchGeneral.getModel();
         mod.setRowEditable(row);
         mod.setColumnEditable(col);
         mod.isCellEditable(row, col);
    }
    public void resetCellEditable()
    {
        MyDefaultTableModel mod = (MyDefaultTableModel) tableSearchGeneral.getModel();
       // mod.resetCellEditable();
    }
    
     public void resetValueTable() {

            int row = tableSearchGeneral.getSelectedRow();
            int col = tableSearchGeneral.getSelectedColumn();
            MyDefaultTableModel mod = (MyDefaultTableModel) tableSearchGeneral.getModel();
            tableSearchGeneral.setValueAt((String) mod.getOldValue(), row, col);
     }  

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdvGeneral;
    private javax.swing.JButton buttonBackSearchGeneral;
    private javax.swing.JButton buttonCreateGeneral;
    private javax.swing.JButton buttonOkAdvSearchGeneral;
    private javax.swing.JButton buttonOkSearchGeneral;
    private javax.swing.JComboBox<String> comboTypeGeneralSearch;
    private com.toedter.calendar.JDateChooser dateGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelAdvSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSearchGeneral;
    private javax.swing.JTextField textCodeGeneralSearch;
    private javax.swing.JTextField textNameGeneralSearch;
    private javax.swing.JTextField textSearchGeneral;
    // End of variables declaration//GEN-END:variables

   


    

}
