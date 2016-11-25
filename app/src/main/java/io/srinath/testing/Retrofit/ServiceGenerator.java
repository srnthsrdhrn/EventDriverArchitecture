package io.srinath.testing.Retrofit;

import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Navin on 25-11-2016.
 */

public class ServiceGenerator {
    public static String BASE_URL = "http:yugam.rajasudhan.in";
    public static String API_BASE_URL = BASE_URL +"api/v1/";
    private static Retrofit retrofit = null;
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request original = chain.request();
            Request request = original.newBuilder()
                    .header("Authorization","123")
                    .method(original.method(),original.body())
                    .build();
            return chain.proceed(request);
        }
    }) ;
    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(API_BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}

