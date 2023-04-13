package com.example.online.shopping.store.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable {
    @Id
    private String productId;

    private String productName;


    private BigDecimal productPrice;


    private Integer productStock;


    private String productDescription;


    private String productIcon;


    private Integer productStatus;

    private Integer categoryType;


    private Date createTime;

    private Date updateTime;

    public ProductInfo() {
    }
}
