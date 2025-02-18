package org.creft.data.structure.graph;

import java.io.Serializable;

public class NodeIdentifier implements Serializable {

    public String getId() {
        return id;
    }

    private final String id;

    public NodeIdentifier(String id) {
        this.id = id;
    }
}
