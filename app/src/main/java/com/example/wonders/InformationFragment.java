package com.example.wonders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class InformationFragment extends Fragment {

    private ImageView imageView;
    private TextView title;
    private TextView description;
    private Wonder wonder;

    public InformationFragment() {
        // Required empty public constructor
    }


    public static InformationFragment newInstance(String param1, String param2) {
        InformationFragment fragment = new InformationFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_information, container, false);

        imageView = view.findViewById(R.id.wonder_cardimage);
        title = view.findViewById(R.id.wonder_name);
        description = view.findViewById(R.id.wonder_description);

        Intent intent = getActivity().getIntent();
        int position = intent.getIntExtra(ListOfWonders.EXTRA_MESSAGE, 0);

        wonder = Wonder.getWonders().get(position);

        title.setText(wonder.getName());
        imageView.setImageResource(wonder.getImage());
        String url = "text";
        //using wiki this time but may want to use worldatlas.com
        if (wonder.getName().equals("Christ the Redeemer")){
            url = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro&explaintext&redirects=1&titles=" + wonder.getName() + "%20(statue)";
        } else {
              url = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro&explaintext&redirects=1&titles=" + wonder.getName();
        }
        Context context = getContext();
        final RequestQueue requestQueue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        String string = (response.substring(response.lastIndexOf("extract")+10,response.length()-5));

                        // Display
                        description.setText(string);
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                description.setText("That didn't work!");
            }
        });

// Add the request to the RequestQueue.
        requestQueue.add(stringRequest);

        return view;
    }
}
