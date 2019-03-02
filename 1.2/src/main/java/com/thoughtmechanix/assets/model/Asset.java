package com.thoughtmechanix.assets.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Asset {
    @Id
    private String id;

    @NotNull
    @Size(min = 3, max = 50)
    private String organizationId;

    @NotNull
    @Size(min = 3, max = 50)
    private String assetName;

    @NotNull
    @Size(min = 3, max = 50)
    private String assetType;

    public Asset() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public Asset withId(String id){
        this.setId( id );
        return this;
    }

    public Asset withOrganizationId(String organizationId){
        this.setOrganizationId(organizationId);
        return this;
    }

    public Asset withAssetType(String productName){
        this.setAssetType(productName);
        return this;
    }

    public Asset withAssetName(String licenseType){
        this.setAssetName(licenseType);
        return this;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id='" + id + '\'' +
                ", organizationId='" + organizationId + '\'' +
                ", assetName='" + assetName + '\'' +
                ", assetType='" + assetType + '\'' +
                '}';
    }
}
