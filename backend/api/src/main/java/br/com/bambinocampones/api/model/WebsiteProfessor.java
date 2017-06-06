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
@Table(name = "website_professor", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteProfessor.findAll", query = "SELECT w FROM WebsiteProfessor w")
    , @NamedQuery(name = "WebsiteProfessor.findById", query = "SELECT w FROM WebsiteProfessor w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteProfessor.findByNome", query = "SELECT w FROM WebsiteProfessor w WHERE w.nome = :nome")
    , @NamedQuery(name = "WebsiteProfessor.findBySlug", query = "SELECT w FROM WebsiteProfessor w WHERE w.slug = :slug")})
public class WebsiteProfessor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "slug")
    private String slug;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professorId")
    private List<WebsiteServico> websiteServicoList;

    public WebsiteProfessor() {
    }

    public WebsiteProfessor(Integer id) {
        this.id = id;
    }

    public WebsiteProfessor(Integer id, String nome, String slug) {
        this.id = id;
        this.nome = nome;
        this.slug = slug;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<WebsiteServico> getWebsiteServicoList() {
        return websiteServicoList;
    }

    public void setWebsiteServicoList(List<WebsiteServico> websiteServicoList) {
        this.websiteServicoList = websiteServicoList;
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
        if (!(object instanceof WebsiteProfessor)) {
            return false;
        }
        WebsiteProfessor other = (WebsiteProfessor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteProfessor[ id=" + id + " ]";
    }

}
