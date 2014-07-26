package com.kudtu.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User extends PersistentObject {

    @Id
    protected long id;
    protected String screenName;
    protected long statusCount;
    protected long followingsCount;
    protected long followersCount;
    protected long favoritesCount;
    protected boolean isVerified;
    protected String description = null;
    protected String profileImageUrl = null;
    protected Date createdAt = null;

    public User(long id, String screenName, long statusCount, long followingsCount, long followersCount,
	    long favoritesCount, boolean isVerified, String description, String profileImageUrl, Date createdAt) {
	super();
	this.id = id;
	this.screenName = screenName;
	this.statusCount = statusCount;
	this.followingsCount = followingsCount;
	this.followersCount = followersCount;
	this.favoritesCount = favoritesCount;
	this.isVerified = isVerified;
	this.description = description;
	this.profileImageUrl = profileImageUrl;
	this.createdAt = createdAt;
    }

    @Override
    public long getId() {
	return id;
    }

    public void setId(long uid) {
	this.id = uid;
    }

    public String getScreenName() {
	return screenName;
    }

    public void setScreenName(String screenName) {
	this.screenName = screenName;
    }

    public long getStatusCount() {
	return statusCount;
    }

    public void setStatusCount(long statusCount) {
	this.statusCount = statusCount;
    }

    public long getFollowingsCount() {
	return followingsCount;
    }

    public void setFollowingsCount(long followingsCount) {
	this.followingsCount = followingsCount;
    }

    public long getFollowersCount() {
	return followersCount;
    }

    public void setFollowersCount(long followersCount) {
	this.followersCount = followersCount;
    }

    public long getFavoritesCount() {
	return favoritesCount;
    }

    public void setFavoritesCount(long favoritesCount) {
	this.favoritesCount = favoritesCount;
    }

    public boolean isVerified() {
	return isVerified;
    }

    public void setVerified(boolean isVerified) {
	this.isVerified = isVerified;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getProfileImageUrl() {
	return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
	this.profileImageUrl = profileImageUrl;
    }

    public Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + (int) (favoritesCount ^ (favoritesCount >>> 32));
	result = prime * result + (int) (followersCount ^ (followersCount >>> 32));
	result = prime * result + (int) (followingsCount ^ (followingsCount >>> 32));
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + (isVerified ? 1231 : 1237);
	result = prime * result + ((profileImageUrl == null) ? 0 : profileImageUrl.hashCode());
	result = prime * result + ((screenName == null) ? 0 : screenName.hashCode());
	result = prime * result + (int) (statusCount ^ (statusCount >>> 32));
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	User other = (User) obj;
	if (createdAt == null) {
	    if (other.createdAt != null)
		return false;
	} else if (!createdAt.equals(other.createdAt))
	    return false;
	if (description == null) {
	    if (other.description != null)
		return false;
	} else if (!description.equals(other.description))
	    return false;
	if (favoritesCount != other.favoritesCount)
	    return false;
	if (followersCount != other.followersCount)
	    return false;
	if (followingsCount != other.followingsCount)
	    return false;
	if (id != other.id)
	    return false;
	if (isVerified != other.isVerified)
	    return false;
	if (profileImageUrl == null) {
	    if (other.profileImageUrl != null)
		return false;
	} else if (!profileImageUrl.equals(other.profileImageUrl))
	    return false;
	if (screenName == null) {
	    if (other.screenName != null)
		return false;
	} else if (!screenName.equals(other.screenName))
	    return false;
	if (statusCount != other.statusCount)
	    return false;
	return true;
    }
    
    
}
