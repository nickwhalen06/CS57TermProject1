package com.thoughtmechanix.assets.repository;

import com.thoughtmechanix.assets.model.Asset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends CrudRepository<Asset,String>  {
    List<Asset> findByOrganizationId(String organizationId);
    Asset findByOrganizationIdAndAssetId(String organizationId,String assetId);
    Asset findByAssetId(String assetId);
}
