public class ryey.easer.plugins.event.m.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.m.a> CREATOR;

  java.lang.String a;

  int b;

  java.lang.String c;

  boolean d;

  java.lang.String e;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/m/a$1
       3: dup
       4: invokespecial #24                 // Method ryey/easer/plugins/event/m/a$1."<init>":()V
       7: putstatic     #26                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.m.a(android.os.Parcel, ryey.easer.plugins.event.m.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #56                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.m.a(java.lang.String, int, java.lang.String, boolean, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #37                 // Field a:Ljava/lang/String;
       9: aload_0
      10: iload_2
      11: putfield      #43                 // Field b:I
      14: aload_0
      15: aload_3
      16: putfield      #45                 // Field c:Ljava/lang/String;
      19: aload_0
      20: iload         4
      22: putfield      #51                 // Field d:Z
      25: aload_0
      26: aload         5
      28: putfield      #53                 // Field e:Ljava/lang/String;
      31: return

  ryey.easer.plugins.event.m.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #60                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #66                 // Field ryey/easer/plugins/event/m/a$2.a:[I
       3: aload_1
       4: invokevirtual #71                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #73                 // class org/json/JSONObject
      12: dup
      13: invokespecial #74                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #76                 // String remote address
      20: aload_0
      21: getfield      #37                 // Field a:Ljava/lang/String;
      24: invokevirtual #80                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      27: pop
      28: aload_1
      29: ldc           #82                 // String remote port
      31: aload_0
      32: getfield      #43                 // Field b:I
      35: invokevirtual #85                 // Method org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
      38: pop
      39: aload_0
      40: getfield      #45                 // Field c:Ljava/lang/String;
      43: invokestatic  #90                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      46: ifne          60
      49: aload_1
      50: ldc           #92                 // String send data
      52: aload_0
      53: getfield      #45                 // Field c:Ljava/lang/String;
      56: invokevirtual #80                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      59: pop
      60: aload_1
      61: ldc           #94                 // String check reply?
      63: aload_0
      64: getfield      #51                 // Field d:Z
      67: invokevirtual #97                 // Method org/json/JSONObject.put:(Ljava/lang/String;Z)Lorg/json/JSONObject;
      70: pop
      71: aload_0
      72: getfield      #51                 // Field d:Z
      75: ifeq          89
      78: aload_1
      79: ldc           #99                 // String reply data
      81: aload_0
      82: getfield      #53                 // Field e:Ljava/lang/String;
      85: invokevirtual #80                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      88: pop
      89: aload_1
      90: invokevirtual #102                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      93: areturn
      94: astore_1
      95: aload_1
      96: invokestatic  #107                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      99: new           #109                // class java/lang/IllegalStateException
     102: dup
     103: aload_1
     104: invokespecial #111                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
     107: athrow
    Exception table:
       from    to  target type
          17    60    94   Class org/json/JSONException
          60    89    94   Class org/json/JSONException

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #66                 // Field ryey/easer/plugins/event/m/a$2.a:[I
       3: aload_2
       4: invokevirtual #71                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #73                 // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #114                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_0
      19: aload_1
      20: ldc           #76                 // String remote address
      22: invokevirtual #118                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      25: putfield      #37                 // Field a:Ljava/lang/String;
      28: aload_0
      29: aload_1
      30: ldc           #82                 // String remote port
      32: invokevirtual #122                // Method org/json/JSONObject.getInt:(Ljava/lang/String;)I
      35: putfield      #43                 // Field b:I
      38: aload_0
      39: aload_1
      40: ldc           #92                 // String send data
      42: aconst_null
      43: invokevirtual #126                // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      46: putfield      #45                 // Field c:Ljava/lang/String;
      49: aload_0
      50: aload_1
      51: ldc           #94                 // String check reply?
      53: invokevirtual #129                // Method org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
      56: putfield      #51                 // Field d:Z
      59: aload_0
      60: getfield      #51                 // Field d:Z
      63: ifeq          76
      66: aload_0
      67: aload_1
      68: ldc           #99                 // String reply data
      70: invokevirtual #118                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      73: putfield      #53                 // Field e:Ljava/lang/String;
      76: return
      77: astore_1
      78: aload_1
      79: invokestatic  #107                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      82: new           #131                // class ryey/easer/commons/local_plugin/b
      85: dup
      86: aload_1
      87: invokespecial #134                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      90: athrow
    Exception table:
       from    to  target type
           9    76    77   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Ljava/lang/String;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #43                 // Field b:I
      13: ifgt          18
      16: iconst_0
      17: ireturn
      18: aload_0
      19: getfield      #51                 // Field d:Z
      22: ifeq          37
      25: aload_0
      26: getfield      #53                 // Field e:Ljava/lang/String;
      29: invokestatic  #90                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      32: ifne          37
      35: iconst_0
      36: ireturn
      37: iconst_1
      38: ireturn

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
       1: ifnull        96
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/m/a
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #37                 // Field a:Ljava/lang/String;
      17: astore_2
      18: aload_1
      19: checkcast     #2                  // class ryey/easer/plugins/event/m/a
      22: astore_1
      23: aload_2
      24: aload_1
      25: getfield      #37                 // Field a:Ljava/lang/String;
      28: invokestatic  #143                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      31: ifne          36
      34: iconst_0
      35: ireturn
      36: aload_0
      37: getfield      #43                 // Field b:I
      40: aload_1
      41: getfield      #43                 // Field b:I
      44: if_icmpeq     49
      47: iconst_0
      48: ireturn
      49: aload_0
      50: getfield      #45                 // Field c:Ljava/lang/String;
      53: aload_1
      54: getfield      #45                 // Field c:Ljava/lang/String;
      57: invokestatic  #143                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      60: ifne          65
      63: iconst_0
      64: ireturn
      65: aload_0
      66: getfield      #51                 // Field d:Z
      69: aload_1
      70: getfield      #51                 // Field d:Z
      73: if_icmpeq     78
      76: iconst_0
      77: ireturn
      78: aload_0
      79: getfield      #53                 // Field e:Ljava/lang/String;
      82: aload_1
      83: getfield      #53                 // Field e:Ljava/lang/String;
      86: invokestatic  #143                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      89: ifne          94
      92: iconst_0
      93: ireturn
      94: iconst_1
      95: ireturn
      96: iconst_0
      97: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #37                 // Field a:Ljava/lang/String;
       5: invokevirtual #148                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #43                 // Field b:I
      13: invokevirtual #152                // Method android/os/Parcel.writeInt:(I)V
      16: aload_1
      17: aload_0
      18: getfield      #45                 // Field c:Ljava/lang/String;
      21: invokevirtual #148                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      24: aload_1
      25: aload_0
      26: getfield      #51                 // Field d:Z
      29: i2b
      30: invokevirtual #156                // Method android/os/Parcel.writeByte:(B)V
      33: aload_0
      34: getfield      #51                 // Field d:Z
      37: ifeq          48
      40: aload_1
      41: aload_0
      42: getfield      #53                 // Field e:Ljava/lang/String;
      45: invokevirtual #148                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      48: return
}
