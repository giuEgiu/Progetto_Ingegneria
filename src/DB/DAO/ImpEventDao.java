/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB.DAO;

import Model.Admin;
import Model.Event;
import View.EventView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author giuli
 */
public class ImpEventDao implements EventDao{
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    //override di tutti i metodi per ricercare, cancellare, modificare
    
    @Override
    public Set<Event> searchEvent(String evtName)
    {
        String query="SELECT * FROM EVENTO WHERE TITOLO=?";
        Set<Event> events = new HashSet();
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1,evtName);
            
            rs = ps.executeQuery();
            
            while(rs.next())
            {
                events.add((Event) rs.getObject(rs.getRow()));
            }
            rs.close();
            ps.close();   
            con.close();
        }
        catch(SQLException x)
        {
            System.out.println("Errore"); //dettagliare errore
        }
        
        return events;
    }

    @Override
    public Event advancedSearchEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
