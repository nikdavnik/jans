/*
 * Janssen Project software is available under the Apache License (2004). See http://www.apache.org/licenses/ for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Transient;

/**
 * Hold SMTP configuration
 *
 * @author Yuriy Movchan Date: 04/20/2014
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SmtpConfiguration implements java.io.Serializable {

    private static final long serialVersionUID = -5675038049444038755L;

    @JsonProperty("host")
    private String host;

    @JsonProperty("port")
    private int port;

    @JsonProperty("requires_ssl")
    private boolean requiresSsl;

    @JsonProperty("trust_host")
    private boolean serverTrust;

    @JsonProperty("from_name")
    private String fromName;

    @JsonProperty("from_email_address")
    private String fromEmailAddress;

    @JsonProperty("requires_authentication")
    private boolean requiresAuthentication;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;

    @Transient
    @JsonIgnore
    private String passwordDecrypted;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isRequiresSsl() {
        return requiresSsl;
    }

    public void setRequiresSsl(boolean requiresSsl) {
        this.requiresSsl = requiresSsl;
    }

    public boolean isServerTrust() {
        return serverTrust;
    }

    public void setServerTrust(boolean serverTrust) {
        this.serverTrust = serverTrust;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromEmailAddress() {
        return fromEmailAddress;
    }

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    public boolean isRequiresAuthentication() {
        return requiresAuthentication;
    }

    public void setRequiresAuthentication(boolean requiresAuthentication) {
        this.requiresAuthentication = requiresAuthentication;
    }

    public boolean isValid() {
        return getHost() != null && getPort() != 0
                && ((!isRequiresAuthentication())
                || (getUserName() != null && getPassword() != null));
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordDecrypted() {
        return passwordDecrypted;
    }

    public void setPasswordDecrypted(String passwordDecrypted) {
        this.passwordDecrypted = passwordDecrypted;
    }

}
