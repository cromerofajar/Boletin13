package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Boletin13 {
    
    public static void main(String[] args) {
        Plantilla obx=new Plantilla("Jose","Baz Canarias",31,34);
        Xogador obxX=new Xogador("pepe","Perez Perez",3,21, 1,"patata");
        Adestrador obxB=new Adestrador("Carlos","Martinez Baz",32,35,"244h");
        Masaxista obxM=new Masaxista ("Marcos","Santiago Castilla",42,30,12,"alguna");

        obx.concentrarse();
        obx.viaxar();
        JOptionPane.showMessageDialog(null,obx.toString());
        obxX.viaxar();
        JOptionPane.showMessageDialog(null,obxX.toString());
        obxB.viaxar();
        JOptionPane.showMessageDialog(null,obxB.toString());
        obxM.viaxar();
        JOptionPane.showMessageDialog(null,obxM.toString());
    }
    
}
