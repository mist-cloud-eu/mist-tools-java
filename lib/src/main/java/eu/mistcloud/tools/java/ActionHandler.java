package eu.mistcloud.tools.java;

import org.json.JSONObject;

public interface ActionHandler {
    void execute(byte[] payloadBytes, JSONObject envelope);
}
