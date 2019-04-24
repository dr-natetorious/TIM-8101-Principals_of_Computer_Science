class com.b.a.d$a extends android.os.Handler {
  com.b.a.d$a(android.os.Looper, java.lang.String, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #15                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
       5: aload_0
       6: aload_2
       7: putfield      #17                 // Field a:Ljava/lang/String;
      10: aload_0
      11: iload_3
      12: putfield      #19                 // Field b:I
      15: return

  public void handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #73                 // Field android/os/Message.obj:Ljava/lang/Object;
       4: checkcast     #45                 // class java/lang/String
       7: astore_2
       8: aload_0
       9: aload_0
      10: getfield      #17                 // Field a:Ljava/lang/String;
      13: ldc           #75                 // String logs
      15: invokespecial #77                 // Method a:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
      18: astore_1
      19: new           #59                 // class java/io/FileWriter
      22: dup
      23: aload_1
      24: iconst_1
      25: invokespecial #80                 // Method java/io/FileWriter."<init>":(Ljava/io/File;Z)V
      28: astore_1
      29: aload_0
      30: aload_1
      31: aload_2
      32: invokespecial #82                 // Method a:(Ljava/io/FileWriter;Ljava/lang/String;)V
      35: aload_1
      36: invokevirtual #86                 // Method java/io/FileWriter.flush:()V
      39: aload_1
      40: invokevirtual #89                 // Method java/io/FileWriter.close:()V
      43: return
      44: aconst_null
      45: astore_1
      46: aload_1
      47: ifnull        58
      50: aload_1
      51: invokevirtual #86                 // Method java/io/FileWriter.flush:()V
      54: aload_1
      55: invokevirtual #89                 // Method java/io/FileWriter.close:()V
      58: return
      59: astore_1
      60: goto          44
      63: astore_2
      64: goto          46
      67: astore_1
      68: return
    Exception table:
       from    to  target type
          19    29    59   Class java/io/IOException
          29    43    63   Class java/io/IOException
          50    58    67   Class java/io/IOException
}
