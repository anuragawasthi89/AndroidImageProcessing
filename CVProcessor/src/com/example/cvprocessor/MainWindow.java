package com.example.cvprocessor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class MainWindow extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main_window);

		findViewById(R.id.view_camera_calibration_button).setOnTouchListener(
				mViewCam);
		findViewById(R.id.face_tracking_button).setOnTouchListener(
				mTrackFace);
		findViewById(R.id.exit_button).setOnTouchListener(
				mExitApp);
	}

	/**
	 * Launches activity to show the camera parameters for the users to assess
	 * the device camera and compare them.
	 */
	View.OnTouchListener mViewCam = new View.OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			Intent intent = new Intent(getBaseContext(), ViewCamCalibrations.class);
			startActivity(intent);
			return false;
		}
	};
	
	/**
	 * Launches activity to track faces in the video stream.
	 */
	View.OnTouchListener mTrackFace = new View.OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			return false;
		}
	};
	
	/**
	 * Launches the home screen activity to exit the app.
	 */
	View.OnTouchListener mExitApp = new View.OnTouchListener() {
		@Override
		public boolean onTouch(View view, MotionEvent motionEvent) {
			// TODO Do the needed cleanup if any for freeing and releasing resources.
			
			// launch the home screen intent to exit app.
			Intent intent = new Intent(Intent.ACTION_MAIN);
			intent.addCategory(Intent.CATEGORY_HOME);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(intent);
			return false;
		}
	};
}
