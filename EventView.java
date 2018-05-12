/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author giuli
 */
public class EventView extends javax.swing.JFrame {

    /**
     * Creates new form EventView
     */
    public EventView() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        textSearchEvent = new javax.swing.JTextField();
        buttonAdvSearch = new javax.swing.JButton();
        buttonCreateEvent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearchEvent = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSearchEvent.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        textSearchEvent.setForeground(new java.awt.Color(153, 153, 153));
        textSearchEvent.setText("Search Events Here...");
        textSearchEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSearchEventMouseClicked(evt);
            }
        });
        textSearchEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchEventActionPerformed(evt);
            }
        });
        textSearchEvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSearchEventKeyPressed(evt);
            }
        });
        jPanel1.add(textSearchEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 30));

        buttonAdvSearch.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        buttonAdvSearch.setText("Advanced Search");
        buttonAdvSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdvSearchActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdvSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 30));

        buttonCreateEvent.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        buttonCreateEvent.setText("Create Event");
        jPanel1.add(buttonCreateEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 120, 30));

        tableSearchEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Date", "Places Available", "Code Event", "Price", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSearchEvent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 570, 240));

        jButton1.setText("Ok");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 50, 30));

        jTabbedPane2.addTab("Events", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 630, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSearchEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchEventActionPerformed

    private void buttonAdvSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdvSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdvSearchActionPerformed

    private void textSearchEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSearchEventMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchEventMouseClicked

    private void textSearchEventKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchEventKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchEventKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdvSearch;
    private javax.swing.JButton buttonCreateEvent;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tableSearchEvent;
    private javax.swing.JTextField textSearchEvent;
    // End of variables declaration//GEN-END:variables
}
