/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerAddetto.ControllerButtonAddetto;
import Controller.ControllerAddetto.ControllerTextAddetto;

/**
 *
 * @author giuli
 */
public class AddettiPanel extends GeneralPanel{
    
    private javax.swing.JButton buttonAdvGeneral;
    private javax.swing.JButton buttonBackSearchGeneral;
    private javax.swing.JButton buttonCreateGeneral;
    private javax.swing.JButton buttonOkAdvSearchGeneral;
    private javax.swing.JButton buttonOkSearchAddetto;
    private javax.swing.JComboBox<String> comboTypeGeneralSearch;
    private com.toedter.calendar.JDateChooser dateGeneral;
    private javax.swing.JPanel jPanelAdvSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSearchAddetto;
    private javax.swing.JTextField textUserGeneralSearch;
    private javax.swing.JTextField textCFGeneralSearch;
    private javax.swing.JTextField textSearchAddetto;
    
    public AddettiPanel()
    {
        super();
        this.setComponentsPanel();
    }
    
    public void setComponentsPanel()
    {
        buttonAdvGeneral = getButtonAdvGeneral();
        textCFGeneralSearch = getTextCodeGeneralSearch();
        textSearchAddetto = getTextSearchGeneral();
        textUserGeneralSearch = getTextNameGeneralSearch();
        jPanelAdvSearch = getjPanelAdvSearch();
        buttonOkSearchAddetto = getButtonOkSearchGeneral();
        buttonCreateGeneral = getButtonCreateGeneral();
        dateGeneral = getDateGeneral();
        comboTypeGeneralSearch = getComboTypeGeneralSearch();
        
        jPanelAdvSearch.setVisible(false);
        buttonCreateGeneral.setVisible(false);
        dateGeneral.setVisible(false);
        comboTypeGeneralSearch.setVisible(false);
        buttonAdvGeneral.setText("Advanced Search");
        textCFGeneralSearch.setText("Insert CF here...");
        textSearchAddetto.setText("Insert Name here...");
        textUserGeneralSearch.setText("Insert User here...");
        
        tableSearchAddetto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "NOME", "COGNOME", "CF", "EMAIL", "TEL", "STIPENDIO", "LIVELLO"
            }
         ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            
        });
        
    
    
        public void SetControllerButton(ControllerButtonAddetto controller)
        {
            buttonOkSearchAddetto.addActionListener(controller);
        }
        public void SetControllerText(ControllerTextAddetto controller)
        {
            textSearchAddetto.addKeyListener(controller);
        }
                
                
}
