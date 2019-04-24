public class ryey.easer.plugins.event.o.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.o.a> CREATOR;

  final boolean a;

  final int b;

  final java.lang.Boolean c;

  final boolean d;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/o/a$1
       3: dup
       4: invokespecial #23                 // Method ryey/easer/plugins/event/o/a$1."<init>":()V
       7: putstatic     #25                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.o.a(int, boolean);
    Code:
       0: aload_0
       1: iconst_1
       2: iload_1
       3: aconst_null
       4: iload_2
       5: invokespecial #30                 // Method "<init>":(ZILjava/lang/Boolean;Z)V
       8: return

  ryey.easer.plugins.event.o.a(int, boolean, boolean);
    Code:
       0: aload_0
       1: iconst_0
       2: iload_1
       3: iload_2
       4: invokestatic  #37                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       7: iload_3
       8: invokespecial #30                 // Method "<init>":(ZILjava/lang/Boolean;Z)V
      11: return

  ryey.easer.plugins.event.o.a(android.os.Parcel, ryey.easer.plugins.event.o.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #60                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.o.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #39                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: getstatic     #66                 // Field ryey/easer/plugins/event/o/a$2.a:[I
       7: aload_2
       8: invokevirtual #71                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore_3
      13: new           #73                 // class org/json/JSONObject
      16: dup
      17: aload_1
      18: invokespecial #76                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      21: astore_1
      22: aload_0
      23: aload_1
      24: ldc           #78                 // String short?
      26: iconst_0
      27: invokevirtual #82                 // Method org/json/JSONObject.optBoolean:(Ljava/lang/String;Z)Z
      30: putfield      #47                 // Field a:Z
      33: aload_0
      34: getfield      #47                 // Field a:Z
      37: ifeq          58
      40: aload_0
      41: aload_1
      42: ldc           #84                 // String seconds
      44: invokevirtual #88                 // Method org/json/JSONObject.getInt:(Ljava/lang/String;)I
      47: putfield      #53                 // Field b:I
      50: aload_0
      51: aconst_null
      52: putfield      #55                 // Field c:Ljava/lang/Boolean;
      55: goto          81
      58: aload_0
      59: aload_1
      60: ldc           #90                 // String time
      62: invokevirtual #88                 // Method org/json/JSONObject.getInt:(Ljava/lang/String;)I
      65: putfield      #53                 // Field b:I
      68: aload_0
      69: aload_1
      70: ldc           #92                 // String exact?
      72: invokevirtual #96                 // Method org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
      75: invokestatic  #37                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      78: putfield      #55                 // Field c:Ljava/lang/Boolean;
      81: aload_0
      82: aload_1
      83: ldc           #98                 // String repeat?
      85: invokevirtual #96                 // Method org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
      88: putfield      #57                 // Field d:Z
      91: return
      92: astore_1
      93: new           #100                // class ryey/easer/commons/local_plugin/b
      96: dup
      97: aload_1
      98: invokespecial #103                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
     101: athrow
    Exception table:
       from    to  target type
          13    55    92   Class org/json/JSONException
          58    81    92   Class org/json/JSONException
          81    91    92   Class org/json/JSONException

  ryey.easer.plugins.event.o.a(boolean, int, java.lang.Boolean, boolean);
    Code:
       0: aload_0
       1: invokespecial #39                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #47                 // Field a:Z
       9: aload_0
      10: iload_2
      11: putfield      #53                 // Field b:I
      14: aload_0
      15: aload_3
      16: putfield      #55                 // Field c:Ljava/lang/Boolean;
      19: aload_0
      20: iload         4
      22: putfield      #57                 // Field d:Z
      25: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #66                 // Field ryey/easer/plugins/event/o/a$2.a:[I
       3: aload_1
       4: invokevirtual #71                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #73                 // class org/json/JSONObject
      12: dup
      13: invokespecial #105                // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #78                 // String short?
      20: aload_0
      21: getfield      #47                 // Field a:Z
      24: invokevirtual #109                // Method org/json/JSONObject.put:(Ljava/lang/String;Z)Lorg/json/JSONObject;
      27: pop
      28: aload_0
      29: getfield      #47                 // Field a:Z
      32: ifeq          49
      35: aload_1
      36: ldc           #84                 // String seconds
      38: aload_0
      39: getfield      #53                 // Field b:I
      42: invokevirtual #112                // Method org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
      45: pop
      46: goto          71
      49: aload_1
      50: ldc           #90                 // String time
      52: aload_0
      53: getfield      #53                 // Field b:I
      56: invokevirtual #112                // Method org/json/JSONObject.put:(Ljava/lang/String;I)Lorg/json/JSONObject;
      59: pop
      60: aload_1
      61: ldc           #92                 // String exact?
      63: aload_0
      64: getfield      #55                 // Field c:Ljava/lang/Boolean;
      67: invokevirtual #115                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      70: pop
      71: aload_1
      72: ldc           #98                 // String repeat?
      74: aload_0
      75: getfield      #57                 // Field d:Z
      78: invokevirtual #109                // Method org/json/JSONObject.put:(Ljava/lang/String;Z)Lorg/json/JSONObject;
      81: pop
      82: aload_1
      83: invokevirtual #119                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      86: areturn
      87: astore_1
      88: aload_1
      89: invokestatic  #124                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      92: new           #126                // class java/lang/IllegalStateException
      95: dup
      96: aload_1
      97: invokespecial #128                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
     100: athrow
    Exception table:
       from    to  target type
          17    46    87   Class org/json/JSONException
          49    71    87   Class org/json/JSONException
          71    82    87   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #53                 // Field b:I
       4: ifgt          9
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
       0: aconst_null
       1: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        74
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/o/a
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #47                 // Field a:Z
      17: istore_2
      18: aload_1
      19: checkcast     #2                  // class ryey/easer/plugins/event/o/a
      22: astore_1
      23: iload_2
      24: aload_1
      25: getfield      #47                 // Field a:Z
      28: if_icmpeq     33
      31: iconst_0
      32: ireturn
      33: aload_0
      34: getfield      #53                 // Field b:I
      37: aload_1
      38: getfield      #53                 // Field b:I
      41: if_icmpeq     46
      44: iconst_0
      45: ireturn
      46: aload_0
      47: getfield      #57                 // Field d:Z
      50: aload_1
      51: getfield      #57                 // Field d:Z
      54: if_icmpeq     59
      57: iconst_0
      58: ireturn
      59: aload_0
      60: getfield      #55                 // Field c:Ljava/lang/Boolean;
      63: aload_1
      64: getfield      #55                 // Field c:Ljava/lang/Boolean;
      67: if_acmpeq     72
      70: iconst_0
      71: ireturn
      72: iconst_1
      73: ireturn
      74: iconst_0
      75: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #47                 // Field a:Z
       5: i2b
       6: invokevirtual #140                // Method android/os/Parcel.writeByte:(B)V
       9: aload_1
      10: aload_0
      11: getfield      #53                 // Field b:I
      14: invokevirtual #144                // Method android/os/Parcel.writeInt:(I)V
      17: aload_0
      18: getfield      #47                 // Field a:Z
      21: ifne          36
      24: aload_1
      25: aload_0
      26: getfield      #55                 // Field c:Ljava/lang/Boolean;
      29: invokevirtual #147                // Method java/lang/Boolean.booleanValue:()Z
      32: i2b
      33: invokevirtual #140                // Method android/os/Parcel.writeByte:(B)V
      36: aload_1
      37: aload_0
      38: getfield      #57                 // Field d:Z
      41: i2b
      42: invokevirtual #140                // Method android/os/Parcel.writeByte:(B)V
      45: return
}
