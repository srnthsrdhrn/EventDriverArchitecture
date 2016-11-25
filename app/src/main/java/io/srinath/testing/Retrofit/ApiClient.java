package io.srinath.testing.Retrofit;

import java.util.List;

import io.srinath.testing.Models.Events;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Navin on 25-11-2016.
 */

public interface ApiClient {
    @GET("/events")
    Call<List<Events>> getEvents();
}
