package com.spp.apiintegration2application;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Products {


    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("quantity")
    @Expose
    private int quantity;
    @SerializedName("unit")
    @Expose
    private String unit;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


//   String _productname,_imageUrl,_price,_quantity,_unit;
//
//    public String get_productname() {
//        return _productname;
//    }
//
//    public void set_productname(String _productname) {
//        this._productname = _productname;
//    }
//
//    public String get_imageUrl() {
//        return _imageUrl;
//    }
//
//    public void set_imageUrl(String _imageUrl) {
//        this._imageUrl = _imageUrl;
//    }
//
//    public String get_price() {
//        return _price;
//    }
//
//    public void set_price(String _price) {
//        this._price = _price;
//    }
//
//    public String get_quantity() {
//        return _quantity;
//    }
//
//    public void set_quantity(String _quantity) {
//        this._quantity = _quantity;
//    }
//
//    public String get_unit() {
//        return _unit;
//    }
//
//    public void set_unit(String _unit) {
//        this._unit = _unit;
//    }

}
