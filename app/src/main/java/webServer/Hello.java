package webServer;

/**
 * This is the Hello class. used as bean It is used to create a greeting message with a given name.
 */
public class Hello {
    private String name;

    /**
     * Constructor for the Hello class.
     *
     * @param name the name to be used in the greeting
     */
    public Hello(String name) {
        this.name = name;
    }

    /**
     * This method returns a greeting message.
     *
     * @return a string in the format of "Hello {name}"
     */
    public String say() {
        return String.format("Hello %s", name);
    }
}
