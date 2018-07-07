/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DAO.AddettoDao;
import GestioneTabella.MyDefaultTableModel;
import View.GeneralPanel;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Pirozzi
 */
public class ControllerTableAddetto extends ControllerTable{

    private AddettoDao dao;
    private GeneralPanel view;
    
    
    public ControllerTableAddetto(AddettoDao dao,GeneralPanel view) {
        super(view.getTableSearchGeneral(),new HashMap<String,Component>());
        comp.put("button1",view.getButtonDeleteAdvSearch());
        comp.put("button2",view.getButtonDeleteSearch());
        this.dao = dao;
        this.view = view;
        this.view.addKeyListener(this);
        
    }
    
    

    @Override
    public void keyReleased(KeyEvent e) {
       
        MyDefaultTableModel tab = (MyDefaultTableModel) table.getModel();
        //SE PREMO INVIO E LA CELLA è EDITABILE.FAI UPDATE
        //ROW E COLUMN = -1 POICHE SE ENTRO QUI ,NON HO + LA CELLA EDITABILE
        if(e.getKeyChar()=='\n' && row != -1 && column != -1 && table.isCellEditable(row, column) ) 
        {
            try {
                tab.setColumnEditable(-1);
                tab.setRowEditable(-1);
                String value = view.getTableSearchGeneral().getValueAt(row, column).toString();
                if(!table.getColumnName(column).equals("EMAIL"))
                    value = value.toUpperCase();
                value= value.replace(",",".");
                table.setValueAt(value, row, column);
                dao.updateAddetto(value,table.getColumnName(column),table.getModel().getValueAt(row,tab.getId_column()).toString());
                row = -1;
                column=-1;
            } catch (SQLException ex) {
                  String msg = ex.getMessage();
                  JOptionPane.showMessageDialog(view,msg, "Errore :" + ex.getErrorCode(),JOptionPane.ERROR_MESSAGE);
                  resetValueTable(row, column,oldvalue);
  
            }
        }
        else
        {
           //se non premo invio,RESETTO LA CELLA AL VALORE PRECEDENTE
            //ROW = -1 E COL = -1 PERCHè UNA VOLTA QUI NON HO PIU LA CELLA EDITABILE,solo col doppio click è editabile
            //-------------------------------->CAMBIATO QUA DA SELECTED A CONVERT.
            if(view.getTableSearchGeneral().getSelectedRow() != row || view.getTableSearchGeneral().getSelectedColumn() != column)
            {  
                tab.setColumnEditable(-1);
                tab.setRowEditable(-1);
               if(row!= -1 && column != -1)
                  resetValueTable(row, column,oldvalue);
               row = -1;
               column = -1;
               for(String s : comp.keySet())
                   comp.get(s).setEnabled(true);
            }
            //sto cambiando casella senza invio,quindi setto la cella cliccata nuovamente non editabile.
            
            
        }
          //ho confermato update o ho abbandonato la,quindi setto la cella cliccata nuovamente non editabile.
            
    }
    
}
