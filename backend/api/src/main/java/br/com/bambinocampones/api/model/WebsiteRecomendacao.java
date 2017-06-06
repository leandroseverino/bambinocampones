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
@Table(name = "website_recomendacao", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteRecomendacao.findAll", query = "SELECT w FROM WebsiteRecomendacao w")
    , @NamedQuery(name = "WebsiteRecomendacao.findById", query = "SELECT w FROM WebsiteRecomendacao w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteRecomendacao.findByTipo", query = "SELECT w FROM WebsiteRecomendacao w WHERE w.tipo = :tipo")
    , @NamedQuery(name = "WebsiteRecomendacao.findByDescricao", query = "SELECT w FROM WebsiteRecomendacao w WHERE w.descricao = :descricao")
    , @NamedQuery(name = "WebsiteRecomendacao.findByAcaoLink", query = "SELECT w FROM WebsiteRecomendacao w WHERE w.acaoLink = :acaoLink")
    , @NamedQuery(name = "WebsiteRecomendacao.findByMiniatura", query = "SELECT w FROM WebsiteRecomendacao w WHERE w.miniatura = :miniatura")
    , @NamedQuery(name = "WebsiteRecomendacao.findByDestaque", query = "SELECT w FROM WebsiteRecomendacao w WHERE w.destaque = :destaque")})
public class WebsiteRecomendacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 200)
    @Column(name = "acao_link")
    private String acaoLink;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "miniatura")
    private String miniatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destaque")
    private boolean destaque;

    public WebsiteRecomendacao() {
    }

    public WebsiteRecomendacao(Integer id) {
        this.id = id;
    }

    public WebsiteRecomendacao(Integer id, String tipo, String descricao, String miniatura, boolean destaque) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.miniatura = miniatura;
        this.destaque = destaque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAcaoLink() {
        return acaoLink;
    }

    public void setAcaoLink(String acaoLink) {
        this.acaoLink = acaoLink;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }

    public boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
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
        if (!(object instanceof WebsiteRecomendacao)) {
            return false;
        }
        WebsiteRecomendacao other = (WebsiteRecomendacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteRecomendacao[ id=" + id + " ]";
    }

}
