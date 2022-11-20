
package BEAN;

import java.util.Date;

public class Rol {
    private int Cod_Rol;
    private String Descripcion;
    private int Nivel;
    private int id_User_Crea;
    private Date fech_Crea;
    private int id_User_Alter;
    private Date fech_Alter;

    public Rol() {
    }

    public Rol(int Cod_Rol, String Descripcion, int Nivel, int id_User_Crea, Date fech_Crea, int id_User_Alter, Date fech_Alter) {
        this.Cod_Rol = Cod_Rol;
        this.Descripcion = Descripcion;
        this.Nivel = Nivel;
        this.id_User_Crea = id_User_Crea;
        this.fech_Crea = fech_Crea;
        this.id_User_Alter = id_User_Alter;
        this.fech_Alter = fech_Alter;
    }

    public int getCod_Rol() {
        return Cod_Rol;
    }

    public void setCod_Rol(int Cod_Rol) {
        this.Cod_Rol = Cod_Rol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public int getId_User_Crea() {
        return id_User_Crea;
    }

    public void setId_User_Crea(int id_User_Crea) {
        this.id_User_Crea = id_User_Crea;
    }

    public Date getFech_Crea() {
        return fech_Crea;
    }

    public void setFech_Crea(Date fech_Crea) {
        this.fech_Crea = fech_Crea;
    }

    public int getId_User_Alter() {
        return id_User_Alter;
    }

    public void setId_User_Alter(int id_User_Alter) {
        this.id_User_Alter = id_User_Alter;
    }

    public Date getFech_Alter() {
        return fech_Alter;
    }

    public void setFech_Alter(Date fech_Alter) {
        this.fech_Alter = fech_Alter;
    }
    
    
}
