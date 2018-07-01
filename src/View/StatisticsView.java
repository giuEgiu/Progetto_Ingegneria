/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Factory.Charts;
import Factory.GenerateChart;
import Factory.LineChart;
import java.awt.Color;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author giuli
 */
public class StatisticsView extends javax.swing.JPanel {

    /**
     * Creates new form Statistics
     */
    public StatisticsView() {
        initComponents();
        buttonGenerateGraph.setActionCommand("GENERATE");
        this.comboDateStatisticFrom.setVisible(false);
        this.comboDateStatisticTo.setVisible(false);
        this.comboStatisticEventType.setVisible(false);
        this.buttonGenerateGraph.setEnabled(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        for(Integer i=2017;i<2100;++i)
        {
            comboDateStatisticFrom.addItem(i.toString());
            comboDateStatisticTo.addItem(i.toString());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboStatisticType = new javax.swing.JComboBox<>();
        buttonGenerateGraph = new javax.swing.JButton();
        comboDateStatisticTo = new javax.swing.JComboBox<>();
        comboDateStatisticFrom = new javax.swing.JComboBox<>();
        comboStatisticEventType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(590, 490));
        setPreferredSize(new java.awt.Dimension(590, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboStatisticType.setBackground(new java.awt.Color(255, 204, 104));
        comboStatisticType.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        comboStatisticType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Statistic Type", "Average age for events", "Tickets sold over the years", "Presences over the years by event", "Earnings over the years" }));
        add(comboStatisticType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 270, 40));

        buttonGenerateGraph.setBackground(new java.awt.Color(255, 204, 104));
        buttonGenerateGraph.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        buttonGenerateGraph.setText("Generate Chart");
        buttonGenerateGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerateGraphActionPerformed(evt);
            }
        });
        add(buttonGenerateGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 160, 50));

        comboDateStatisticTo.setBackground(new java.awt.Color(255, 204, 104));
        comboDateStatisticTo.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        add(comboDateStatisticTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 120, 30));

        comboDateStatisticFrom.setBackground(new java.awt.Color(255, 204, 104));
        comboDateStatisticFrom.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        comboDateStatisticFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDateStatisticFromActionPerformed(evt);
            }
        });
        add(comboDateStatisticFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, 30));

        comboStatisticEventType.setBackground(new java.awt.Color(255, 204, 104));
        comboStatisticEventType.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        comboStatisticEventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Event Type", "Sport", "Cinema", "Concert", "Theater" }));
        add(comboStatisticEventType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, 40));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FROM");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 120, 30));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TO");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/pastello.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(590, 490));
        jLabel1.setPreferredSize(new java.awt.Dimension(590, 490));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 680));
    }// </editor-fold>//GEN-END:initComponents

    public JButton getButtonGenerateGraph() {
        return buttonGenerateGraph;
    }

    public void setButtonGenerateGraph(JButton buttonGenerateGraph) {
        this.buttonGenerateGraph = buttonGenerateGraph;
    }

    public JComboBox<String> getComboDateStatisticFrom() {
        return comboDateStatisticFrom;
    }

    public void setComboDateStatisticFrom(JComboBox<String> comboDateStatisticFrom) {
        this.comboDateStatisticFrom = comboDateStatisticFrom;
    }

    public JComboBox<String> getComboDateStatisticTo() {
        return comboDateStatisticTo;
    }

    public void setComboDateStatisticTo(JComboBox<String> comboDateStatisticTo) {
        this.comboDateStatisticTo = comboDateStatisticTo;
    }

    public JComboBox<String> getComboStatisticEventType() {
        return comboStatisticEventType;
    }

    public void setComboStatisticEventType(JComboBox<String> comboStatisticEventType) {
        this.comboStatisticEventType = comboStatisticEventType;
    }

    public JComboBox<String> getComboStatisticType() {
        return comboStatisticType;
    }

    public void setComboStatisticType(JComboBox<String> comboStatisticType) {
        this.comboStatisticType = comboStatisticType;
    }

    private void buttonGenerateGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerateGraphActionPerformed
    }//GEN-LAST:event_buttonGenerateGraphActionPerformed

    private void comboDateStatisticFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDateStatisticFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDateStatisticFromActionPerformed

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    
    public void generateGraph(Map<Comparable,Number> map,String choise)
    {
        GenerateChart charts = new GenerateChart();
        //Average age for events, Tickets sold over the years, Presences over the years by event, Earnings over the years
        if(choise.equals("Average age for events"))
        {
            Charts chart = charts.getChart("PIE");
            ChartFrame frame = new ChartFrame("Bar Chart for Parameters",chart.drawChart(map));
            frame.setSize(450,500);
            frame.setVisible(true);
            
        }
        else if(choise.equals("Tickets sold over the years"))
        {
            Charts chart = charts.getChart("LINE");
            ChartFrame frame = new ChartFrame("Bar Chart for Parameters",chart.drawChart(map));
            JFreeChart k = chart.drawChart(map);
            
            frame.setSize(450,500);
            frame.setVisible(true);
        }
        else if(choise.equals("Presences over the years by event"))
        {
             Charts chart = charts.getChart("LINE");
            ChartFrame frame = new ChartFrame("Bar Chart for Parameters",chart.drawChart(map));
            frame.setSize(450,500);
            frame.setVisible(true);
        }
        else if(choise.equals("Earnings over the years"))
        {
            Charts chart = charts.getChart("LINE");
            ChartFrame frame = new ChartFrame("Bar Chart for Parameters",chart.drawChart(map));
            frame.setSize(450,500);
            frame.setVisible(true);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGenerateGraph;
    private javax.swing.JComboBox<String> comboDateStatisticFrom;
    private javax.swing.JComboBox<String> comboDateStatisticTo;
    private javax.swing.JComboBox<String> comboStatisticEventType;
    private javax.swing.JComboBox<String> comboStatisticType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
