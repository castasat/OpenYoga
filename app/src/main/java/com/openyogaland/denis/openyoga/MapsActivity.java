package com.openyogaland.denis.openyoga;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback
{
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    
    // Obtain the SupportMapFragment and get notified when the map is ready to be used.
    FragmentManager supportFragmentManager = this.getSupportFragmentManager();
    SupportMapFragment mapFragment = (SupportMapFragment) supportFragmentManager.findFragmentById(R.id.map);
    mapFragment.getMapAsync(this);
  }
  
  /**
   * Manipulates the map once available.
   * This callback is triggered when the map is ready to be used.
   * This is where we can add markers or lines, add listeners or move the camera. In this case,
   * we just add a marker near Sydney, Australia.
   * If Google Play services is not installed on the device, the user will be prompted to install
   * it inside the SupportMapFragment. This method will only be triggered once the user has
   * installed Google Play services and returned to the app.
   */
  @Override
  public void onMapReady(GoogleMap googleMap)
  {
    LatLng myLocation = new LatLng(55.77165, 37.58665);
    MarkerOptions markerOptions = new MarkerOptions();
    
    googleMap.addMarker(markerOptions.position(myLocation).title(getString(R.string.clubAvatar)));
    googleMap.moveCamera(CameraUpdateFactory.newLatLng(myLocation));
  
    googleMap.setMinZoomPreference(12.0f);
    googleMap.setMaxZoomPreference(19.0f);
  }
}
