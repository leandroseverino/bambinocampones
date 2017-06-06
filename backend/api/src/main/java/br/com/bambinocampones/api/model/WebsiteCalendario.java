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
@Table(name = "website_calendario", catalog = "bambinocampones", schema = "public")
@NamedQueries({
    @NamedQuery(name = "WebsiteCalendario.findAll", query = "SELECT w FROM WebsiteCalendario w")
    , @NamedQuery(name = "WebsiteCalendario.findById", query = "SELECT w FROM WebsiteCalendario w WHERE w.id = :id")
    , @NamedQuery(name = "WebsiteCalendario.findByTitulo", query = "SELECT w FROM WebsiteCalendario w WHERE w.titulo = :titulo")
    , @NamedQuery(name = "WebsiteCalendario.findBySlug", query = "SELECT w FROM WebsiteCalendario w WHERE w.slug = :slug")
    , @NamedQuery(name = "WebsiteCalendario.findByTipo", query = "SELECT w FROM WebsiteCalendario w WHERE w.tipo = :tipo")
    , @NamedQuery(name = "WebsiteCalendario.findByDataAgendamento", query = "SELECT w FROM WebsiteCalendario w WHERE w.dataAgendamento = :dataAgendamento")})
public class WebsiteCalendario implements Serializable {

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
    @Column(name = "data_agendamento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAgendamento;

    public WebsiteCalendario() {
    }

    public WebsiteCalendario(Integer id) {
        this.id = id;
    }

    public WebsiteCalendario(Integer id, String titulo, String slug, String tipo, Date dataAgendamento) {
        this.id = id;
        this.titulo = titulo;
        this.slug = slug;
        this.tipo = tipo;
        this.dataAgendamento = dataAgendamento;
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

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
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
        if (!(object instanceof WebsiteCalendario)) {
            return false;
        }
        WebsiteCalendario other = (WebsiteCalendario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bambinocampones.api.model.WebsiteCalendario[ id=" + id + " ]";
    }

}
