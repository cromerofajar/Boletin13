package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Plantilla {
    private int id, edad;
    private String nome,apelidos;
    
    public void concentrarse(){
        JOptionPane.showMessageDialog(null,"Concentrase a seleccion.");
    }
    
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxa a seleccion");
    }

    public Plantilla(String nome,String apelidos,int id,int edad){
        this.nome=nome;
        this.apelidos=apelidos;
        this.id=id;
        this.edad=edad;
    }
    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    @Override
    public String toString() {
        return"Nome=" + nome +  "\nApelidos=" + apelidos + "\nId=" + id + "\nEdad=" + edad ;
    }
    
}
