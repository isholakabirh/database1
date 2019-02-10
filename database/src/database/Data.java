package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Data {
    public static void main(String[] args){
        Connection conn;

        try{
            //if you get an error like class not found exception, you need to add mysql driver as a library to your
            //project. You can just google this, or let me know and I'll guid you through
            Class.forName("com.mysql.jdbc.Driver");

            //i created a db on heroku, this is what I use for this test
            //you can go on using my db, however I cannot guarantee that it will be up for too long
            conn=DriverManager.getConnection(
                    "jdbc:mysql://us-cdbr-iron-east-03.cleardb.net/heroku_fe8d60278b44e50",
                    "bef94eaa638c2a",
                    "cf4126ef"
            );
            //below is the configuration to point to your local db
//            conn=DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/customer",
//                    "root",
//                    ""
//            );

            Statement stmt = conn.createStatement();
            String sql = "insert into custom (username,password) values ('svceeg','dve') ";
            //in you previous code you used executeQuery, however this method cannot be used for queries that would
            //change the state of the database, hence the use of executeUpdate
            stmt.executeUpdate(sql);

            System.out.println("Query Completed Successfully");
            conn.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}