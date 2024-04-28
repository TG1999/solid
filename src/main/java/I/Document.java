package I;

// Interface Segregation Principle

// Clients should not be forced to depend on interfaces they do not use.

// Anti Pattern - Fat interface

interface Document {
    void open();
    void save();
    void print();
    void share();
}


// Not every Document will support all functionalities

interface Openable {
    void open();
}

interface Savable {
    void save();
}

interface Printable {
    void print();
}

interface Shareable {
    void share();
}

// Changes to one interface do not affect other interfaces, helping in easier maintenance and extensibility.
// This principle encourages creating smaller, more specific interfaces rather than large, general-purpose ones
class TextDocument implements Openable, Savable, Printable {
    @Override
    public void open() {
        // Open text document
    }

    @Override
    public void save() {
        // Save text document
    }

    @Override
    public void print() {
        // Print text document
    }
}

class Spreadsheet implements Openable, Savable, Printable {
    @Override
    public void open() {
        // Open spreadsheet
    }

    @Override
    public void save() {
        // Save spreadsheet
    }

    @Override
    public void print() {
        // Print spreadsheet
    }
}

class Presentation implements Openable, Savable, Shareable {
    @Override
    public void open() {
        // Open presentation
    }

    @Override
    public void save() {
        // Save presentation
    }

    @Override
    public void share() {
        // Share presentation
    }
}
