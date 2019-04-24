public class ryey.easer.plugins.a.h.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.h.a> CREATOR;

  ryey.easer.plugins.a.h.a$a a;

  ryey.easer.plugins.a.h.a$b b;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/h/a$1
       3: dup
       4: invokespecial #26                 // Method ryey/easer/plugins/a/h/a$1."<init>":()V
       7: putstatic     #28                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.h.a(android.os.Parcel, ryey.easer.plugins.a.h.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #48                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.h.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #31                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: getstatic     #33                 // Field ryey/easer/plugins/a/h/a$a.a:Lryey/easer/plugins/a/h/a$a;
       8: putfield      #34                 // Field a:Lryey/easer/plugins/a/h/a$a;
      11: aload_0
      12: getstatic     #37                 // Field ryey/easer/plugins/a/h/a$b.c:Lryey/easer/plugins/a/h/a$b;
      15: putfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      18: getstatic     #54                 // Field ryey/easer/plugins/a/h/a$2.a:[I
      21: aload_2
      22: invokevirtual #60                 // Method ryey/easer/b/a.ordinal:()I
      25: iaload
      26: istore_3
      27: new           #62                 // class org/json/JSONObject
      30: dup
      31: aload_1
      32: invokespecial #65                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      35: astore_1
      36: aload_1
      37: ldc           #67                 // String headset_state
      39: invokevirtual #71                 // Method org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
      42: astore_2
      43: aload_2
      44: ifnull        55
      47: aload_0
      48: aload_2
      49: invokestatic  #75                 // Method ryey/easer/plugins/a/h/a$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/a/h/a$a;
      52: putfield      #34                 // Field a:Lryey/easer/plugins/a/h/a$a;
      55: aload_1
      56: ldc           #77                 // String headset_type
      58: invokevirtual #71                 // Method org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
      61: astore_1
      62: aload_1
      63: ifnull        74
      66: aload_0
      67: aload_1
      68: invokestatic  #80                 // Method ryey/easer/plugins/a/h/a$b.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/a/h/a$b;
      71: putfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      74: return
      75: astore_1
      76: new           #82                 // class ryey/easer/commons/local_plugin/b
      79: dup
      80: aload_1
      81: invokespecial #85                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      84: athrow
    Exception table:
       from    to  target type
          27    43    75   Class org/json/JSONException
          47    55    75   Class org/json/JSONException
          55    62    75   Class org/json/JSONException
          66    74    75   Class org/json/JSONException

  ryey.easer.plugins.a.h.a(ryey.easer.plugins.a.h.a$a, ryey.easer.plugins.a.h.a$b);
    Code:
       0: aload_0
       1: invokespecial #31                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: getstatic     #33                 // Field ryey/easer/plugins/a/h/a$a.a:Lryey/easer/plugins/a/h/a$a;
       8: putfield      #34                 // Field a:Lryey/easer/plugins/a/h/a$a;
      11: aload_0
      12: getstatic     #37                 // Field ryey/easer/plugins/a/h/a$b.c:Lryey/easer/plugins/a/h/a$b;
      15: putfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      18: aload_0
      19: aload_1
      20: putfield      #34                 // Field a:Lryey/easer/plugins/a/h/a$a;
      23: aload_0
      24: aload_2
      25: putfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      28: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #54                 // Field ryey/easer/plugins/a/h/a$2.a:[I
       3: aload_1
       4: invokevirtual #60                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #62                 // class org/json/JSONObject
      12: dup
      13: invokespecial #88                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #67                 // String headset_state
      20: aload_0
      21: getfield      #34                 // Field a:Lryey/easer/plugins/a/h/a$a;
      24: invokevirtual #92                 // Method ryey/easer/plugins/a/h/a$a.name:()Ljava/lang/String;
      27: invokevirtual #96                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_1
      32: ldc           #77                 // String headset_type
      34: aload_0
      35: getfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      38: invokevirtual #97                 // Method ryey/easer/plugins/a/h/a$b.name:()Ljava/lang/String;
      41: invokevirtual #96                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      44: pop
      45: aload_1
      46: invokevirtual #100                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      49: areturn
      50: astore_1
      51: new           #102                // class java/lang/IllegalStateException
      54: dup
      55: aload_1
      56: invokespecial #105                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      59: athrow
    Exception table:
       from    to  target type
          17    45    50   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Lryey/easer/plugins/a/h/a$a;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: getfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      13: ifnull        18
      16: iconst_1
      17: ireturn
      18: iconst_0
      19: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        41
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/a/h/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/h/a
      28: getfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      31: invokestatic  #114                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      34: ifne          39
      37: iconst_0
      38: ireturn
      39: iconst_1
      40: ireturn
      41: iconst_0
      42: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #34                 // Field a:Lryey/easer/plugins/a/h/a$a;
       5: invokevirtual #120                // Method android/os/Parcel.writeSerializable:(Ljava/io/Serializable;)V
       8: aload_1
       9: aload_0
      10: getfield      #39                 // Field b:Lryey/easer/plugins/a/h/a$b;
      13: invokevirtual #120                // Method android/os/Parcel.writeSerializable:(Ljava/io/Serializable;)V
      16: return
}
