package org.creft.data.structure.graph;

import java.io.Serializable;

public record NodeIdentifier<T extends Comparable<T>>(T id) implements Serializable {

}
