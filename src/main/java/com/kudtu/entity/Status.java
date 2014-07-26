package com.kudtu.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Status extends PersistentObject {

    @Id
    protected long id;
    protected long retweetCount;
    protected long favoriteCount;
    protected long commentCount;
    protected String text = null;
    protected long extendedMediaEntitiesCount;
    protected long urlEntitiesCount;
    protected long hashtagEntitiesCount;
    protected long userMentionEntitiesCount;
    protected Date createdAt = null;
    protected long users_id;

    public Status(long id, long retweetCount, long favoriteCount, long commentCount, String text,
	    long extendedMediaEntitiesCount, long urlEntitiesCount, long hashtagEntitiesCount,
	    long userMentionEntitiesCount, Date createdAt, long users_id) {
	super();
	this.id = id;
	this.retweetCount = retweetCount;
	this.favoriteCount = favoriteCount;
	this.commentCount = commentCount;
	this.text = text;
	this.extendedMediaEntitiesCount = extendedMediaEntitiesCount;
	this.urlEntitiesCount = urlEntitiesCount;
	this.hashtagEntitiesCount = hashtagEntitiesCount;
	this.userMentionEntitiesCount = userMentionEntitiesCount;
	this.createdAt = createdAt;
	this.users_id = users_id;
    }

    @Override
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public long getRetweetCount() {
	return retweetCount;
    }

    public void setRetweetCount(long retweetCount) {
	this.retweetCount = retweetCount;
    }

    public long getFavoriteCount() {
	return favoriteCount;
    }

    public void setFavoriteCount(long favoriteCount) {
	this.favoriteCount = favoriteCount;
    }

    public long getCommentCount() {
	return commentCount;
    }

    public void setCommentCount(long commentCount) {
	this.commentCount = commentCount;
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public long getExtendedMediaEntitiesCount() {
	return extendedMediaEntitiesCount;
    }

    public void setExtendedMediaEntitiesCount(long extendedMediaEntitiesCount) {
	this.extendedMediaEntitiesCount = extendedMediaEntitiesCount;
    }

    public long getUrlEntitiesCount() {
	return urlEntitiesCount;
    }

    public void setUrlEntitiesCount(long urlEntitiesCount) {
	this.urlEntitiesCount = urlEntitiesCount;
    }

    public long getHashtagEntitiesCount() {
	return hashtagEntitiesCount;
    }

    public void setHashtagEntitiesCount(long hashtagEntitiesCount) {
	this.hashtagEntitiesCount = hashtagEntitiesCount;
    }

    public long getUserMentionEntitiesCount() {
	return userMentionEntitiesCount;
    }

    public void setUserMentionEntitiesCount(long userMentionEntitiesCount) {
	this.userMentionEntitiesCount = userMentionEntitiesCount;
    }

    public Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
    }

    public long getUsers_id() {
	return users_id;
    }

    public void setUsers_id(long users_id) {
	this.users_id = users_id;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (commentCount ^ (commentCount >>> 32));
	result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
	result = prime * result + (int) (extendedMediaEntitiesCount ^ (extendedMediaEntitiesCount >>> 32));
	result = prime * result + (int) (favoriteCount ^ (favoriteCount >>> 32));
	result = prime * result + (int) (hashtagEntitiesCount ^ (hashtagEntitiesCount >>> 32));
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + (int) (retweetCount ^ (retweetCount >>> 32));
	result = prime * result + ((text == null) ? 0 : text.hashCode());
	result = prime * result + (int) (urlEntitiesCount ^ (urlEntitiesCount >>> 32));
	result = prime * result + (int) (userMentionEntitiesCount ^ (userMentionEntitiesCount >>> 32));
	result = prime * result + (int) (users_id ^ (users_id >>> 32));
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
	Status other = (Status) obj;
	if (commentCount != other.commentCount)
	    return false;
	if (createdAt == null) {
	    if (other.createdAt != null)
		return false;
	} else if (!createdAt.equals(other.createdAt))
	    return false;
	if (extendedMediaEntitiesCount != other.extendedMediaEntitiesCount)
	    return false;
	if (favoriteCount != other.favoriteCount)
	    return false;
	if (hashtagEntitiesCount != other.hashtagEntitiesCount)
	    return false;
	if (id != other.id)
	    return false;
	if (retweetCount != other.retweetCount)
	    return false;
	if (text == null) {
	    if (other.text != null)
		return false;
	} else if (!text.equals(other.text))
	    return false;
	if (urlEntitiesCount != other.urlEntitiesCount)
	    return false;
	if (userMentionEntitiesCount != other.userMentionEntitiesCount)
	    return false;
	if (users_id != other.users_id)
	    return false;
	return true;
    }

}
