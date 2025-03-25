package slenduhhova.myfitty.dto;

/**
 * Representa un ejercicio en el sistema, incluyendo su identificador, nombre,
 * descripción y una imagen de demostración.
 * 
 * @author annas
 */
public class Exercici {

    /**
     * Identificador único del ejercicio.
     */
    private int Id;

    /**
     * Nombre del ejercicio.
     */
    private String NomExercici;

    /**
     * Descripción del ejercicio.
     */
    private String Descripcio;

    /**
     * URL o nombre del archivo de la imagen de demostración del ejercicio.
     */
    private String DemoFoto;

    /**
     * Constructor de la clase Exercici.
     *
     * @param Id Identificador único del ejercicio.
     * @param NomExercici Nombre del ejercicio.
     * @param Descripcio Descripción del ejercicio.
     * @param DemoFoto URL o nombre del archivo de la imagen de demostración.
     */
    public Exercici(int Id, String NomExercici, String Descripcio, String DemoFoto) {
        this.Id = Id;
        this.NomExercici = NomExercici;
        this.Descripcio = Descripcio;
        this.DemoFoto = DemoFoto;
    }
    
    /**
     * Constructor vacío de la clase Exercici.
     */
    public Exercici() {
    }


    /**
     * Obtiene el identificador del ejercicio.
     *
     * @return el ID del ejercicio.
     */
    public int getId() {
        return Id;
    }

    /**
     * Establece el identificador del ejercicio.
     *
     * @param Id el nuevo identificador del ejercicio.
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * Obtiene el nombre del ejercicio.
     *
     * @return el nombre del ejercicio.
     */
    public String getNomExercici() {
        return NomExercici;
    }

    /**
     * Establece el nombre del ejercicio.
     *
     * @param NomExercici el nuevo nombre del ejercicio.
     */
    public void setNomExercici(String NomExercici) {
        this.NomExercici = NomExercici;
    }

    /**
     * Obtiene la descripción del ejercicio.
     *
     * @return la descripción del ejercicio.
     */
    public String getDescripcio() {
        return Descripcio;
    }

    /**
     * Establece la descripción del ejercicio.
     *
     * @param Descripcio la nueva descripción del ejercicio.
     */
    public void setDescripcio(String Descripcio) {
        this.Descripcio = Descripcio;
    }

    /**
     * Obtiene la imagen de demostración del ejercicio.
     *
     * @return la URL o el nombre del archivo de la imagen de demostración.
     */
    public String getDemoFoto() {
        return DemoFoto;
    }

    /**
     * Establece la imagen de demostración del ejercicio.
     *
     * @param DemoFoto la nueva imagen de demostración del ejercicio.
     */
    public void setDemoFoto(String DemoFoto) {
        this.DemoFoto = DemoFoto;
    }

    /**
     * Devuelve una representación en cadena del objeto.
     *
     * @return una cadena que representa el ejercicio en el formato: "Nombre
     * 'Descripción' Imagen"
     */
    @Override
    public String toString() {
        return NomExercici + "  \"" + Descripcio + "\"  " + DemoFoto;
    }
}
