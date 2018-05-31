/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneTabella;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Pirozzi
 */
public class MyTableCellRenderer extends JLabel implements TableCellRenderer{

   public MyTableCellRenderer() {
     this.setOpaque(false);
     this.setFocusable(false);
     
  }
   
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        this.setOpaque(false);
        
        
        if(value != null)
        {
            this.setText((String) value);
            this.setToolTipText(value.toString());
        }
        else
        {
            this.setText("null");
        }
        if(isSelected)
        {   this.setOpaque(true);
            this.setBackground(new Color(244,164,96));
        }
       
       if(hasFocus)
       {
           this.setOpaque(true);
           this.setBackground(new Color(86,170,255));
       }
      
       
       return this;
    }
    
    
  
}
