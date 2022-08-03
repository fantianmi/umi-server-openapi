package io.umiverse.gateway.openapi.api;

import io.umiverse.gateway.openapi.model.AskAcceptRequest;
import io.umiverse.gateway.openapi.model.AskSaveRequest;
import io.umiverse.gateway.openapi.model.Bid;
import io.umiverse.gateway.openapi.model.BidAcceptRequest;
import io.umiverse.gateway.openapi.model.BidSaveRequest;
import io.umiverse.gateway.openapi.model.Deal;
import io.umiverse.gateway.openapi.model.NftItem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
@Controller
@RequestMapping("${openapi.umiverseServerAPISpec.base-path:}")
public class MarketplaceApiController implements MarketplaceApi {

    private final NativeWebRequest request;

    @Autowired
    public MarketplaceApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
