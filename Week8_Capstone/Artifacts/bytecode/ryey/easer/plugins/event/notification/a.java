public class ryey.easer.plugins.event.notification.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.notification.a> CREATOR;

  java.lang.String a;

  java.lang.String b;

  java.lang.String c;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/notification/a$1
       3: dup
       4: invokespecial #26                 // Method ryey/easer/plugins/event/notification/a$1."<init>":()V
       7: putstatic     #28                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.notification.a(android.os.Parcel, ryey.easer.plugins.event.notification.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #46                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.notification.a(java.lang.String, java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #31                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #39                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #41                 // Field b:Ljava/lang/String;
      14: aload_0
      15: aload_3
      16: putfield      #43                 // Field c:Ljava/lang/String;
      19: return

  ryey.easer.plugins.event.notification.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #31                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #50                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #56                 // Field ryey/easer/plugins/event/notification/a$2.a:[I
       3: aload_1
       4: invokevirtual #62                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #64                 // class org/json/JSONObject
      12: dup
      13: invokespecial #65                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_0
      18: getfield      #39                 // Field a:Ljava/lang/String;
      21: invokestatic  #70                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      24: ifne          38
      27: aload_1
      28: ldc           #72                 // String app
      30: aload_0
      31: getfield      #39                 // Field a:Ljava/lang/String;
      34: invokevirtual #76                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      37: pop
      38: aload_0
      39: getfield      #41                 // Field b:Ljava/lang/String;
      42: invokestatic  #70                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      45: ifne          59
      48: aload_1
      49: ldc           #78                 // String title
      51: aload_0
      52: getfield      #41                 // Field b:Ljava/lang/String;
      55: invokevirtual #76                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      58: pop
      59: aload_0
      60: getfield      #43                 // Field c:Ljava/lang/String;
      63: invokestatic  #70                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      66: ifne          80
      69: aload_1
      70: ldc           #80                 // String content
      72: aload_0
      73: getfield      #43                 // Field c:Ljava/lang/String;
      76: invokevirtual #76                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      79: pop
      80: aload_1
      81: invokevirtual #83                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      84: areturn
      85: astore_1
      86: new           #85                 // class java/lang/IllegalStateException
      89: dup
      90: aload_1
      91: invokespecial #88                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      94: athrow
    Exception table:
       from    to  target type
          17    38    85   Class org/json/JSONException
          38    59    85   Class org/json/JSONException
          59    80    85   Class org/json/JSONException

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #56                 // Field ryey/easer/plugins/event/notification/a$2.a:[I
       3: aload_2
       4: invokevirtual #62                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #64                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #91                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_0
      19: aload_1
      20: ldc           #72                 // String app
      22: aconst_null
      23: invokevirtual #95                 // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      26: putfield      #39                 // Field a:Ljava/lang/String;
      29: aload_0
      30: aload_1
      31: ldc           #78                 // String title
      33: aconst_null
      34: invokevirtual #95                 // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      37: putfield      #41                 // Field b:Ljava/lang/String;
      40: aload_0
      41: aload_1
      42: ldc           #80                 // String content
      44: aconst_null
      45: invokevirtual #95                 // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      48: putfield      #43                 // Field c:Ljava/lang/String;
      51: return
      52: astore_1
      53: aload_1
      54: invokestatic  #99                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      57: return
    Exception table:
       from    to  target type
           9    51    52   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #39                 // Field a:Ljava/lang/String;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: getfield      #41                 // Field b:Ljava/lang/String;
      13: ifnull        18
      16: iconst_1
      17: ireturn
      18: aload_0
      19: getfield      #43                 // Field c:Ljava/lang/String;
      22: ifnull        27
      25: iconst_1
      26: ireturn
      27: iconst_0
      28: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: iconst_3
       1: anewarray     #105                // class ryey/easer/commons/local_plugin/b/a
       4: dup
       5: iconst_0
       6: new           #10                 // class ryey/easer/plugins/event/notification/a$a
       9: dup
      10: invokespecial #106                // Method ryey/easer/plugins/event/notification/a$a."<init>":()V
      13: aastore
      14: dup
      15: iconst_1
      16: new           #16                 // class ryey/easer/plugins/event/notification/a$c
      19: dup
      20: invokespecial #107                // Method ryey/easer/plugins/event/notification/a$c."<init>":()V
      23: aastore
      24: dup
      25: iconst_2
      26: new           #13                 // class ryey/easer/plugins/event/notification/a$b
      29: dup
      30: invokespecial #108                // Method ryey/easer/plugins/event/notification/a$b."<init>":()V
      33: aastore
      34: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_1
       7: instanceof    #2                  // class ryey/easer/plugins/event/notification/a
      10: ifne          15
      13: iconst_0
      14: ireturn
      15: aload_1
      16: checkcast     #2                  // class ryey/easer/plugins/event/notification/a
      19: astore_1
      20: aload_1
      21: invokevirtual #112                // Method a:()Z
      24: ifne          29
      27: iconst_0
      28: ireturn
      29: aload_0
      30: getfield      #39                 // Field a:Ljava/lang/String;
      33: aload_1
      34: getfield      #39                 // Field a:Ljava/lang/String;
      37: invokestatic  #115                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      40: ifne          45
      43: iconst_0
      44: ireturn
      45: aload_0
      46: getfield      #41                 // Field b:Ljava/lang/String;
      49: aload_1
      50: getfield      #41                 // Field b:Ljava/lang/String;
      53: invokestatic  #115                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      56: ifne          61
      59: iconst_0
      60: ireturn
      61: aload_0
      62: getfield      #43                 // Field c:Ljava/lang/String;
      65: aload_1
      66: getfield      #43                 // Field c:Ljava/lang/String;
      69: invokestatic  #115                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      72: ifne          77
      75: iconst_0
      76: ireturn
      77: iconst_1
      78: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #39                 // Field a:Ljava/lang/String;
       5: invokevirtual #120                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #41                 // Field b:Ljava/lang/String;
      13: invokevirtual #120                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: aload_1
      17: aload_0
      18: getfield      #43                 // Field c:Ljava/lang/String;
      21: invokevirtual #120                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      24: return
}
