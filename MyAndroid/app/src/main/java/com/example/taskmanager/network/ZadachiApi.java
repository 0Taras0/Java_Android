package com.example.taskmanager.network;

import com.example.taskmanager.dto.zadachi.ZadachaItemDTO;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ZadachiApi {
    @GET("api/zadachi")
    public Call<List<ZadachaItemDTO>> list();
    @Multipart
    @POST("api/zadachi")
    Call<ZadachaItemDTO> create(
            @Part("Name") RequestBody name,
            @Part MultipartBody.Part image
    );
}