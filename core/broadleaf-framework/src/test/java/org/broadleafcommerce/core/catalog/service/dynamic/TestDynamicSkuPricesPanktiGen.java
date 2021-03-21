package org.broadleafcommerce.core.catalog.service.dynamic;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestDynamicSkuPricesPanktiGen {
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
    public void testGetPrice1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>19.99</float>" +
        "  </retailPrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>19.99</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }

    @Test
    public void testGetPrice2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>29.99</float>" +
        "  </retailPrice>" +
        "  <salePrice>" +
        "    <float>10.0</float>" +
        "  </salePrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>10.0</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }

    @Test
    public void testGetPrice3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>29.99</float>" +
        "  </retailPrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>29.99</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }

    @Test
    public void testGetPrice4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>29.99</float>" +
        "  </retailPrice>" +
        "  <salePrice>" +
        "    <float>1.0</float>" +
        "  </salePrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>1.0</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }

    @Test
    public void testGetPrice5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>" +
        "  <retailPrice>" +
        "    <float>19.99</float>" +
        "  </retailPrice>" +
        "  <salePrice>" +
        "    <float>1.0</float>" +
        "  </salePrice>" +
        "</org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices>";
        org.broadleafcommerce.core.catalog.service.dynamic.DynamicSkuPrices receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.common.money.Money>" +
        "  <float>1.0</float>" +
        "</org.broadleafcommerce.common.money.Money>";
        org.broadleafcommerce.common.money.Money expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getPrice());
    }
}