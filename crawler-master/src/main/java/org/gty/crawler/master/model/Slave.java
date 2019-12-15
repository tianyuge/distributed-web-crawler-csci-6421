package org.gty.crawler.master.model;

import com.google.common.base.MoreObjects;

public class Slave {

    private String nodeName;
    private String nodeAddress;
    private String nodePort;

    public Slave() {
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeAddress() {
        return nodeAddress;
    }

    public void setNodeAddress(String nodeAddress) {
        this.nodeAddress = nodeAddress;
    }

    public String getNodePort() {
        return nodePort;
    }

    public void setNodePort(String nodePort) {
        this.nodePort = nodePort;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("nodeName", nodeName)
            .add("nodeAddress", nodeAddress)
            .add("nodePort", nodePort)
            .toString();
    }
}
