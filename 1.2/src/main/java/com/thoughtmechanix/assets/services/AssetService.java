package com.thoughtmechanix.assets.services;

import org.springframework.stereotype.Service;
import com.thoughtmechanix.assets.model.Asset;

@Service
public class AssetService {
    public Asset getAsset(String organizationId, String assetId){
        return new Asset()
                .withId(assetId)
                .withOrganizationId( organizationId )
                .withAssetName("Test Asset Name")
                .withAssetType("Test Asset Type");
    }
}
