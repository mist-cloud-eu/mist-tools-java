package eu.mistcloud.tools.java;

public class NullMist implements MistTools {
    NullMist(){}
    public MistTools handle(String action, ActionHandler handler){return this;}
    public void init(InitHandler handler){}
}
