package fun.happyhacker.configrefresh.controller;

import fun.happyhacker.configrefresh.config.HelloProperties;
import fun.happyhacker.configrefresh.config.ValueConfig;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    private ValueConfig valueConfig;
    private HelloProperties properties;

    public ConfigController(ValueConfig valueConfig, HelloProperties properties) {
        this.valueConfig = valueConfig;
        this.properties = properties;
    }

    @GetMapping(path = "/demo")
    public String demo() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("bob", properties.getBob());
        jsonObject.put("star", properties.getStar());
        jsonObject.put("bar", valueConfig.getBar());

        return jsonObject.toString();
    }
}
