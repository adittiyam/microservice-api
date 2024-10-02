package com.example.microservice_api.service;

import com.example.microservice_api.model.Channel;
import com.example.microservice_api.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepository;

    public List<Channel> getAllChannels() {
        return channelRepository.findAll();
    }

    public Channel createChannel(Channel channel) {
        return channelRepository.save(channel);
    }

    public Channel updateChannel(Long id, Channel channel) {
        channel.setId(id);
        return channelRepository.save(channel);
    }

    public void deleteChannel(Long id) {
        channelRepository.deleteById(id);
    }
}
