package com.tadi.dto.user;

import com.tadi.dto.BaseRequestModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateUserRequest extends BaseRequestModel {

    private String email;
    private String password;
}
