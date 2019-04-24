public class ryey.easer.plugins.event.j.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.j.a> CREATOR;

  ryey.easer.plugins.event.j.a$a a;

  ryey.easer.plugins.event.j.a$b b;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/j/a$1
       3: dup
       4: invokespecial #24                 // Method ryey/easer/plugins/event/j/a$1."<init>":()V
       7: putstatic     #26                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.j.a(android.os.Parcel, ryey.easer.plugins.event.j.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #47                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.j.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: getstatic     #32                 // Field ryey/easer/plugins/event/j/a$a.c:Lryey/easer/plugins/event/j/a$a;
       8: putfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
      11: aload_0
      12: getstatic     #36                 // Field ryey/easer/plugins/event/j/a$b.c:Lryey/easer/plugins/event/j/a$b;
      15: putfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      18: aload_0
      19: aload_1
      20: aload_2
      21: iload_3
      22: invokevirtual #50                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      25: return

  ryey.easer.plugins.event.j.a(ryey.easer.plugins.event.j.a$a, ryey.easer.plugins.event.j.a$b);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: getstatic     #32                 // Field ryey/easer/plugins/event/j/a$a.c:Lryey/easer/plugins/event/j/a$a;
       8: putfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
      11: aload_0
      12: getstatic     #36                 // Field ryey/easer/plugins/event/j/a$b.c:Lryey/easer/plugins/event/j/a$b;
      15: putfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      18: aload_0
      19: aload_1
      20: putfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
      23: aload_0
      24: aload_2
      25: putfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      28: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #57                 // Field ryey/easer/plugins/event/j/a$2.a:[I
       3: aload_1
       4: invokevirtual #63                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #65                 // class org/json/JSONObject
      12: dup
      13: invokespecial #66                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #68                 // String headset_action
      20: aload_0
      21: getfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
      24: invokevirtual #72                 // Method ryey/easer/plugins/event/j/a$a.name:()Ljava/lang/String;
      27: invokevirtual #76                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_1
      32: ldc           #78                 // String headset_type
      34: aload_0
      35: getfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      38: invokevirtual #79                 // Method ryey/easer/plugins/event/j/a$b.name:()Ljava/lang/String;
      41: invokevirtual #76                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      44: pop
      45: aload_1
      46: invokevirtual #82                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      49: areturn
      50: astore_1
      51: new           #84                 // class java/lang/IllegalStateException
      54: dup
      55: aload_1
      56: invokespecial #87                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      59: athrow
    Exception table:
       from    to  target type
          17    45    50   Class org/json/JSONException

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #57                 // Field ryey/easer/plugins/event/j/a$2.a:[I
       3: aload_2
       4: invokevirtual #63                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #65                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #90                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_1
      19: ldc           #68                 // String headset_action
      21: invokevirtual #94                 // Method org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
      24: astore_2
      25: aload_2
      26: ifnull        37
      29: aload_0
      30: aload_2
      31: invokestatic  #98                 // Method ryey/easer/plugins/event/j/a$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/event/j/a$a;
      34: putfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
      37: aload_1
      38: ldc           #78                 // String headset_type
      40: invokevirtual #94                 // Method org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
      43: astore_1
      44: aload_1
      45: ifnull        56
      48: aload_0
      49: aload_1
      50: invokestatic  #101                // Method ryey/easer/plugins/event/j/a$b.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/event/j/a$b;
      53: putfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      56: return
      57: astore_1
      58: new           #103                // class ryey/easer/commons/local_plugin/b
      61: dup
      62: aload_1
      63: invokespecial #106                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      66: athrow
    Exception table:
       from    to  target type
           9    25    57   Class org/json/JSONException
          29    37    57   Class org/json/JSONException
          37    44    57   Class org/json/JSONException
          48    56    57   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: aload_0
      10: getfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      13: ifnull        18
      16: iconst_1
      17: ireturn
      18: iconst_0
      19: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: aconst_null
       1: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        54
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/j/a
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
      17: astore_2
      18: aload_1
      19: checkcast     #2                  // class ryey/easer/plugins/event/j/a
      22: astore_1
      23: aload_2
      24: aload_1
      25: getfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
      28: invokestatic  #117                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      31: ifne          36
      34: iconst_0
      35: ireturn
      36: aload_0
      37: getfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      40: aload_1
      41: getfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      44: invokestatic  #117                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      47: ifne          52
      50: iconst_0
      51: ireturn
      52: iconst_1
      53: ireturn
      54: iconst_0
      55: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #34                 // Field a:Lryey/easer/plugins/event/j/a$a;
       5: invokevirtual #123                // Method android/os/Parcel.writeSerializable:(Ljava/io/Serializable;)V
       8: aload_1
       9: aload_0
      10: getfield      #38                 // Field b:Lryey/easer/plugins/event/j/a$b;
      13: invokevirtual #123                // Method android/os/Parcel.writeSerializable:(Ljava/io/Serializable;)V
      16: return
}
