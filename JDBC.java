
package practical5;
import java.sql.*;



public class Practical5 
{

         
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/riya", "root", "shivi");
            Statement st=con.createStatement();
            st.executeUpdate("insert into student1 values(101,'RIA'),(102,'RIYA'),(103,'RIYAA'),(104,'Riiyaa'),(105,'rriiyaa')");
            st.executeUpdate("update student1 set name='yari' where id=101");
            st.executeUpdate("delete from student1 where id=101");
           ResultSet rs= st.executeQuery("select * from student1");
            System.out.println("id\t\t\tname");
            while(rs.next())
            {
            System.out.print(rs.getInt(1)+"\t\t\t");
            System.out.println(rs.getString(2)) ;
            }
            con.close();
            System.out.println("INSERTED"); 
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
