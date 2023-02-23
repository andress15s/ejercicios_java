package ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        
        //declaracion

        int x;
        int y;
        int z;
        int mayor;

        //input

        x = Integer.parseInt(JOptionPane.showInputDialog("digite el  numero: "));

        y = Integer.parseInt(JOptionPane.showInputDialog("digite el  numero: "));

        z = Integer.parseInt(JOptionPane.showInputDialog("digite el  numero: "));

        //processing

        if(x>y)
        {
            if(x>z)
            {
                mayor = x;
            }
            else
            {
                mayor = z;
            }
        }
        else
        {
            if(y>z)
            {
                mayor = y;
            }
            else
            {
                mayor = z;
            }
        }

            //output

            JOptionPane.showMessageDialog(null, "el mayor entre: " + x +" , "+ y + " , " + z + " es el: "+ mayor, "mayor de 3 numeros",  JOptionPane.WARNING_MESSAGE);    




    }
}
