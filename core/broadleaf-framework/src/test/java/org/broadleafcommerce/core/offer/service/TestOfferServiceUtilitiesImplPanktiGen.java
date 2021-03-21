package org.broadleafcommerce.core.offer.service;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestOfferServiceUtilitiesImplPanktiGen {
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
    public void testFindRelatedQualifierRoot1() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>0</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createFulfillmentGroupAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>0</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range reference=\"../../../../org.easymock.internal.ExpectedInvocationAndResults/results/ranges/org.easymock.internal.Range\"/>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$6\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot2() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>3</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot3() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot3-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot4() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot4-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot5() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot5-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot6() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>5</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot7() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>0</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot8() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot8-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot9() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot9-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot10() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot10-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot11() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot11-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot12() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot12-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot13() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>2</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createFulfillmentGroupAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>1</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range reference=\"../../../../org.easymock.internal.ExpectedInvocationAndResults/results/ranges/org.easymock.internal.Range\"/>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$6\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot14() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>0</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot15() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl.findRelatedQualifierRoot15-receiving.xml").getFile());
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot16() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>1</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot17() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>7</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot18() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>2</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }

    @Test
    public void testFindRelatedQualifierRoot19() throws Exception {
        String receivingObjectStr = 
        "<org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>" +
        "  <promotableItemFactory class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableItemFactoryImpl\">" +
        "    <useQtyOnlyTierCalculation>false</useQtyOnlyTierCalculation>" +
        "    <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\"/>" +
        "  </promotableItemFactory>" +
        "  <offerDao class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.core.offer.dao.OfferDao</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.ReplayState\">" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists>" +
        "                    <org.easymock.internal.UnorderedBehavior>" +
        "                      <results>" +
        "                        <org.easymock.internal.ExpectedInvocationAndResults>" +
        "                          <expectedInvocation>" +
        "                            <invocation serialization=\"custom\">" +
        "                              <org.easymock.internal.Invocation>" +
        "                                <default>" +
        "                                  <arguments/>" +
        "                                  <currentCaptures class=\"list\"/>" +
        "                                  <mock class=\"dynamic-proxy\" reference=\"../../../../../../../../../../../../../../../..\"/>" +
        "                                </default>" +
        "                                <org.easymock.internal.MethodSerializationWrapper>" +
        "                                  <className>org.broadleafcommerce.core.offer.dao.OfferDao</className>" +
        "                                  <methodName>createOrderItemPriceDetailAdjustment</methodName>" +
        "                                  <parameterTypeNames/>" +
        "                                </org.easymock.internal.MethodSerializationWrapper>" +
        "                              </org.easymock.internal.Invocation>" +
        "                            </invocation>" +
        "                            <matchers/>" +
        "                          </expectedInvocation>" +
        "                          <results>" +
        "                            <callCount>4</callCount>" +
        "                            <ranges>" +
        "                              <org.easymock.internal.Range>" +
        "                                <minimum>0</minimum>" +
        "                                <maximum>2147483647</maximum>" +
        "                              </org.easymock.internal.Range>" +
        "                            </ranges>" +
        "                            <results>" +
        "                              <org.easymock.internal.Result>" +
        "                                <value class=\"org.broadleafcommerce.core.offer.service.OfferDataItemProvider$3\"/>" +
        "                                <shouldFillInStackTrace>false</shouldFillInStackTrace>" +
        "                              </org.easymock.internal.Result>" +
        "                            </results>" +
        "                          </results>" +
        "                        </org.easymock.internal.ExpectedInvocationAndResults>" +
        "                      </results>" +
        "                      <checkOrder>false</checkOrder>" +
        "                    </org.easymock.internal.UnorderedBehavior>" +
        "                  </behaviorLists>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "                <lock>" +
        "                  <sync class=\"java.util.concurrent.locks.ReentrantLock$NonfairSync\" serialization=\"custom\">" +
        "                    <java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                      <default>" +
        "                        <state>0</state>" +
        "                      </default>" +
        "                    </java.util.concurrent.locks.AbstractQueuedSynchronizer>" +
        "                    <java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                      <default/>" +
        "                    </java.util.concurrent.locks.ReentrantLock_-Sync>" +
        "                  </sync>" +
        "                </lock>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </offerDao>" +
        "  <entityService class=\"dynamic-proxy\">" +
        "    <interface>org.broadleafcommerce.common.service.GenericEntityService</interface>" +
        "    <handler class=\"org.easymock.internal.ObjectMethodsFilter\" serialization=\"custom\">" +
        "      <org.easymock.internal.ObjectMethodsFilter>" +
        "        <default>" +
        "          <delegate>" +
        "            <control>" +
        "              <state class=\"org.easymock.internal.RecordState\">" +
        "                <lastInvocationUsed>true</lastInvocationUsed>" +
        "                <behavior class=\"org.easymock.internal.MocksBehavior\">" +
        "                  <behaviorLists/>" +
        "                  <stubResults/>" +
        "                  <nice>false</nice>" +
        "                  <checkOrder>false</checkOrder>" +
        "                  <isThreadSafe>true</isThreadSafe>" +
        "                  <shouldBeUsedInOneThread>false</shouldBeUsedInOneThread>" +
        "                  <position>0</position>" +
        "                </behavior>" +
        "              </state>" +
        "              <behavior class=\"org.easymock.internal.MocksBehavior\" reference=\"../state/behavior\"/>" +
        "              <type>DEFAULT</type>" +
        "            </control>" +
        "          </delegate>" +
        "        </default>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>toString</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>equals</methodName>" +
        "          <parameterTypeNames>" +
        "            <string>java.lang.Object</string>" +
        "          </parameterTypeNames>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "        <org.easymock.internal.MethodSerializationWrapper>" +
        "          <className>java.lang.Object</className>" +
        "          <methodName>hashCode</methodName>" +
        "          <parameterTypeNames/>" +
        "        </org.easymock.internal.MethodSerializationWrapper>" +
        "      </org.easymock.internal.ObjectMethodsFilter>" +
        "    </handler>" +
        "  </entityService>" +
        "  <promotableOfferUtility class=\"org.broadleafcommerce.core.offer.service.discount.domain.PromotableOfferUtilityImpl\" reference=\"../promotableItemFactory/promotableOfferUtility\"/>" +
        "</org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl>";
        org.broadleafcommerce.core.offer.service.OfferServiceUtilitiesImpl receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.broadleafcommerce.core.order.domain.OrderItem paramObject1 = (org.broadleafcommerce.core.order.domain.OrderItem) paramObjects[0];
        Assert.assertEquals(null, receivingObject.findRelatedQualifierRoot(paramObject1));
    }
}