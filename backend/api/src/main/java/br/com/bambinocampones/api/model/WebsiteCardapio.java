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
@Table(name = "website_cardapio", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteCardapio.findAll", query = "SELECT w FROM WebsiteCardapio w")
    , @NamedQuery(name = "WebsiteCardapio.findById", query = "SELECT w FROM WebsiteCardapio w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteCardapio.findByTipo", query = "SELECT w FROM WebsiteCardapio w WHERE w.tipo = :tipo")
    , @NamedQuery(name = "WebsiteCardapio.findByMes", query = "SELECT w FROM WebsiteCardapio w WHERE w.mes = :mes")
    , @NamedQuery(name = "WebsiteCardapio.findByAno", query = "SELECT w FROM WebsiteCardapio w WHERE w.ano = :ano")
    , @NamedQuery(name = "WebsiteCardapio.findByCardapioFile", query = "SELECT w FROM WebsiteCardapio w WHERE w.cardapioFile = :cardapioFile")})
public class WebsiteCardapio implements Serializable {

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
    @Size(min = 1, max = 100)
    @Column(name = "cardapio_file")
    private String cardapioFile;

    public WebsiteCardapio() {
    }

    public WebsiteCardapio(Integer id) {
        this.id = id;
    }

    public WebsiteCardapio(Integer id, String tipo, String mes, String ano, String cardapioFile) {
        this.id = id;
        this.tipo = tipo;
        this.mes = mes;
        this.ano = ano;
        this.cardapioFile = cardapioFile;
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

    public String getCardapioFile() {
        return cardapioFile;
    }

    public void setCardapioFile(String cardapioFile) {
        this.cardapioFile = cardapioFile;
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
        if (!(object instanceof WebsiteCardapio)) {
            return false;
        }
        WebsiteCardapio other = (WebsiteCardapio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteCardapio[ id=" + id + " ]";
    }

}
