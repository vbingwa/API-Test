
package com.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

import java.util.List;
@Getter @Setter
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Playlist {

    @JsonProperty("collaborative")
    private Boolean collaborative;
    @JsonProperty("description")
    private String description;
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;
    @JsonProperty("followers")
    private Followers followers;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private List<Object> images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("primary_color")
    private Object primaryColor;
    @JsonProperty("public")
    private Boolean _public;
    @JsonProperty("snapshot_id")
    private String snapshotId;
    @JsonProperty("tracks")
    private Tracks tracks;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;


    public Boolean getCollaborative() {
        return this.collaborative;
    }

    public String getDescription() {
        return this.description;
    }

    public ExternalUrls getExternalUrls() {
        return this.externalUrls;
    }

    public Followers getFollowers() {
        return this.followers;
    }

    public String getHref() {
        return this.href;
    }

    public String getId() {
        return this.id;
    }

    public List<Object> getImages() {
        return this.images;
    }

    public String getName() {
        return this.name;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public Object getPrimaryColor() {
        return this.primaryColor;
    }

    public Boolean get_public() {
        return this._public;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public Tracks getTracks() {
        return this.tracks;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    @JsonProperty("collaborative")
    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    @JsonProperty("followers")
    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("images")
    public void setImages(List<Object> images) {
        this.images = images;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("primary_color")
    public void setPrimaryColor(Object primaryColor) {
        this.primaryColor = primaryColor;
    }

    @JsonProperty("public")
    public void set_public(Boolean _public) {
        this._public = _public;
    }

    @JsonProperty("snapshot_id")
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    @JsonProperty("tracks")
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }
}
