package com.thoughtmechanix.assets.controllers;

import com.thoughtmechanix.assets.model.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import com.thoughtmechanix.assets.services.AssetService;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/assets")
public class AssetServiceController {
    @Autowired
    private AssetService assetService;

    @RequestMapping(value="/{assetId}",method = RequestMethod.GET)
    public Asset getAssets( @PathVariable("organizationId") String organizationId,
                                @PathVariable("assetId") String assetId) {

        //return licenseService.getLicense(licenseId);
        return new Asset()
                .withId(assetId)
                .withOrganizationId(organizationId)
                .withAssetName("Building")
                .withAssetType("Tangible");
    }

}
