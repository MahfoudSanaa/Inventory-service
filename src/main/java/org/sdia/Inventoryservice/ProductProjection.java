package org.sdia.Inventoryservice;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullProduct",types =
        Product.class)
interface ProductProjection extends Projection{

    public Long getId();
    public String getName();
    public String getEmail();

}

