// TODO: Make proper packages (folders) for better seperation of concerns
// F u NO

import db.DB;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Connect to database
            DB.Connect();
            // 2. Feed application with data from DB
            // 3. Launch GUI

        // Handle error(s)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}