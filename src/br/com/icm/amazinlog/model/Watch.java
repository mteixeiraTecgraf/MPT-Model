package br.com.icm.amazinlog.model;

import java.io.Serializable;

public class Watch implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Tag tag;
    private String uid;

    public Watch()
    {
        
    }
    public Watch(String uid, Tag tag)
    {
        setUid(uid);
        setTag(tag);
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

}