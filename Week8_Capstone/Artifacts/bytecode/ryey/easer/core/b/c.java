class ryey.easer.core.b.c implements ryey.easer.core.b.b {
  static {};
    Code:
       0: new           #12                 // class java/text/SimpleDateFormat
       3: dup
       4: ldc           #14                 // String yyyy-MM-dd
       6: getstatic     #20                 // Field java/util/Locale.US:Ljava/util/Locale;
       9: invokespecial #24                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      12: putstatic     #26                 // Field a:Ljava/text/SimpleDateFormat;
      15: return

  ryey.easer.core.b.c();
    Code:
       0: aload_0
       1: invokespecial #29                 // Method java/lang/Object."<init>":()V
       4: return

  public java.lang.String a();
    Code:
       0: ldc           #32                 // String ryey.easer.core.dynamics.date
       2: areturn

  public java.lang.String a(android.content.Context, android.os.Bundle);
    Code:
       0: invokestatic  #39                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
       3: invokevirtual #43                 // Method java/util/Calendar.getTime:()Ljava/util/Date;
       6: astore_1
       7: getstatic     #26                 // Field a:Ljava/text/SimpleDateFormat;
      10: aload_1
      11: invokevirtual #47                 // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
      14: areturn

  public int b();
    Code:
       0: ldc           #50                 // int 2131624033
       2: ireturn
}
