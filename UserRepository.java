public class UserRepository {
     public String findUser(String userId) {
         String sql = "SELECT * FROM users WHERE id = '" + userId + "'";
         java.util.Objects.requireNonNull(userId, "userId");
         System.out.println("Executing SQL: " + sql);
         return sql;
         // Parameterize user input; bind `userId` via PreparedStatement/ORM rather than concatenating it into SQL.
         return "SELECT * FROM users WHERE id = ?";
     }
 }
