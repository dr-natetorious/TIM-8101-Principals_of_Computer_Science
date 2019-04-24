public class ryey.easer.plugins.operation.h.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.h.b> CREATOR;

  final java.lang.String a;

  final java.lang.String b;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/h/b$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/operation/h/b$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.h.b(android.os.Parcel, ryey.easer.plugins.operation.h.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #39                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.h.b(java.lang.String, java.lang.String);
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

  ryey.easer.plugins.operation.h.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: getstatic     #46                 // Field ryey/easer/plugins/operation/h/b$2.a:[I
       7: aload_2
       8: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore_3
      13: new           #54                 // class org/json/JSONObject
      16: dup
      17: aload_1
      18: invokespecial #57                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      21: astore_1
      22: aload_0
      23: aload_1
      24: ldc           #59                 // String package
      26: invokevirtual #63                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      29: putfield      #34                 // Field a:Ljava/lang/String;
      32: aload_0
      33: aload_1
      34: ldc           #65                 // String class
      36: invokevirtual #68                 // Method org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
      39: putfield      #36                 // Field b:Ljava/lang/String;
      42: return
      43: astore_1
      44: new           #70                 // class ryey/easer/commons/local_plugin/b
      47: dup
      48: aload_1
      49: invokespecial #73                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      52: athrow
    Exception table:
       from    to  target type
          13    42    43   Class org/json/JSONException

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #46                 // Field ryey/easer/plugins/operation/h/b$2.a:[I
       3: aload_1
       4: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #54                 // class org/json/JSONObject
      12: dup
      13: invokespecial #75                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #59                 // String package
      20: aload_0
      21: getfield      #34                 // Field a:Ljava/lang/String;
      24: invokevirtual #79                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      27: pop
      28: aload_1
      29: ldc           #65                 // String class
      31: aload_0
      32: getfield      #36                 // Field b:Ljava/lang/String;
      35: invokevirtual #79                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      38: pop
      39: aload_1
      40: invokevirtual #82                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      43: astore_1
      44: aload_1
      45: areturn
      46: astore_1
      47: new           #84                 // class java/lang/IllegalStateException
      50: dup
      51: aload_1
      52: invokespecial #87                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      55: athrow
    Exception table:
       from    to  target type
           9    44    46   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Ljava/lang/String;
       4: ifnull        19
       7: aload_0
       8: getfield      #34                 // Field a:Ljava/lang/String;
      11: invokestatic  #94                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      14: ifne          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

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
       8: ifnull        61
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/operation/h/b
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #34                 // Field a:Ljava/lang/String;
      24: astore_2
      25: aload_1
      26: checkcast     #2                  // class ryey/easer/plugins/operation/h/b
      29: astore_1
      30: aload_2
      31: aload_1
      32: getfield      #34                 // Field a:Ljava/lang/String;
      35: invokestatic  #103                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      38: ifne          43
      41: iconst_0
      42: ireturn
      43: aload_0
      44: getfield      #36                 // Field b:Ljava/lang/String;
      47: aload_1
      48: getfield      #36                 // Field b:Ljava/lang/String;
      51: invokestatic  #103                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      54: ifne          59
      57: iconst_0
      58: ireturn
      59: iconst_1
      60: ireturn
      61: iconst_0
      62: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #34                 // Field a:Ljava/lang/String;
       5: invokevirtual #108                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #36                 // Field b:Ljava/lang/String;
      13: invokevirtual #108                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      16: return
}
