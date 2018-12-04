package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Adestrador extends Plantilla {
    private String idFederacion;

    public Adestrador(String nome, String apelidos, int id, int edad, String idFederacion) {
        super(nome,apelidos,id,edad);
        this.idFederacion = idFederacion;
    }
    
    private void dirixirPartido(){}
    private void dirixirAdestramento(){}
    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxa o entrenador:"+super.getNome());
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "O adestrador é:\n"+ super.toString() +  "\nIdFederacion=" + idFederacion;
    }

}
    
    
