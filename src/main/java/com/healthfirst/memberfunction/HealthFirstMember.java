package com.healthfirst.memberfunction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthFirstMember {
    private String memberId;
    private Coverage coverage;

    public enum Coverage {
        MEDICAL, DENTAL, VISION, NONE
    }
}
