package model.dao;

import model.entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao{

    @Override
    public List<Customer> queryAllCustomers() {
        String sql= """
                     SELECT * FROM "customer" WHERE id=?;
                """;

        List<Customer> customersList=new ArrayList<>();
        try(
                Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","143");
                Statement statement  =conn.createStatement();
                ResultSet res =statement.executeQuery(sql);
                ){

            while (res.next()){
               customersList.add(new Customer(
                       res.getInt("id"),
                       res.getString("name"),
                       res.getString("email"),
                       res.getString("phone"),
                       res.getString("address")
               ));
            }


        }catch(Exception sqlException){
            System.out.println(sqlException.getMessage());
        }

        return  customersList;
    }

    @Override
    public int deleteCustomerById(Integer id) throws SQLException {
  Connection conn= DriverManager
     .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","143");
       if ( conn.isValid(3)){
           System.out.println("Deleted!");

       }
        return 0;
    }

    @Override
    public int updateCustomerById(Integer id) {
        return 0;
    }

    @Override
    public int addNewCustomer(@org.jetbrains.annotations.NotNull Customer customer) {
        String sql = """
                INSERT INTO "customer" (name, email, phone, address)
                VALUES (?,?,?,?)
                """;
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/postgres",
                        "postgres",
                        "143"
                );
                PreparedStatement pre = conn.prepareStatement(sql);
                ){
            pre.setString(1,customer.getName());
            pre.setString(2,customer.getEmail());
            pre.setString(3,customer.getPhone());
            pre.setString(4,customer.getAddress());
            int rowAffected =pre.executeUpdate();
            if (rowAffected>0){
                System.out.println("Insert Sucessfully");
            }


        }catch (SQLException sqlException ){
            System.out.println(sqlException.getMessage());
        }




        return 0;
    }
}
