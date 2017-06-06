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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "website_materialescolar", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteMaterialescolar.findAll", query = "SELECT w FROM WebsiteMaterialescolar w")
    , @NamedQuery(name = "WebsiteMaterialescolar.findById", query = "SELECT w FROM WebsiteMaterialescolar w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteMaterialescolar.findByAno", query = "SELECT w FROM WebsiteMaterialescolar w WHERE w.ano = :ano")
    , @NamedQuery(name = "WebsiteMaterialescolar.findByMiniatura", query = "SELECT w FROM WebsiteMaterialescolar w WHERE w.miniatura = :miniatura")
    , @NamedQuery(name = "WebsiteMaterialescolar.findByAnexoFile", query = "SELECT w FROM WebsiteMaterialescolar w WHERE w.anexoFile = :anexoFile")})
public class WebsiteMaterialescolar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ano")
    private String ano;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "miniatura")
    private String miniatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "anexo_file")
    private String anexoFile;
    @JoinColumn(name = "servico_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WebsiteServico servicoId;

    public WebsiteMaterialescolar() {
    }

    public WebsiteMaterialescolar(Integer id) {
        this.id = id;
    }

    public WebsiteMaterialescolar(Integer id, String ano, String miniatura, String anexoFile) {
        this.id = id;
        this.ano = ano;
        this.miniatura = miniatura;
        this.anexoFile = anexoFile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }

    public String getAnexoFile() {
        return anexoFile;
    }

    public void setAnexoFile(String anexoFile) {
        this.anexoFile = anexoFile;
    }

    public WebsiteServico getServicoId() {
        return servicoId;
    }

    public void setServicoId(WebsiteServico servicoId) {
        this.servicoId = servicoId;
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
        if (!(object instanceof WebsiteMaterialescolar)) {
            return false;
        }
        WebsiteMaterialescolar other = (WebsiteMaterialescolar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteMaterialescolar[ id=" + id + " ]";
    }

}
