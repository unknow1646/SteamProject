package com.example.steamproject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "gameFeign",
        url = "http://api.steampowered.com/" +
                "IPlayerService/GetOwnedGames/v0001/?appid=440&key=B6E7FBBB65477B6EDAB56DC000F16099&steamid=76561198049552485")
public interface GamesSteamClient extends BaseMethodClass {
    @Override
    @RequestMapping(method = RequestMethod.GET)
    Object getObject();
}
