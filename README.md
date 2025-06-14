🎵 SpotifyAlbums

Este projeto é uma API Java com Spring Boot que se conecta com a API do Spotify para buscar os álbuns mais recentes lançados pela plataforma. Ele utiliza a autenticação via `client_credentials` para acessar endpoints públicos, como o de **novos lançamentos de álbuns**.

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Cloud OpenFeign
- Jackson (para desserialização JSON)
- Spotify Web API
- Maven

## 🎯 Funcionalidades

- Autenticação com a API do Spotify via `client_credentials`
- Consumo da rota `GET /v1/browse/new-releases` do Spotify
- Exposição de uma rota interna `/spotify/api/albuns` para listar os álbuns recém-lançados
- Deve fazer LOGIN no site https://developer.spotify.com/ para conseguir obter o TOKEN 

## 📦 Como rodar o projeto localmente

1. **Clone o repositório:**

```bash
git clone https://github.com/mariadeb28/SpotifyAlbums.git
cd SpotifyAlbums

Acesse o endpoint:
GET http://localhost:8080/spotify/api/albuns

🧪 Exemplo de resposta
[
  {
    "name": "Novo Álbum 1"
  },
  {
    "name": "Novo Álbum 2"
  },
  ...
]


