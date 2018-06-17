package com.openyogaland.denis.openyoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
  /**
   * This method is called then Activity is created
   * @param savedInstanceState - this is a saved activity instance state
   */
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  
    Button mapButton = findViewById(R.id.mapButton);
    mapButton.setOnClickListener(this);
  }
  
  /**
   * Called when a view has been clicked.
   * @param view The view that was clicked.
   */
  @Override
  public void onClick(View view)
  {
    if(view.getId() == R.id.mapButton)
    {
      Toast.makeText(this, "Here we call map activity", Toast.LENGTH_SHORT).show();
      // вызываем новую активность
      Intent intent = new Intent(this, MapsActivity.class);
      // здесь можно в интент передать данные с помощью метода intent.putExtra(String "key", "значение")
      startActivity(intent);
      // если нужно вернуть результат startActivityForResult(intent)
    }
  }
}
