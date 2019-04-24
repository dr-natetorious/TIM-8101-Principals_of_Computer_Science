public class ryey.easer.plugins.event.l.b extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.l.b> CREATOR;

  ryey.easer.plugins.event.l.e a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/l/b$1
       3: dup
       4: invokespecial #23                 // Method ryey/easer/plugins/event/l/b$1."<init>":()V
       7: putstatic     #25                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.l.b(android.os.Parcel, ryey.easer.plugins.event.l.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #47                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.l.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #50                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public ryey.easer.plugins.event.l.b(ryey.easer.plugins.event.l.e);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
       9: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #57                 // Field ryey/easer/plugins/event/l/b$2.a:[I
       3: aload_1
       4: invokevirtual #63                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #65                 // class org/json/JSONObject
      12: dup
      13: invokespecial #66                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_0
      18: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      21: getfield      #69                 // Field ryey/easer/plugins/event/l/e.a:Ljava/lang/String;
      24: invokestatic  #74                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      27: ifne          44
      30: aload_1
      31: ldc           #76                 // String sender
      33: aload_0
      34: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      37: getfield      #69                 // Field ryey/easer/plugins/event/l/e.a:Ljava/lang/String;
      40: invokevirtual #80                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      43: pop
      44: aload_0
      45: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      48: getfield      #82                 // Field ryey/easer/plugins/event/l/e.b:Ljava/lang/String;
      51: invokestatic  #74                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      54: ifne          71
      57: aload_1
      58: ldc           #84                 // String content
      60: aload_0
      61: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      64: getfield      #82                 // Field ryey/easer/plugins/event/l/e.b:Ljava/lang/String;
      67: invokevirtual #80                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      70: pop
      71: aload_1
      72: invokevirtual #88                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      75: astore_1
      76: aload_1
      77: areturn
      78: astore_1
      79: aload_1
      80: ldc           #90                 // String Error serializing %s
      82: iconst_1
      83: anewarray     #92                 // class java/lang/Object
      86: dup
      87: iconst_0
      88: aload_0
      89: invokevirtual #96                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      92: invokevirtual #99                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      95: aastore
      96: invokestatic  #104                // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      99: new           #106                // class java/lang/IllegalStateException
     102: dup
     103: aload_1
     104: invokevirtual #109                // Method org/json/JSONException.getMessage:()Ljava/lang/String;
     107: invokespecial #112                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
     110: athrow
    Exception table:
       from    to  target type
           9    44    78   Class org/json/JSONException
          44    71    78   Class org/json/JSONException
          71    76    78   Class org/json/JSONException

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: new           #30                 // class ryey/easer/plugins/event/l/e
       4: dup
       5: invokespecial #113                // Method ryey/easer/plugins/event/l/e."<init>":()V
       8: putfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      11: getstatic     #57                 // Field ryey/easer/plugins/event/l/b$2.a:[I
      14: aload_2
      15: invokevirtual #63                 // Method ryey/easer/b/a.ordinal:()I
      18: iaload
      19: istore_3
      20: new           #65                 // class org/json/JSONObject
      23: dup
      24: aload_1
      25: invokespecial #114                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      28: astore_1
      29: aload_0
      30: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      33: aload_1
      34: ldc           #76                 // String sender
      36: aconst_null
      37: invokevirtual #118                // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      40: putfield      #69                 // Field ryey/easer/plugins/event/l/e.a:Ljava/lang/String;
      43: aload_0
      44: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      47: aload_1
      48: ldc           #84                 // String content
      50: aconst_null
      51: invokevirtual #118                // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      54: putfield      #82                 // Field ryey/easer/plugins/event/l/e.b:Ljava/lang/String;
      57: return
      58: astore_1
      59: aload_1
      60: invokestatic  #123                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      63: new           #125                // class ryey/easer/commons/local_plugin/b
      66: dup
      67: aload_1
      68: invokespecial #128                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      71: athrow
    Exception table:
       from    to  target type
          20    57    58   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
      10: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: iconst_2
       1: anewarray     #134                // class ryey/easer/commons/local_plugin/b/a
       4: dup
       5: iconst_0
       6: new           #13                 // class ryey/easer/plugins/event/l/b$b
       9: dup
      10: invokespecial #135                // Method ryey/easer/plugins/event/l/b$b."<init>":()V
      13: aastore
      14: dup
      15: iconst_1
      16: new           #10                 // class ryey/easer/plugins/event/l/b$a
      19: dup
      20: invokespecial #136                // Method ryey/easer/plugins/event/l/b$a."<init>":()V
      23: aastore
      24: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #2                  // class ryey/easer/plugins/event/l/b
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      20: aload_1
      21: checkcast     #2                  // class ryey/easer/plugins/event/l/b
      24: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
      27: invokevirtual #140                // Method ryey/easer/plugins/event/l/e.equals:(Ljava/lang/Object;)Z
      30: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #44                 // Field a:Lryey/easer/plugins/event/l/e;
       5: iload_2
       6: invokevirtual #146                // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
       9: return
}
