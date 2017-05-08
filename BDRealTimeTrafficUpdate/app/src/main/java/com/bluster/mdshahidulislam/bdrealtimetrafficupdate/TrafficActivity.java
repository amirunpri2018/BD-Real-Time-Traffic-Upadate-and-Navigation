package com.bluster.mdshahidulislam.bdrealtimetrafficupdate;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TrafficActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mGoogleMap;
    MapView mMapView;
    View mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }





    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7579575, 90.3846949)).title("Panthapath Tejgaon link Rd").snippet("Heigh Traffic-3km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.761571,90.3891152)).title("Bir Uttom Major General Azizur Rahm").snippet("Medium Traffic-9km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7585467,90.3913897)).title("Mirpur Rd").snippet("Heigh Traffic-2km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7479603,90.3944296)).title("14 Mirpur Rd").snippet("Low Traffic-30km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7512302,90.3866723)).title("Ibn Sina Diagonestic Lab Rd").snippet("Low Traffic-40km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7623006,90.3888158)).title("Mirpur Rd").snippet("Heigh Traffic-0km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7666445,90.3994821)).title("Mohakhali Fly over").snippet("Low Traffic-30km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(223.7405043,90.3861562)).title("Panthapath Tejgaon link Rd").snippet("Heigh Traffic-3km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7617828,90.3777006)).title("6 সদরঘাট - গাবতলি সড়ক").snippet("Medium Traffic-9km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7906084,90.3713883)).title("5 Mirpur Rd").snippet("Heigh Traffic-4km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7929645,90.3931893)).title("Kemal Ataturk Ave").snippet("Low Traffic-6km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7929645,90.3931893)).title("7 Dhaka - Mymensingh Hwy").snippet("Heigh Traffic-3km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7878596,90.381688)).title("Green University of Bangladesh").snippet("Heigh Traffic-6km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.8056082,90.4023732)).title("Presidential Jinnah Care").snippet("Road Closed-NO CAR ALLOWED ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.8062752,90.4070993)).title("প্রগতি সরণী").snippet("Medium Traffic-6km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.7976681,90.4089201)).title("109 Gulshan Ave").snippet("Heigh Traffic-6km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.8007223,90.3980563)).title("Kafrul 33/11 kV Sub-Station").snippet("Low Traffic-5km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.8317468,90.4023604)).title("Tongi Diversion Rd").snippet("Low Traffic-42km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(23.8162676,90.3889573)).title("5 Mirpur Rd").snippet("Low Traffic-52km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(3.778814,90.4207555)).title("Bir Uttam AK Khandakar Rd").snippet("Low Traffic-56km/h ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        CameraPosition Libery = CameraPosition.builder().target(new LatLng(23.7855428,90.3867756)).zoom(8).bearing(0).tilt(45).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(Libery));

    }
}
