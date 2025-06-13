package tech.song.SpotifyAPI.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(
        name = "AuthSpotifyClient",
        url = "https://accounts.spotify.com"
)

public interface AuthSpotifyClient {

    @PostMapping(value = "/api/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    LoginResponse login (@org.springframework.web.bind.annotation.RequestHeader("Authorization") String authorization,
                         @org.springframework.web.bind.annotation.RequestBody org.springframework.util.MultiValueMap<String,
                                 String> body);

}
