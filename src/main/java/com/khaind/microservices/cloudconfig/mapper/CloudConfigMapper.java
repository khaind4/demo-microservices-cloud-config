package com.khaind.microservices.cloudconfig.mapper;

import com.khaind.microservices.cloudconfig.dto.CloudConfigDTO;
import com.khaind.microservices.cloudconfig.entity.CloudConfigEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CloudConfigMapper {
    CloudConfigEntity toEntity(CloudConfigDTO dto);

    CloudConfigDTO toDTO(CloudConfigEntity entity);

    List<CloudConfigEntity> toEntities(List<CloudConfigDTO> dtos);

    List<CloudConfigDTO> toDTOs(List<CloudConfigEntity> entities);
}
