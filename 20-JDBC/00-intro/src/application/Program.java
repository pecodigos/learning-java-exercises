package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        try {

            Connection connection = DB.getConnection();
            connection.close();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }
}
