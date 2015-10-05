package com.ei.eiservices.utote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the categories database table.
 *
 */
@Entity
@Table(name="categories")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="`categoriesid`", insertable=true, updatable=false, unique=true, nullable=false)
    private int categoriesid;

    @Column(nullable=false)
    private boolean categoriesclosebeforetwominutes;

    @Column
    private int categoriescreationtime;

    @Column(length=45)
    private String categoriesdescription;

    @Column(length=45)
    private String categoriesimage;

    @Column(nullable=false)
    private int categorieslistforadmin;

    @Column(length=100)
    private String categoriesname;

    @Column(nullable=false, length=100)
    private String categoriesnameshort;

    @Column(nullable=false)
    private boolean categoriesshow;

    @Column
    private boolean categoriesstatus;

    public Category() {
    }

    public int getCategoriesid() {
        return this.categoriesid;
    }

    public void setCategoriesid(int categoriesid) {
        this.categoriesid = categoriesid;
    }

    public boolean getCategoriesclosebeforetwominutes() {
        return this.categoriesclosebeforetwominutes;
    }

    public void setCategoriesclosebeforetwominutes(boolean categoriesclosebeforetwominutes) {
        this.categoriesclosebeforetwominutes = categoriesclosebeforetwominutes;
    }

    public int getCategoriescreationtime() {
        return this.categoriescreationtime;
    }

    public void setCategoriescreationtime(int categoriescreationtime) {
        this.categoriescreationtime = categoriescreationtime;
    }

    public String getCategoriesdescription() {
        return this.categoriesdescription;
    }

    public void setCategoriesdescription(String categoriesdescription) {
        this.categoriesdescription = categoriesdescription;
    }

    public String getCategoriesimage() {
        return this.categoriesimage;
    }

    public void setCategoriesimage(String categoriesimage) {
        this.categoriesimage = categoriesimage;
    }

    public int getCategorieslistforadmin() {
        return this.categorieslistforadmin;
    }

    public void setCategorieslistforadmin(int categorieslistforadmin) {
        this.categorieslistforadmin = categorieslistforadmin;
    }

    public String getCategoriesname() {
        return this.categoriesname;
    }

    public void setCategoriesname(String categoriesname) {
        this.categoriesname = categoriesname;
    }

    public String getCategoriesnameshort() {
        return this.categoriesnameshort;
    }

    public void setCategoriesnameshort(String categoriesnameshort) {
        this.categoriesnameshort = categoriesnameshort;
    }

    public boolean getCategoriesshow() {
        return this.categoriesshow;
    }

    public void setCategoriesshow(boolean categoriesshow) {
        this.categoriesshow = categoriesshow;
    }

    public boolean getCategoriesstatus() {
        return this.categoriesstatus;
    }

    public void setCategoriesstatus(boolean categoriesstatus) {
        this.categoriesstatus = categoriesstatus;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Category [categoriesid=").append(categoriesid).append(", categoriesclosebeforetwominutes=")
        .append(categoriesclosebeforetwominutes).append(", categoriescreationtime=").append(categoriescreationtime).append(", ");
        if (categoriesdescription != null) {
            builder.append("categoriesdescription=").append(categoriesdescription).append(", ");
        }
        if (categoriesimage != null) {
            builder.append("categoriesimage=").append(categoriesimage).append(", ");
        }
        builder.append("categorieslistforadmin=").append(categorieslistforadmin).append(", ");
        if (categoriesname != null) {
            builder.append("categoriesname=").append(categoriesname).append(", ");
        }
        if (categoriesnameshort != null) {
            builder.append("categoriesnameshort=").append(categoriesnameshort).append(", ");
        }
        builder.append("categoriesshow=").append(categoriesshow).append(", categoriesstatus=").append(categoriesstatus).append("]");
        return builder.toString();
    }


}