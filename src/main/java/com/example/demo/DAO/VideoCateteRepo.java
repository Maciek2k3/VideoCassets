package com.example.demo.DAO;

import com.example.demo.DAO.Entity.VideoCasete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCateteRepo extends CrudRepository<VideoCasete,Long> {
}
