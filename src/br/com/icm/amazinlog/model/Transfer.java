package br.com.icm.amazinlog.model;

import java.io.Serializable;


public class Transfer implements Serializable{
	public enum Type{
		TRANSFER_REQUEST,
		TRANSFER_RESPONSE
	}
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Tag tag;
    private String uid;
    private Type type;

    public Transfer(String uid, Tag tag, Type type)
    {
        setUid(uid);
        setTag(tag);
        setType(type);
    }

    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public Tag getTag() {
        return tag;
    }
    public void setTag(Tag tag) {
        this.tag = tag;
    }

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
