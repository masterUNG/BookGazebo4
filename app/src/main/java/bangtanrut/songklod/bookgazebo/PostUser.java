package bangtanrut.songklod.bookgazebo;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

/**
 * Created by Administrator on 2/4/2560.
 */

public class PostUser extends AsyncTask<String,Void,String>{

    private Context context;

    public PostUser(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {

        try {

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("Name", params[0])
                    .add("Surname", params[1])
                    .add("IdCard", params[2])
                    .add("Address", params[3])
                    .add("Phone", params[4])
                    .add("User", params[5])
                    .add("Password", params[6])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(params[7]).post(requestBody).build();
            Response response = okHttpClient.newCall(request).execute();
            return response.body().string();


        } catch (Exception e) {
            Log.d("2AprilV1", "e doIn ==>" + e.toString());
            return null;
        }


    }
}//Main Class
