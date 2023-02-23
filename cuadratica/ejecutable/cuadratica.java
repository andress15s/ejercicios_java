package cuadratica.ejecutable;

import javax.swing.JOptionPane;

public class cuadratica 
{
   
    int a = 0;
    int b = 0;
    int c = 0;

    public cuadratica()
{
    //input

    

    a = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de a: "));
    b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de b: "));
    c = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de c: "));

    //processing

    double determinante = Math.pow(b, 2)-(4*a*c);

    if (determinante > 0 )
    {
        Double r1 = ((b *(-1)) + Math.sqrt(determinante)) / (2*a);
        Double r2 = ((b *(-1)) - Math.sqrt(determinante)) / (2*a);
        JOptionPane.showMessageDialog(null,"la raiz 1 es: " + r1 + ", "+ "la raiz 2 es: " + r2);
    }

    else
    { 
        JOptionPane.showMessageDialog(null, "el determinante es negativo y no se puede completar la operacion");
    }
}

    public static void main(String[] args) 
   {
        new cuadratica();
   } 
}
