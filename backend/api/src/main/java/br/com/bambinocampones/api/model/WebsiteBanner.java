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
@Table(name = "website_banner", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteBanner.findAll", query = "SELECT w FROM WebsiteBanner w")
    , @NamedQuery(name = "WebsiteBanner.findById", query = "SELECT w FROM WebsiteBanner w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteBanner.findByTitulo", query = "SELECT w FROM WebsiteBanner w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsiteBanner.findBySlug", query = "SELECT w FROM WebsiteBanner w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsiteBanner.findByDescricao", query = "SELECT w FROM WebsiteBanner w WHERE w.descricao = :descricao")
    , @NamedQuery(name = "WebsiteBanner.findByUrlResource", query = "SELECT w FROM WebsiteBanner w WHERE w.urlResource = :urlResource")
    , @NamedQuery(name = "WebsiteBanner.findByUploadResource", query = "SELECT w FROM WebsiteBanner w WHERE w.uploadResource = :uploadResource")
    , @NamedQuery(name = "WebsiteBanner.findByActionResource", query = "SELECT w FROM WebsiteBanner w WHERE w.actionResource = :actionResource")
    , @NamedQuery(name = "WebsiteBanner.findByAtivo", query = "SELECT w FROM WebsiteBanner w WHERE w.ativo = :ativo")})
public class WebsiteBanner implements Serializable {

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
    @Size(max = 200)
    @Column(name = "url_resource")
    private String urlResource;
    @Size(max = 100)
    @Column(name = "upload_resource")
    private String uploadResource;
    @Size(max = 200)
    @Column(name = "action_resource")
    private String actionResource;
    @Column(name = "ativo")
    private Boolean ativo;

    public WebsiteBanner() {
    }

    public WebsiteBanner(Integer id) {
        this.id = id;
    }

    public WebsiteBanner(Integer id, String titulo, String slug, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.descricao = descricao;
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

    public String getUrlResource() {
        return urlResource;
    }

    public void setUrlResource(String urlResource) {
        this.urlResource = urlResource;
    }

    public String getUploadResource() {
        return uploadResource;
    }

    public void setUploadResource(String uploadResource) {
        this.uploadResource = uploadResource;
    }

    public String getActionResource() {
        return actionResource;
    }

    public void setActionResource(String actionResource) {
        this.actionResource = actionResource;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
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
        if (!(object instanceof WebsiteBanner)) {
            return false;
        }
        WebsiteBanner other = (WebsiteBanner) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteBanner[ id=" + id + " ]";
    }

}
