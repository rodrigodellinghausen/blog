package com.wswork.blog.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity //Entidade, tabela                  tabela é no banco && entidade é na linguagem.
@Table (name = "post") //não obrigatorio, quando o nome da tabela e nome da entidade sao iguais.
public class Post {
    @Id //ligação com a primary key do banco
    @Column //colunas do banco
    @GeneratedValue (strategy = GenerationType.IDENTITY) //valor será gerado pelo banco
    private Integer id;

    @Column
    private String titulo;

    @Column
    private String subtitulo;

    @Column
    private String texto;

    @Column
    private String fonte;

    @Column
    private String autor;

    @Column
    private String imagem;

    @Column ( name = "data_criacao") //nome na tabela é diferente, precisa referenciar nomes;
    @Temporal (TemporalType.TIMESTAMP) //informa que no banco o tipo é timestamp, ou seja, data e hora.
    private Date dataCriacao;

    @OneToMany (cascade = CascadeType.ALL) //
    @JoinColumn ( name = "post_id") //vai na tabela comentario e referencia cada post, pode ter varios comentarios
    private List<Comentario> comentarios; //referenciar Comentario

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
