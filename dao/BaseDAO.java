// Resuable class for establishing database connection
package dao;

import db.DB;
import java.sql.*;

public abstract class BaseDAO {
    // Only for intended DAO classes to use
    protected Connection getConnection() throws SQLException {
        return DB.getConnection();
    }
}
