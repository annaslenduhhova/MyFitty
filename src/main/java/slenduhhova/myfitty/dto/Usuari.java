package slenduhhova.myfitty.dto;

/**
 * Representa un usuario del sistema, incluyendo su información personal,
 * credenciales de acceso y estado como instructor.
 *
 * @author annas
 */
public class Usuari {

    /**
     * Identificador único del usuario.
     */
    private int Id;

    /**
     * Nombre del usuario.
     */
    private String Nom;

    /**
     * Correo electrónico del usuario.
     */
    private String Email;

    /**
     * Hash de la contraseña del usuario para almacenamiento seguro.
     */
    private String PasswordHash;

    /**
     * Foto del usuario almacenada como un array de bytes.
     */
    private byte[] Foto;

    /**
     * Nombre del archivo de la foto del usuario.
     */
    private String FotoFilename;

    /**
     * Indica si el usuario es un instructor.
     */
    private boolean Instructor;

    /**
     * ID del instructor asignado al usuario (si aplica).
     */
    private int AssignedInstructor;

    /**
     * Constructor con todos los atributos de la clase Usuari.
     *
     * @param Id Identificador único del usuario.
     * @param Nom Nombre del usuario.
     * @param Email Correo electrónico del usuario.
     * @param PasswordHash Hash de la contraseña del usuario.
     * @param Foto Foto del usuario en formato de bytes.
     * @param FotoFilename Nombre del archivo de la foto del usuario.
     * @param Instructor Indica si el usuario es un instructor.
     * @param AssignedInstructor ID del instructor asignado al usuario.
     */
    public Usuari(int Id, String Nom, String Email, String PasswordHash, byte[] Foto, String FotoFilename, boolean Instructor, int AssignedInstructor) {
        this.Id = Id;
        this.Nom = Nom;
        this.Email = Email;
        this.PasswordHash = PasswordHash;
        this.Foto = Foto;
        this.FotoFilename = FotoFilename;
        this.Instructor = Instructor;
        this.AssignedInstructor = AssignedInstructor;
    }

    /**
     * Constructor vacío de la clase Usuari.
     */
    public Usuari() {
    }

    /**
     * Obtiene el identificador del usuario.
     *
     * @return el ID del usuario.
     */
    public int getId() {
        return Id;
    }

    /**
     * Establece el identificador del usuario.
     *
     * @param Id el nuevo identificador del usuario.
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return el nombre del usuario.
     */
    public String getNom() {
        return Nom;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param Nom el nuevo nombre del usuario.
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return el correo electrónico del usuario.
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param Email el nuevo correo electrónico del usuario.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Obtiene el hash de la contraseña del usuario.
     *
     * @return el hash de la contraseña.
     */
    public String getPasswordHash() {
        return PasswordHash;
    }

    /**
     * Establece el hash de la contraseña del usuario.
     *
     * @param PasswordHash el nuevo hash de la contraseña.
     */
    public void setPasswordHash(String PasswordHash) {
        this.PasswordHash = PasswordHash;
    }

    /**
     * Obtiene la foto del usuario en formato de bytes.
     *
     * @return la foto del usuario como un array de bytes.
     */
    public byte[] getFoto() {
        return Foto;
    }

    /**
     * Establece la foto del usuario en formato de bytes.
     *
     * @param Foto la nueva foto del usuario en bytes.
     */
    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }

    /**
     * Obtiene el nombre del archivo de la foto del usuario.
     *
     * @return el nombre del archivo de la foto.
     */
    public String getFotoFilename() {
        return FotoFilename;
    }

    /**
     * Establece el nombre del archivo de la foto del usuario.
     *
     * @param FotoFilename el nuevo nombre del archivo de la foto.
     */
    public void setFotoFilename(String FotoFilename) {
        this.FotoFilename = FotoFilename;
    }

    /**
     * Indica si el usuario es un instructor.
     *
     * @return {@code true} si el usuario es instructor, {@code false} en caso
     * contrario.
     */
    public boolean isInstructor() {
        return Instructor;
    }

    /**
     * Establece el estado del usuario como instructor.
     *
     * @param Instructor {@code true} si el usuario es instructor, {@code false}
     * en caso contrario.
     */
    public void setInstructor(boolean Instructor) {
        this.Instructor = Instructor;
    }

    /**
     * Obtiene el ID del instructor asignado al usuario.
     *
     * @return el ID del instructor asignado.
     */
    public int getAssignedInstructor() {
        return AssignedInstructor;
    }

    /**
     * Establece el ID del instructor asignado al usuario.
     *
     * @param AssignedInstructor el nuevo ID del instructor asignado.
     */
    public void setAssignedInstructor(int AssignedInstructor) {
        this.AssignedInstructor = AssignedInstructor;
    }

    /**
     * Devuelve una representación en cadena del objeto.
     *
     * @return el nombre del usuario.
     */
    @Override
    public String toString() {
        return Nom;
    }
}
