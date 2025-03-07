import model.dao.CustomerDaoImpl;
import model.entity.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       String url ="jdbc:postgresql://localhost:5432/postgres";
       String user="postgres";
       String pw ="143";
        try {
            Connection conn = DriverManager.getConnection(url,user,pw);
            String sql = """
                    DELETE FROM "product" WHERE id=?;
                    """;
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1,2);
            pre.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}