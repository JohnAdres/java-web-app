package com.corejsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 27, 2016
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.sql.DataSource;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

@Named // or @Named
@RequestScoped
public class CustomerBean {
     @Resource(name="jdbc/mydb")
     private DataSource ds;
     private CachedRowSet crs;
     public ResultSet getAll() throws SQLException{
          Connection conn = ds.getConnection();
          String sql = "Select * from employees";
          try{
               Statement stmt = conn.createStatement();
               ResultSet result = stmt.executeQuery(sql);
               crs = RowSetProvider.newFactory().createCachedRowSet();
               crs.populate(result);
               return crs;
          }finally{
               conn.close();
          }         
     }
  
}
