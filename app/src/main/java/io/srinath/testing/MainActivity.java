package io.srinath.testing;

import android.app.usage.UsageEvents;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.List;

import io.srinath.testing.Models.Events;
import io.srinath.testing.Retrofit.ApiClient;
import io.srinath.testing.Retrofit.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

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

                }
            });
            return null;
        }
    }
    @Subscribe(threadMode =  ThreadMode.ASYNC)
    public void onEventRecieve(Events events){
        Toast.makeText(this,events.toString(),Toast.LENGTH_LONG).show();
    }
    @Subscribe(threadMode = ThreadMode.ASYNC)
    public void onStringRecieve(String string ){
        Toast.makeText(this,string,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
