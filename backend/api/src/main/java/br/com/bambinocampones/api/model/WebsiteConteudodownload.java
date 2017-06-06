/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bambinocampones.api.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "website_conteudodownload", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteConteudodownload.findAll", query = "SELECT w FROM WebsiteConteudodownload w")
    , @NamedQuery(name = "WebsiteConteudodownload.findById", query = "SELECT w FROM WebsiteConteudodownload w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteConteudodownload.findByTitulo", query = "SELECT w FROM WebsiteConteudodownload w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsiteConteudodownload.findBySlug", query = "SELECT w FROM WebsiteConteudodownload w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsiteConteudodownload.findByDescricao", query = "SELECT w FROM WebsiteConteudodownload w WHERE w.descricao = :descricao")
    , @NamedQuery(name = "WebsiteConteudodownload.findByTipo", query = "SELECT w FROM WebsiteConteudodownload w WHERE w.tipo = :tipo")
    , @NamedQuery(name = "WebsiteConteudodownload.findByMiniatura", query = "SELECT w FROM WebsiteConteudodownload w WHERE w.miniatura = :miniatura")
    , @NamedQuery(name = "WebsiteConteudodownload.findByConteudoFile", query = "SELECT w FROM WebsiteConteudodownload w WHERE w.conteudoFile = :conteudoFile")})
public class WebsiteConteudodownload implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "slug")
    private String slug;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "miniatura")
    private String miniatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "conteudo_file")
    private String conteudoFile;

    public WebsiteConteudodownload() {
    }

    public WebsiteConteudodownload(Integer id) {
        this.id = id;
    }

    public WebsiteConteudodownload(Integer id, String titulo, String slug, String descricao, String tipo, String miniatura, String conteudoFile) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.descricao = descricao;
        this.tipo = tipo;
        this.miniatura = miniatura;
        this.conteudoFile = conteudoFile;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }

    public String getConteudoFile() {
        return conteudoFile;
    }

    public void setConteudoFile(String conteudoFile) {
        this.conteudoFile = conteudoFile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebsiteConteudodownload)) {
            return false;
        }
        WebsiteConteudodownload other = (WebsiteConteudodownload) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteConteudodownload[ id=" + id + " ]";
    }

}
