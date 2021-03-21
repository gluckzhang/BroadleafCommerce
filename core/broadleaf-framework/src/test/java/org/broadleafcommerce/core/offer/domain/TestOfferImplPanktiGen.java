package org.broadleafcommerce.core.offer.domain;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestOfferImplPanktiGen {
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
    public void testGetOrderMinSubTotal1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>4</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>0.01</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:53.688 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:53.688 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal6() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>4</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>AMOUNT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:53.688 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:53.688 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal7() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>-1</priority>" +
        "  <startDate>2021-03-20 17:13:03.119 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.119 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal8() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:07.708 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:07.708 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test5\"), MVEL.eval(\"toUpperCase()\",\"test6\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal9() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal10() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal11() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>0.05</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>true</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal12() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>1</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal13() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal14() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal15() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>true</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal16() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal17() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;126</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal18() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.430 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.430 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;126</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal19() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:13:03.108 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.108 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal20() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal21() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:33.362 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:33.362 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal22() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal23() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal24() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal25() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:07.60 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:07.60 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testGetOrderMinSubTotal26() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:13:03.115 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.115 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria/>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>4</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getOrderMinSubTotal());
    }

    @Test
    public void testIsFutureCredit1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.430 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.430 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;126</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testIsFutureCredit2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testIsFutureCredit3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>4</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>AMOUNT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:53.688 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:53.688 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testIsFutureCredit4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>true</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testIsFutureCredit5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>4</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>0.01</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:53.688 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:53.688 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testIsFutureCredit6() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testIsFutureCredit7() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>0.05</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>true</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testIsFutureCredit8() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;126</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(false, receivingObject.isFutureCredit());
    }

    @Test
    public void testGetAdjustmentType1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>4</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>0.01</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:53.688 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:53.688 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType6() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:07.60 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:07.60 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType7() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:13:03.115 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.115 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria/>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>4</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType8() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType9() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:33.362 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:33.362 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType10() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.430 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.430 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;126</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType11() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>-1</priority>" +
        "  <startDate>2021-03-20 17:13:03.119 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.119 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType12() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType13() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>true</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;100</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType14() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <name>secondOffer</name>" +
        "  <type>FULFILLMENT_GROUP</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.163 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.163 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>fulfillmentGroup.address.postalCode==75244</matchRule>" +
        "        </offerRule>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType15() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType16() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>1</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType17() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>4</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER</type>" +
        "  <discountType>AMOUNT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:53.688 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:53.688 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType18() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType19() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType20() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>FULFILLMENT_GROUP</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.161 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.161 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>true</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>fulfillmentGroup.address.postalCode==75244</matchRule>" +
        "        </offerRule>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType21() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetAdjustmentType22() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        String returnedObjectStr = 
        "<org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>" +
        "  <type>ORDER_DISCOUNT</type>" +
        "  <friendlyType>Order Discount</friendlyType>" +
        "</org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType>";
        org.broadleafcommerce.core.offer.service.type.OfferAdjustmentType expectedObject = deserializeObject(returnedObjectStr);
        Assert.assertEquals(expectedObject, receivingObject.getAdjustmentType());
    }

    @Test
    public void testGetTargetMinSubTotal1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>-1</priority>" +
        "  <startDate>2021-03-20 17:13:03.119 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.119 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>1</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal6() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal7() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal8() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal9() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:07.708 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:07.708 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test5\"), MVEL.eval(\"toUpperCase()\",\"test6\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal10() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:13:03.108 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.108 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal11() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal12() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:33.362 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:33.362 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal13() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal14() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal15() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal16() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:07.60 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:07.60 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal17() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetTargetMinSubTotal18() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:13:03.115 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.115 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria/>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>4</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getTargetMinSubTotal());
    }

    @Test
    public void testGetMarketingMessage1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage3() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>-1</priority>" +
        "  <startDate>2021-03-20 17:13:03.119 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.119 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage4() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>1</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage5() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage6() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:11:52.790 UTC</startDate>" +
        "  <endDate>2021-03-22 17:11:52.790 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage7() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>3</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:20.165 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:20.165 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage8() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage9() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:33.362 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:33.362 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage10() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage11() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.848 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.848 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>false</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage12() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:45.843 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:45.843 UTC</endDate>" +
        "  <applyToSalePrice>false</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>QUALIFIER_TARGET</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>QUALIFIER_TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>2</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage13() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>1</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:12:07.60 UTC</startDate>" +
        "  <endDate>2021-03-22 17:12:07.60 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>NONE</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria>" +
        "    <org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferQualifyingCriteriaXrefImpl>" +
        "  </qualifyingItemCriteria>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>1</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }

    @Test
    public void testGetMarketingMessage14() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.domain.OfferImpl>" +
        "  <id>2</id>" +
        "  <offerCodes/>" +
        "  <type>ORDER_ITEM</type>" +
        "  <discountType>PERCENT_OFF</discountType>" +
        "  <value>10</value>" +
        "  <priority>1</priority>" +
        "  <startDate>2021-03-20 17:13:03.115 UTC</startDate>" +
        "  <endDate>2021-03-22 17:13:03.115 UTC</endDate>" +
        "  <applyToSalePrice>true</applyToSalePrice>" +
        "  <applyToChildItems>false</applyToChildItems>" +
        "  <combinableWithOtherOffers>true</combinableWithOtherOffers>" +
        "  <automaticallyAdded>true</automaticallyAdded>" +
        "  <maxUsesPerOrder>0</maxUsesPerOrder>" +
        "  <offerItemQualifierRuleType>NONE</offerItemQualifierRuleType>" +
        "  <offerItemTargetRuleType>TARGET</offerItemTargetRuleType>" +
        "  <qualifyingItemCriteria/>" +
        "  <legacyQualifyingItemCriteria/>" +
        "  <targetItemCriteria class=\"singleton-set\">" +
        "    <org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "      <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../..\"/>" +
        "      <offerItemCriteria class=\"org.broadleafcommerce.core.offer.domain.OfferItemCriteriaImpl\">" +
        "        <quantity>4</quantity>" +
        "        <orderItemMatchRule>([MVEL.eval(\"toUpperCase()\",\"test1\"), MVEL.eval(\"toUpperCase()\",\"test2\")] contains MVEL.eval(\"toUpperCase()\", discreteOrderItem.category.name))</orderItemMatchRule>" +
        "      </offerItemCriteria>" +
        "    </org.broadleafcommerce.core.offer.domain.OfferTargetCriteriaXrefImpl>" +
        "  </targetItemCriteria>" +
        "  <legacyTargetItemCriteria/>" +
        "  <totalitarianOffer>false</totalitarianOffer>" +
        "  <requiresRelatedTargetAndQualifiers>false</requiresRelatedTargetAndQualifiers>" +
        "  <offerMatchRules>" +
        "    <entry>" +
        "      <string>ORDER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\">" +
        "          <matchRule>order.subTotal.getAmount()&gt;20</matchRule>" +
        "        </offerRule>" +
        "        <key>ORDER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>CUSTOMER</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>CUSTOMER</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "    <entry>" +
        "      <string>FULFILLMENT_GROUP</string>" +
        "      <org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "        <offer class=\"org.broadleafcommerce.core.offer.domain.OfferImpl\" reference=\"../../../..\"/>" +
        "        <offerRule class=\"org.broadleafcommerce.core.offer.domain.OfferRuleImpl\"/>" +
        "        <key>FULFILLMENT_GROUP</key>" +
        "      </org.broadleafcommerce.core.offer.domain.OfferOfferRuleXrefImpl>" +
        "    </entry>" +
        "  </offerMatchRules>" +
        "  <useListForDiscounts>false</useListForDiscounts>" +
        "  <offerPriceData/>" +
        "  <archiveStatus>" +
        "    <archived>N</archived>" +
        "  </archiveStatus>" +
        "</org.broadleafcommerce.core.offer.domain.OfferImpl>";
        org.broadleafcommerce.core.offer.domain.OfferImpl receivingObject = deserializeObject(receivingObjectStr);
        Assert.assertEquals(null, receivingObject.getMarketingMessage());
    }
}