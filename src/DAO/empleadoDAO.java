
package DAO;

import BEAN.Empleado;
import BEAN.Empleado;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class empleadoDAO {

    public empleadoDAO() {
    }
    
    public void insertaEmpleado(Empleado emp){ //no
        DbBean con = new DbBean();
        String sql;
        sql = "insert into Empleado values ("+ emp.getCod_Empleado() +", '"+ emp.getNombre() +"', '"+ emp.getApellido() +"', ";
        sql += "'"+ emp.getDNI() +"', '"+ emp.getFech_Nacimiento() +"', "+ emp.getCod_Rol() +", "+ emp.getEstado() +", ";
        sql += emp.getId_User_Crea() +", '"+ emp.getFech_Crea() +"', "+ emp.getId_User_Alter() +", '"+ emp.getFech_Alter() +"')";
        System.out.println(sql);
        
        try{
            con.ejecutaSQL(sql);
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
    }
    
    public void actualizaEmpleado(Empleado emp){ //no
        DbBean con = new DbBean();
        String sql;
        sql = "update Empleado set Nombre = '"+ emp.getNombre() +"', Apellido = '"+ emp.getApellido() +"', DNI = '"+ emp.getDNI() +"', ";
        sql += "fech_Nacimiento = '"+ emp.getFech_Nacimiento() +"', Cod_Rol = "+ emp.getCod_Rol() +", Estado = "+ emp.getEstado() +", ";
        sql += "id_User_Crea = "+ emp.getId_User_Crea() +", fech_Crea = '"+ emp.getFech_Crea() +"', id_User_Alter = "+ emp.getId_User_Alter() +", ";
        sql += "fech_Alter = '"+ emp.getFech_Alter() +"' where Cod_Empleado = "+ emp.getCod_Empleado();
        System.out.println(sql);
        
        try{
            con.ejecutaSQL(sql);
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
    }
    
    public Vector<Empleado> listaEmp(boolean sw, String cad){ //no
        DbBean con = new DbBean();
        Vector<Empleado> lista = new Vector<Empleado>();
        String sql;
        
        sql = "select * from Empleado ";
        if(sw){
            sql += "where Cod_Empleado = "+ cad +" or Nombre like '"+ cad +"%' or Apellido like '"+ cad +"%'";
        }
        System.out.println(sql);
        
        try{
            ResultSet resultado;
            resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                Empleado emp = new Empleado();
                emp.setCod_Empleado(resultado.getInt(1));
                emp.setNombre(resultado.getString(2));
                emp.setApellido(resultado.getString(3));
                emp.setDNI(resultado.getString(4));
                emp.setFech_Nacimiento(resultado.getDate(5));
                emp.setCod_Rol(resultado.getInt(6));
                emp.setEstado(resultado.getInt(7));
                emp.setId_User_Crea(resultado.getInt(8));
                emp.setFech_Crea(resultado.getDate(9));
                emp.setId_User_Alter(resultado.getInt(10));
                emp.setFech_Alter(resultado.getDate(11));
                lista.add(emp);
            }
            resultado.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }
        catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return lista;
    }
}
