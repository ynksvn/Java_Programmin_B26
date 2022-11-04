package day54_abstraction.animal.language;

public interface Language {
    //how to implement Interface from any package in the project

    String PLANET = "Earth"; // public static final String PlANET. It is constant because it is in interface. anytime ypu have static final, it is constant, the value will not change
    //naming Convention  for public static final



    void hi();
    void bye();
    // they are abstract methods. They need to be implemented with something to be able to use.





}
