public class ryey.easer.plugins.operation.l.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.l.b> CREATOR;

  java.lang.String a;

  java.lang.String b;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/l/b$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/operation/l/b$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.l.b(android.os.Parcel, ryey.easer.plugins.operation.l.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #39                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.l.b(java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #34                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_2
      11: putfield      #36                 // Field b:Ljava/lang/String;
      14: return

  ryey.easer.plugins.operation.l.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #43                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #49                 // Field ryey/easer/plugins/operation/l/b$2.a:[I
       3: aload_1
       4: invokevirtual #55                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #57                 // class org/json/JSONObject
      12: dup
      13: invokespecial #58                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #60                 // String title
      20: aload_0
      21: getfield      #34                 // Field a:Ljava/lang/String;
      24: invokevirtual #64                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      27: pop
      28: aload_1
      29: ldc           #66                 // String content
      31: aload_0
      32: getfield      #36                 // Field b:Ljava/lang/String;
      35: invokevirtual #64                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      38: pop
      39: aload_1
      40: invokevirtual #69                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      43: areturn
      44: astore_1
      45: new           #71                 // class java/lang/IllegalStateException
      48: dup
      49: aload_1
      50: invokespecial #74                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      53: athrow
    Exception table:
       from    to  target type
          17    39    44   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: new           #2                  // class ryey/easer/plugins/operation/l/b
       3: dup
       4: aload_0
       5: getfield      #34                 // Field a:Ljava/lang/String;
       8: aload_1
       9: invokestatic  #80                 // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
      12: aload_0
      13: getfield      #36                 // Field b:Ljava/lang/String;
      16: aload_1
      17: invokestatic  #80                 // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
      20: invokespecial #82                 // Method "<init>":(Ljava/lang/String;Ljava/lang/String;)V
      23: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #49                 // Field ryey/easer/plugins/operation/l/b$2.a:[I
       3: aload_2
       4: invokevirtual #55                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #57                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #85                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_0
      19: aload_1
      20: ldc           #60                 // String title
      22: invokevirtual #89                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      25: putfield      #34                 // Field a:Ljava/lang/String;
      28: aload_0
      29: aload_1
      30: ldc           #66                 // String content
      32: invokevirtual #89                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      35: putfield      #36                 // Field b:Ljava/lang/String;
      38: return
      39: astore_1
      40: new           #91                 // class ryey/easer/commons/local_plugin/b
      43: dup
      44: aload_1
      45: invokespecial #94                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      48: athrow
    Exception table:
       from    to  target type
           9    38    39   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Ljava/lang/String;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #36                 // Field b:Ljava/lang/String;
      13: ifnonnull     18
      16: iconst_0
      17: ireturn
      18: iconst_1
      19: ireturn

  public java.util.Set<java.lang.String> b();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Ljava/lang/String;
       4: invokestatic  #100                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #36                 // Field b:Ljava/lang/String;
      13: invokestatic  #100                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
      16: invokeinterface #106,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
      21: pop
      22: aload_1
      23: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_1
       7: instanceof    #2                  // class ryey/easer/plugins/operation/l/b
      10: ifne          15
      13: iconst_0
      14: ireturn
      15: aload_1
      16: checkcast     #2                  // class ryey/easer/plugins/operation/l/b
      19: astore_1
      20: aload_1
      21: invokevirtual #113                // Method a:()Z
      24: ifne          29
      27: iconst_0
      28: ireturn
      29: aload_0
      30: getfield      #34                 // Field a:Ljava/lang/String;
      33: aload_1
      34: getfield      #34                 // Field a:Ljava/lang/String;
      37: invokestatic  #116                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      40: ifne          45
      43: iconst_0
      44: ireturn
      45: aload_0
      46: getfield      #36                 // Field b:Ljava/lang/String;
      49: aload_1
      50: getfield      #36                 // Field b:Ljava/lang/String;
      53: invokestatic  #116                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      56: ifne          61
      59: iconst_0
      60: ireturn
      61: iconst_1
      62: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #34                 // Field a:Ljava/lang/String;
       5: invokevirtual #121                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #36                 // Field b:Ljava/lang/String;
      13: invokevirtual #121                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: return
}
