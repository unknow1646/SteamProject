package com.example.steamproject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "feignDemo",
        url = "api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key=B6E7FBBB65477B6EDAB56DC000F16099&steamids=76561198049552485&format=json")
public interface SteamClient extends BaseMethodClass {
    @Override
    @RequestMapping(method = RequestMethod.GET)
    Object getObject();
}
