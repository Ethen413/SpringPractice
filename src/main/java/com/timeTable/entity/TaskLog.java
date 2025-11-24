package com.timeTable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskLog {
    Long id;
    Long taskId;
    LocalTime startAt;
    LocalTime endAt;
    Long durationSeconds;
}
