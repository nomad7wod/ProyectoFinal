
package DAO;

import BEAN.Usuarios;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.util.Vector;

public class usuariosDAO {

    public usuariosDAO() {
    }
    
    public boolean validarUsuario(String user){
        DbBean con = new DbBean();
        String sql;
        boolean sw = false;
        sql = "select Usuario from Usuarios where Usuario = '"+ user +"'";
        System.out.println(sql);
        
        try{
            ResultSet resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                if(user.equals(resultado.getString(1).toString())){
                    sw = true;
                }
            }
            resultado.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch (java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return sw;
    }
    
    public boolean validaContraseña(String user, String contra){
        DbBean con = new DbBean();
        String sql;
        boolean sw = false;
        
        sql = "select Usuario, Contra from Usuarios where Usuario = '"+ user +"' and Contra = '"+ contra +"'";
        System.out.println(sql);
        
        try{
            ResultSet resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                if(user.equals(resultado.getString(1)) && contra.equals(resultado.getString(2))){
                    sw = true;
                }
            }
            resultado.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch (java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return sw;
    }
    
    public void insertaUsuario(Usuarios user){
        DbBean con = new DbBean();
        String sql;
        sql = "insert into Usuarios values ("+ user.getCod_Usuario() +", "+ user.getCod_Empleado() +", '"+ user.getUsuario() +"', ";
        sql += "'"+ user.getContra() +"', '"+ user.getFech_Crea() +"', '"+ user.getFech_Alter() +"')";
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
    
    public void actualizaUsuario(Usuarios user){
        DbBean con = new DbBean();
        String sql;
        sql = "update Usuarios set Cod_Empleado = "+ user.getCod_Empleado() +", Usuario = '"+ user.getUsuario() +"', Contra = '"+ user.getContra() +"', ";
        sql += "fech_Crea = '"+ user.getFech_Crea() +"', fech_Alter = '"+ user.getFech_Alter() +"' where Cod_Usuario = "+ user.getCod_Usuario();
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
    
    public int idMax(){
        DbBean con = new DbBean();
        int id = 0;
        
        try{
            String sql = "select MAX(Cod_Usuario) from Usuarios";
            ResultSet result = con.resultadoSQL(sql);
            if(result.next()){
                id = result.getInt(1);
                result.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return id;
    }
    
    public void eliminaUsuario(int cod_user){
        DbBean con = new DbBean();
               
        try{
            String sql = "delete from Usuarios where Cod_Usuario = "+ cod_user;
            System.out.println(sql);
            con.ejecutaSQL(sql);
            if(con.ejecutaSQL(sql)==0){
                try{
                    for(int i=1; i<=idMax()-cod_user; i++){
                        sql = "update Usuarios set Cod_Usuario = "+ (cod_user+i-1) +" where Cod_Usuario = "+ (cod_user+i);
                        System.out.println(sql);
                        con.ejecutaSQL(sql);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
    }
    
    /*public Vector<Usuarios> listaUser(boolean sw, String cad){
        DbBean con = new DbBean();
        Vector<Usuarios> lista = new Vector<Usuarios>();
        String sql;
        
        sql = "select * from Usuarios ";
        if(sw){
            sql += "where Cod_Usuario = "+ cad +" or Usuario like '"+ cad +"%'";
        }
        System.out.println(sql);
        
        try{
            ResultSet resultado;
            resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                Usuarios user = new Usuarios();
                user.setCod_Usuario(resultado.getInt(1));
                user.setCod_Empleado(resultado.getInt(2));
                user.setUsuario(resultado.getString(3));
                user.setContra(resultado.getString(4));
                user.setFech_Crea(resultado.getDate(5));
                user.setFech_Alter(resultado.getDate(6));
                lista.add(user);
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
    */
}
