package tech.song.SpotifyAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.song.SpotifyAPI.client.Album;
import tech.song.SpotifyAPI.client.AlbumSpotifyClient;
import tech.song.SpotifyAPI.client.AuthSpotifyClient;


import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
    private final AuthSpotifyClient authSpotifyClient;

    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }


    @GetMapping("/albums")
    public ResponseEntity<List<Album>> HiWorld(){
        String clientId = "e9ad05e8a61d4f1bae722faa43dac594";
        String clientSecret = "26ba4c7a515a453ab3412c3d8160ed23";

        String credentials = clientId + ":" + clientSecret;
        String base64Credentials = Base64.getEncoder().encodeToString(credentials.getBytes());

        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "client_credentials");

        String token = authSpotifyClient.login("Basic " + base64Credentials, body)
                .getAccessToken();


        var response = albumSpotifyClient.getReleases("Bearer " + token);

        return ResponseEntity.ok(response.getAlbums().getItems());
    }
}
