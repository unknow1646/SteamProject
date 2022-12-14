package com.example.steamproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/steam")
public class SteamController {

    @Autowired
    SteamClient steamClient;

    @Autowired
    GamesSteamClient gamesSteamClient;

    @Autowired
    GameNameClient gameNameClient;

    @GetMapping("/user")
    public Object getUser() throws JsonProcessingException {
        //url = "?t=Batman&apiKey=5ce0471d";
        String apiKey = "B6E7FBBB65477B6EDAB56DC000F16099";
        Object object = steamClient.getObject();

        return object;
    }

    @GetMapping(value = "/games", produces= MediaType.APPLICATION_JSON_VALUE)
    public Object getGames() throws JsonProcessingException {
        //url = "?t=Batman&apiKey=5ce0471d";
        String apiKey = "B6E7FBBB65477B6EDAB56DC000F16099";
        Object object = gamesSteamClient.getObject();

        return object;
    }

    @GetMapping("/userId")
    public String getUserById() throws JsonProcessingException {

        Object object = steamClient.getObject();
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(object);
        Example player = objectMapper.readValue(s, Example.class);
        Object object1 = gameNameClient.getObject();
        ObjectMapper objectMapper1 = new ObjectMapper();
        String s2 = objectMapper.writeValueAsString(object);
        Example2 example2 = objectMapper.readValue(s, Example2.class);


        return player.getResponse().getPlayers().get(0).getPersonaname();
    }

    @GetMapping("/gameName")
    public Object getGameName() throws JsonProcessingException {

        Object object = gameNameClient.getObject();
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(object);
        Example2 example2 = objectMapper.readValue(s, Example2.class);
        List<Root> collect = example2.getApplist().getApps().stream().filter(root -> root.getAppid().equals(228280)).collect(Collectors.toList());
        return collect;
    }
}
