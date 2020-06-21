package com.example.tetu_mp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIPoke {
    @GET("https://pokeapi.co/api/v2/pokemon/")

    Call<RestPokemonResponse> getPokemonResponse();
}
