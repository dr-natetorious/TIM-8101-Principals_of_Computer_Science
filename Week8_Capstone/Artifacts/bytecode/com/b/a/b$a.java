public final class com.b.a.b$a {
  java.util.Date a;

  java.text.SimpleDateFormat b;

  com.b.a.g c;

  java.lang.String d;

  com.b.a.b$a(com.b.a.b$1);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method "<init>":()V
       4: return

  public com.b.a.b a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/util/Date;
       4: ifnonnull     18
       7: aload_0
       8: new           #30                 // class java/util/Date
      11: dup
      12: invokespecial #31                 // Method java/util/Date."<init>":()V
      15: putfield      #28                 // Field a:Ljava/util/Date;
      18: aload_0
      19: getfield      #33                 // Field b:Ljava/text/SimpleDateFormat;
      22: ifnonnull     41
      25: aload_0
      26: new           #35                 // class java/text/SimpleDateFormat
      29: dup
      30: ldc           #37                 // String yyyy.MM.dd HH:mm:ss.SSS
      32: getstatic     #43                 // Field java/util/Locale.UK:Ljava/util/Locale;
      35: invokespecial #46                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      38: putfield      #33                 // Field b:Ljava/text/SimpleDateFormat;
      41: aload_0
      42: getfield      #48                 // Field c:Lcom/b/a/g;
      45: ifnonnull     151
      48: invokestatic  #54                 // Method android/os/Environment.getExternalStorageDirectory:()Ljava/io/File;
      51: invokevirtual #60                 // Method java/io/File.getAbsolutePath:()Ljava/lang/String;
      54: astore_1
      55: new           #62                 // class java/lang/StringBuilder
      58: dup
      59: invokespecial #63                 // Method java/lang/StringBuilder."<init>":()V
      62: astore_2
      63: aload_2
      64: aload_1
      65: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      68: pop
      69: aload_2
      70: getstatic     #71                 // Field java/io/File.separatorChar:C
      73: invokevirtual #74                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      76: pop
      77: aload_2
      78: ldc           #76                 // String logger
      80: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      83: pop
      84: aload_2
      85: invokevirtual #79                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      88: astore_1
      89: new           #62                 // class java/lang/StringBuilder
      92: dup
      93: invokespecial #63                 // Method java/lang/StringBuilder."<init>":()V
      96: astore_2
      97: aload_2
      98: ldc           #81                 // String AndroidFileLogger.
     100: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     103: pop
     104: aload_2
     105: aload_1
     106: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     109: pop
     110: new           #83                 // class android/os/HandlerThread
     113: dup
     114: aload_2
     115: invokevirtual #79                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     118: invokespecial #86                 // Method android/os/HandlerThread."<init>":(Ljava/lang/String;)V
     121: astore_2
     122: aload_2
     123: invokevirtual #89                 // Method android/os/HandlerThread.start:()V
     126: aload_0
     127: new           #91                 // class com/b/a/d
     130: dup
     131: new           #93                 // class com/b/a/d$a
     134: dup
     135: aload_2
     136: invokevirtual #97                 // Method android/os/HandlerThread.getLooper:()Landroid/os/Looper;
     139: aload_1
     140: ldc           #98                 // int 512000
     142: invokespecial #101                // Method com/b/a/d$a."<init>":(Landroid/os/Looper;Ljava/lang/String;I)V
     145: invokespecial #104                // Method com/b/a/d."<init>":(Landroid/os/Handler;)V
     148: putfield      #48                 // Field c:Lcom/b/a/g;
     151: new           #6                  // class com/b/a/b
     154: dup
     155: aload_0
     156: aconst_null
     157: invokespecial #107                // Method com/b/a/b."<init>":(Lcom/b/a/b$a;Lcom/b/a/b$1;)V
     160: areturn
}
