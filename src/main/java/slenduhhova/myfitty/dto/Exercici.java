
package slenduhhova.myfitty.dto;

/**
 *
 * @author annas
 */
public class Exercici {
    private int Id;
    private String NomExercici;
    private String Descripcio;
    private String DemoFoto;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomExercici() {
        return NomExercici;
    }

    public void setNomExercici(String NomExercici) {
        this.NomExercici = NomExercici;
    }

    public String getDescripcio() {
        return Descripcio;
    }

    public void setDescripcio(String Descripcio) {
        this.Descripcio = Descripcio;
    }

    public String getDemoFoto() {
        return DemoFoto;
    }

    public void setDemoFoto(String DemoFoto) {
        this.DemoFoto = DemoFoto;
    }
}
