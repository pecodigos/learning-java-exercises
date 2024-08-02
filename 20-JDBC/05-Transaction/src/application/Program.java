package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        Statement st = null;

        try {
            connection = DB.getConnection();

            connection.setAutoCommit(false);

            st = connection.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();

            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);

        }
        catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! It was cause by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! It was caused by: " + ex.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
