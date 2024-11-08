
package slenduhhova.myfitty.dto;

/**
 *
 * @author annas
 */
public class Usuari {
    private int Id;
    private String Nom;
    private String Email;
    private String PasswordHash;
    private byte[] Foto;
    private String FotoFilename;
    private boolean Instructor;
    private int AssignedInstructor;   

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String PasswordHash) {
        this.PasswordHash = PasswordHash;
    }

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }

    public String getFotoFilename() {
        return FotoFilename;
    }

    public void setFotoFilename(String FotoFilename) {
        this.FotoFilename = FotoFilename;
    }

    public boolean isInstructor() {
        return Instructor;
    }

    public void setInstructor(boolean Instructor) {
        this.Instructor = Instructor;
    }

    public int getAssignedInstructor() {
        return AssignedInstructor;
    }

    public void setAssignedInstructor(int AssignedInstructor) {
        this.AssignedInstructor = AssignedInstructor;
    }
    
    @Override
    public String toString() {
        return Nom;
    }

}
