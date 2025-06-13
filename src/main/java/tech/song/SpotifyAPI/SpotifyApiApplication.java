package tech.song.SpotifyAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpotifyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyApiApplication.class, args);
	}

}
