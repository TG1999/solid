package S;

// Single Responsibility Principle

// A class should have only one reason to change, meaning it should have only one responsibility.

// This principle helps in keeping classes focused and makes them easier to understand and maintain.

// ANTI PATTERN
public class GodObject {
    public void handleUserManagement() {
        // Logic for user management
    }

    public void handleEmailSending() {
        // Logic for sending emails
    }

    public void handleLogging() {
        // Logic for logging
    }
}

class UserManager {
    public void handleUserManagement() {
        // Logic for user management
    }
}

class EmailService {
    public void handleEmailSending() {
        // Logic for sending emails
    }
}


class Logger {
    public void handleLogging() {
        // Logic for logging
    }
}

