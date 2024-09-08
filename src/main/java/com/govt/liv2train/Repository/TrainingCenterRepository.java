package com.govt.liv2train.Repository;

import com.govt.liv2train.Model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {

    List<TrainingCenter> findByCenterNameContainingIgnoreCase(String centerName);
    List<TrainingCenter> findByCenterCode(String centerCode);
    List<TrainingCenter> findByAddressCity(String city);
    List<TrainingCenter> findByAddressState(String state);
}
