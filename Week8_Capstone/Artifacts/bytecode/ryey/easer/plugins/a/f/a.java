public class ryey.easer.plugins.a.f.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.f.a> CREATOR;

  java.util.Calendar a;

  ryey.easer.plugins.a.f.a$a b;

  static {};
    Code:
       0: new           #25                 // class java/text/SimpleDateFormat
       3: dup
       4: ldc           #27                 // String yyyy-MM-dd
       6: getstatic     #33                 // Field java/util/Locale.US:Ljava/util/Locale;
       9: invokespecial #37                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      12: putstatic     #39                 // Field c:Ljava/text/SimpleDateFormat;
      15: new           #8                  // class ryey/easer/plugins/a/f/a$1
      18: dup
      19: invokespecial #41                 // Method ryey/easer/plugins/a/f/a$1."<init>":()V
      22: putstatic     #43                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      25: return

  ryey.easer.plugins.a.f.a(android.os.Parcel, ryey.easer.plugins.a.f.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #77                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.f.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #46                 // Method java/lang/Object."<init>":()V
       4: getstatic     #85                 // Field ryey/easer/plugins/a/f/a$2.a:[I
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
      24: ldc           #97                 // String date
      26: invokevirtual #101                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      29: invokestatic  #104                // Method a:(Ljava/lang/String;)Ljava/util/Calendar;
      32: putfield      #54                 // Field a:Ljava/util/Calendar;
      35: aload_0
      36: aload_1
      37: ldc           #106                // String rel
      39: invokevirtual #101                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      42: invokestatic  #110                // Method ryey/easer/plugins/a/f/a$a.valueOf:(Ljava/lang/String;)Lryey/easer/plugins/a/f/a$a;
      45: putfield      #74                 // Field b:Lryey/easer/plugins/a/f/a$a;
      48: return
      49: astore_1
      50: aload_1
      51: invokestatic  #115                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      54: return
      55: astore_1
      56: aload_1
      57: invokestatic  #115                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      60: new           #117                // class ryey/easer/commons/local_plugin/b
      63: dup
      64: aload_1
      65: invokespecial #120                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      68: athrow
    Exception table:
       from    to  target type
          13    48    55   Class java/text/ParseException
          13    48    49   Class org/json/JSONException

  ryey.easer.plugins.a.f.a(java.util.Calendar, ryey.easer.plugins.a.f.a$a);
    Code:
       0: aload_0
       1: invokespecial #46                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #54                 // Field a:Ljava/util/Calendar;
       9: aload_0
      10: aload_2
      11: putfield      #74                 // Field b:Lryey/easer/plugins/a/f/a$a;
      14: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #85                 // Field ryey/easer/plugins/a/f/a$2.a:[I
       3: aload_1
       4: invokevirtual #90                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #92                 // class org/json/JSONObject
      12: dup
      13: invokespecial #140                // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #97                 // String date
      20: aload_0
      21: getfield      #54                 // Field a:Ljava/util/Calendar;
      24: invokestatic  #142                // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      27: invokevirtual #146                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_1
      32: ldc           #106                // String rel
      34: aload_0
      35: getfield      #74                 // Field b:Lryey/easer/plugins/a/f/a$a;
      38: invokevirtual #150                // Method ryey/easer/plugins/a/f/a$a.name:()Ljava/lang/String;
      41: invokevirtual #146                // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      44: pop
      45: aload_1
      46: invokevirtual #153                // Method org/json/JSONObject.toString:()Ljava/lang/String;
      49: astore_1
      50: aload_1
      51: areturn
      52: astore_1
      53: aload_1
      54: invokestatic  #115                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      57: new           #155                // class java/lang/IllegalStateException
      60: dup
      61: ldc           #157                // String Failed to serialize DateConditionData
      63: invokespecial #158                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      66: athrow
    Exception table:
       from    to  target type
           9    50    52   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #54                 // Field a:Ljava/util/Calendar;
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
       8: ifnull        67
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/a/f/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #74                 // Field b:Lryey/easer/plugins/a/f/a$a;
      24: astore_2
      25: aload_1
      26: checkcast     #2                  // class ryey/easer/plugins/a/f/a
      29: astore_1
      30: aload_2
      31: aload_1
      32: getfield      #74                 // Field b:Lryey/easer/plugins/a/f/a$a;
      35: invokevirtual #164                // Method ryey/easer/plugins/a/f/a$a.equals:(Ljava/lang/Object;)Z
      38: ifne          43
      41: iconst_0
      42: ireturn
      43: aload_0
      44: getfield      #54                 // Field a:Ljava/util/Calendar;
      47: invokestatic  #142                // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      50: aload_1
      51: getfield      #54                 // Field a:Ljava/util/Calendar;
      54: invokestatic  #142                // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      57: invokevirtual #167                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      60: ifne          65
      63: iconst_0
      64: ireturn
      65: iconst_1
      66: ireturn
      67: iconst_0
      68: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #54                 // Field a:Ljava/util/Calendar;
       5: invokevirtual #172                // Method java/util/Calendar.getTimeInMillis:()J
       8: invokevirtual #175                // Method android/os/Parcel.writeLong:(J)V
      11: aload_1
      12: aload_0
      13: getfield      #74                 // Field b:Lryey/easer/plugins/a/f/a$a;
      16: invokevirtual #176                // Method ryey/easer/plugins/a/f/a$a.ordinal:()I
      19: invokevirtual #180                // Method android/os/Parcel.writeInt:(I)V
      22: return
}
