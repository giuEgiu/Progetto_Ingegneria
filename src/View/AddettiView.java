/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GeneralController;
import Model.MyDefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author Pirozzi
 */
public class AddettiView extends javax.swing.JFrame implements Observer{

    private javax.swing.JTextField CercaText;
    private javax.swing.JButton CreateAddettoButton;
    private javax.swing.JButton SearchAdvancedButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTable TabellaAddetto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    
    public AddettiView() {
        initComponents();
    }

    public String getCercaText()
    {
        return CercaText.getText();
    }
 
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabellaAddetto = new javax.swing.JTable();
        CercaText = new javax.swing.JTextField();
        CreateAddettoButton = new javax.swing.JButton();
        SearchAdvancedButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Addetti");
        jLabel1.setOpaque(true);
        SearchButton.setActionCommand("CERCA");
              TabellaAddetto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabellaAddetto);

        CercaText.setText("Scrivi Qualcosa");
        CercaText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CreateAddettoButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CreateAddettoButton.setText("Crea Addetto");

        SearchAdvancedButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SearchAdvancedButton.setText("Ricerca Avanzata");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CERCA");

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SearchButton.setText("Cerca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchAdvancedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(CercaText, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(CreateAddettoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CercaText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateAddettoButton)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchAdvancedButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
        
    
    @Override
    public void update(Observable o, Object arg) {
        
    
        
            TabellaAddetto.setModel((MyDefaultTableModel) arg);
            //rimuovo la colonna dalla Jtable. Remove vuole una TableColumn che mi prendo dal modello
            TabellaAddetto.removeColumn(TabellaAddetto.getColumnModel().getColumn(7));
            
            //SUCCESSIVAMENTE SARA ANCORA PRESENTE NEL MODELLO.TabellaAddetto.getModel().getValueAt()
            
    }
    
    public void setActionControllerButton(GeneralController nuovo)
    {
        SearchButton.addActionListener(nuovo);
    }
      
    public void setControllerKeyTable(KeyAdapter nuovo)
    {
        TabellaAddetto.addKeyListener(nuovo);
    }
        
    /**
     * @param args the command line arguments
     */
    public void  setControllerText(KeyListener control)
    {
        CercaText.addKeyListener(control);
          
    }


 
}
