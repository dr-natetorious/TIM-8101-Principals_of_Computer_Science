public class ryey.easer.plugins.operation.b.b implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.b.b> CREATOR;

  java.util.Calendar a;

  java.lang.String b;

  boolean c;

  static {};
    Code:
       0: iconst_2
       1: newarray       int
       3: dup
       4: iconst_0
       5: bipush        11
       7: iastore
       8: dup
       9: iconst_1
      10: bipush        12
      12: iastore
      13: putstatic     #27                 // Field d:[I
      16: new           #29                 // class java/text/SimpleDateFormat
      19: dup
      20: ldc           #31                 // String HH:mm
      22: getstatic     #37                 // Field java/util/Locale.US:Ljava/util/Locale;
      25: invokespecial #41                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      28: putstatic     #43                 // Field e:Ljava/text/SimpleDateFormat;
      31: new           #8                  // class ryey/easer/plugins/operation/b/b$1
      34: dup
      35: invokespecial #45                 // Method ryey/easer/plugins/operation/b/b$1."<init>":()V
      38: putstatic     #47                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      41: return

  ryey.easer.plugins.operation.b.b(android.os.Parcel, ryey.easer.plugins.operation.b.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #83                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.b.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #50                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #52                 // Field c:Z
       9: aload_0
      10: aload_1
      11: aload_2
      12: iload_3
      13: invokevirtual #86                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      16: return

  ryey.easer.plugins.operation.b.b(java.util.Calendar, java.lang.String, boolean);
    Code:
       0: aload_0
       1: invokespecial #50                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #52                 // Field c:Z
       9: aload_0
      10: aload_1
      11: putfield      #60                 // Field a:Ljava/util/Calendar;
      14: aload_0
      15: aload_2
      16: putfield      #76                 // Field b:Ljava/lang/String;
      19: aload_0
      20: iload_3
      21: putfield      #52                 // Field c:Z
      24: return

  static java.lang.String a(java.util.Calendar);
    Code:
       0: getstatic     #43                 // Field e:Ljava/text/SimpleDateFormat;
       3: aload_0
       4: invokevirtual #92                 // Method java/util/Calendar.getTime:()Ljava/util/Date;
       7: invokevirtual #96                 // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
      10: areturn

  static java.util.Calendar a(java.lang.String);
    Code:
       0: invokestatic  #58                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       3: astore_1
       4: aload_1
       5: getstatic     #43                 // Field e:Ljava/text/SimpleDateFormat;
       8: aload_0
       9: invokevirtual #101                // Method java/text/SimpleDateFormat.parse:(Ljava/lang/String;)Ljava/util/Date;
      12: invokevirtual #105                // Method java/util/Calendar.setTime:(Ljava/util/Date;)V
      15: aload_1
      16: areturn

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #110                // Field ryey/easer/plugins/operation/b/b$2.a:[I
       3: aload_1
       4: invokevirtual #115                // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #117                // class org/json/JSONObject
      12: dup
      13: invokespecial #118                // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #120                // String time
      20: aload_0
      21: getfield      #60                 // Field a:Ljava/util/Calendar;
      24: invokestatic  #122                // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      27: invokevirtual #126                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_1
      32: ldc           #128                // String message
      34: aload_0
      35: getfield      #76                 // Field b:Ljava/lang/String;
      38: invokevirtual #126                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      41: pop
      42: aload_1
      43: ldc           #130                // String absolute?
      45: aload_0
      46: getfield      #52                 // Field c:Z
      49: invokevirtual #133                // Method org/json/JSONObject.put:(Ljava/lang/String;Z)Lorg/json/JSONObject;
      52: pop
      53: aload_1
      54: invokevirtual #136                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      57: astore_1
      58: aload_1
      59: areturn
      60: astore_1
      61: aload_1
      62: invokestatic  #141                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      65: ldc           #143                // String
      67: areturn
    Exception table:
       from    to  target type
          17    58    60   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: getfield      #76                 // Field b:Ljava/lang/String;
       4: aload_1
       5: invokestatic  #149                // Method ryey/easer/b.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/b/c;)Ljava/lang/String;
       8: astore_1
       9: new           #2                  // class ryey/easer/plugins/operation/b/b
      12: dup
      13: aload_0
      14: getfield      #60                 // Field a:Ljava/util/Calendar;
      17: aload_1
      18: aload_0
      19: getfield      #52                 // Field c:Z
      22: invokespecial #151                // Method "<init>":(Ljava/util/Calendar;Ljava/lang/String;Z)V
      25: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #110                // Field ryey/easer/plugins/operation/b/b$2.a:[I
       3: aload_2
       4: invokevirtual #115                // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: new           #117                // class org/json/JSONObject
      12: dup
      13: aload_1
      14: invokespecial #156                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      17: astore_1
      18: aload_0
      19: aload_1
      20: ldc           #120                // String time
      22: invokevirtual #160                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      25: invokestatic  #162                // Method a:(Ljava/lang/String;)Ljava/util/Calendar;
      28: putfield      #60                 // Field a:Ljava/util/Calendar;
      31: aload_0
      32: aload_1
      33: ldc           #128                // String message
      35: aconst_null
      36: invokevirtual #166                // Method org/json/JSONObject.optString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      39: putfield      #76                 // Field b:Ljava/lang/String;
      42: aload_0
      43: aload_1
      44: ldc           #130                // String absolute?
      46: iconst_1
      47: invokevirtual #170                // Method org/json/JSONObject.optBoolean:(Ljava/lang/String;Z)Z
      50: putfield      #52                 // Field c:Z
      53: return
      54: astore_1
      55: aload_1
      56: invokestatic  #141                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      59: new           #172                // class ryey/easer/commons/local_plugin/b
      62: dup
      63: aload_1
      64: invokespecial #175                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      67: athrow
      68: astore_1
      69: aload_1
      70: invokestatic  #141                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      73: new           #172                // class ryey/easer/commons/local_plugin/b
      76: dup
      77: aload_1
      78: invokespecial #175                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      81: athrow
    Exception table:
       from    to  target type
           9    18    68   Class org/json/JSONException
          18    31    54   Class java/text/ParseException
          18    31    68   Class org/json/JSONException
          31    53    68   Class org/json/JSONException
          55    68    68   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Ljava/util/Calendar;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
      10: ireturn

  public java.util.Set<java.lang.String> b();
    Code:
       0: aload_0
       1: getfield      #76                 // Field b:Ljava/lang/String;
       4: invokestatic  #180                // Method ryey/easer/b.c:(Ljava/lang/String;)Ljava/util/Set;
       7: areturn

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
       8: instanceof    #2                  // class ryey/easer/plugins/operation/b/b
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #76                 // Field b:Ljava/lang/String;
      20: astore        5
      22: aload_1
      23: checkcast     #2                  // class ryey/easer/plugins/operation/b/b
      26: astore_1
      27: aload         5
      29: aload_1
      30: getfield      #76                 // Field b:Ljava/lang/String;
      33: invokestatic  #188                // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      36: ifne          41
      39: iconst_0
      40: ireturn
      41: getstatic     #27                 // Field d:[I
      44: astore        5
      46: aload         5
      48: arraylength
      49: istore_3
      50: iconst_0
      51: istore_2
      52: iload_2
      53: iload_3
      54: if_icmpge     93
      57: aload         5
      59: iload_2
      60: iaload
      61: istore        4
      63: aload_0
      64: getfield      #60                 // Field a:Ljava/util/Calendar;
      67: iload         4
      69: invokevirtual #192                // Method java/util/Calendar.get:(I)I
      72: aload_1
      73: getfield      #60                 // Field a:Ljava/util/Calendar;
      76: iload         4
      78: invokevirtual #192                // Method java/util/Calendar.get:(I)I
      81: if_icmpeq     86
      84: iconst_0
      85: ireturn
      86: iload_2
      87: iconst_1
      88: iadd
      89: istore_2
      90: goto          52
      93: aload_0
      94: getfield      #52                 // Field c:Z
      97: aload_1
      98: getfield      #52                 // Field c:Z
     101: if_icmpeq     106
     104: iconst_0
     105: ireturn
     106: iconst_1
     107: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: getstatic     #27                 // Field d:[I
       3: astore        5
       5: aload         5
       7: arraylength
       8: istore_3
       9: iconst_0
      10: istore_2
      11: iload_2
      12: iload_3
      13: if_icmpge     42
      16: aload         5
      18: iload_2
      19: iaload
      20: istore        4
      22: aload_1
      23: aload_0
      24: getfield      #60                 // Field a:Ljava/util/Calendar;
      27: iload         4
      29: invokevirtual #192                // Method java/util/Calendar.get:(I)I
      32: invokevirtual #198                // Method android/os/Parcel.writeInt:(I)V
      35: iload_2
      36: iconst_1
      37: iadd
      38: istore_2
      39: goto          11
      42: aload_1
      43: aload_0
      44: getfield      #76                 // Field b:Ljava/lang/String;
      47: invokevirtual #201                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      50: aload_1
      51: aload_0
      52: getfield      #52                 // Field c:Z
      55: i2b
      56: invokevirtual #205                // Method android/os/Parcel.writeByte:(B)V
      59: return
}
