package com.example.microservice_api.Controller;

import com.example.microservice_api.model.Channel;
import com.example.microservice_api.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/channels")
public class ChannelController {

    @Autowired
    private ChannelService channelService;

    @GetMapping
    public ResponseEntity<List<Channel>> getAllChannels() {
        return ResponseEntity.ok(channelService.getAllChannels());
    }

    @PostMapping
    public ResponseEntity<Channel> createChannel(@RequestBody Channel channel) {
        return ResponseEntity.ok(channelService.createChannel(channel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Channel> updateChannel(@PathVariable Long id, @RequestBody Channel channel) {
        return ResponseEntity.ok(channelService.updateChannel(id, channel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChannel(@PathVariable Long id) {
        channelService.deleteChannel(id);
        return ResponseEntity.noContent().build();
    }
}
