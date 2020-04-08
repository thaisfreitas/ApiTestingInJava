package payloads;

//    {
//        "token": "5e4e6452ef75cf6"
//    }

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthResponsePayload {

    @JsonProperty
    private String token;

    public String getToken() {
        return token;
    }
}
