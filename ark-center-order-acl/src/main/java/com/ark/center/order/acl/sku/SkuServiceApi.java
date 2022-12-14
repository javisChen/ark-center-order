package com.ark.center.order.acl.sku;

import com.ark.center.commodity.api.sku.SkuApi;
import com.ark.component.microservice.rpc.exception.FeignCommonErrorDecoder;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "${ark.center.commodity.service.name:commodity}",
        path = "/v1/sku",
        url = "${ark.center.commodity.service.uri:}",
        decode404 = true,
        configuration = {FeignCommonErrorDecoder.class}
)
public interface SkuServiceApi extends SkuApi {
}
