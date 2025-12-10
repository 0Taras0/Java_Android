package com.example.taskmanager.network;

import com.example.taskmanager.dto.zadachi.ZadachaItemDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ZadachiApi {
    @GET("api/zadachi")
    public Call<List<ZadachaItemDTO>> list();
}
