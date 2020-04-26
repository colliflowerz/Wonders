package com.example.wonders.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wonders.Activities.ListOfWondersActivity;
import com.example.wonders.R;
import com.example.wonders.Wonder;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {
    private Wonder wonder;

    //Used in the Async task below where it loads the map and sets the markers in the background
    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            //Gets the specific wonder
            Intent intent = getActivity().getIntent();
            int position = intent.getIntExtra(ListOfWondersActivity.EXTRA_MESSAGE, 0);
            wonder = Wonder.getWonders().get(position);

            //Creates longitude and latitude for each of the wonders
            LatLng wonderCood = new LatLng(wonder.getLatitude(), wonder.getLongitude());
            LatLng Taj_Mahal = new LatLng(27.173891, 78.042068);
            LatLng Colosseum = new LatLng(41.890251, 12.492373);
            LatLng Chichen_Itza = new LatLng(20.678392, -88.571568);
            LatLng Machu_Picchu = new LatLng(-13.163068, -72.545128);
            LatLng Christ_the_Redeemer = new LatLng(-22.95158, -43.210482);
            LatLng Petra = new LatLng(30.328960, 35.444832);
            LatLng Great_Wall_of_China = new LatLng(40.431908, 116.570374);

            //Sets the markers for each of the wonders and sets a colour for the marker
            googleMap.addMarker(new MarkerOptions().position(Taj_Mahal).title("Taj Mahal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
            googleMap.addMarker(new MarkerOptions().position(Colosseum).title("Colosseum").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
            googleMap.addMarker(new MarkerOptions().position(Chichen_Itza).title("Chichen Itza").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            googleMap.addMarker(new MarkerOptions().position(Machu_Picchu).title("Machu Picchu").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
            googleMap.addMarker(new MarkerOptions().position(Christ_the_Redeemer).title("Christ the Redeemer").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
            googleMap.addMarker(new MarkerOptions().position(Petra).title("Petra").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
            googleMap.addMarker(new MarkerOptions().position(Great_Wall_of_China).title("Great Wall of China").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(wonderCood, 3.0f));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            //Callback used here
            mapFragment.getMapAsync(callback);
        }
    }
}
