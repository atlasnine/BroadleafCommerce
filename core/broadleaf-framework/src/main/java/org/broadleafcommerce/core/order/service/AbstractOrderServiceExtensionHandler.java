/*
 * #%L
 * BroadleafCommerce Framework
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.core.order.service;

import org.broadleafcommerce.common.extension.AbstractExtensionHandler;
import org.broadleafcommerce.common.extension.ExtensionResultHolder;
import org.broadleafcommerce.common.extension.ExtensionResultStatusType;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.call.OrderItemRequestDTO;
import org.broadleafcommerce.profile.core.domain.Customer;


/**
 * @author bpolster
 */
public abstract class AbstractOrderServiceExtensionHandler extends AbstractExtensionHandler implements
        OrderServiceExtensionHandler {
    
    public ExtensionResultStatusType attachAdditionalDataToNewNamedCart(Customer customer, Order cart) {
        return ExtensionResultStatusType.NOT_HANDLED;
    }

    public ExtensionResultStatusType preValidateCartOperation(Order cart, ExtensionResultHolder erh) {
        return ExtensionResultStatusType.NOT_HANDLED;
    }

    public ExtensionResultStatusType preValidateUpdateQuantityOperation(Order cart, OrderItemRequestDTO dto, 
            ExtensionResultHolder erh) {
        return ExtensionResultStatusType.NOT_HANDLED;
    }
    
    public ExtensionResultStatusType attachAdditionalDataToOrder(Order order, boolean priceOrder) {
        return ExtensionResultStatusType.NOT_HANDLED;
    }

}
