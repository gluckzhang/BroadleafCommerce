/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2021 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.core.catalog.domain;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
public class TestSkuImplPanktiGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObject(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObject(File serializedObjectFile) throws Exception {
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    @Test
    public void testGetCurrency1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <salePrice>1.00</salePrice>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <salePrice>10.00</salePrice>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <salePrice>1.00</salePrice>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    public void testGetCurrency5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getCurrency());
    }

    @Test
    @Ignore
    public void testGetBaseRetailPrice1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>29.99</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getBaseRetailPrice());
    }

    @Test
    @Ignore
    public void testGetBaseRetailPrice2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>19.99</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getBaseRetailPrice());
    }

    @Test
    public void testGetBaseSalePrice1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getBaseSalePrice());
    }

    @Test
    public void testGetBaseSalePrice2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getBaseSalePrice());
    }

    @Test
    public void testIsTaxable1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.isTaxable());
    }

    @Test
    public void testIsTaxable2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.isTaxable());
    }

    @Test
    public void testGetName1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<string>test1</string>";
        java.lang.String expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getName());
    }

    @Test
    public void testGetName2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<string>test2</string>";
        java.lang.String expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getName());
    }

    @Test
    @Ignore
    public void testGetPriceData1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <salePrice>10.00</salePrice>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>29.99</float>" +
        "  </retailPrice>" +
        "  <salePrice>" +
        "    <float>10.0</float>" +
        "  </salePrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPriceData());
    }

    @Test
    @Ignore
    public void testGetPriceData2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>19.99</float>" +
        "  </retailPrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPriceData());
    }

    @Test
    @Ignore
    public void testGetPriceData3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>1</id>" +
        "  <salePrice>1.00</salePrice>" +
        "  <retailPrice>19.99</retailPrice>" +
        "  <name>test1</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>19.99</float>" +
        "  </retailPrice>" +
        "  <salePrice>" +
        "    <float>1.0</float>" +
        "  </salePrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPriceData());
    }

    @Test
    @Ignore
    public void testGetPriceData4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <salePrice>1.00</salePrice>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>29.99</float>" +
        "  </retailPrice>" +
        "  <salePrice>" +
        "    <float>1.0</float>" +
        "  </salePrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPriceData());
    }

    @Test
    @Ignore
    public void testGetPriceData5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.domain.SkuImpl>" +
        "  <id>2</id>" +
        "  <retailPrice>29.99</retailPrice>" +
        "  <name>test2</name>" +
        "  <discountable>Y</discountable>" +
        "  <dimension/>" +
        "  <weight/>" +
        "  <skuMedia/>" +
        "  <legacySkuMedia/>" +
        "  <defaultProduct class=\"org.broadleafcommerce.core.catalog.domain.ProductImpl\">" +
        "    <overrideGeneratedUrl>false</overrideGeneratedUrl>" +
        "    <isFeaturedProduct>false</isFeaturedProduct>" +
        "    <defaultSku class=\"org.broadleafcommerce.core.catalog.domain.SkuImpl\" reference=\"../..\"/>" +
        "    <canSellWithoutOptions>false</canSellWithoutOptions>" +
        "    <skus/>" +
        "    <crossSaleProducts/>" +
        "    <upSaleProducts/>" +
        "    <additionalSkus/>" +
        "    <allParentCategoryXrefs/>" +
        "    <productAttributes/>" +
        "    <productOptions/>" +
        "    <archiveStatus>" +
        "      <archived>N</archived>" +
        "    </archiveStatus>" +
        "  </defaultProduct>" +
        "  <skuAttributes/>" +
        "  <productOptionValueXrefs/>" +
        "  <legacyProductOptionValues/>" +
        "  <fees/>" +
        "  <fulfillmentFlatRates/>" +
        "  <excludedFulfillmentOptions/>" +
        "  <quantityAvailable>0</quantityAvailable>" +
        "</org.broadleafcommerce.core.catalog.domain.SkuImpl>";
        org.broadleafcommerce.core.catalog.domain.SkuImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>29.99</float>" +
        "  </retailPrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPriceData());
    }
}