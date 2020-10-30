/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2020 Broadleaf Commerce
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
package org.broadleafcommerce.core.catalog.service.dynamic;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestDynamicSkuPricesPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetPrice1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>6.99</float>" +
        "  </retailPrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices receivingObject = (org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices) xStream.fromXML(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>6.99</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = (org.broadleafcommerce.common.money.Money) xStream.fromXML(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }
}