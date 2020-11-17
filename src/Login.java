
import javax.swing.JOptionPane;


public class Login {

    public static void main(String[] args){
        
        String usuario, clave;
      
        usuario = JOptionPane.showInputDialog(null, "Introduzca su usuario:");
        clave = JOptionPane.showInputDialog(null, "Introduzca su clave:");
        
        if(usuario.equalsIgnoreCase("leuris") && clave.equalsIgnoreCase("1122")){
            
            MDIInicio inicio = new MDIInicio();
            inicio.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos");
        }
    }
}
