/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bambinocampones.api.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "website_publicacao", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsitePublicacao.findAll", query = "SELECT w FROM WebsitePublicacao w")
    , @NamedQuery(name = "WebsitePublicacao.findById", query = "SELECT w FROM WebsitePublicacao w WHERE w.id = :id")
    , @NamedQuery(name = "WebsitePublicacao.findByTitulo", query = "SELECT w FROM WebsitePublicacao w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsitePublicacao.findBySlug", query = "SELECT w FROM WebsitePublicacao w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsitePublicacao.findByDataHora", query = "SELECT w FROM WebsitePublicacao w WHERE w.dataHora = :dataHora")
    , @NamedQuery(name = "WebsitePublicacao.findByDataPublicacao", query = "SELECT w FROM WebsitePublicacao w WHERE w.dataPublicacao = :dataPublicacao")
    , @NamedQuery(name = "WebsitePublicacao.findByPalavrasChaves", query = "SELECT w FROM WebsitePublicacao w WHERE w.palavrasChaves = :palavrasChaves")
    , @NamedQuery(name = "WebsitePublicacao.findByTipos", query = "SELECT w FROM WebsitePublicacao w WHERE w.tipos = :tipos")
    , @NamedQuery(name = "WebsitePublicacao.findByIntroducao", query = "SELECT w FROM WebsitePublicacao w WHERE w.introducao = :introducao")
    , @NamedQuery(name = "WebsitePublicacao.findByCompleta", query = "SELECT w FROM WebsitePublicacao w WHERE w.completa = :completa")
    , @NamedQuery(name = "WebsitePublicacao.findByMiniaturaPublicacao", query = "SELECT w FROM WebsitePublicacao w WHERE w.miniaturaPublicacao = :miniaturaPublicacao")
    , @NamedQuery(name = "WebsitePublicacao.findByDestaque", query = "SELECT w FROM WebsitePublicacao w WHERE w.destaque = :destaque")
    , @NamedQuery(name = "WebsitePublicacao.findByPermiteComentario", query = "SELECT w FROM WebsitePublicacao w WHERE w.permiteComentario = :permiteComentario")
    , @NamedQuery(name = "WebsitePublicacao.findByRascunho", query = "SELECT w FROM WebsitePublicacao w WHERE w.rascunho = :rascunho")})
public class WebsitePublicacao implements Serializable {

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
    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_publicacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPublicacao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "palavras_chaves")
    private String palavrasChaves;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "tipos")
    private String tipos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "introducao")
    private String introducao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "completa")
    private String completa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "miniatura_publicacao")
    private String miniaturaPublicacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "destaque")
    private boolean destaque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permite_comentario")
    private boolean permiteComentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rascunho")
    private boolean rascunho;
    @JoinColumn(name = "galeria_id", referencedColumnName = "id")
    @ManyToOne
    private WebsiteGaleria galeriaId;

    public WebsitePublicacao() {
    }

    public WebsitePublicacao(Integer id) {
        this.id = id;
    }

    public WebsitePublicacao(Integer id, String titulo, String slug, Date dataHora, Date dataPublicacao, String palavrasChaves, String tipos, String introducao, String completa, String miniaturaPublicacao, boolean destaque, boolean permiteComentario, boolean rascunho) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.dataHora = dataHora;
        this.dataPublicacao = dataPublicacao;
        this.palavrasChaves = palavrasChaves;
        this.tipos = tipos;
        this.introducao = introducao;
        this.completa = completa;
        this.miniaturaPublicacao = miniaturaPublicacao;
        this.destaque = destaque;
        this.permiteComentario = permiteComentario;
        this.rascunho = rascunho;
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

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getPalavrasChaves() {
        return palavrasChaves;
    }

    public void setPalavrasChaves(String palavrasChaves) {
        this.palavrasChaves = palavrasChaves;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getCompleta() {
        return completa;
    }

    public void setCompleta(String completa) {
        this.completa = completa;
    }

    public String getMiniaturaPublicacao() {
        return miniaturaPublicacao;
    }

    public void setMiniaturaPublicacao(String miniaturaPublicacao) {
        this.miniaturaPublicacao = miniaturaPublicacao;
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

    public boolean getRascunho() {
        return rascunho;
    }

    public void setRascunho(boolean rascunho) {
        this.rascunho = rascunho;
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
        if (!(object instanceof WebsitePublicacao)) {
            return false;
        }
        WebsitePublicacao other = (WebsitePublicacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsitePublicacao[ id=" + id + " ]";
    }

}
