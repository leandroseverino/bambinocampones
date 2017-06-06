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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "website_galeriaresource", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteGaleriaresource.findAll", query = "SELECT w FROM WebsiteGaleriaresource w")
    , @NamedQuery(name = "WebsiteGaleriaresource.findById", query = "SELECT w FROM WebsiteGaleriaresource w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteGaleriaresource.findByUrlResource", query = "SELECT w FROM WebsiteGaleriaresource w WHERE w.urlResource = :urlResource")
    , @NamedQuery(name = "WebsiteGaleriaresource.findByUploadResource", query = "SELECT w FROM WebsiteGaleriaresource w WHERE w.uploadResource = :uploadResource")
    , @NamedQuery(name = "WebsiteGaleriaresource.findByActionResource", query = "SELECT w FROM WebsiteGaleriaresource w WHERE w.actionResource = :actionResource")})
public class WebsiteGaleriaresource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 200)
    @Column(name = "url_resource")
    private String urlResource;
    @Size(max = 200)
    @Column(name = "upload_resource")
    private String uploadResource;
    @Size(max = 200)
    @Column(name = "action_resource")
    private String actionResource;
    @JoinColumn(name = "galeria_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WebsiteGaleria galeriaId;

    public WebsiteGaleriaresource() {
    }

    public WebsiteGaleriaresource(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public WebsiteGaleria getGaleriaId() {
        return galeriaId;
    }

    public void setGaleriaId(WebsiteGaleria galeriaId) {
        this.galeriaId = galeriaId;
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
        if (!(object instanceof WebsiteGaleriaresource)) {
            return false;
        }
        WebsiteGaleriaresource other = (WebsiteGaleriaresource) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteGaleriaresource[ id=" + id + " ]";
    }

}
