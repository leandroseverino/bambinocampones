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
@Table(name = "website_menu", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteMenu.findAll", query = "SELECT w FROM WebsiteMenu w")
    , @NamedQuery(name = "WebsiteMenu.findById", query = "SELECT w FROM WebsiteMenu w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteMenu.findByTitulo", query = "SELECT w FROM WebsiteMenu w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsiteMenu.findBySlug", query = "SELECT w FROM WebsiteMenu w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsiteMenu.findByEndereco", query = "SELECT w FROM WebsiteMenu w WHERE w.endereco = :endereco")
    , @NamedQuery(name = "WebsiteMenu.findByOrdem", query = "SELECT w FROM WebsiteMenu w WHERE w.ordem = :ordem")
    , @NamedQuery(name = "WebsiteMenu.findByNivel", query = "SELECT w FROM WebsiteMenu w WHERE w.nivel = :nivel")
    , @NamedQuery(name = "WebsiteMenu.findByPalavrasChaves", query = "SELECT w FROM WebsiteMenu w WHERE w.palavrasChaves = :palavrasChaves")
    , @NamedQuery(name = "WebsiteMenu.findByRascunho", query = "SELECT w FROM WebsiteMenu w WHERE w.rascunho = :rascunho")})
public class WebsiteMenu implements Serializable {

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
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ordem")
    private int ordem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "palavras_chaves")
    private String palavrasChaves;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rascunho")
    private boolean rascunho;
    @OneToMany(mappedBy = "menuPaiId")
    private List<WebsiteMenu> websiteMenuList;
    @JoinColumn(name = "menu_pai_id", referencedColumnName = "id")
    @ManyToOne
    private WebsiteMenu menuPaiId;
    @JoinColumn(name = "pagina_id", referencedColumnName = "id")
    @ManyToOne
    private WebsitePagina paginaId;

    public WebsiteMenu() {
    }

    public WebsiteMenu(Integer id) {
        this.id = id;
    }

    public WebsiteMenu(Integer id, String titulo, String slug, String endereco, int ordem, int nivel, String palavrasChaves, boolean rascunho) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.endereco = endereco;
        this.ordem = ordem;
        this.nivel = nivel;
        this.palavrasChaves = palavrasChaves;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPalavrasChaves() {
        return palavrasChaves;
    }

    public void setPalavrasChaves(String palavrasChaves) {
        this.palavrasChaves = palavrasChaves;
    }

    public boolean getRascunho() {
        return rascunho;
    }

    public void setRascunho(boolean rascunho) {
        this.rascunho = rascunho;
    }

    public List<WebsiteMenu> getWebsiteMenuList() {
        return websiteMenuList;
    }

    public void setWebsiteMenuList(List<WebsiteMenu> websiteMenuList) {
        this.websiteMenuList = websiteMenuList;
    }

    public WebsiteMenu getMenuPaiId() {
        return menuPaiId;
    }

    public void setMenuPaiId(WebsiteMenu menuPaiId) {
        this.menuPaiId = menuPaiId;
    }

    public WebsitePagina getPaginaId() {
        return paginaId;
    }

    public void setPaginaId(WebsitePagina paginaId) {
        this.paginaId = paginaId;
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
        if (!(object instanceof WebsiteMenu)) {
            return false;
        }
        WebsiteMenu other = (WebsiteMenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteMenu[ id=" + id + " ]";
    }

}
