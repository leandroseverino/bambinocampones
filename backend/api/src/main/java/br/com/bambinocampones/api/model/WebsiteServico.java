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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "website_servico", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteServico.findAll", query = "SELECT w FROM WebsiteServico w")
    , @NamedQuery(name = "WebsiteServico.findById", query = "SELECT w FROM WebsiteServico w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteServico.findByTitulo", query = "SELECT w FROM WebsiteServico w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsiteServico.findBySlug", query = "SELECT w FROM WebsiteServico w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsiteServico.findByConteudoProgramatico", query = "SELECT w FROM WebsiteServico w WHERE w.conteudoProgramatico = :conteudoProgramatico")
    , @NamedQuery(name = "WebsiteServico.findByAtividadesIncluidas", query = "SELECT w FROM WebsiteServico w WHERE w.atividadesIncluidas = :atividadesIncluidas")
    , @NamedQuery(name = "WebsiteServico.findByAtividadesExtras", query = "SELECT w FROM WebsiteServico w WHERE w.atividadesExtras = :atividadesExtras")
    , @NamedQuery(name = "WebsiteServico.findByRotinaDiaria", query = "SELECT w FROM WebsiteServico w WHERE w.rotinaDiaria = :rotinaDiaria")
    , @NamedQuery(name = "WebsiteServico.findByObservacoes", query = "SELECT w FROM WebsiteServico w WHERE w.observacoes = :observacoes")})
public class WebsiteServico implements Serializable {

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
    @Column(name = "conteudo_programatico")
    private String conteudoProgramatico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "atividades_incluidas")
    private String atividadesIncluidas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "atividades_extras")
    private String atividadesExtras;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rotina_diaria")
    private String rotinaDiaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "observacoes")
    private String observacoes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicoId")
    private List<WebsiteMaterialescolar> websiteMaterialescolarList;
    @JoinColumn(name = "professor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private WebsiteProfessor professorId;

    public WebsiteServico() {
    }

    public WebsiteServico(Integer id) {
        this.id = id;
    }

    public WebsiteServico(Integer id, String titulo, String slug, String conteudoProgramatico, String atividadesIncluidas, String atividadesExtras, String rotinaDiaria, String observacoes) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.conteudoProgramatico = conteudoProgramatico;
        this.atividadesIncluidas = atividadesIncluidas;
        this.atividadesExtras = atividadesExtras;
        this.rotinaDiaria = rotinaDiaria;
        this.observacoes = observacoes;
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

    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setConteudoProgramatico(String conteudoProgramatico) {
        this.conteudoProgramatico = conteudoProgramatico;
    }

    public String getAtividadesIncluidas() {
        return atividadesIncluidas;
    }

    public void setAtividadesIncluidas(String atividadesIncluidas) {
        this.atividadesIncluidas = atividadesIncluidas;
    }

    public String getAtividadesExtras() {
        return atividadesExtras;
    }

    public void setAtividadesExtras(String atividadesExtras) {
        this.atividadesExtras = atividadesExtras;
    }

    public String getRotinaDiaria() {
        return rotinaDiaria;
    }

    public void setRotinaDiaria(String rotinaDiaria) {
        this.rotinaDiaria = rotinaDiaria;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<WebsiteMaterialescolar> getWebsiteMaterialescolarList() {
        return websiteMaterialescolarList;
    }

    public void setWebsiteMaterialescolarList(List<WebsiteMaterialescolar> websiteMaterialescolarList) {
        this.websiteMaterialescolarList = websiteMaterialescolarList;
    }

    public WebsiteProfessor getProfessorId() {
        return professorId;
    }

    public void setProfessorId(WebsiteProfessor professorId) {
        this.professorId = professorId;
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
        if (!(object instanceof WebsiteServico)) {
            return false;
        }
        WebsiteServico other = (WebsiteServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteServico[ id=" + id + " ]";
    }

}
