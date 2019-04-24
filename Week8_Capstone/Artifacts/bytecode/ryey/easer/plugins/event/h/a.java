public class ryey.easer.plugins.event.h.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.h.a> CREATOR;

  java.util.Calendar a;

  static {};
    Code:
       0: new           #19                 // class java/text/SimpleDateFormat
       3: dup
       4: ldc           #21                 // String yyyy-MM-dd
       6: getstatic     #27                 // Field java/util/Locale.US:Ljava/util/Locale;
       9: invokespecial #31                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      12: putstatic     #33                 // Field b:Ljava/text/SimpleDateFormat;
      15: new           #6                  // class ryey/easer/plugins/event/h/a$1
      18: dup
      19: invokespecial #35                 // Method ryey/easer/plugins/event/h/a$1."<init>":()V
      22: putstatic     #37                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      25: return

  ryey.easer.plugins.event.h.a(android.os.Parcel, ryey.easer.plugins.event.h.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #61                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.h.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #40                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #42                 // Field a:Ljava/util/Calendar;
       9: aload_0
      10: aload_1
      11: aload_2
      12: iload_3
      13: invokevirtual #64                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      16: return

  public ryey.easer.plugins.event.h.a(java.util.Calendar);
    Code:
       0: aload_0
       1: invokespecial #40                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #42                 // Field a:Ljava/util/Calendar;
       9: aload_0
      10: aload_1
      11: putfield      #42                 // Field a:Ljava/util/Calendar;
      14: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #87                 // Field ryey/easer/plugins/event/h/a$2.a:[I
       3: aload_1
       4: invokevirtual #93                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: aload_0
      10: getfield      #42                 // Field a:Ljava/util/Calendar;
      13: invokestatic  #95                 // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      16: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #87                 // Field ryey/easer/plugins/event/h/a$2.a:[I
       3: aload_2
       4: invokevirtual #93                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: aload_0
      10: aload_1
      11: invokestatic  #99                 // Method a:(Ljava/lang/String;)Ljava/util/Calendar;
      14: putfield      #42                 // Field a:Ljava/util/Calendar;
      17: return
      18: astore_1
      19: aload_1
      20: invokestatic  #104                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      23: new           #106                // class ryey/easer/commons/local_plugin/b
      26: dup
      27: aload_1
      28: invokespecial #109                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      31: athrow
    Exception table:
       from    to  target type
           9    17    18   Class java/text/ParseException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #42                 // Field a:Ljava/util/Calendar;
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
       0: aconst_null
       1: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        40
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/h/a
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #42                 // Field a:Ljava/util/Calendar;
      17: invokestatic  #95                 // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      20: aload_1
      21: checkcast     #2                  // class ryey/easer/plugins/event/h/a
      24: getfield      #42                 // Field a:Ljava/util/Calendar;
      27: invokestatic  #95                 // Method a:(Ljava/util/Calendar;)Ljava/lang/String;
      30: invokevirtual #119                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      33: ifne          38
      36: iconst_0
      37: ireturn
      38: iconst_1
      39: ireturn
      40: iconst_0
      41: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #42                 // Field a:Ljava/util/Calendar;
       5: invokevirtual #124                // Method java/util/Calendar.getTimeInMillis:()J
       8: invokevirtual #127                // Method android/os/Parcel.writeLong:(J)V
      11: return
}
