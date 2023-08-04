package eu.mistcloud.tools.java;

public interface MistTools {
    MistTools handle(String action, ActionHandler handler);
    void init(InitHandler handler);
}
