
package BEAN;




public class Tarea {
    private int Cod_Tarea;
    private String Descripcion;
    private int Nivel_Complejidad;
    private int id_User_Crea;
    private String fech_Crea;
    private int id_User_Alter;
    private String fech_Alter;

    public Tarea() {
    }

    public Tarea(int Cod_Tarea, String Descripcion, int Nivel_Complejidad, int id_User_Crea, String fech_Crea, int id_User_Alter, String fech_Alter) {
        this.Cod_Tarea = Cod_Tarea;
        this.Descripcion = Descripcion;
        this.Nivel_Complejidad = Nivel_Complejidad;
        this.id_User_Crea = id_User_Crea;
        this.fech_Crea = fech_Crea;
        this.id_User_Alter = id_User_Alter;
        this.fech_Alter = fech_Alter;
    }
    
    
    
    public int getCod_Tarea() {
        return Cod_Tarea;
    }

    public void setCod_Tarea(int Cod_Tarea) {
        this.Cod_Tarea = Cod_Tarea;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNivel_Complejidad() {
        return Nivel_Complejidad;
    }

    public void setNivel_Complejidad(int Nivel_Complejidad) {
        this.Nivel_Complejidad = Nivel_Complejidad;
    }

    public int getId_User_Crea() {
        return id_User_Crea;
    }

    public void setId_User_Crea(int id_User_Crea) {
        this.id_User_Crea = id_User_Crea;
    }

    public String getFech_Crea() {
        return fech_Crea;
    }

    public void setFech_Crea(String fech_Crea) {
        this.fech_Crea = fech_Crea;
    }

    public int getId_User_Alter() {
        return id_User_Alter;
    }

    public void setId_User_Alter(int id_User_Alter) {
        this.id_User_Alter = id_User_Alter;
    }

    public String getFech_Alter() {
        return fech_Alter;
    }

    public void setFech_Alter(String fech_Alter) {
        this.fech_Alter = fech_Alter;
    }
    
    
    
}
