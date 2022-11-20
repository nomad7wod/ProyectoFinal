package BEAN;


public class Equipo {
    private int Cod_Equipo;
    private String Descripcion;
    private double Costo_Adqui;
    private int Id_User_Crea;
    private String fech_Crea;
    private int Id_User_Alter;
    private String fech_Alter;

    public Equipo() {
    }

    public Equipo(int Cod_Equipo, String Descripcion, double Costo_Adqui, int Id_User_Crea, String fech_Crea, int Id_User_Alter, String fech_Alter) {
        this.Cod_Equipo = Cod_Equipo;
        this.Descripcion = Descripcion;
        this.Costo_Adqui = Costo_Adqui;
        this.Id_User_Crea = Id_User_Crea;
        this.fech_Crea = fech_Crea;
        this.Id_User_Alter = Id_User_Alter;
        this.fech_Alter = fech_Alter;
    }

    public int getCod_Equipo() {
        return Cod_Equipo;
    }

    public void setCod_Equipo(int Cod_Equipo) {
        this.Cod_Equipo = Cod_Equipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getCosto_Adqui() {
        return Costo_Adqui;
    }

    public void setCosto_Adqui(double Costo_Adqui) {
        this.Costo_Adqui = Costo_Adqui;
    }

    public int getId_User_Crea() {
        return Id_User_Crea;
    }

    public void setId_User_Crea(int Id_User_Crea) {
        this.Id_User_Crea = Id_User_Crea;
    }

    public String getFech_Crea() {
        return fech_Crea;
    }

    public void setFech_Crea(String fech_Crea) {
        this.fech_Crea = fech_Crea;
    }

    public int getId_User_Alter() {
        return Id_User_Alter;
    }

    public void setId_User_Alter(int Id_User_Alter) {
        this.Id_User_Alter = Id_User_Alter;
    }

    public String getFech_Alter() {
        return fech_Alter;
    }

    public void setFech_Alter(String fech_Alter) {
        this.fech_Alter = fech_Alter;
    }
    
    
}
