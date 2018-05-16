/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.ControllerAddetto;


import Model.Addetto.AddettiModel;
import View.AddettiView;
import View.GeneralPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


/**
 *
 * @author Pirozzi
 */
public class ControllerKeyAddetto extends KeyAdapter{
    
    GeneralPanel view;
    AddettiModel model;
  
 
    @Override
    public void keyReleased(KeyEvent e) {
        
            
           if(view.getTextNameGeneralSearch().getText().trim().length()>0)
           {
             if(e.getKeyChar()=='\n')
            {
                String testo = view.getTextNameGeneralSearch().getText();
                ArrayList<String> parole  = EstraiParoleChiavi(testo);
                model.doSearch(parole);
            }
           }
        
    }
    
    public void setModel(AddettiModel model)
    {
        this.model = model;
    }
    
    public void setView(GeneralPanel view)
    {
        this.view = view;
    }
    
     public  ArrayList<String> EstraiParoleChiavi(String testo)
    {
       
        ArrayList<String> parolechiavi= new ArrayList<>();
         
                   while(testo.contains(" "))
                   {
                      if(testo.indexOf(" ")!= 0) //primo carattere non è uno spazio
                      {
                          parolechiavi.add(testo.substring(0,testo.indexOf(" ")));//prende sottostringa
                      }
                        
                       testo = testo.substring(testo.indexOf(" ")+1,testo.length()); 
                      
                   }
                  if(testo.trim().length()!=0 )//controllo che l'ultimo carattere non è uno spazio
                  {
                      parolechiavi.add(testo);
                  }//conterrà tutte le parole chiavi
             return parolechiavi;
    }

}
