package com.khaind.microservices.cloudconfig.dto;

import javax.persistence.Column;

public class CloudConfigDTO {
    private Long id;

    private String application;

    private String profile;

    private String label;

    private String key;

    private String value;

    public void setId(Long id) {
        this.id = id;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getApplication() {
        return application;
    }

    public String getProfile() {
        return profile;
    }

    public String getLabel() {
        return label;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
