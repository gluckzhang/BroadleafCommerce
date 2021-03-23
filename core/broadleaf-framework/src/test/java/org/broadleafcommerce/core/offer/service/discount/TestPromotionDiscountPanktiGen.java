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
package org.broadleafcommerce.core.offer.service.discount;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
public class TestPromotionDiscountPanktiGen {
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
    public void testSplit1() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split1-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit2() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split2-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split3-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split4-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split5-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit6() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split6-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit7() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split7-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split8-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split9-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split10-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split11-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split12-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit13() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split13-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit14() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split14-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split15-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit16() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split16-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit17() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split17-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit18() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split18-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(2));
    }

    @Test
    public void testSplit19() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split19-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit20() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split20-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit21() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split21-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit22() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split22-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    @Ignore
    public void testSplit23() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split23-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        File fileReturned = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split23-returned.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount expectedObject = deserializeObject(fileReturned);
        Assert.assertEquals(expectedObject, receivingObject.split(1));
    }

    @Test
    public void testSplit24() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split24-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit25() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split25-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit26() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split26-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit27() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split27-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit28() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split28-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(2));
    }

    @Test
    public void testSplit29() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split29-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit30() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split30-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit31() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split31-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit32() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split32-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit33() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split33-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit34() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split34-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit35() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split35-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit36() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split36-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit37() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split37-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit38() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split38-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit39() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split39-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit40() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split40-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit41() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split41-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit42() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split42-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit43() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split43-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit44() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split44-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit45() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split45-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit46() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split46-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit47() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split47-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }

    @Test
    public void testSplit48() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.discount.PromotionDiscount.split48-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.discount.PromotionDiscount receivingObject = deserializeObject(fileReceiving);
        Assert.assertEquals(null, receivingObject.split(1));
    }
}