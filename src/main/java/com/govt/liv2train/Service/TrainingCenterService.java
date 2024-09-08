package com.govt.liv2train.Service;

import com.govt.liv2train.Model.TrainingCenter;

import java.util.List;

public interface TrainingCenterService {

    TrainingCenter createTrainingCenter(TrainingCenter trainingCenter);
    List<TrainingCenter> getAllTrainingCenters();

    List<TrainingCenter> getTrainingCentersByFilters(String centerName, String centerCode, String city, String state);

}
