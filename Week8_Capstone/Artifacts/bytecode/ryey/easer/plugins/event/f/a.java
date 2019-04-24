public class ryey.easer.plugins.event.f.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.f.a> CREATOR;

  public final java.lang.String a;

  final ryey.easer.plugins.event.f.a$a b;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/f/a$1
       3: dup
       4: invokespecial #24                 // Method ryey/easer/plugins/event/f/a$1."<init>":()V
       7: putstatic     #26                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.f.a(android.os.Parcel, ryey.easer.plugins.event.f.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #50                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.f.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: getstatic     #56                 // Field ryey/easer/plugins/event/f/a$2.a:[I
       7: aload_2
       8: invokevirtual #61                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore_3
      13: new           #63                 // class org/json/JSONObject
      16: dup
      17: aload_1
      18: invokespecial #66                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      21: astore_1
      22: aload_0
      23: aload_1
      24: ldc           #68                 // String condition_name
      26: invokevirtual #72                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      29: putfield      #37                 // Field a:Ljava/lang/String;
      32: aload_0
      33: aload_1
      34: ldc           #74                 // String condition_event
      36: invokevirtual #72                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      39: invokestatic  #78                 // Method ryey/easer/plugins/event/f/a$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/event/f/a$a;
      42: putfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      45: return
      46: astore_1
      47: new           #80                 // class ryey/easer/commons/local_plugin/b
      50: dup
      51: aload_1
      52: invokespecial #83                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      55: athrow
    Exception table:
       from    to  target type
          13    45    46   Class org/json/JSONException

  ryey.easer.plugins.event.f.a(java.lang.String, ryey.easer.plugins.event.f.a$a);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #37                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      14: return

  public ryey.easer.plugins.event.f.a(ryey.easer.plugins.event.f.a, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_2
       6: putfield      #37                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_1
      11: getfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      14: putfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      17: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #56                 // Field ryey/easer/plugins/event/f/a$2.a:[I
       3: aload_1
       4: invokevirtual #61                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #63                 // class org/json/JSONObject
      12: dup
      13: invokespecial #87                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #68                 // String condition_name
      20: aload_0
      21: getfield      #37                 // Field a:Ljava/lang/String;
      24: invokevirtual #91                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      27: pop
      28: aload_1
      29: ldc           #74                 // String condition_event
      31: aload_0
      32: getfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      35: invokevirtual #94                 // Method ryey/easer/plugins/event/f/a$a.name:()Ljava/lang/String;
      38: invokevirtual #91                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      41: pop
      42: aload_1
      43: invokevirtual #97                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      46: astore_1
      47: aload_1
      48: areturn
      49: astore_1
      50: aload_1
      51: invokestatic  #102                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      54: new           #104                // class java/lang/IllegalStateException
      57: dup
      58: aload_1
      59: invokespecial #106                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      62: athrow
    Exception table:
       from    to  target type
           9    47    49   Class org/json/JSONException

  public boolean a();
    Code:
       0: iconst_1
       1: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: iconst_1
       1: anewarray     #112                // class ryey/easer/commons/local_plugin/b/a
       4: dup
       5: iconst_0
       6: new           #13                 // class ryey/easer/plugins/event/f/a$b
       9: dup
      10: invokespecial #113                // Method ryey/easer/plugins/event/f/a$b."<init>":()V
      13: aastore
      14: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        29
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/f/a
       8: ifne          14
      11: goto          29
      14: aload_0
      15: getfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      18: aload_1
      19: checkcast     #2                  // class ryey/easer/plugins/event/f/a
      22: getfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      25: invokevirtual #117                // Method ryey/easer/plugins/event/f/a$a.equals:(Ljava/lang/Object;)Z
      28: ireturn
      29: iconst_0
      30: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #37                 // Field a:Ljava/lang/String;
       5: invokevirtual #122                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #47                 // Field b:Lryey/easer/plugins/event/f/a$a;
      13: invokevirtual #123                // Method ryey/easer/plugins/event/f/a$a.ordinal:()I
      16: invokevirtual #127                // Method android/os/Parcel.writeInt:(I)V
      19: return
}
