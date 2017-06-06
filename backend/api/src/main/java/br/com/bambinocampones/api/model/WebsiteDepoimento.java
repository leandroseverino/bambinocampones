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
@Table(name = "website_depoimento", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteDepoimento.findAll", query = "SELECT w FROM WebsiteDepoimento w")
    , @NamedQuery(name = "WebsiteDepoimento.findById", query = "SELECT w FROM WebsiteDepoimento w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteDepoimento.findByConteudo", query = "SELECT w FROM WebsiteDepoimento w WHERE w.conteudo = :conteudo")
    , @NamedQuery(name = "WebsiteDepoimento.findByAutor", query = "SELECT w FROM WebsiteDepoimento w WHERE w.autor = :autor")})
public class WebsiteDepoimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "conteudo")
    private String conteudo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "autor")
    private String autor;

    public WebsiteDepoimento() {
    }

    public WebsiteDepoimento(Integer id) {
        this.id = id;
    }

    public WebsiteDepoimento(Integer id, String conteudo, String autor) {
        this.id = id;
        this.conteudo = conteudo;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
        if (!(object instanceof WebsiteDepoimento)) {
            return false;
        }
        WebsiteDepoimento other = (WebsiteDepoimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteDepoimento[ id=" + id + " ]";
    }

}
