/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Runner.RunMVCAddetti;
import Runner.RunMVCCustomer;
import Runner.RunMVCEvents;
import Runner.TempRunMVCAddetti;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;


/**
 *
 * @author giuli
 */
public class GeneralView extends javax.swing.JFrame{

    String event;
    /**
     * Creates new form EventView
     */
    public GeneralView() {
        
        initComponents();
        RunMVCEvents runEvents = new RunMVCEvents();
        RunMVCAddetti runSecurity = new RunMVCAddetti();
        RunMVCCustomer runCustomer = new RunMVCCustomer();
        runEvents.startRunMVCEvents();
        runSecurity.startMVCAddetti();
        runCustomer.startMVCCustomer();
        jTabbedMenu.add("Events",runEvents.getEvtView());
        jTabbedMenu.add("Customers",runCustomer.getCustomerView());
        jTabbedMenu.add("Security",runSecurity.getView());
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedMenu = new javax.swing.JTabbedPane();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedMenu.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedMenu.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        getContentPane().add(jTabbedMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedMenu;
    // End of variables declaration//GEN-END:variables

    
}
