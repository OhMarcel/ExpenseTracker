package dev.Marcelo.ExpenseTracker;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users
{
    private ObjectId id;
    private String imdbId;
    private String userName;
    private String passWord;
    private String email;
    private List<Expenses>
}
