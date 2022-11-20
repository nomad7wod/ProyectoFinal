
package BEAN;

import java.util.Date;

public class Usuarios {
    private int Cod_Usuario;
    private int Cod_Empleado;
    private String Usuario;
    private String Contra;
    private Date fech_Crea;
    private Date fech_Alter;

    public Usuarios() {
    }

    public Usuarios(int Cod_Usuario, int Cod_Empleado, String Usuario, String Contra, Date fech_Crea, Date fech_Alter) {
        this.Cod_Usuario = Cod_Usuario;
        this.Cod_Empleado = Cod_Empleado;
        this.Usuario = Usuario;
        this.Contra = Contra;
        this.fech_Crea = fech_Crea;
        this.fech_Alter = fech_Alter;
    }

    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public int getCod_Empleado() {
        return Cod_Empleado;
    }

    public void setCod_Empleado(int Cod_Empleado) {
        this.Cod_Empleado = Cod_Empleado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public Date getFech_Crea() {
        return fech_Crea;
    }

    public void setFech_Crea(Date fech_Crea) {
        this.fech_Crea = fech_Crea;
    }

    public Date getFech_Alter() {
        return fech_Alter;
    }

    public void setFech_Alter(Date fech_Alter) {
        this.fech_Alter = fech_Alter;
    }
    
}
