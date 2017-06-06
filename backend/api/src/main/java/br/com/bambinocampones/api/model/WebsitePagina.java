/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bambinocampones.api.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "website_pagina", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsitePagina.findAll", query = "SELECT w FROM WebsitePagina w")
    , @NamedQuery(name = "WebsitePagina.findById", query = "SELECT w FROM WebsitePagina w WHERE w.id = :id")
    , @NamedQuery(name = "WebsitePagina.findByTitulo", query = "SELECT w FROM WebsitePagina w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsitePagina.findBySlug", query = "SELECT w FROM WebsitePagina w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsitePagina.findByConteudo", query = "SELECT w FROM WebsitePagina w WHERE w.conteudo = :conteudo")
    , @NamedQuery(name = "WebsitePagina.findByPalavrasChaves", query = "SELECT w FROM WebsitePagina w WHERE w.palavrasChaves = :palavrasChaves")
    , @NamedQuery(name = "WebsitePagina.findByPermiteComentario", query = "SELECT w FROM WebsitePagina w WHERE w.permiteComentario = :permiteComentario")
    , @NamedQuery(name = "WebsitePagina.findByRascunho", query = "SELECT w FROM WebsitePagina w WHERE w.rascunho = :rascunho")
    , @NamedQuery(name = "WebsitePagina.findByDescricao", query = "SELECT w FROM WebsitePagina w WHERE w.descricao = :descricao")})
public class WebsitePagina implements Serializable {

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
    @Size(min = 1, max = 2147483647)
    @Column(name = "conteudo")
    private String conteudo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "palavras_chaves")
    private String palavrasChaves;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permite_comentario")
    private boolean permiteComentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rascunho")
    private boolean rascunho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(mappedBy = "paginaId")
    private List<WebsiteMenu> websiteMenuList;

    public WebsitePagina() {
    }

    public WebsitePagina(Integer id) {
        this.id = id;
    }

    public WebsitePagina(Integer id, String titulo, String slug, String conteudo, String palavrasChaves, boolean permiteComentario, boolean rascunho, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.conteudo = conteudo;
        this.palavrasChaves = palavrasChaves;
        this.permiteComentario = permiteComentario;
        this.rascunho = rascunho;
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

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getPalavrasChaves() {
        return palavrasChaves;
    }

    public void setPalavrasChaves(String palavrasChaves) {
        this.palavrasChaves = palavrasChaves;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<WebsiteMenu> getWebsiteMenuList() {
        return websiteMenuList;
    }

    public void setWebsiteMenuList(List<WebsiteMenu> websiteMenuList) {
        this.websiteMenuList = websiteMenuList;
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
        if (!(object instanceof WebsitePagina)) {
            return false;
        }
        WebsitePagina other = (WebsitePagina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsitePagina[ id=" + id + " ]";
    }

}
