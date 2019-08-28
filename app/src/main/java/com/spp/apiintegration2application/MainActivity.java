package com.spp.apiintegration2application;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickOnjsondata(View view) {

        new YourAsyncTask(MainActivity.this).execute("");
    }

    private class YourAsyncTask extends AsyncTask<String, Void, String> {
        public ProgressDialog dialog;

        public YourAsyncTask(MainActivity activity) {
            dialog = new ProgressDialog(activity);
        }


        @Override
        protected void onPreExecute() {
            dialog.setMessage("Doing something, please wait.");
            dialog.show();
        }


        protected String doInBackground(String... args) {

            String url = "http://api.myjson.com/bins/d5y1e";
            String jsonStr = " ";
            try {
                // Making a request to url and getting response
                HttpClient client = new DefaultHttpClient();
                HttpGet request = new HttpGet();
                request.setURI(new URI(url));
                HttpResponse response = client.execute(request);
                jsonStr = EntityUtils.toString(response.getEntity());

            } catch (Exception e) {
                Log.e("Main Activity","Exception: " + e.getMessage());
            }


            return jsonStr;

        }

            protected void onPostExecute(String result) {

//                try {


                Gson gson= new Gson();

                Type listType = new TypeToken<List<Products>>() {}.getType();

                List<Products> pList = gson.fromJson(result,listType);





//
//                JSONArray ProductsArr = new JSONArray(result);
//
//
//
//                List<Products> ProductsList = new ArrayList<>();
//
//
//                for (int i = 0; i < ProductsArr.length(); i++) {
//
//
//                    JSONObject obj = ProductsArr.getJSONObject(i);
//
//                    Products Product = new Products();
//
//
//                    Product.set_productname(obj.getString("productname"));
//
//                    Product.set_imageUrl(obj.getString("imageUrl"));
//
//                    Product.set_price(obj.getString("price"));
//
//                    Product.set_quantity(obj.getString("quantity"));
//
//                    Product.set_unit(obj.getString("unit"));
//
//
//                    ProductsList.add(Product);
//
//
//                }
//
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }

            Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();

            // do UI work here
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
    }
}


