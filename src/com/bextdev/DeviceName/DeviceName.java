package com.bextdev.DeviceName;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class DeviceName extends AndroidNonvisibleComponent {

  public DeviceName(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public String GetDeviceName(){
    //Taken from here: https://stackoverflow.com/questions/7071281/get-android-device-name
    //I originally took hbhakhra's Awnser but because of your comment Chuong. I finally got the awnser. Thanks for your help Chuong & hbhakra!
    return android.os.Build.MANUFACTURER + android.os.Build.PRODUCT;
  }
}
