package com.govt.liv2train.Controller;

import com.govt.liv2train.Model.TrainingCenter;
import com.govt.liv2train.Service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
@Validated
public class TrainingCenterController {


    @Autowired
    private TrainingCenterService trainingCenterService;

    @PostMapping("/addCenter")
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedCenter = trainingCenterService.createTrainingCenter(trainingCenter);
        return ResponseEntity.ok(savedCenter);
    }

    @GetMapping("/search")
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(
            @RequestParam(required = false) String centerName,
            @RequestParam(required = false) String centerCode,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state) {
        List<TrainingCenter> centers = trainingCenterService.getTrainingCentersByFilters(centerName, centerCode, city, state);
        return ResponseEntity.ok(centers);
    }
}
