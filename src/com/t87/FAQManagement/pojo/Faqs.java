package com.t87.FAQManagement.pojo;

import java.util.Date;

/**
 * 常见问题
 */
public class Faqs {
    private int id;         //问题编号
    private String title;   //标题
    private Date createdate;//添加时间
    private String content; //内容
    private int classid;    //类别编号（对应类别表的主键）

    private String cname;   //类别名称


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}
