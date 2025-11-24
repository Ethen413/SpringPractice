package com.timeTable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    Long id;
    Long userId;
    Date taskDate;
    String title;
    String description;
    Date startTime;
    Date endTime;
    Boolean isRecurring;
    String resultDescription;
    Double resultValue;
    String resultUnit;
    LocalDateTime createAt;
    LocalDateTime updateAt;

}
