/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneTabella;

import DB.DAO.ManagementTurnDao;
import View.ManagementTurnView;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Pirozzi
 */
public class ControllerUpdateTurn extends ControllerTable{
    
    private ManagementTurnDao dao;
    private ManagementTurnView view;
   
    public ControllerUpdateTurn(ManagementTurnDao dao,ManagementTurnView view) {
        
        super(view.getTableMenagementEvents(),new HashMap<String,Component>());
        comp.put("button1",view.getButtonDelete());
        this.dao = dao;
        this.view = view;
    }
    
      @Override
    public void keyReleased(KeyEvent e) {
       
        MyDefaultTableModel tab = (MyDefaultTableModel) table.getModel();
        //SE PREMO INVIO E LA CELLA è EDITABILE.FAI UPDATE
        //ROW E COLUMN = -1 POICHE SE ENTRO QUI ,NON HO + LA CELLA EDITABILE
        if(e.getKeyChar()=='\n' && table.isCellEditable(row, column) && row != -1 && column != -1) 
        {
            try {
                tab.setColumnEditable(-1);
                tab.setRowEditable(-1);
                String value = view.getTableMenagementEvents().getValueAt(row, column).toString();
                if(!view.getTableMenagementEvents().getColumnName(column).equals("EMAIL"))
                    value = value.toUpperCase();
                value= value.replace(",",".");
                view.getTableMenagementEvents().setValueAt(value, row, column);
                //int updateTurn(int turn,String field,Object new_value) throws SQLException;
                dao.updateTurn((Integer)(Integer.parseInt(table.getValueAt(row,tab.getId_column()).toString())),table.getColumnName(column),value);
                row = -1;
                column=-1;
            } catch (SQLException ex) {
                  String msg = ex.getMessage();
                  JOptionPane.showMessageDialog(view,msg, "Errore :" + ex.getErrorCode(),JOptionPane.ERROR_MESSAGE);
                //  view.resetValueTable(row, column,oldvalue);//da fare.
  
            }
        }
        else
        {
            
           //se non premo invio,RESETTO LA CELLA AL VALORE PRECEDENTE
            //ROW = -1 E COL = -1 PERCHè UNA VOLTA QUI NON HO PIU LA CELLA EDITABILE,solo col doppio click è editabile
            if(table.getSelectedRow() != row || table.getSelectedColumn() != column)
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