package stpaul.lutheran.persistence;


import org.hibernate.boot.model.relational.Database;
import stpaul.lutheran.entity.Users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Access users in the user table.
 *
 * @author pwaite
 */
public class UserData {

    private List<Users> getUsers(String sql) {
        List<Users> users = new ArrayList<Users>();
        return users;
    }


    public List<Users> getAllUsers(){

        String sql = "SELECT * FROM Users";
        return getUsers(sql);

    }

    public List<Users> getUserByLastName(String search){

        String sql = "SELECT * FROM Users WHERE last_name LIKE '%" + search + "%'";
        return getUsers(sql);
    }

    private Users createUserFromResults(ResultSet results) throws SQLException {
        Users user = new Users();
        user.setLastName(results.getString("last_name"));
        //user.setFirstName(results.getString("first_name"));
        //user.setUserName(results.getString("user_name"));

        return user;
    }
}