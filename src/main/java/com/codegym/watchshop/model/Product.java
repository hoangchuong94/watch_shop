package com.codegym.watchshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double unitPrice;
    private String image;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date productDate;
    private Boolean available;
    //    private Integer categoryId;
    private Integer quantity;
    private String description;
    private String viewCount;
    private Boolean special;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    Category category;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    List<OrderDetails> orderDetails;


    public Product() {
    }

    public Product(Long id, String name, Double unitPrice, String image, Date productDate, Boolean available, Integer quantity, String description, String viewCount, Boolean special, boolean status, Category category, List<OrderDetails> orderDetails) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.image = image;
        this.productDate = productDate;
        this.available = available;
        this.quantity = quantity;
        this.description = description;
        this.viewCount = viewCount;
        this.special = special;
        this.status = status;
        this.category = category;
        this.orderDetails = orderDetails;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public Boolean getSpecial() {
        return special;
    }

    public void setSpecial(Boolean special) {
        this.special = special;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
