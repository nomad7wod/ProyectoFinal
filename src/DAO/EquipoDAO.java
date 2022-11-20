package DAO;
import BEAN.Equipo;
import UTIL.DbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class EquipoDAO {
    public EquipoDAO(){
    }
    
    //READ
    public Vector<Equipo> ListaItem(boolean sw, String str){
        Vector<Equipo> item = new Vector<Equipo>();
        DbBean con = new DbBean();
        String sql = "SELECT * FROM Equipo";
        if(sw == true){
            sql = sql + " WHERE Descripcion LIKE '"+ str +"%'";
        }

        
        try{
            ResultSet resultado = con.resultadoSQL(sql);
            
            while(resultado.next()){
                Equipo equipo = new Equipo();
                equipo.setCod_Equipo(resultado.getInt(1));        
                equipo.setDescripcion(resultado.getString(2));        
                equipo.setCosto_Adqui(resultado.getDouble(3));        
                equipo.setId_User_Crea(resultado.getInt(4));        
                equipo.setFech_Crea(resultado.getString(5));        
                equipo.setId_User_Alter(resultado.getInt(6));        
                equipo.setFech_Alter(resultado.getString(7));        
                    
                item.addElement(equipo);
            }
        }catch(java.sql.SQLException ex){
            ex.printStackTrace();
        }
        try{
            con.desconecta();
        }catch(SQLException ex){}

        return item;
    }
    //UPDATE or CREATE
    public int procesaItem(Equipo e, String proc){
       int resultado = 0;
       String sql= "";
       DbBean con=new DbBean();
       if(proc.equals("insert")){
            sql = "INSERT INTO Equipo VALUES (" + e.getCod_Equipo() + ", '" + e.getDescripcion() + "', " + e.getCosto_Adqui() + ", " + e.getId_User_Crea() + ", '" + e.getFech_Crea() + "', " + e.getId_User_Alter() + ", '" + e.getFech_Alter() + "')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql= "UPDATE Equipo SET Descripcion = '" + e.getDescripcion() + "', Costo_Adqui = " + e.getCosto_Adqui() + ", Id_User_Crea = " + e.getId_User_Crea() + ", Fech_Crea = '" + e.getFech_Crea() + "', Id_User_Alter = " + e.getId_User_Alter() + ", Fech_Alter = '" + e.getFech_Alter() + "' WHERE Cod_Equipo = "+ e.getCod_Equipo();
       }
       System.out.println("Observando el estado de la sentencia sql: "+sql);

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
        String sql = "DELTE FROM Equipo WHERE Cod_Equipo = " + Cod;
                
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
}
