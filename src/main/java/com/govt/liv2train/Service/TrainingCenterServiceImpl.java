package com.govt.liv2train.Service;

import com.govt.liv2train.Model.TrainingCenter;
import com.govt.liv2train.Repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService{

    @Autowired
    TrainingCenterRepository trainingCenterRepository;


    @Override
    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        // Persist the TrainingCenter object, with the createdOn field set by the prePersist method
        return trainingCenterRepository.save(trainingCenter);

    }

    @Override
    public List<TrainingCenter> getAllTrainingCenters() {
        // Retrieve all training centers from the repository
        return trainingCenterRepository.findAll();
    }

    @Override
    public List<TrainingCenter> getTrainingCentersByFilters(String centerName, String centerCode, String city, String state) {
        // Apply filters to the query based on provided parameters
        if (centerName != null && !centerName.isEmpty()) {
            return trainingCenterRepository.findByCenterNameContainingIgnoreCase(centerName);
        } else if (centerCode != null && !centerCode.isEmpty()) {
            return trainingCenterRepository.findByCenterCode(centerCode);
        } else if (city != null && !city.isEmpty()) {
            return trainingCenterRepository.findByAddressCity(city);
        } else if (state != null && !state.isEmpty()) {
            return trainingCenterRepository.findByAddressState(state);
        } else {
            // Return all training centers if no filters are applied
            return getAllTrainingCenters();
        }
    }
}
