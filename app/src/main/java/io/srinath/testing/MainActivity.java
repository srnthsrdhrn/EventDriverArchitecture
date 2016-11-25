package io.srinath.testing;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import io.srinath.testing.Models.Events;
import io.srinath.testing.Retrofit.ApiClient;
import io.srinath.testing.Retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View v){
            new Async().execute();
    }

    private class Async extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {
            ApiClient apiClient = ServiceGenerator.getClient().create(ApiClient.class);
            Call<List<Events>> events = apiClient.getEvents();
            events.enqueue(new Callback<List<Events>>() {
                @Override
                public void onResponse(Call<List<Events>> call, Response<List<Events>> response) {
                    EventBus.getDefault().post(response.body().get(0));
                }

                @Override
                public void onFailure(Call<List<Events>> call, Throwable t) {
                    EventBus.getDefault().post("Failure");
                }
            });
            return null;
        }
    }

}
