package com.pfa.elearning.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthentificationResponse {

    private String accesToken;
}
