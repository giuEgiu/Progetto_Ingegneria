/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessComponent.Factory;

import java.util.Map;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author INGSW2017_22
 */
public interface Charts
{    
    public JFreeChart drawChart(Map<Comparable,Number> map);
}
