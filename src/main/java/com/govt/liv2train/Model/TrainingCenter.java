package com.govt.liv2train.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Data
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center name is mandatory")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is mandatory")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @Embedded
    private Address address;

    @Min(value = 1, message = "Student capacity must be positive")
    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private LocalDateTime createdOn;

    @Email(message = "Invalid email address")
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String contactPhone;


    @PrePersist
    public void prePersist() {
        // Set the current timestamp in IST when the entity is being persisted
        this.createdOn = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
    }

    // Convert the createdOn LocalDateTime to a string in IST
    public String getCreatedOnInIST() {
        // Convert LocalDateTime to ZonedDateTime in IST
        ZonedDateTime istTime = createdOn.atZone(ZoneId.of("Asia/Kolkata"));
        // Format the ZonedDateTime to a readable string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return istTime.format(formatter);
    }




}
