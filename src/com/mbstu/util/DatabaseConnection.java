package com.mbstu.util;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseConnection {

    /* Database Connection***********/
    public static Connection getConnection()
    {
        Connection conn = null;
        try
        {       
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inputStream);

            Class.forName(props.getProperty("jdbc.driverClassName"));
            conn = DriverManager.getConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.username"), props.getProperty("jdbc.password"));
        }
        catch(ClassNotFoundException e){}
        catch(SQLException ex){}
        catch(Exception e){}
        return conn;
        
    }

    //****Account Number Check***///
     private static Statement getStatement() throws Exception {
		Statement st = null;
		Connection con = getConnection();
		st = con.createStatement();
		return st;
	}

      public static boolean checkValue(String sql) throws Exception {
		boolean b = false;
		ResultSet rst = null;
		Statement st = getStatement();
		rst = st.executeQuery(sql);
		if (rst.next()) {
			b = true;
		}
		return b;

	}

    public static Connection getDefaultConnection()
    {
        
        Connection conn = null;
        try
        {
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inputStream);
            
            Class.forName(props.getProperty("jdbc.driverClassName"));
            conn = DriverManager.getConnection(props.getProperty("jdbc.defaulturl"), props.getProperty("jdbc.username"), props.getProperty("jdbc.password"));
        }
        catch(ClassNotFoundException e){
            return conn;
        }
        catch(SQLException ex){
            return conn;
        }
        catch(Exception e){
            return conn;
        }

        return conn;

    }

 public static String backupDatabase() {
        String Mysqlpath = getMysqlBinPath();
        try
        {
            Properties props = new Properties();
            InputStream inputStreamJdbc = DatabaseConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inputStreamJdbc);
            
            File folder = new File("C:\\Users\\Rafiq\\Desktop\\Rafiq");
            if(!folder.exists())
            {
                folder.mkdir();
            }
            String backupFile = folder.toString()+File.separator+"bank.sql";
            
            Runtime.getRuntime().exec(Mysqlpath+"mysqldump -u "+props.getProperty("jdbc.username")+" -p"+props.getProperty("jdbc.password")+" "+props.getProperty("jdbc.database")+" -r "+backupFile+"");
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
            return "Fail to Backup Database";
        }        

        return "Successfully Backup Database";
    }
    
    
    public static String loadDatabase(String fileLocation) {
        String Mysqlpath = getMysqlBinPath();
        System.out.println(fileLocation);
        try
        {
            Properties props = new Properties();
            InputStream inputStream = DatabaseConnection.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(inputStream);

            String[] executeCmd = new String[]{Mysqlpath+"mysql",props.getProperty("jdbc.database"), "--user=" + props.getProperty("jdbc.username"), "--password=" + props.getProperty("jdbc.password"), "-e", " source "+fileLocation+""};
            Process runtimeProcess =Runtime.getRuntime().exec(executeCmd);
            runtimeProcess.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            return "Fail to Load Database";
        }

        return "Successfully Load Database";
    }

    public static String getMysqlBinPath() {
        String path = System.getenv("Path");
        //System.out.println(path);
        String str[] = path.split(";");
        for(int i=0; i<str.length;i++)
        {
            String s = str[i];
            if(s.contains("MySQL"))
            {
                return str[i]+"\\";
            }
        }
        return "";
    }

    public static String getMysqlRootPath() {
        String path = getMysqlBinPath();
        //System.out.println(path);
        String str[] = path.split("bin");
        for(int i=0; i<str.length;i++)
        {
            String s = str[i];
            if(s.contains("MySQL"))
            {
                return str[i];
            }
        }
        return "";
    }
}

