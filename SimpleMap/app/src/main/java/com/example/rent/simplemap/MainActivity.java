package com.example.rent.simplemap;

import android.graphics.Color;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private List<LatLng> historicalClicks = new ArrayList<>();
    private TextView distanceTextView;
    private float distancesum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distanceTextView = (TextView) findViewById(R.id.distance);

        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.camera(CameraPosition.fromLatLngZoom(new LatLng(52.2297, 21.0122), 10));
        googleMapOptions.zoomControlsEnabled(true);
        SupportMapFragment supportMapFragment = SupportMapFragment.newInstance(googleMapOptions);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.map_fragment_container, supportMapFragment)
                .commit();
        supportMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

        MarkerOptions markerOptions = new MarkerOptions()
                .position(new LatLng(52.2372142, 21.0183743))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.common_full_open_on_phone))
                .title("Software Development Academy")
                .snippet("Snippet");
        googleMap.addMarker(markerOptions);

        googleMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng) {
                MarkerOptions markerOptions = new MarkerOptions()
                        .position(latLng)
                        .title("New point!");
                Marker marker = googleMap.addMarker(markerOptions);
                marker.setDraggable(true);
            }
        });

        CircleOptions circleOptions = new CircleOptions()
                .center(new LatLng(52.2297, 21.0122))
                .strokeColor(Color.BLUE)
                .fillColor(Color.argb(100, 255, 0, 0))
                .strokeWidth(20)
                .radius(1000);

        googleMap.addCircle(circleOptions);

        //rysowanie lini przy kliknieciu
        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                historicalClicks.add(latLng);

                PolylineOptions polylineOptions = new PolylineOptions();

                for (LatLng historicalClick : historicalClicks) {
                    polylineOptions.add(historicalClick);
                }
                googleMap.addPolyline(polylineOptions);
                //sledzenie linii na mapie
                googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));

                if (historicalClicks.size() > 1) {
                    LatLng first = historicalClicks.get(historicalClicks.size() - 1);
                    LatLng second = historicalClicks.get(historicalClicks.size() - 2);
                    float[] result = new float[3];
                    Location.distanceBetween(first.latitude, first.longitude, second.latitude, second.longitude, result);
                    distancesum = distancesum + result[0];
                    distanceTextView.setText("Distance " + Math.round(distancesum/1000) + "km");
                }
            }
        });
    }
}
