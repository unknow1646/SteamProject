package com.example.steamproject;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "steamid",
        "communityvisibilitystate",
        "profilestate",
        "personaname",
        "profileurl",
        "avatar",
        "avatarmedium",
        "avatarfull",
        "avatarhash",
        "lastlogoff",
        "personastate",
        "primaryclanid",
        "timecreated",
        "personastateflags"
})
@Generated("jsonschema2pojo")
public class Player {

    @JsonProperty("steamid")
    private String steamid;
    @JsonProperty("communityvisibilitystate")
    private Integer communityvisibilitystate;
    @JsonProperty("profilestate")
    private Integer profilestate;
    @JsonProperty("personaname")
    private String personaname;
    @JsonProperty("profileurl")
    private String profileurl;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("avatarmedium")
    private String avatarmedium;
    @JsonProperty("avatarfull")
    private String avatarfull;
    @JsonProperty("avatarhash")
    private String avatarhash;
    @JsonProperty("lastlogoff")
    private Integer lastlogoff;
    @JsonProperty("personastate")
    private Integer personastate;
    @JsonProperty("primaryclanid")
    private String primaryclanid;
    @JsonProperty("timecreated")
    private Integer timecreated;
    @JsonProperty("personastateflags")
    private Integer personastateflags;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("steamid")
    public String getSteamid() {
        return steamid;
    }

    @JsonProperty("steamid")
    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }

    @JsonProperty("communityvisibilitystate")
    public Integer getCommunityvisibilitystate() {
        return communityvisibilitystate;
    }

    @JsonProperty("communityvisibilitystate")
    public void setCommunityvisibilitystate(Integer communityvisibilitystate) {
        this.communityvisibilitystate = communityvisibilitystate;
    }

    @JsonProperty("profilestate")
    public Integer getProfilestate() {
        return profilestate;
    }

    @JsonProperty("profilestate")
    public void setProfilestate(Integer profilestate) {
        this.profilestate = profilestate;
    }

    @JsonProperty("personaname")
    public String getPersonaname() {
        return personaname;
    }

    @JsonProperty("personaname")
    public void setPersonaname(String personaname) {
        this.personaname = personaname;
    }

    @JsonProperty("profileurl")
    public String getProfileurl() {
        return profileurl;
    }

    @JsonProperty("profileurl")
    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("avatarmedium")
    public String getAvatarmedium() {
        return avatarmedium;
    }

    @JsonProperty("avatarmedium")
    public void setAvatarmedium(String avatarmedium) {
        this.avatarmedium = avatarmedium;
    }

    @JsonProperty("avatarfull")
    public String getAvatarfull() {
        return avatarfull;
    }

    @JsonProperty("avatarfull")
    public void setAvatarfull(String avatarfull) {
        this.avatarfull = avatarfull;
    }

    @JsonProperty("avatarhash")
    public String getAvatarhash() {
        return avatarhash;
    }

    @JsonProperty("avatarhash")
    public void setAvatarhash(String avatarhash) {
        this.avatarhash = avatarhash;
    }

    @JsonProperty("lastlogoff")
    public Integer getLastlogoff() {
        return lastlogoff;
    }

    @JsonProperty("lastlogoff")
    public void setLastlogoff(Integer lastlogoff) {
        this.lastlogoff = lastlogoff;
    }

    @JsonProperty("personastate")
    public Integer getPersonastate() {
        return personastate;
    }

    @JsonProperty("personastate")
    public void setPersonastate(Integer personastate) {
        this.personastate = personastate;
    }

    @JsonProperty("primaryclanid")
    public String getPrimaryclanid() {
        return primaryclanid;
    }

    @JsonProperty("primaryclanid")
    public void setPrimaryclanid(String primaryclanid) {
        this.primaryclanid = primaryclanid;
    }

    @JsonProperty("timecreated")
    public Integer getTimecreated() {
        return timecreated;
    }

    @JsonProperty("timecreated")
    public void setTimecreated(Integer timecreated) {
        this.timecreated = timecreated;
    }

    @JsonProperty("personastateflags")
    public Integer getPersonastateflags() {
        return personastateflags;
    }

    @JsonProperty("personastateflags")
    public void setPersonastateflags(Integer personastateflags) {
        this.personastateflags = personastateflags;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Player.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("steamid");
        sb.append('=');
        sb.append(((this.steamid == null)?"<null>":this.steamid));
        sb.append(',');
        sb.append("communityvisibilitystate");
        sb.append('=');
        sb.append(((this.communityvisibilitystate == null)?"<null>":this.communityvisibilitystate));
        sb.append(',');
        sb.append("profilestate");
        sb.append('=');
        sb.append(((this.profilestate == null)?"<null>":this.profilestate));
        sb.append(',');
        sb.append("personaname");
        sb.append('=');
        sb.append(((this.personaname == null)?"<null>":this.personaname));
        sb.append(',');
        sb.append("profileurl");
        sb.append('=');
        sb.append(((this.profileurl == null)?"<null>":this.profileurl));
        sb.append(',');
        sb.append("avatar");
        sb.append('=');
        sb.append(((this.avatar == null)?"<null>":this.avatar));
        sb.append(',');
        sb.append("avatarmedium");
        sb.append('=');
        sb.append(((this.avatarmedium == null)?"<null>":this.avatarmedium));
        sb.append(',');
        sb.append("avatarfull");
        sb.append('=');
        sb.append(((this.avatarfull == null)?"<null>":this.avatarfull));
        sb.append(',');
        sb.append("avatarhash");
        sb.append('=');
        sb.append(((this.avatarhash == null)?"<null>":this.avatarhash));
        sb.append(',');
        sb.append("lastlogoff");
        sb.append('=');
        sb.append(((this.lastlogoff == null)?"<null>":this.lastlogoff));
        sb.append(',');
        sb.append("personastate");
        sb.append('=');
        sb.append(((this.personastate == null)?"<null>":this.personastate));
        sb.append(',');
        sb.append("primaryclanid");
        sb.append('=');
        sb.append(((this.primaryclanid == null)?"<null>":this.primaryclanid));
        sb.append(',');
        sb.append("timecreated");
        sb.append('=');
        sb.append(((this.timecreated == null)?"<null>":this.timecreated));
        sb.append(',');
        sb.append("personastateflags");
        sb.append('=');
        sb.append(((this.personastateflags == null)?"<null>":this.personastateflags));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
