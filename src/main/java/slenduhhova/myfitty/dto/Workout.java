package slenduhhova.myfitty.dto;

/**
 * Representa un entrenamiento programado para un usuario en una fecha
 * específica. Contiene información sobre el identificador del entrenamiento, la
 * fecha, el usuario asignado y comentarios adicionales.
 *
 * @author annas
 */
public class Workout {

    /**
     * Identificador único del entrenamiento.
     */
    private int Id;

    /**
     * Constructor que inicializa un entrenamiento con todos sus atributos.
     *
     * @param Id Identificador único del entrenamiento.
     * @param ForDate Fecha programada para el entrenamiento.
     * @param UserId Identificador del usuario al que pertenece el
     * entrenamiento.
     * @param Comments Comentarios adicionales sobre el entrenamiento.
     */
    public Workout(int Id, String ForDate, int UserId, String Comments) {
        this.Id = Id;
        this.ForDate = ForDate;
        this.UserId = UserId;
        this.Comments = Comments;
    }

    /**
     * Constructor vacío de la clase Workout.
     */
    public Workout() {
    }

    /**
     * Fecha programada para el entrenamiento en formato de cadena.
     */
    private String ForDate;

    /**
     * Identificador del usuario al que pertenece el entrenamiento.
     */
    private int UserId;

    /**
     * Comentarios adicionales sobre el entrenamiento.
     */
    private String Comments;

    /**
     * Obtiene el identificador del entrenamiento.
     *
     * @return el ID del entrenamiento.
     */
    public int getId() {
        return Id;
    }

    /**
     * Establece el identificador del entrenamiento.
     *
     * @param Id el nuevo identificador del entrenamiento.
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * Obtiene la fecha programada del entrenamiento.
     *
     * @return la fecha programada en formato de cadena.
     */
    public String getForDate() {
        return ForDate;
    }

    /**
     * Establece la fecha programada del entrenamiento.
     *
     * @param ForDate la nueva fecha programada del entrenamiento.
     */
    public void setForDate(String ForDate) {
        this.ForDate = ForDate;
    }

    /**
     * Obtiene el identificador del usuario al que pertenece el entrenamiento.
     *
     * @return el ID del usuario.
     */
    public int getUserId() {
        return UserId;
    }

    /**
     * Establece el identificador del usuario al que pertenece el entrenamiento.
     *
     * @param UserId el nuevo ID del usuario.
     */
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    /**
     * Obtiene los comentarios adicionales del entrenamiento.
     *
     * @return los comentarios del entrenamiento.
     */
    public String getComments() {
        return Comments;
    }

    /**
     * Establece los comentarios adicionales del entrenamiento.
     *
     * @param Comments los nuevos comentarios del entrenamiento.
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    /**
     * Devuelve una representación en cadena del objeto {@code Workout}.
     *
     * @return el identificador del entrenamiento como cadena.
     */
    @Override
    public String toString() {
        return String.valueOf(Id);
    }
}
