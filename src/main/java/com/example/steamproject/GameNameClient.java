package com.example.steamproject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "gameName",
        url = "https://api.steampowered.com/ISteamApps/GetAppList/v2/")
public interface GameNameClient extends BaseMethodClass {
    @Override
    @RequestMapping(method = RequestMethod.GET)
    Object getObject();
}
