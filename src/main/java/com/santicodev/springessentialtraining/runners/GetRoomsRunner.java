package com.santicodev.springessentialtraining.runners;

import com.santicodev.springessentialtraining.data.entity.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class GetRoomsRunner {
    private static final Logger LOG = LoggerFactory.getLogger(GetRoomsRunner.class);

    public void run(RestTemplate restTemplate) throws Exception {
        LOG.info("GetRoomsRunner Process: Start");
        LOG.info("GetRoomsRunner Process: Obteniendo rooms desde http://localhost:7000/api/rooms");
        ResponseEntity<List<Room>> rooms = restTemplate.exchange(
                "http://localhost:7000/api/rooms", HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Room>>() {
                }
        );
        rooms.getBody().forEach(room -> {
            LOG.info(room.toString());
        });
        LOG.info("GetRoomsRunner Process: Finish");
    }
}
