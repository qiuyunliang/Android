/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.example.swig.jni;

public class RecordStream {
  public static void setStopFlag(int value) {
    RecordStreamJNI.stopFlag_set(value);
  }

  public static int getStopFlag() {
    return RecordStreamJNI.stopFlag_get();
  }

  public static int start(String input, String output) {
    return RecordStreamJNI.start(input, output);
  }

  public static int stop() {
    return RecordStreamJNI.stop();
  }

}
