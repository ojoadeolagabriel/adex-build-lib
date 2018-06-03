package com.transferwise.utilmon.api;

import io.vertx.core.json.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PingController {
    @RequestMapping(method = RequestMethod.GET, path = "ping")
    public String ping(){
        return new JsonObject().put("responseCode", "00")
                .put("responseMessage", "Qui-qui!").toString();
    }
}
