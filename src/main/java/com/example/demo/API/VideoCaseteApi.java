package com.example.demo.API;

import com.example.demo.DAO.Entity.VideoCasete;
import com.example.demo.Manager.VideoCaseteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/casete")
public class VideoCaseteApi {

    private VideoCaseteManager videoCasetes;

    @Autowired
    public VideoCaseteApi(VideoCaseteManager videoCasetes) {
        this.videoCasetes = videoCasetes;
    }

    @GetMapping("/all")
    public Iterable<VideoCasete> getAll() {
        return videoCasetes.findAll();
    }

    @GetMapping
    public Optional<VideoCasete> getById(@RequestParam Long index) {
        return videoCasetes.findById(index);
    }

    @PostMapping
    public VideoCasete addVideo(@RequestBody VideoCasete videoCasete) {
        return videoCasetes.save(videoCasete);
    }

    @PutMapping
    public VideoCasete updateVideo(@RequestBody VideoCasete videoCasete) {
        return videoCasetes.save(videoCasete);
    }

    @DeleteMapping
    public void deleteVideo(Long index) {
        videoCasetes.deleteById(index);
    }

}
