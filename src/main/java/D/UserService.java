package D;

// Dependency Inversion Principle

// Use dependency injection with interfaces

//  High-level modules should not depend on low-level modules. Both should depend on abstractions.
// This principle promotes loose coupling between modules by relying on abstractions and interfaces instead of concrete implementations.

interface DatabaseConnection {
    void connect();
}

class MySqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        // Logic to connect to MySQL database
    }
}

class UserServiceAntiPattern {
    private MySqlConnection connection;

    public UserServiceAntiPattern(MySqlConnection connection) {
        this.connection = connection;
    }

    // Methods using connection...
}

class UserService {
    private DatabaseConnection connection;

    public UserService(DatabaseConnection connection) {
        this.connection = connection;
    }

    // Methods using connection...
}
