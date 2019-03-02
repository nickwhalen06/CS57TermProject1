package com.thoughtmechanix.assets.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Asset {
  @Id
  private String assetId;

  @NotNull
  @Size(min = 3, max = 50)
  private String organizationId;

  @NotNull
  @Size(min = 3, max = 50)
  private String assetName;

  @NotNull
  @Size(min = 3, max = 50)
  private String assetType;

  @NotNull
  @Size(min = 3, max = 100)
  private String comment;

  public Asset() {

  }

  @NotNull
  public String getComment() {
    return comment;
  }

  public void setComment(@NotNull String comment) {
    this.comment = comment;
  }

  public String getId() {
    return assetId;
  }

  public void setId(String id) {
    this.assetId = id;
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

  public Asset withAssetType(String assetName){
    this.setAssetType(assetName);
    return this;
  }

  public Asset withAssetName(String assetName){
    this.setAssetName(assetName);
    return this;
  }

  public Asset withComment(String comment){
    this.setComment(comment);
    return this;
  }

  @Override
  public String toString() {
    return "Asset{" +
            "assetId='" + assetId + '\'' +
            ", organizationId='" + organizationId + '\'' +
            ", assetName='" + assetName + '\'' +
            ", assetType='" + assetType + '\'' +
            '}';
  }

}
