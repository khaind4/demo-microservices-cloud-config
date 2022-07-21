package com.khaind.microservices.cloudconfig.controller;

import com.khaind.microservices.cloudconfig.dto.CloudConfigDTO;
import com.khaind.microservices.cloudconfig.entity.CloudConfigEntity;
import com.khaind.microservices.cloudconfig.mapper.CloudConfigMapper;
import com.khaind.microservices.cloudconfig.repository.CloudConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/config")
public class CloudConfigController {
    @Autowired
    private CloudConfigRepository cloudConfigRepository;

    @Autowired
    private CloudConfigMapper cloudConfigMapper;

    @PostMapping
    public CloudConfigDTO upsert(@RequestBody CloudConfigDTO dto) {
        CloudConfigEntity entity = cloudConfigRepository.save(cloudConfigMapper.toEntity(dto));
        return cloudConfigMapper.toDTO(entity);
    }

    @GetMapping("/{id}")
    public CloudConfigDTO getCloudConfig(@PathVariable Long id) {
        Optional<CloudConfigEntity> entity = cloudConfigRepository.findById(id);
        if (entity.isPresent()) {
            return cloudConfigMapper.toDTO(entity.get());
        }
        return null;
    }

    @GetMapping
    public List<CloudConfigDTO> getCloudConfigs() {
        return cloudConfigMapper.toDTOs(cloudConfigRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public String deleteCloudConfig(@PathVariable Long id) {
        try {
            cloudConfigRepository.deleteById(id);
            return "success";
        } catch (Exception e) {
            System.out.printf("Delete cloudConfig error: " + e);
        }
        return "fail";
    }
}
