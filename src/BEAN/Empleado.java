
package BEAN;

import java.util.Date;

public class Empleado {
    private int Cod_Empleado;
    private String Nombre;
    private String Apellido;
    private String DNI;
    private Date fech_Nacimiento;
    private int Cod_Rol;
    private int Estado;
    private int id_User_Crea;
    private Date fech_Crea;
    private int id_User_Alter;
    private Date fech_Alter;

    public Empleado() {
    }

    public Empleado(int Cod_Empleado, String Nombre, String Apellido, String DNI, Date fech_Nacimiento, int Cod_Rol, int Estado, int id_User_Crea, Date fech_Crea, int id_User_Alter, Date fech_Alter) {
        this.Cod_Empleado = Cod_Empleado;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.fech_Nacimiento = fech_Nacimiento;
        this.Cod_Rol = Cod_Rol;
        this.Estado = Estado;
        this.id_User_Crea = id_User_Crea;
        this.fech_Crea = fech_Crea;
        this.id_User_Alter = id_User_Alter;
        this.fech_Alter = fech_Alter;
    }

    public int getCod_Empleado() {
        return Cod_Empleado;
    }

    public void setCod_Empleado(int Cod_Empleado) {
        this.Cod_Empleado = Cod_Empleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFech_Nacimiento() {
        return fech_Nacimiento;
    }

    public void setFech_Nacimiento(Date fech_Nacimiento) {
        this.fech_Nacimiento = fech_Nacimiento;
    }

    public int getCod_Rol() {
        return Cod_Rol;
    }

    public void setCod_Rol(int Cod_Rol) {
        this.Cod_Rol = Cod_Rol;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
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
