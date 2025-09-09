package com.dimitarrradev.workoutScheduler.exercise.dto;

import com.dimitarrradev.workoutScheduler.exercise.enums.Complexity;
import com.dimitarrradev.workoutScheduler.exercise.enums.MovementType;

public record ExerciseFindViewModel(
        Long id,
        String name,
        Complexity complexity,
        MovementType movementType
) {
}
