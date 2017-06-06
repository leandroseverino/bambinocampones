/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bambinocampones.api.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "website_galeria", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteGaleria.findAll", query = "SELECT w FROM WebsiteGaleria w")
    , @NamedQuery(name = "WebsiteGaleria.findById", query = "SELECT w FROM WebsiteGaleria w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteGaleria.findByTitulo", query = "SELECT w FROM WebsiteGaleria w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsiteGaleria.findBySlug", query = "SELECT w FROM WebsiteGaleria w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsiteGaleria.findByTipo", query = "SELECT w FROM WebsiteGaleria w WHERE w.tipo = :tipo")
    , @NamedQuery(name = "WebsiteGaleria.findByDescricao", query = "SELECT w FROM WebsiteGaleria w WHERE w.descricao = :descricao")
    , @NamedQuery(name = "WebsiteGaleria.findByMes", query = "SELECT w FROM WebsiteGaleria w WHERE w.mes = :mes")
    , @NamedQuery(name = "WebsiteGaleria.findByAno", query = "SELECT w FROM WebsiteGaleria w WHERE w.ano = :ano")
    , @NamedQuery(name = "WebsiteGaleria.findByDestaque", query = "SELECT w FROM WebsiteGaleria w WHERE w.destaque = :destaque")
    , @NamedQuery(name = "WebsiteGaleria.findByPermiteComentario", query = "SELECT w FROM WebsiteGaleria w WHERE w.permiteComentario = :permiteComentario")})
public class WebsiteGaleria implements Serializable {

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
    @Size(min = 1, max = 1)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "mes")
    private String mes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ano")
    private String ano;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destaque")
    private boolean destaque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permite_comentario")
    private boolean permiteComentario;
    @OneToMany(mappedBy = "galeriaId")
    private List<WebsitePublicacao> websitePublicacaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "galeriaId")
    private List<WebsiteGaleriaresource> websiteGaleriaresourceList;

    public WebsiteGaleria() {
    }

    public WebsiteGaleria(Integer id) {
        this.id = id;
    }

    public WebsiteGaleria(Integer id, String titulo, String slug, String tipo, String descricao, String mes, String ano, boolean destaque, boolean permiteComentario) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.tipo = tipo;
        this.descricao = descricao;
        this.mes = mes;
        this.ano = ano;
        this.destaque = destaque;
        this.permiteComentario = permiteComentario;
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

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public boolean getPermiteComentario() {
        return permiteComentario;
    }

    public void setPermiteComentario(boolean permiteComentario) {
        this.permiteComentario = permiteComentario;
    }

    public List<WebsitePublicacao> getWebsitePublicacaoList() {
        return websitePublicacaoList;
    }

    public void setWebsitePublicacaoList(List<WebsitePublicacao> websitePublicacaoList) {
        this.websitePublicacaoList = websitePublicacaoList;
    }

    public List<WebsiteGaleriaresource> getWebsiteGaleriaresourceList() {
        return websiteGaleriaresourceList;
    }

    public void setWebsiteGaleriaresourceList(List<WebsiteGaleriaresource> websiteGaleriaresourceList) {
        this.websiteGaleriaresourceList = websiteGaleriaresourceList;
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
        if (!(object instanceof WebsiteGaleria)) {
            return false;
        }
        WebsiteGaleria other = (WebsiteGaleria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteGaleria[ id=" + id + " ]";
    }

}
