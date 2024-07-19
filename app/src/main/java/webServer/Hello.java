package webServer;

public class Hello {
  private String name;

  public Hello(String name) {
    this.name = name;
  }

  public String say() {
    return String.format("Hello %s", name);
  }
}
