package com.wswork.blog.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comentario {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "post_id")
    private Integer postId;

    @Column
    private String autor;

    @Column
    private String texto;

    @Column
    private String status;

    @Column ( name = "data_coment")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataComent = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataComent() {
        return dataComent;
    }

    public void setDataComent(Date dataComent) {
        this.dataComent = dataComent;
    }
}
