package com.example.demo.Manager;

import com.example.demo.DAO.Entity.VideoCasete;
import com.example.demo.DAO.VideoCateteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCaseteManager {

    private VideoCateteRepo videoCateteRepo;

    @Autowired
    public VideoCaseteManager(VideoCateteRepo videoCateteRepo) {
        this.videoCateteRepo = videoCateteRepo;
    }

    public Optional<VideoCasete> findById(Long id) {
        return videoCateteRepo.findById(id);
    }

    public Iterable<VideoCasete> findAll() {
        return videoCateteRepo.findAll();
    }

    public VideoCasete save(VideoCasete videoCasete) {
        return videoCateteRepo.save(videoCasete);
    }

    public void deleteById(Long id) {
        videoCateteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new VideoCasete(1L, "Nona", LocalDate.of(1988, 5, 20)));
        save(new VideoCasete(2L, "Nona", LocalDate.of(1988, 5, 20)));
        save(new VideoCasete(3L, "Nona", LocalDate.of(1988, 5, 20)));
    }
}
