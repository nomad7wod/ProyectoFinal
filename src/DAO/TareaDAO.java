
package DAO;

import BEAN.Tarea;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class TareaDAO {
    public TareaDAO(){
    }
    //READ
    public Vector<Tarea> ListaItem(boolean sw,String str){
        Vector<Tarea> item = new Vector<Tarea>();
        DbBean con = new DbBean();
        String sql = "SELECT * FROM Tarea";
        if(sw==true){
            sql = sql + "WHERE Descripcion LIKE '"+ str +"%'";
            
        }
        
        try{
            ResultSet resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                Tarea tarea = new Tarea();
                tarea.setCod_Tarea(resultado.getInt(1));
                tarea.setDescripcion(resultado.getString(2));
                tarea.setNivel_Complejidad(resultado.getInt(3));
                tarea.setId_User_Crea(resultado.getInt(4));
                tarea.setFech_Crea(resultado.getString(5));
                tarea.setId_User_Alter(resultado.getInt(6));
                tarea.setFech_Alter(resultado.getString(7));
                
                item.addElement(tarea);
            }
            
            
        }catch(java.sql.SQLException ex){
            ex.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(SQLException ex){
        }
    
        return item;
    }
    //UPDATE OR CREATE
    public int procesaItem(Tarea t, String proc){
        int resultado = 0;
        String sql = "";
        DbBean con = new DbBean();
        if(proc.equals("insert")){
                        sql = "INSERT INTO Tarea VALUES (" + t.getCod_Tarea() + ", '" + t.getDescripcion() + "', " + t.getNivel_Complejidad() + ", " + t.getId_User_Crea() + ", '" + t.getFech_Crea() + "', " + t.getId_User_Alter() + ", '" + t.getFech_Alter() + "')";
            System.out.println("Sentencia sql: " + sql);
        }
        if(proc.equals("update")){
            sql = "UPDATE Tarea SET Descripcion = '" + t.getDescripcion()+ "', Nivel_Complejidad = " + t.getNivel_Complejidad() + ", Id_User_Crea = " + t.getId_User_Crea() + ", Fech_Crea =  '" + t.getFech_Crea() + "', Id_User_Alter = " + t.getId_User_Alter();
        }
        System.out.println("Setencia sql: "+sql);
        
        try{
          resultado=con.ejecutaSQL(sql);
        }catch(java.sql.SQLException ex){
            ex.printStackTrace();
        }
        try{
        con.desconecta();
        }catch(SQLException ex){
        }
        
            return resultado;
    }
    
    public void RemoverItem(int Cod){
        DbBean con = new DbBean();
        String sql = "DELETE FROM Tarea WHERE Cod_Tarea = " + Cod;
        
        try{                               //confirmacion
        if(con.ejecutaSQL(sql) == 1){
            System.out.println("Se eliminó un producto");
        }
                       
        }catch(java.sql.SQLException ex){
         ex.printStackTrace();
        }
        try{
         con.desconecta();       //terminar conexion
        }catch(java.sql.SQLException ex){
         ex.printStackTrace();
        } 
    }
    //READ
    public Vector<Tarea> listaTarea(boolean sw, String cad){
        DbBean con = new DbBean ();
        String sql;
        Vector<Tarea> lista = new Vector<Tarea>();
        
        sql = "SELECT * FROM Tarea ";
        if(sw){
            sql += "where Cod_Tarea = '" + cad + "' or Descripcion like '" + cad + "%' or Nivel_Complejidad = '" + cad + "'";
        }
        System.out.println("Sentencia sql: " + sql);
        
        try{
            ResultSet resultado;
            resultado = con.resultadoSQL(sql);
            while(resultado.next()){
                Tarea tarea = new Tarea();
                tarea.setCod_Tarea(resultado.getInt(1));
                tarea.setDescripcion(resultado.getString(2));
                tarea.setNivel_Complejidad(resultado.getInt(3));
                tarea.setId_User_Crea(resultado.getInt(4));
                tarea.setFech_Crea(resultado.getString(5));
                tarea.setId_User_Alter(resultado.getInt(6));
                tarea.setFech_Alter(resultado.getString(7));
                lista.add(tarea);
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
