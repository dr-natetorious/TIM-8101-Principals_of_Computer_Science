public final class android.support.v4.app.g {
  public static android.os.IBinder a(android.os.Bundle, java.lang.String);
    Code:
       0: getstatic     #14                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        18
       5: if_icmplt     14
       8: aload_0
       9: aload_1
      10: invokevirtual #20                 // Method android/os/Bundle.getBinder:(Ljava/lang/String;)Landroid/os/IBinder;
      13: areturn
      14: aload_0
      15: aload_1
      16: invokestatic  #22                 // Method android/support/v4/app/g$a.a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
      19: areturn
}
