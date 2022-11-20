
package DAO;

import BEAN.Rol;
import BEAN.Rol;
import BEAN.Rol;
import UTIL.*;
import java.sql.ResultSet;
import java.util.Vector;

public class rolDAO {

    public rolDAO() {
    }
    
    public void insertaRol(Rol rol){ //no
        DbBean con = new DbBean();
        String sql;
        sql = "insert into Rol values("+ rol.getCod_Rol() +", '"+ rol.getDescripcion() +"', "+ rol.getNivel() +", "+ rol.getId_User_Crea();
        sql += ", '"+ rol.getFech_Crea() +"', "+ rol.getId_User_Alter() +", '"+ rol.getFech_Alter() +"')";
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
    
    public void actualizaRol(Rol rol){ //no
        DbBean con = new DbBean();
        String sql;
        sql = "update Rol set Descripcion = '"+ rol.getDescripcion() +"', Nivel = "+ rol.getNivel() +", id_User_Crea = "+ rol.getId_User_Crea();
        sql += ", fech_Crea = '"+ rol.getFech_Crea() +"', id_User_Alter = "+ rol.getId_User_Alter() +", fech_Alter = '"+ rol.getFech_Alter();
        sql += " where Cod_Rol = "+ rol.getCod_Rol();
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
    
    public Vector<Rol> listaRol(boolean sw, String cad){ //no
        DbBean con = new DbBean();
        String sql;
        Vector<Rol> lista = new Vector<Rol>();
        
        sql = "select * from Rol ";
        if(sw){
            sql += "where Cod_Rol ='"+ cad +"' or Descripcion like '"+ cad +"%' or Nivel = '"+ cad +"'";
        }
        System.out.println(sql);
        
        try{
            ResultSet resultado;
            resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                Rol rol = new Rol();
                rol.setCod_Rol(resultado.getInt(1));
                rol.setDescripcion(resultado.getString(2));
                rol.setNivel(resultado.getInt(3));
                rol.setId_User_Crea(resultado.getInt(4));
                rol.setFech_Crea(resultado.getDate(5));
                rol.setId_User_Alter(resultado.getInt(6));
                rol.setFech_Alter(resultado.getDate(7));
                lista.add(rol);
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
