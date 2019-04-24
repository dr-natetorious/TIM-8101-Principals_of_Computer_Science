public class ryey.easer.plugins.operation.j.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.j.b> CREATOR;

  final java.lang.String a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/j/b$1
       3: dup
       4: invokespecial #20                 // Method ryey/easer/plugins/operation/j/b$1."<init>":()V
       7: putstatic     #22                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.j.b(android.os.Parcel, ryey.easer.plugins.operation.j.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #36                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.j.b(java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #33                 // Field a:Ljava/lang/String;
       9: return

  ryey.easer.plugins.operation.j.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: getstatic     #43                 // Field ryey/easer/plugins/operation/j/b$2.a:[I
       7: aload_2
       8: invokevirtual #49                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore_3
      13: aload_0
      14: new           #51                 // class org/json/JSONObject
      17: dup
      18: aload_1
      19: invokespecial #53                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      22: ldc           #55                 // String target
      24: invokevirtual #59                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      27: putfield      #33                 // Field a:Ljava/lang/String;
      30: return
      31: astore_1
      32: new           #61                 // class ryey/easer/commons/local_plugin/b
      35: dup
      36: aload_1
      37: invokespecial #64                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      40: athrow
    Exception table:
       from    to  target type
          13    30    31   Class org/json/JSONException

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #43                 // Field ryey/easer/plugins/operation/j/b$2.a:[I
       3: aload_1
       4: invokevirtual #49                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #51                 // class org/json/JSONObject
      12: dup
      13: invokespecial #66                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #55                 // String target
      20: aload_0
      21: getfield      #33                 // Field a:Ljava/lang/String;
      24: invokevirtual #70                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      27: pop
      28: aload_1
      29: invokevirtual #73                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      32: astore_1
      33: aload_1
      34: areturn
      35: astore_1
      36: aload_1
      37: invokestatic  #78                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      40: ldc           #80                 // String
      42: areturn
    Exception table:
       from    to  target type
           9    33    35   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Ljava/lang/String;
       4: invokevirtual #87                 // Method java/lang/String.isEmpty:()Z
       7: iconst_1
       8: ixor
       9: ireturn

  public java.util.Set<java.lang.String> b();
    Code:
       0: aconst_null
       1: areturn

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
      12: instanceof    #2                  // class ryey/easer/plugins/operation/j/b
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #33                 // Field a:Ljava/lang/String;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/operation/j/b
      28: getfield      #33                 // Field a:Ljava/lang/String;
      31: invokevirtual #96                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
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
       2: getfield      #33                 // Field a:Ljava/lang/String;
       5: invokevirtual #101                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: return
}
