package costo_minuto.ejecutable;

import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) 
    {
        
        //declaracion variables

        int duracion_llamada;
        int costo_llamada;
        

        //input

        duracion_llamada = Integer.parseInt(JOptionPane.showInputDialog("digite la duracion de la llamada: "));

        //processing

        if (duracion_llamada > 3)
        {
            costo_llamada = 300 + 50*(duracion_llamada - 3);
        }
  
        else
            {
                costo_llamada = 300;
            }

        //output

        JOptionPane.showMessageDialog(null,"el valor a pagar es: " + " $" + costo_llamada);




    }
    
}
