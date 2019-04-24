public class ryey.easer.plugins.a.j.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.j.a> CREATOR;

  final java.util.Calendar a;

  final ryey.easer.plugins.a.j.a$a b;

  static {};
    Code:
       0: new           #25                 // class java/text/SimpleDateFormat
       3: dup
       4: ldc           #27                 // String HH:mm
       6: getstatic     #33                 // Field java/util/Locale.US:Ljava/util/Locale;
       9: invokespecial #37                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      12: putstatic     #39                 // Field c:Ljava/text/SimpleDateFormat;
      15: new           #8                  // class ryey/easer/plugins/a/j/a$1
      18: dup
      19: invokespecial #41                 // Method ryey/easer/plugins/a/j/a$1."<init>":()V
      22: putstatic     #43                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      25: return

  ryey.easer.plugins.a.j.a(android.os.Parcel, ryey.easer.plugins.a.j.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #77                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.j.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #46                 // Method java/lang/Object."<init>":()V
       4: getstatic     #85                 // Field ryey/easer/plugins/a/j/a$2.a:[I
       7: aload_2
       8: invokevirtual #90                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore_3
      13: new           #92                 // class org/json/JSONObject
      16: dup
      17: aload_1
      18: invokespecial #95                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      21: astore_1
      22: aload_0
      23: aload_1
      24: ldc           #97                 // String time
      26: invokevirtual #101                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      29: invokestatic  #104                // Method a:(Ljava/lang/String;)Ljava/util/Calendar;
      32: putfield      #66                 // Field a:Ljava/util/Calendar;
      35: aload_0
      36: aload_1
      37: ldc           #106                // String rel
      39: invokevirtual #101                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      42: invokestatic  #110                // Method ryey/easer/plugins/a/j/a$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/a/j/a$a;
      45: putfield      #58                 // Field b:Lryey/easer/plugins/a/j/a$a;
      48: return
      49: astore_1
      50: new           #112                // class ryey/easer/commons/local_plugin/b
      53: dup
      54: aload_1
      55: invokespecial #115                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      58: athrow
      59: astore_1
      60: new           #112                // class ryey/easer/commons/local_plugin/b
      63: dup
      64: aload_1
      65: invokespecial #115                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      68: athrow
    Exception table:
       from    to  target type
          13    48    59   Class org/json/JSONException
          13    48    49   Class java/text/ParseException

  ryey.easer.plugins.a.j.a(java.util.Calendar, ryey.easer.plugins.a.j.a$a);
    Code:
       0: aload_0
       1: invokespecial #46                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #66                 // Field a:Ljava/util/Calendar;
       9: aload_0
      10: aload_2
      11: putfield      #58                 // Field b:Lryey/easer/plugins/a/j/a$a;
      14: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #85                 // Field ryey/easer/plugins/a/j/a$2.a:[I
       3: aload_1
       4: invokevirtual #90                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #92                 // class org/json/JSONObject
      12: dup
      13: invokespecial #135                // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #97                 // String time
      20: aload_0
      21: getfield      #66                 // Field a:Ljava/util/Calendar;
      24: invokestatic  #137                // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      27: invokevirtual #141                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_1
      32: ldc           #106                // String rel
      34: aload_0
      35: getfield      #58                 // Field b:Lryey/easer/plugins/a/j/a$a;
      38: invokevirtual #145                // Method ryey/easer/plugins/a/j/a$a.name:()Ljava/lang/String;
      41: invokevirtual #141                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      44: pop
      45: aload_1
      46: invokevirtual #148                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      49: astore_1
      50: aload_1
      51: areturn
      52: astore_1
      53: new           #150                // class java/lang/IllegalStateException
      56: dup
      57: aload_1
      58: invokespecial #153                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      61: athrow
    Exception table:
       from    to  target type
           9    50    52   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #66                 // Field a:Ljava/util/Calendar;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
      10: ireturn

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
       8: ifnull        47
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/a/j/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #66                 // Field a:Ljava/util/Calendar;
      24: invokestatic  #137                // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      27: aload_1
      28: checkcast     #2                  // class ryey/easer/plugins/a/j/a
      31: getfield      #66                 // Field a:Ljava/util/Calendar;
      34: invokestatic  #137                // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      37: invokevirtual #161                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      40: ifne          45
      43: iconst_0
      44: ireturn
      45: iconst_1
      46: ireturn
      47: iconst_0
      48: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #58                 // Field b:Lryey/easer/plugins/a/j/a$a;
       5: invokevirtual #164                // Method ryey/easer/plugins/a/j/a$a.ordinal:()I
       8: invokevirtual #168                // Method android/os/Parcel.writeInt:(I)V
      11: aload_1
      12: aload_0
      13: getfield      #66                 // Field a:Ljava/util/Calendar;
      16: invokevirtual #171                // Method java/util/Calendar.getTimeInMillis:()J
      19: invokevirtual #174                // Method android/os/Parcel.writeLong:(J)V
      22: return
}
