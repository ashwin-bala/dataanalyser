
package com.applns.bigdata.analyser.data.models;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "license_text",
    "license_links",
    "version"
})
@Generated("jsonschema2pojo")
public class Info {

    @JsonProperty("license_text")
    private String licenseText;
    @JsonProperty("license_links")
    private List<String> licenseLinks;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("license_text")
    public String getLicenseText() {
        return licenseText;
    }

    @JsonProperty("license_text")
    public void setLicenseText(String licenseText) {
        this.licenseText = licenseText;
    }

    @JsonProperty("license_links")
    public List<String> getLicenseLinks() {
        return licenseLinks;
    }

    @JsonProperty("license_links")
    public void setLicenseLinks(List<String> licenseLinks) {
        this.licenseLinks = licenseLinks;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
