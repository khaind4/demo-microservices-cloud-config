package com.khaind.microservices.cloudconfig.repository;

import com.khaind.microservices.cloudconfig.entity.CloudConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudConfigRepository extends JpaRepository<CloudConfigEntity, Long> {
}
