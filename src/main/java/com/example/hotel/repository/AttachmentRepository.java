package com.example.hotel.repository;


import com.example.hotel.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
