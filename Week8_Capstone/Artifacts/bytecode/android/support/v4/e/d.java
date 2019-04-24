public final class android.support.v4.e.d {
  public static void a();
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        18
       5: if_icmplt     11
       8: invokestatic  #17                 // Method android/os/Trace.endSection:()V
      11: return

  public static void a(java.lang.String);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        18
       5: if_icmplt     12
       8: aload_0
       9: invokestatic  #22                 // Method android/os/Trace.beginSection:(Ljava/lang/String;)V
      12: return
}
