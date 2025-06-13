package tech.song.SpotifyAPI.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AlbumResponse {
    @JsonProperty("albums")
    private AlbumWrapper albums;

    public AlbumResponse(AlbumWrapper albums) {
        this.albums = albums;
    }

    public AlbumResponse() {
    }

    public AlbumWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumWrapper albums) {
        this.albums = albums;
    }
}
