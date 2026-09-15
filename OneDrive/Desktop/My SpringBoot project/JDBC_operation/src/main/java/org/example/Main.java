package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/user";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Mvinod@4284";
    public static void main(String[] args) {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to database successfully");
            //operation perform

//            insert(conn, 1, "Vinod Mudavath", 22);
//            insert(conn, 2, "Manisha", 21);

            update(conn, 3, "Vinod Mudavath", 22);
            update(conn, 4, "Viha", 20);
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // insert method
    private static void insert(Connection conn, int id, String name, int age) {
        String sql = "INSERT INTO jdbc(id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);       // set id
            pstmt.setString(2, name);  // set name
            pstmt.setInt(3, age);      // set age

            int rows = pstmt.executeUpdate(); // execute insert
            System.out.println(rows + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // update method
    private static void update(Connection conn, int id,String name, int age) {
        String sql = "UPDATE jdbc SET name = ?, age = ? WHERE id = ?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2,22);
            stmt.setInt(3,1);
            int row = stmt.executeUpdate();
            System.out.println(row + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}